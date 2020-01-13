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
public class SupplierQuery {
    
    public ArrayList<SupplierContacts> supplierList()
    {
        ArrayList<SupplierContacts> sList = new ArrayList<SupplierContacts> ();
        Connection conn = DatabaseConnection.getConnection();
        
        Statement st;
        ResultSet rs;
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT sup_Name, Sup_Email, Sup_Phone, Sup_Address, Sup_Main FROM suppliers ORDER by sup_Name ASC");
            
            SupplierContacts supplier;
            
            while(rs.next())
            {
                supplier = new SupplierContacts(rs.getString("sup_Name"), 
                                rs.getString("Sup_Email"),rs.getString("Sup_Phone"), rs.getString("Sup_Address"), 
                                        rs.getString("Sup_Main"));
                sList.add(supplier);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(SupplierQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return sList;
    }
    
    
}
