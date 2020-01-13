
package Databases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnection {

//    public DatabaseConnection()
//    {
//        getConnection();
//    }
    public static Connection getConnection()
    {
        
        Properties prop = new Properties();
        InputStream input = null;
        Connection conn = null;
        try {
           // input = new FileInputStream("config.properties");
            input = DatabaseConnection.class.getResourceAsStream("config.properties");
          
                
                prop.load(input);
            //prop.load(input);
            String dbHost = prop.getProperty("db.driver.class");
            String dbConnection = prop.getProperty("db.conn.url");
            String dbUser = prop.getProperty("db.username");
            String dbPassword = prop.getProperty("db.password");
            
           //Class.forName("com.mysql.jdbc.Driver");
            //conn =  DriverManager.getConnection("jdbc:mysql://" + prop.getProperty("db.host") + "/" + prop.getProperty("db.dbname"), prop.getProperty("db.user"), prop.getProperty("db.password"));
            //conn =  DriverManager.getConnection("jdbc:mysql://localhost/SalesManagement","root","");
            
			if(!"".equals(dbHost) && !"".equals(dbConnection))
			{
                            	
				/* Register jdbc driver class. */
				Class.forName(dbHost);
		
				// Get database connection object.
				conn = DriverManager.getConnection(dbConnection, dbUser, dbPassword);
				
				// Get dtabase meta data.
				DatabaseMetaData dbMetaData = conn.getMetaData();
				
				// Get database name.
				String dbName = dbMetaData.getDatabaseProductName();
				
				// Get database version.
				String dbVersion = dbMetaData.getDatabaseProductVersion();
				
            }
                       
                       
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    
        
        return conn;
    }

   
    
//    
//   public static void main(String []args)
//   {
//        DatabaseConnection databaseConnection = new DatabaseConnection();
//   }
    
}
