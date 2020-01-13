/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heightech;

import Databases.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class InventoryQuery {
    public ArrayList<Inventory> itemList()
    {
        ArrayList<Inventory> clist = new ArrayList<Inventory>();
        Connection conn = DatabaseConnection.getConnection();
        
        Statement st;
        ResultSet rs;
        
        try
        {
            st = conn.createStatement();
            //querying all the elements from the database
            rs = st.executeQuery("SELECT  inventory.Item_name, inventory.Item_number, inventory.Item_Quantity, items.Item_price  FROM inventory LEFT JOIN items ON items.Item_number = inventory.item_number ORDER BY Item_name ASC");
        
            Inventory item;
            
            // for getting the items from the database in form of aloop
            while(rs.next())
            {
                item = new Inventory(
                        rs.getString("inventory.item_name"), rs.getString("inventory.Item_number"),
                        rs.getInt("inventory.Item_Quantity"), rs.getInt("items.item_price"));
                
                // This is a really essecial code for displaying the items
                clist.add(item);
            }
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(ItemQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return clist;
    }
    
}
