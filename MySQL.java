/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finals;

import java.sql.*;
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
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","149608357");
            //here student is database name, root is username 
            this.stmt = con.createStatement();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

     public void getValue(){  
        try{
              
            ResultSet rs = stmt.executeQuery("select * from students");  
            while(rs.next())  
            System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3));  
            con.close();  
        }
        catch(Exception e){ System.out.println(e);}  
    } 
    
    public void setValue(String JName, int JStudID, String JCourse, String JSection, int JYear){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/student","root","149608357");  
            //here student is database name, root is username 
            String Name = JName;
            int StudID = JStudID;
            String Course = JCourse;
            String Section = JSection;
            int Year = JYear;
            
            
            String Value = "VALUES ('" + Name + "',0" + StudID + ",'" + Course + "','" + Section + "'," + Year +")";
            
            stmt.executeUpdate("INSERT INTO studInfo (Name, StudID, Course, Section, Year)" + Value);
            
        }
        catch(Exception e){ System.out.println(e);}  
    }  
}
