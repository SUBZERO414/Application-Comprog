package finals;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luke
 */
public class MySQL {
    String sqlData;
    private Statement stmt;
    //initialized constructors for multiple use in methods

    public MySQL() {
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","");
            //here the 'student' is the database name, root is the username and 149608357 is the password for the PHP
            stmt = con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

     public void getValue(String JUser, int studentID){  
        boolean flag = true;
        try{
                ResultSet rs = stmt.executeQuery("select * from StudInfo");  
                while(rs.next()){
                    String User = rs.getString(1);
                    int ID = rs.getInt("StudID");
                    //code to scan database for information(Specifically StudID)

                    if(JUser.equals(User) && studentID==ID){
                        String studentData = rs.getString(1) + "  " + rs.getString(4) + "  " + rs.getString(5) ; 
                        store(studentData);
                        JOptionPane.showMessageDialog(null,"Login Succesful! Attended today.");
                        //if matching data is found then it is printed and prompt to announced successful login and attandance status
                        flag = false;
                        break;
                    }
                }
                if(flag){
                   JOptionPane.showMessageDialog(null,"No matching student found.\nCheck typed in data.");
                   //If statement for no user matching the data
                }
        }
        catch(Exception e){ System.out.println(e);}  
    } 
    
    public void setValue(String JName, int JStudID,String JType, String JCourse, String JSection, int JYear){
        try{
            String Name = JName;
            int StudID = JStudID;
            String TypeStud = JType;
            String Course = JCourse;
            String Section = JSection;
            int Year = JYear;
            //Method to transferdata between Jframes, allocating variable data to be used in other files or methods
            
            String Value = "VALUES ('" + Name + "',0" + StudID + ",'" + TypeStud + "','" + Course + "','" + Section + "'," + Year +")";
            //String variable to hold sql command
            
            stmt.executeUpdate("INSERT INTO studinfo (Name, StudID, TypeStud, Course, Section, SYear)" + Value);
            //statement object to manipulate the sql
            
        }
        catch(Exception e){ System.out.println(e);}  
    }  
    
    public void store(String str){
        sqlData = str;
        Attendance entry = new Attendance();
        
        entry.attendanceTracker(sqlData);
    }
}
