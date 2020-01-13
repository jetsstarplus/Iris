/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heightech;

import Administrators.AdminSystem;
import Databases.DatabaseConnection;
import PrinterDesign.Block;
import PrinterDesign.Board;
import PrinterDesign.Table;
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author User
 */
public class UpdateInventory extends javax.swing.JFrame {

    /**
     * Creates new form UpdateInventory
     */
    public UpdateInventory() {
        super("Iris Vision Dynamics");
        
        initComponents();
        populateJtableInventory();
        jTableUpdate.setShowGrid(true);
        jTableUpdate.setGridColor(Color.black);
        setIcon();
        
        int count = 0;
        
                          String company = ""
                                    + "HEIGHTECK BUSINESS SOLUTIONS\n"
                                    + "KITENGELA BEHIND KOBIL PETROL STATION\n"
                                    + "Land: 812254630 Mob: 0722382898 Mob2: 0701850242\n"
                                    + " \n"
                                    + "CUSTOMER INVOICE\n"
                                    + " \n";
                            
                     List<String> headersList = Arrays.asList("", "ITEM NAME", "DESCRIPTION", "QUANTITY", "PRICE");
                    List<List<String>> rowsList = Arrays.asList(
                            Arrays.asList(Integer.toString((int)jTableUpdate.getModel().getValueAt(0, 0)), (String)jTableUpdate.getModel().getValueAt(0, 1), (String)jTableUpdate.getModel().getValueAt(0, 2),
                                                Integer.toString((int)jTableUpdate.getModel().getValueAt(0, 3)), Integer.toString((int)jTableUpdate.getModel().getValueAt(0, 4))),
                            Arrays.asList(Integer.toString((int)jTableUpdate.getModel().getValueAt(1, 0)), (String)jTableUpdate.getModel().getValueAt(1, 1), (String)jTableUpdate.getModel().getValueAt(1, 2),
                                                Integer.toString((int)jTableUpdate.getModel().getValueAt(1, 3)), Integer.toString((int)jTableUpdate.getModel().getValueAt(1, 4))),
                            Arrays.asList("Rea", "Female", "No", "30", "10000.00"),
                            Arrays.asList("Deandre", "Female", "No", "19", "18000.50"),
                            Arrays.asList("Alice", "Male", "Yes", "29", "580.40"),
                            Arrays.asList("Alyse", "Female", "No", "26", "7000.89"),
                            Arrays.asList("Venessa", "Female", "No", "22", "100700.50"),
       
                            getItem(getItemPlace())
                    );
                            
                           // List<List<String>> rowsist = getItem
                    
                   // );
                       
                    String advertise = "Your Electronic Store\n\nsolution by iriskenya.com\n"
                                        +"0701850242";
                    
                    //bookmark 1
                    Board board = new Board(210);
                    Block contents = new Block(board, 75, 7, company).allowGrid(false).setBlockAlign(Block.BLOCK_CENTRE).setDataAlign(Block.DATA_CENTER);
                    Table table = new Table(board, 210, headersList, rowsList);
                    board.setInitialBlock(contents);
                    board.appendTableTo(0, Board.APPEND_BELOW, table);
                    List<Integer> colAlignList = Arrays.asList(
                        Block.DATA_CENTER, 
                        Block.DATA_CENTER, 
                        Block.DATA_CENTER, 
                        Block.DATA_CENTER, 
                        Block.DATA_CENTER);
                    table.setColAlignsList(colAlignList);
                    //Block tableBlock = table.tableToBlocks();
                    //board.setInitialBlock(tableBlock);
                   // board.getBlock(1).setBelowBlock(new Block(board, 75, 7, advertise).allowGrid(false).setBlockAlign(Block.BLOCK_CENTRE).setDataAlign(Block.DATA_CENTER));
                    Block sign1Block = new Block(board, 75, 7, advertise).allowGrid(false).setBlockAlign(Block.BLOCK_CENTRE).setDataAlign(Block.DATA_CENTER);
                    //B.setBelowBlock(sign1Block);
                    board.build();
                    String tableString = board.getPreview();
                    
                    
                    table.setGridMode(Table.GRID_NON);
                    System.out.println(tableString);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUpdate = new javax.swing.JTable();
        jButtonPrintReset = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        RESET = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE INVENTORY");

        jLabelPrice.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelPrice.setForeground(new java.awt.Color(153, 255, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Total:");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 0)));

        jTableUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 204, 0)));
        jTableUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableUpdate);

        jButtonPrintReset.setBackground(new java.awt.Color(255, 102, 102));
        jButtonPrintReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPrintReset.setText("PRINT AND RESET");

        jButtonPrint.setBackground(new java.awt.Color(255, 153, 51));
        jButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPrint.setText("PRINT");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jButtonClose.setBackground(new java.awt.Color(204, 0, 0));
        jButtonClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonClose.setText("CLOSE");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(255, 102, 51));
        RESET.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPrintReset, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jButtonPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPrintReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
       printDocument();
    }//GEN-LAST:event_jButtonPrintActionPerformed

    /** This area will be reseting the inventory table*/
    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
       int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Reset The Inventory?","RESET", YES_NO_OPTION, WARNING_MESSAGE);
       
       if(x==0)
       {
           resetDatabase();
       }
    }//GEN-LAST:event_RESETActionPerformed
  /** This method populates the inventory table */
     public final void populateJtableInventory()
    {
        Connection conn = DatabaseConnection.getConnection();
        Statement statement;
        ResultSet rset;
        
        try {
            statement = conn.createStatement();
            rset = statement.executeQuery("SELECT COUNT(*) FROM inventory");
            int price= 0;
            InventoryQuery uq = new InventoryQuery();
            
            ArrayList<Inventory> sList = uq.itemList();
            
            String[] colNames = {"", "Item Name", "Item Number", "Quantity", "Total Price"};
            Object[][] rows = new Object[sList.size()][7];
            
            int j = 1;
            
            while(rset.next())
            {
                for(int i = 0; i<sList.size(); i++)
                {
                   rows[i][0] = j;
                  rows[i][1] = sList.get(i).getItem_name();
                  rows[i][2] = sList.get(i).getItem_number();
                  rows[i][3] = sList.get(i).getItem_Quantity();
                  rows[i][4] = sList.get(i).getItem_Quantity()*sList.get(i).getPrice();
                  SupplierDisplayModel md = new SupplierDisplayModel(rows, colNames);
                  jTableUpdate.setModel(md);
                  jTableUpdate.setRowHeight(28);
                  /** @price returns the total price of the items that are already sold out*/
                  price += sList.get(i).getItem_Quantity()*sList.get(i).getPrice();
                  
                  
                  DefaultTableCellRenderer center = new DefaultTableCellRenderer();
                center.setHorizontalAlignment(JLabel.CENTER);
                jTableUpdate.setDefaultRenderer(String.class, center);
                
                  JTableHeader th =jTableUpdate.getTableHeader();
                  th.setBackground(Color.green);
                  th.setFont(new Font("Tahoma",Font.BOLD, 12));
                     th.setForeground(Color.blue);
                    j++;
                }
                
                jLabelPrice.setText("KSH: " + Integer.toString(price));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(Suppliers.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        finally
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
     
     /** This function prints all the data in the table to a static file in the system*/
     public void printDocument()
     {
         String name = "C:\\Users\\User\\Documents\\Inventory"+random()+".txt";
         StringBuilder str = new StringBuilder();
        try { 
            File file = new File(name);
            
            
            file.createNewFile();
            
             try (FileWriter write = new FileWriter(name)) {
                 str.append("    ");
                 str.append("Item Name    ");
                 str.append("Item Number    ");
                 str.append("Quantities     ");
                 str.append("Total Prices     \n");
                 for(int i=0; i<jTableUpdate.getRowCount(); i++)
                 {
                     for(int j=0; j<jTableUpdate.getColumnCount(); j++)
                     {
                         Object cell = jTableUpdate.getModel().getValueAt(i, j)+ "         ";
                        str.append(cell);
                     }
                     str.append("\n--------------------------------------------------------------------------------\n");
                     
                 }
                 write.write(str.toString());
                 write.flush();
             }
        } catch (IOException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
   public final List getItem(int col)
   {
       
       List item = null;
       
                       item = Arrays.asList(Integer.toString((int)jTableUpdate.getModel().getValueAt(col, 0)), (String)jTableUpdate.getModel().getValueAt(col, 1), (String)jTableUpdate.getModel().getValueAt(col, 2),
                                                Integer.toString((int)jTableUpdate.getModel().getValueAt(col, 3)), Integer.toString((int)jTableUpdate.getModel().getValueAt(col, 4)));
                     
       return item;
      
   }
      
   public final int getItemPlace()
   {
       int itemPlace = 0;
       
       for(int j=0; j<jTableUpdate.getRowCount(); j++)
                     {
                         itemPlace = j;
                         System.out.println(itemPlace);
                     }
       return itemPlace;
   }
   
   
       /**
     * @return this function produces the transaction id*/
   public int random()
   {
       int x=ThreadLocalRandom.current().nextInt(0, 100000000);
       
       return x;
   }
       //setting upp the logo
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("MainLogo.png")));
    }


 private void resetDatabase()
 {
     Connection conn = DatabaseConnection.getConnection();
           Statement st;
           
           ResultSet rs;
           try {
               st = conn.createStatement();
               rs=st.executeQuery("DELETE FROM INVENTORY");
               
              while(rs.next())
              {
                  JOptionPane.showMessageDialog(null, "Reset Successful", "RESET", INFORMATION_MESSAGE);
              }
           } catch (SQLException ex) {
               Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
           }
 }
    /**d
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RESET;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonPrintReset;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableUpdate;
    // End of variables declaration//GEN-END:variables
}
