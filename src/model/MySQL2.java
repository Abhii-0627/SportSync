
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class MySQL2 {
    
    private static Connection connection;
    
    public static void createConnection() throws Exception {
        if (connection == null) {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/sportsync_db","root","AnjuJa@020627");
        }
    }
    
  public static ResultSet executeSearch(String query) throws Exception {

        createConnection();

        return connection.createStatement().executeQuery(query);

    }
    
    public static Integer executeIUD(String query) throws Exception{
        
        createConnection();
        return connection.createStatement().executeUpdate(query);
    }
        
    }
        
   
            
     
    
    
    
    

