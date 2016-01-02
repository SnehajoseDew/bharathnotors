/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    
    
   Connection con=null;
   public static Connection Connecr()
   {
       try
       {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatmotors","root","");
         JOptionPane.showMessageDialog(null,"established");
        return con;
        
       }
   catch(Exception e)
   {
       JOptionPane.showMessageDialog(null,e);
       return null;
   }
   }
    
    
    
}
