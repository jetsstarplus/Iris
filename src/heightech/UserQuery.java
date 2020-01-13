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
public class UserQuery {
    
    public ArrayList<UserSetters> usersList()
    {
        ArrayList<UserSetters> uList = new ArrayList<UserSetters>();
        Connection conn = DatabaseConnection.getConnection();
        
        Statement st;
        ResultSet rs;
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT user_first, user_last, user_email, user_ID_No, "
                    + "user_Phone, user_uid, user_Pass FROM users ORDER BY user_first ASC");
            
            UserSetters users;
            
            while(rs.next())
            {
                users = new UserSetters(rs.getString("user_first"), rs.getString("user_last"),
                        rs.getString("user_email"), rs.getInt("user_ID_No"),                        
                        rs.getString("user_Phone"), rs.getString("user_uid"), rs.getString("user_Pass"));
                
                uList.add(users);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return uList;
    }
}
