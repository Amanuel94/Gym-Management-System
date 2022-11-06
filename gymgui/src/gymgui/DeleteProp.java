/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gymgui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DeleteProp extends javax.swing.JDialog {


    public DeleteProp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        del_prog = new javax.swing.JButton();
        del_cancel = new javax.swing.JButton();
        del = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enter the property ID of the property record:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Delete a Property Record");

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

        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(del_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(del_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(del_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void del_progActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_progActionPerformed
                String id =  del.getText();
        String sqlstring1 = "DELETE FROM property WHERE prop_id = " + id + ";";
        String sqlstring2 = "SELECT * FROM property WHERE prop_id = " + id + ";";

        if(id.equals("")) javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid ID");
        else{
        try{    
            
            
        String msg = "Are you sure you want to delete a property record with id "+ id + "?";
        int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, msg);
        if(res == javax.swing.JOptionPane.YES_OPTION){
            
            conn = new DBConnection();
            Connection db = conn.getDB();
            
            PreparedStatement del_smnt = db.prepareStatement(sqlstring1);
            Statement check = db.createStatement();
            ResultSet rs = check.executeQuery(sqlstring2);
            rs.next();
            rs.getString("prop_id");
            del_smnt.executeUpdate();
            
            
            
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Record Deleted successfully!");}
        else if(res == javax.swing.JOptionPane.NO_OPTION){}
        else {this.dispose(); new Home();}}
        catch (Exception ex){
        String msg = ex.toString();
             if(msg.contains("empty result set"))javax.swing.JOptionPane.showMessageDialog(rootPane, "There is no property with such ID");
             else javax.swing.JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
        }
    }

    private void del_cancelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });
        this.dispose();
    }

    private void delActionPerformed(java.awt.event.ActionEvent evt) {

    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteProp dialog = new DeleteProp(new javax.swing.JFrame(), true);
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


    private javax.swing.JTextField del;
    private javax.swing.JButton del_cancel;
    private javax.swing.JButton del_prog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;

    private DBConnection conn;
}
