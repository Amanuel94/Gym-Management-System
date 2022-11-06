/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gymgui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class DeleteProg extends javax.swing.JDialog {

    public DeleteProg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            this.programs = getProg();
        } catch (SQLException ex) {
            Logger.getLogger(DeleteProg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteProg.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        del_prog = new javax.swing.JButton();
        del_cancel = new javax.swing.JButton();
        prog_id1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete programme");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Delete an Employee Record");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Choose the programme ID:");

        del_prog.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        del_prog.setText("Delete");
        del_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_progActionPerformed(evt);
            }
        });

        del_cancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        del_cancel.setText("Cancel");
        del_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_cancelActionPerformed(evt);
            }
        });

        prog_id1.setModel(new DefaultComboBoxModel(this.programs));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(del_prog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prog_id1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(prog_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(del_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void del_progActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         String msg = "Are you sure you want to delete the program with id "+ prog_id1.getSelectedItem().toString();
        int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, msg);
        if(res == javax.swing.JOptionPane.YES_OPTION){
            try{
        conn = new DBConnection();
        Connection db = conn.getDB();
        String query =  "DELETE FROM programme WHERE pid = " + prog_id1.getSelectedItem().toString();
        PreparedStatement del_prg = db.prepareStatement(query);
        del_prg.executeUpdate();
        del_prg.close();
           
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Record Deleted successfully!");
        }
        catch(Exception e){
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Unknown Error Occured with the database");
        
        
        
        
        }
        
            
            
            
         }
        else if(res == javax.swing.JOptionPane.NO_OPTION){}
        else {this.dispose(); new Home();}
        
        
       
    }

    private void del_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_cancelActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteProg dialog = new DeleteProg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    private javax.swing.JButton del_cancel;
    private javax.swing.JButton del_prog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> prog_id1;

private DBConnection conn;
    private String[] programs;
    private DefaultTableModel d;
     private String[] getProg() throws SQLException, ClassNotFoundException {
       ArrayList<String> progs = new ArrayList<String>();
       String entry = "";
        try{conn = new DBConnection();
        Connection db = conn.getDB();
        Statement fetch = db.createStatement();
        ResultSet rs = fetch.executeQuery("SELECT pid FROM programme;");
        while(rs.next()){
        entry = rs.getInt("pid") + "";
       progs.add(entry);
        }}
        catch (Exception e){javax.swing.JOptionPane.showMessageDialog(rootPane, "Error occured with the database.");}
        return (String[]) progs.toArray(new String[progs.size()]);
        
    }
}
