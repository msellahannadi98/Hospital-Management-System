
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Madusha
 */
//public class ConnectionProvider {
    
    //C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext
//    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    final static String DB_URL = "jdbc:mysql://localhost:3306/ConnectionProvider";
//    
//    final static String USER = "root";
//    final static String PASS = "";
//    
//    public static Connection connection(){
//        
//        try{
//            Class.forName(JDBC_DRIVER);
//            
//            Connection conn = DriverManager.getConnection(DB_URL, USER,PASS);
//            return conn;
//            
//        }catch(ClassNotFoundException | SQLException e){
//            JOptionPane.showMessageDialog(null, e);
//             
//        }
//        return null;
//    }
//    
//    
//}
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
