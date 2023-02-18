/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.sql.*;

public class JavaApplication1 {
Connection con;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication1 ja1=new JavaApplication1();
        ja1.create_connection();
        // TODO code application logic here
    }
    public void create_connection(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Root");
            System.out.println("Connection successful");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from users;");
            while(rs.next()){
                String name=rs.getString("name");
                int age=rs.getInt(2);
                System.out.println(name+" " +age);
            }
            rs.close();
            stmt.close();
        }
        catch(Exception e){
            
        }
    }
    
}
