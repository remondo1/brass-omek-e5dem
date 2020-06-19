/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_pfa;
import java.sql.*;
/**
 *
 * @author amine
 */
public class Connect {
    String urlbd = "jdbc:oracle:thin:@localhost:1521:XE";
    static Connection con;
    String urlp =  "oracle.jdbc.driver.OracleDriver";
    public Connect()
    {
       try 
       {
         Class.forName(urlp);
         System.out.print("pilote chargé");
       }
       catch(ClassNotFoundException e )
           
       {
         System.out.print(e);
       }
         
       try 
       {  
            con = DriverManager.getConnection(urlbd,"myuser1","00000000");
            System.out.print("connecté au BD");
       } 
       
       catch(SQLException t)
       { System.out.print(t);}
    
    }
    static Connection getcon ( )
    {  
         return con;
       }
    
}
