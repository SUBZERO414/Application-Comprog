package test;

import java.io.*;
import java.nio.file.*;
import java.text.*;
import java.util.Date;
import static java.nio.file.StandardOpenOption.*;
import java.util.regex.*;

/**
 *
 * @author Luke
 */
public class Attendance {  
    /*This method is called in another method or Jframe that gives it a string data which endcodes the given 
    data(expected to be the student information from the MySQL java class file) in a txt file.
    The date is set to the current date from the computer and adds it to the name of the txt file for easier identification.
    
    The method list all the acquired data into a txt file that will be continuesly added provided that it is given data and matches
    the date of the txt file created, otherwise creates a new one and adds to that one instead*/
    public void attendanceTracker(String attendanceData){
        try{
            String d = new SimpleDateFormat("MMMddyyyy").format(new Date()); 
            //Date format where MMM=month(Jun) dd=day and yyyy=year
            Path filePath = Paths.get("C:\\Attendance\\StudentLogins" + d + ".txt");
            //sets up the filepath and file name using Path object
            
            OutputStream output = null;
            output = new BufferedOutputStream(Files.newOutputStream(filePath,CREATE, APPEND));
            BufferedWriter input = new BufferedWriter(new OutputStreamWriter(output));
            input.write(attendanceData);
            input.newLine();
            input.close();
            //Buffered writer object and built in methods to encode the login data into storable txt file
        }
        catch(Exception e){
            System.out.println("Error found: " + e);
        }
    }
    /*This method is used in conjunction with the attendanceTracker method. The method accepts two String data type in its parameter 
    to scan for the information in the txt file created by the attendanceTracker (provided that the String day datatype in the parameter matches the date on the file).
    Using the given String section in the parameter, this method scans for any matching entry in the txt file (hence specifier) and puts it in a new txt file with only 
    the selected data included in the txt file
    i.e. String Section = BS201 then only BS201 entries will be added and shown in the newly created txt file in the specified directory/folder*/
    public void loginSpecifier(String Sec, String day){        
        try {
            DateFormat dateFormat = new SimpleDateFormat("MMM/dd/yyyy"); //Eto Sabangan pa update nalang once makuha mo front end
            Date dFormat = dateFormat.parse(day);
            String date = new SimpleDateFormat("MMMddyyyy").format(dFormat);
            //Above are Date objects to convert the passed data in the parameter into usable data for the method
        
        
            String entry = Sec + "_" + date;
            //Prepares strings for txt file creation

            Path filePath = Paths.get("C:\\Attendance\\StudentLogins" + date + ".txt");
            //Initializes a Path object to access the file that will created further in the method

            Path newRecord = Paths.get("C:\\Attendance\\AttendanceRecords\\"+ entry + ".txt");
            //Another Path object but sets the unique name of the file using the string type declared
            OutputStream print = null;
            String data;
            //local variables for use in the algorithm

            Pattern Section = Pattern.compile(Sec);
            //Pattern object to set the matcher method to identify the compiled string

            try{
                BufferedReader read = new BufferedReader(new FileReader(filePath.toString()));
                //Buffered reader object to read the txt file indicated to scan for data

                //Below is an Algorithm to scan the txt file for data using the matcher class
                while((data=read.readLine())!=null){
                    String str = data;
                    Matcher searchSec = Section.matcher(str);
                    //Matcher object to match the section selected

                    boolean searching = searchSec.find();
                    //Boolean datatype that checks if the current string contains matching data

                    if(searching){ //If matching data is found proceeds to the if statment
                        print = new BufferedOutputStream(Files.newOutputStream(newRecord,CREATE, APPEND));
                        //Output stream that creates a file if the file doesnt exist and/or extends the existing one
                        BufferedWriter encode = new BufferedWriter(new OutputStreamWriter(print));
                        String Attendance = str;
                        encode.write(Attendance);
                        encode.newLine();
                        encode.close();
                        //Buffered writer to encode the attendance in the txt file
                    }
                }    
            }
            catch(Exception e){System.out.println(e);} //Error statement if any error will occur
        }catch (ParseException ex) { System.out.println("Unable to get date");}
    }   
}
