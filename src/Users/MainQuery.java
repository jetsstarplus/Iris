/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Databases.DatabaseConnection;
import heightech.ItemQuery;
import heightech.Items;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class MainQuery {
    
    public ArrayList<Items> itemList()
    {
        ArrayList<Items> clist = new ArrayList<Items>();
        Connection conn = DatabaseConnection.getConnection();
        
        Statement st;
        ResultSet rs;
        
        try
        {
            st = conn.createStatement();
            //querying all the elements from the database
            
            rs = st.executeQuery("SELECT  Item_name, Item_number, Item_class, Item_description, Item_Quantity,"
                    + " Item_Image, Admin_Name, item_price, Item_supplier, Item_model FROM items ORDER BY Item_name ASC");
        
            Items item;
            
            // for getting the items from the database in form of aloop
            while(rs.next())
            {
                item = new Items(rs.getString("Item_model"),
                        rs.getString("Item_name"), rs.getString("Item_number"),
                        rs.getString("Item_class"), rs.getBytes("Item_Image"),
                        rs.getString("Item_description"),rs.getInt("Item_Quantity"), rs.getInt("item_price"), 
                        rs.getString("Admin_Name"), rs.getString("Item_supplier"));
                
                // This is a really essecial code for displaying the items
                clist.add(item);
            }
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(ItemQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return clist;
    }
    
    
       
     public ArrayList<Items> itemListSale()
    {
        ArrayList<Items> clist = new ArrayList<Items>();
        Connection conn = DatabaseConnection.getConnection();
        
        PreparedStatement st;
        ResultSet rs;
        
        try
        {
            st = conn.prepareStatement("SELECT  Item_name, Item_number, Item_class, Item_description, Item_Quantity,"
                    + " Item_Image, Admin_Name, item_price, Item_supplier, Item_model FROM items WHERE Item_number = ?");
            //querying all the elements from the database
          
            rs = st.executeQuery();
        
            Items item;
            
            // for getting the items from the database in form of aloop
            while(rs.next())
            {
                item = new Items(rs.getString("Item_model"),
                        rs.getString("Item_name"), rs.getString("Item_number"),
                        rs.getString("Item_class"), rs.getBytes("Item_Image"),
                        rs.getString("Item_description"),rs.getInt("Item_Quantity"), rs.getInt("item_price"), 
                        rs.getString("Admin_Name"), rs.getString("Item_supplier"));
                
                // This is a really essecial code for displaying the items
                clist.add(item);
            }
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(ItemQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return clist;
    }
    
}
