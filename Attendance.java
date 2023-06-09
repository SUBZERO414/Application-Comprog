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
