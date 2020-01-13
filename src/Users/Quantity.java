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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author User
 */
public class Quantity {

    public boolean Quantity(String item) {
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        boolean checkQuantity = false;
        int quantity=0;
        try {
            ps = conn.prepareStatement("SELECT Item_Quantity FROM items WHERE Item_number = ?");
            ps.setString(1, item);
            rs = ps.executeQuery();
            while(rs.next())
            {
                quantity = rs.getInt("Item_Quantity");
               // System.out.println(quantity);
             if(quantity < 1)
             {
                 JOptionPane.showMessageDialog(null, "Item Out Of Stock", "ERROR!!!", ERROR_MESSAGE);
                 checkQuantity = false;
             }
             
             else
             {
                 checkQuantity = true;
             }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Quantity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Quantity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return checkQuantity;
    }

}
