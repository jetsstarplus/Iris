/*
 * The MIT License
 *
 * Copyright 2019 User.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Administrators;

import Administrators.AdminModel;
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
 * This class querries the administrator and places the items into an arraylist to be displayed to a
 * Jtable in the add admin
 */
public class AdminQuery {
    public ArrayList<AdminModel> adminSystem()
    {
        ArrayList<AdminModel> admin = new ArrayList();
        Connection conn = DatabaseConnection.getConnection();
        
        Statement st;
        ResultSet rs;
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT Admin_first, Admin_Last, Admin_Phone, Admin_Id_No FROM Admin");
            
            AdminModel adminn;
            while(rs.next())
            {
                adminn = new AdminModel(rs.getString("Admin_First"), rs.getString("Admin_Last"), rs.getString("Admin_Phone"), rs.getInt("Admin_Id_No"));
                
                admin.add(adminn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return admin;
    }
}
