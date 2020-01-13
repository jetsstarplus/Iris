/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Databases.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AddItem{
    ArrayList itemList = new ArrayList<>();
          
    public AddItem() {
        
         Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
          
        
        try {
           // System.out.println("Connection successful");
            ps = conn.prepareStatement("SELECT Item_number FROM items");
            rs =ps.executeQuery();
            
            rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();
            
            
            while(rs.next())
            {
                itemList.add(rs.getString("Item_number"));
                
            }
            
            //System.out.println("All is successful");
            
           
            
                    
        } catch (SQLException ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
   
    /** In this section, user is a new thread that is ignited upon starting to run the enter the values to the system.
     This is when the execution of the sales has already started.  It queries the database and returns the result to the user 
     after the query through the table. 
     It also has the ability to check if the quantities of the items are enough and then confirm of whether to proceed or not in the system.
     It can also stop sales if a problem occurs in the system.*/
    
    
   
    
//    public String iterate()
//    {
//        String ite="";
//        Iterator it = itemList.iterator();
//        
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
//        
//        return ite;
////    }
    
//    
//    public static void main(String[] args)
//    {
//        AddItem addItem = new AddItem();
//        addItem.iterate();
//        System.out.println("Hello world!");
//        System.out.println(addItem.itemList);
//    }
        
}
