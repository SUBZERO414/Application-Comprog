package finals;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author Luke
 */
public class Attendance {
    Scanner sc = new Scanner(System.in);
    private static String timeNow = new SimpleDateFormat("KK-mma").format(new Date());
    private static String d = new SimpleDateFormat("MMM").format(new Date());
    private static String Sub = "ComProg";
    private static String Sec = "BS201";
    
//    public static void main(String[]args){
//        Attendance run = new Attendance();
//        
//        System.out.println("text file name is: " + d + "_" + timeNow);
//        run.attendanceSheet();
//    }
    public void attendanceTracker(String attendanceData){
        try{
            Path filePath = Paths.get("C:\\Attendance\\StudentLogins.txt");
            OutputStream output = null;
            output = new BufferedOutputStream(Files.newOutputStream(filePath,CREATE, APPEND));
            BufferedWriter input = new BufferedWriter(new OutputStreamWriter(output));
            input.write(attendanceData);
            input.newLine();
            input.close();
        }
        catch(Exception e){
            System.out.println("Error found: " + e);
        }
    }
    public void setSubSec(){
        System.out.print("Enter Subject: ");
        Sub = sc.next();
        System.out.print("Enter Section: ");
        Sec = sc.next();   
    }
    public void attendanceSheet(){
        String SubSec = Sub + "_" + Sec;
        String entry = SubSec + "_" + d + "_" + timeNow;
        Path filePath = Paths.get("C:\\Attendance\\StudentLogins.txt");
        Path newRecord = Paths.get("C:\\Attendance\\AttendanceRecords\\"+ entry + ".txt");
        OutputStream print = null;
        String data;
        
        Pattern Subject = Pattern.compile(Sub);
        Pattern Section = Pattern.compile(Sec);
        
        try{
            BufferedReader read = new BufferedReader(new FileReader(filePath.toString()));
            while((data=read.readLine())!=null){
                String str = data;
                Matcher searchSub = Subject.matcher(str);
                Matcher searchSec = Section.matcher(str);
                boolean searching = searchSec.find();
                if(searching){
                    print = new BufferedOutputStream(Files.newOutputStream(newRecord,CREATE, APPEND));
                    BufferedWriter encode = new BufferedWriter(new OutputStreamWriter(print));
                    String Attendance = str;
                    encode.write(Attendance);
                    encode.newLine();
                    encode.close();   
                }
            }    
        }
        catch(Exception e){System.out.println(e);}
    }
}
