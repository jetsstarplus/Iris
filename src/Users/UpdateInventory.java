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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author User
 */
public class UpdateInventory {
int quantity;

   public UpdateInventory()
   {
       
   }
    public void UpdateInventory( String items, String item2) {
            /** Updating the contents of the inventory*/
//            
//               if(getitem().contains(items))
//                {
             try {
                 try ( /** Updating the contents in the database of the items */ Connection conn2 = DatabaseConnection.getConnection()) {
                     PreparedStatement ps2;
                     //ResultSet rs2;
                     int newQuantity = getitemQuantity(items)+ 1;
                     ps2 = conn2.prepareStatement("UPDATE inventory SET item_Quantity =? WHERE item_number = ?");
                     ps2.setInt(1, newQuantity);
                     ps2.setString(2, items);
                     
                     ps2.executeUpdate();
                     //System.out.println("Go out");
                     conn2.close();
                 }
             } 
             
             
             catch (SQLException ep) {
                 
                 try {
                 try ( /** Inserting the items if they don't exist in the system */ Connection conn2 = DatabaseConnection.getConnection()) {
                     PreparedStatement ps2;
                     //ResultSet rs2;
                     //int newQuantity = quantityItem - 1;
                     ps2 = conn2.prepareStatement("INSERT INTO inventory(item_name, item_number, item_Quantity) VALUES (?,?,?)");
                     ps2.setString(1, item2);
                     ps2.setString(2, items);
                     ps2.setInt(3, 1);
                     
                     ps2.executeUpdate();
                     conn2.close();
                 }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
             }          
             }
                        
            
                
//               else if(!getitem().contains(items))
//                {
//             try {
//                 try ( /** Inserting the items if they don't exist in the system */ Connection conn2 = DatabaseConnection.getConnection()) {
//                     PreparedStatement ps2;
//                     //ResultSet rs2;
//                     //int newQuantity = quantityItem - 1;
//                     ps2 = conn2.prepareStatement("INSERT INTO inventory(item_name, item_number, item_Quantity) VALUES (?,?,?)");
//                     ps2.setString(1, item2);
//                     ps2.setString(2, items);
//                     ps2.setInt(3, 1);
//                     
//                     ps2.executeUpdate();
//                     conn2.close();
//                 }
//                 
//             } catch (SQLException ex) {
//                 Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
//             }          
//    }
               
              
    
    }    
    
  
    /**
     * Checking if the inventory has an item/ a particular item
     * 
     * @return
     */
    public static ArrayList getitem()
    {
    int quantity=0;
    ArrayList itemList = new ArrayList<>();
    //boolean check = true;
        Connection conn =DatabaseConnection.getConnection();
        Statement ps;
        ResultSet rs;
        
        try {
            ps = conn.createStatement();
            rs = ps.executeQuery("SELECT item_number FROM inventory");
            
            while(rs.next())
            {
                itemList.add(rs.getString("item_number"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        
        //return check;
        return itemList;
    }
    
    
     public static int getitemQuantity(String item)
    {
    int quantity=0;
    //boolean check = true;
        Connection conn =DatabaseConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = conn.prepareStatement("SELECT item_Quantity FROM inventory WHERE item_number=?");
            ps.setString(1, item);
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                quantity = rs.getInt("item_Quantity");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        
        //return check;
        return quantity;
    }
}
