package test;

import com.mysql.jdbc.CommunicationsException;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Luke
 */
public class MySQL {
    private Statement stmt;
    //initialized constructors for multiple use in methods

    public MySQL() {
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
            //Line of code to initialize connection with the server, where root is the username and blank is the password for the user
            stmt = con.createStatement();
            //sets the statement object to command the connected SQL. The methods can now command the database this way.
        }
        catch(CommunicationsException e){
            
        }
        catch(Exception e){
//            setUpDirectories();
            JOptionPane.showMessageDialog(null,"Missing Directories added.");
            //Code to set up the missing 
        }
    }
    
    public void setUpDirectories(){
        createFolders();
        createSQL();
    }

    public void getValue(String JUser, int studentID){  
        boolean flag = true;
        //The following is an algorithm to search the SQL database for the input values
        try{
                ResultSet rs = stmt.executeQuery("select * from StudInfo");  
                while(rs.next()){
                    String User = rs.getString(1);
                    int ID = rs.getInt("StudID");
                    //code to scan database for information(Specifically StudID)

                    if(JUser.equals(User) && studentID==ID){
			/*The If else statements has a condition in the parameter to check if the username and ID matches the data in the passed on value(Data obtained from the database specifically Name and studID).
			If there is a match then it will create a String data type with the data of the user from the database(The values are obtained using the Result set object 'rs' to call the string data of the stored information in the database, 
			where the numbers represent the column the data is stored in within the database) This string is then passed on to other methods or objects*/
                        String studentData = rs.getString(2) + ", " + rs.getString(1) + ", " + rs.getString(4) + ", " + rs.getString(5) ; 
                        store(studentData);
                        //method call to store the obtained data
                        JOptionPane.showMessageDialog(null,"Login Succesful! Attended today.");
                        //if matching data is found then it is printed and prompt to announced successful login and attandance status
                        flag = false;
                        break;
                    }
                }
                if(flag){
                   JOptionPane.showMessageDialog(null,"No matching student found.\nCheck typed in data.");
                   //If statement for no user matching the givem data
                }
        }
        catch(Exception e){ 
            System.out.println("error occured: " + e);
        }  
    } 
    
    public void setValue(String JName, int JStudID,String JType, String JCourse, String JSection, int JYear){
        try{
            String Name = JName;
            int StudID = JStudID;
            String TypeStud = JType;
            String Course = JCourse;
            String Section = JSection;
            int Year = JYear;
            //Method to transfer data between Jframes, allocating variable data to be used in other files or methods
            
            String Value = "VALUES ('" + Name + "', " + StudID + ",'" + TypeStud + "','" + Course + "','" + Section + "'," + Year +")";
            //String variable to hold sql command
            
            stmt.executeUpdate("INSERT INTO studinfo (Name, StudID, TypeStud, Course, Section, SYear)" + Value);
            //statement object to manipulate the sql
            
        }
        catch(Exception e){
            System.out.println("error occured: " + e);
        }  
    }  
    
    public void store(String str){
        String timeNow = new SimpleDateFormat("KK:mma").format(new java.util.Date()); //Time format where KK=hour(01) mm=minutes and a is am/pm

        String sqlData = str;
        Attendance entry = new Attendance();
        
        entry.attendanceTracker(sqlData + " /" + timeNow);
        //A method to store the obtained data from the register log in to the Attendance java class (Includes log in time)
        
    }
    public void createSQL(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            stmt = conn.createStatement();
            //This code connects to the SQL if there is one running, else it throws a connection error
            
            stmt.executeUpdate("create database students");
            System.out.println("Database created successfully");
            /*After connecting to the SQL, this code is to initialize the database needed for the program
            Else it throws a SQL Exception error whereby the database already exist
            (Unlikely to happen as this code is called when no database exist)*/
            
            createTable();
        } catch (SQLException ex) {
            String inform = "Unable to create the directories. Make sure there is a running SQL server.";
            System.out.println(inform);
            //Tells the user the most likely issue if an error occured
        }
    }
    
    public void createTable(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
            Statement state = con.createStatement();
            //The code above accesses the database made and makes a statement object to command the SQL
            
            String Name = "Name varchar(50) not null,";
            String StudID = "StudID int not null primary key,";
            String TypeStud = "TypeStud varchar(10) not null,";
            String Course = "Course varchar(10) not null,";
            String Section = "Section varchar(10) not null,";
            String SYear = "SYear int(50) not null)";
            //SQL datatype initializers seperated into strings for avoiding too long parameter length
            
            String table = "create table studinfo(" + Name + StudID + TypeStud + Course + Section + SYear;
            //Condences the strings to form one query command to the SQL(qeury means an action waiting to be performed)
            state.executeUpdate(table);
            System.out.println("Table created successfully");
            /*Table is created in the new database, table name is studinfo with the categories: Name, StudID, TypeStud, Course, Section, and SYear
             Otherwise throws an exception wherein the database is not existing or table already exist*/
        } 
        catch (SQLException ex) {
            String inform = "Unable to create the directories. table already exist";
            System.out.println(inform);
            //Unlikely error to occur if this method is called in conjunction with the createSQL method
        }
    }
    
    public void createFolders(){
        File folder = new File("C:\\Attendance"); 
        File newAttendance = new File("C:\\Attendance\\AttendanceRecords");
        //Path file objects to direct the java program to create the files in the specified paths
        
        //The parameter/conditon checks if the folder exist in the path given, if not then created the folder
        if(folder.mkdir() == true) {
            
            if(newAttendance.mkdir() == true) { 
                System.out.println("Directories has been created successfully!"); 
                //Does the same thing but checks for a different folder in a different path
            }
            else{
                System.out.println("failed to create the second directory");
                //Informs if there was a failed attempt
            }
	}
	else{ 
            System.out.println("Failed to create directories."); 
            //Informs if there was a failed attempt to create both of the folders
	}
    }
    public void checkSystem(){
        /*You can call this blank method to check the System if the needed database is present
        If not then an error is thrown via the constructor of the class*/
    }
}
