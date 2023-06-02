/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finals;

import static java.lang.Integer.parseInt;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Luke
 */
public class MySQL {
    Connection con;
    Statement stmt;

    public MySQL() {
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","149608357");
            //here student is database name, root is username 
            this.stmt = con.createStatement();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

     public void getValue(String JUser, int studentID){  
        try{
            ResultSet rs = stmt.executeQuery("select * from StudInfo");  
            while(rs.next())  {
                String User = rs.getString(1);
                int ID = rs.getInt("StudID");
                if(JUser.equals(User) && studentID==ID){
                    System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getInt(6));  
                    JOptionPane.showMessageDialog(null,"Login Succesful! Attended today.");
                }
            }
            
        }
        catch(Exception e){ System.out.println(e);}  
    } 
    
    public void setValue(String JName, int JStudID,String JType, String JCourse, String JSection, int JYear){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/student","root","149608357");  
            //here student is the database name, root is username and password is my special combination
            String Name = JName;
            int StudID = JStudID;
            String TypeStud = JType;
            String Course = JCourse;
            String Section = JSection;
            int Year = JYear;
            
            
            String Value = "VALUES ('" + Name + "',0" + StudID + ",'" + TypeStud + "','" + Course + "','" + Section + "'," + Year +")";
            
            stmt.executeUpdate("INSERT INTO studinfo (Name, StudID, TypeStud, Course, Section, SYear)" + Value);
            
        }
        catch(Exception e){ System.out.println(e);}  
    }  
    
    public void store(String str){
        
    }
}
