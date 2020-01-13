
package heightech;

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

/**
 *
 * @author User
 */
//Checking if the item aready exists
public class ItemQuery {
    

    // Inserting the Items
    public boolean insertItem(Items item)
    {
        boolean isContactCreated = true;
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps;
        
        try {
            
            ps = conn.prepareStatement("INSERT INTO items(Item_name, Item_number, "
                    + "Item_class, Item_description, Item_Quantity, Item_Image, "
                    + "Admin_Name, item_price, Item_supplier, Item_model) VALUES (?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, item.getItemName());
            ps.setString(2, item.getItemNumber());
            ps.setString(3, item.getItemClass());
            ps.setString(4, item.getItemDesc());
            ps.setInt(5, item.getItemQuantity());
            ps.setBytes(6, item.getItempic());
            ps.setString(7, item.getAdminName());
            ps.setInt(8, item.getItemPrice()); 
            ps.setString(9, item.getItemSupplier());
            ps.setString(10, item.getItemModel());
             
             if(ps.executeUpdate() != 0)
                {
                    JOptionPane.showMessageDialog(null, "New Item Added");
                    isContactCreated = true;
                }
             else
                 {
                   JOptionPane.showMessageDialog(null, "Something Went Wrong");
                     isContactCreated = false;
                 }     
        } 
        
        catch (SQLException ex) {
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
        
       
        return isContactCreated;
    }
    
    
    // This is for updating the Items Table
     public boolean updateItem(Items item, boolean withImage)
    {
        boolean isItemUpdated = true;
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement pps;
        String updateQuery = "";
        
        // if the image is to be updated
        if(withImage ==  true)
        {
            updateQuery = "UPDATE items SET Item_name=?,Item_class=?,"
                    + "                             Item_Quantity=?,"
                    + "                                     Item_Image=?,Admin_Name=?,"
                    + "                                             item_price=?,Item_supplier=?,"
                    + "                                                     Item_model=? WHERE Item_number = ?";
            
             try {
            
                    pps = conn.prepareStatement(updateQuery);

                    pps.setString(1, item.getItemName());
                    pps.setString(2, item.getItemClass());
                    pps.setInt(3, item.getItemQuantity());
                    pps.setBytes(4, item.getItempic());
                    pps.setString(5, item.getAdminName());
                    pps.setInt(6, item.getItemPrice()); 
                    pps.setString(7, item.getItemSupplier());
                    pps.setString(8, item.getItemModel());
                    pps.setString(9, item.getItemNumber());

                     if(pps.executeUpdate() != 0)
                        {
                            JOptionPane.showMessageDialog(null, "Item Details Updated");
                            isItemUpdated = true;
                        }
                     else
                         {
                           JOptionPane.showMessageDialog(null, "Something Went Wrong");
                             isItemUpdated = false;
                         }     
                } 

                catch (SQLException ex) {
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

                }
        
        else  // if the image is not to be updated
        {
            updateQuery = "UPDATE items SET Item_name=?,Item_class=?,"
                    + "                             Item_Quantity=?,"
                    + "                                     Admin_Name=?,"  + " item_price=?,Item_supplier=?,"
                    + "                                                     Item_model=? WHERE Item_number = ?";
            
                        try {

                       pps = conn.prepareStatement(updateQuery);

                       pps.setString(1, item.getItemName());
                       pps.setString(2, item.getItemClass());
                       pps.setInt(3, item.getItemQuantity());
                       pps.setString(4, item.getAdminName());
                       pps.setInt(5, item.getItemPrice()); 
                       pps.setString(6, item.getItemSupplier());
                       pps.setString(7, item.getItemModel());
                       pps.setString(8, item.getItemNumber());

                        if(pps.executeUpdate() != 0)
                           {
                               JOptionPane.showMessageDialog(null, "Item Details Updated");
                               isItemUpdated = true;
                           }
                        else
                            {
                              JOptionPane.showMessageDialog(null, "Something Went Wrong");
                                isItemUpdated = false;
                            }     
                   } 

                   catch (SQLException ex) {
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
        }
        
               
       
        return isItemUpdated;
    }
   
     
     // Deleting the Items
      
    public void  deleteItems(String item)
    {
        
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps;
        
        try {
            
            ps = conn.prepareStatement("DELETE FROM items WHERE Item_number = ?");
         
            ps.setString(1, item);
            
             
             if(ps.executeUpdate() != 0)
                {
                    JOptionPane.showMessageDialog(null, "Item Deleted Successfully");
                }
             else
                 {
                   JOptionPane.showMessageDialog(null, "Something Went Wrong");
                 }     
        } 
        
        catch (SQLException ex) {
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
       
    }
    
    // Create a list of items
    
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
