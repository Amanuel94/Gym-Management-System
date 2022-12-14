/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymgui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author user
 */
public class UpdateProgg extends javax.swing.JFrame {

    /**
     * Creates new form UpdateProgg
     */
    public UpdateProgg() {
        int cur = 1;
        d = new DefaultTableModel(cur+1,1){
  
       public boolean isCellEditable(int rows, int cols){ 
           if(rows == cur)
           return false;
       else return true;}
       
       };
        d.setValueAt("Last Row", cur, 0);
        String[] idcol = {"Client ID"};
        d.setColumnIdentifiers(idcol);
        try {
            programs = this.getProg();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateProg.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        discard_regP_btn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registerP_btn1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        clr_regP_btn = new javax.swing.JButton();
        no_part = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        part_id = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        prog_id = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        discard_regP_btn2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registerP_btn2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        clr_regP_btn1 = new javax.swing.JButton();
        no_part1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        part_id1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        prog_id1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        discard_regP_btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        discard_regP_btn1.setText("Back");
        discard_regP_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discard_regP_btn1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Enter the number of new participants:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Register New Members");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Choose programme:");

        registerP_btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerP_btn1.setText("Register");
        registerP_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerP_btn1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Enter the members' IDs that participate in this program:");

        clr_regP_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clr_regP_btn.setText("Reset");
        clr_regP_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_regP_btnActionPerformed(evt);
            }
        });

        no_part.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        no_part.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                no_partStateChanged(evt);
            }
        });
        no_part.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                no_partPropertyChange(evt);
            }
        });

        part_id.setModel(d);
        jScrollPane3.setViewportView(part_id);

        jScrollPane1.setViewportView(jScrollPane3);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Select the last row of the table and click on Register when you are done.");

        prog_id.setModel(new DefaultComboBoxModel(this.programs));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(registerP_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(clr_regP_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(discard_regP_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(no_part, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(prog_id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(prog_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(no_part, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerP_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clr_regP_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discard_regP_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Register new member", jPanel2);

        discard_regP_btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        discard_regP_btn2.setText("Back");
        discard_regP_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discard_regP_btn2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Number of the memberrs/participants to be removed:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Remove existing member");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Choose programme:");

        registerP_btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerP_btn2.setText("Remove");
        registerP_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerP_btn2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Enter the ID of the participant to be removed from the program:");

        clr_regP_btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clr_regP_btn1.setText("Reset");
        clr_regP_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_regP_btn1ActionPerformed(evt);
            }
        });

        no_part1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        no_part1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                no_part1StateChanged(evt);
            }
        });
        no_part1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                no_part1PropertyChange(evt);
            }
        });

        part_id1.setModel(d);
        jScrollPane4.setViewportView(part_id1);

        jScrollPane2.setViewportView(jScrollPane4);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("Select the last row of the table and click on Register when you are done.");

        prog_id1.setModel(new DefaultComboBoxModel(this.programs));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(registerP_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(clr_regP_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(discard_regP_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(no_part1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(prog_id1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane2)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(prog_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(no_part1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerP_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clr_regP_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discard_regP_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Remove existing member", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void discard_regP_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discard_regP_btn1ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });

        this.dispose();
    }//GEN-LAST:event_discard_regP_btn1ActionPerformed

    private void registerP_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerP_btn1ActionPerformed
        // TODO add your handling code here:
        String old;
        try{
            String id = prog_id.getSelectedItem().toString();
            conn = new DBConnection();
            Connection db = conn.getDB();
            int l = part_id.getRowCount()-1;
            String[] parts = new String[l];
            for (int i = 0; i < l; i++) {
                parts[i] = part_id.getValueAt(i, 0).toString();
            }
            PreparedStatement update_prog = db.prepareStatement("INSERT INTO client_programme(cid, pid) VALUES(?,?);");

                    for (int j = 0; j < l; j++) {
                        old = parts[j];
                        update_prog.setString(1,parts[j]);
                        update_prog.setString(2, id);
                        update_prog.executeUpdate();

                    }

                
                update_prog.close();
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Programme is now updated successfully!");
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {

                        Home wind = new Home();
                        wind.setVisible(true);
                    }
                });

                this.dispose();
            

        }
        catch(Exception e){
            String msg = e.toString();
            //e.printStackTrace();

            if(msg.contains("Duplicate"))javax.swing.JOptionPane.showMessageDialog(rootPane, "Some of the clients already participate in the selected programme.");
            else if (msg.contains("NullPointerException")){
                //                conn = new DBConnection();
                //                Connection db = conn.getDB();
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Make sure that you have filled everything and clicked the last row of the table.");
                //                PreparedStatement rs = db.prepareStatement("DELETE FROM programme WHERE prg_name = \"" + prog_name.getText() + "\";");
                //                rs.executeUpdate();
                //                rs.close();

            }
            else javax.swing.JOptionPane.showMessageDialog(rootPane, "Unknown error occured. Check if all the client ID's exist.");
        }

    }//GEN-LAST:event_registerP_btn1ActionPerformed

    private void clr_regP_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_regP_btnActionPerformed
        // TODO add your handling code here:
        no_part.setValue(1);
        int cur = 1;
        DefaultTableModel init = new DefaultTableModel(cur + 1,1){

            public boolean isCellEditable(int rows, int cols){
                if(rows == cur)
                return false;
                else return true;}

        };
        String[] idcol = {"Client ID"};
        init.setColumnIdentifiers(idcol);
        part_id.setModel(init);
        //        emp_branch.setSelectedIndex(0);
        //        emp_phone.setText("");
        //        emp_address.setText("");
    }//GEN-LAST:event_clr_regP_btnActionPerformed

    private void no_partStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_no_partStateChanged
        // TODO add your handling code here:

        int cur = (int) no_part.getValue();
        DefaultTableModel d = new DefaultTableModel(cur+1,1){

            public boolean isCellEditable(int rows, int cols){
                if(rows == cur)
                return false;
                else return true;}

        };
        d.setValueAt("Last row", cur, 0);

        String[] idcol = {"Client ID"};
        d.setColumnIdentifiers(idcol);

        part_id.setModel(d);

    }//GEN-LAST:event_no_partStateChanged

    private void no_partPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_no_partPropertyChange

    }//GEN-LAST:event_no_partPropertyChange

    private void discard_regP_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discard_regP_btn2ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });

        this.dispose();
    }//GEN-LAST:event_discard_regP_btn2ActionPerformed

    private void registerP_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerP_btn2ActionPerformed
        // TODO add your handling code here:
        try{
            String id = prog_id1.getSelectedItem().toString();
            conn = new DBConnection();
            Connection db = conn.getDB();
            int l = part_id1.getRowCount()-1;
            String[] parts = new String[l];
            for (int i = 0; i < l; i++) {
                parts[i] = part_id1.getValueAt(i, 0).toString();
            }
            PreparedStatement update_prog = db.prepareStatement("DELETE FROM client_programme WHERE cid = ? AND  pid = ?;");

                    for (int j = 0; j < l; j++) {
                        update_prog.setString(1,parts[j]);
                        update_prog.setString(2, id);
                        System.out.println(update_prog.toString());
                        update_prog.executeUpdate();

                    }

                
                update_prog.close();
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Programme is now updated successfully!");
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {

                        Home wind = new Home();
                        wind.setVisible(true);
                    }
                });

                this.dispose();
            

        }
        catch(Exception e){
            String msg = e.toString();
            e.printStackTrace();

            if(msg.contains("Duplicate"))javax.swing.JOptionPane.showMessageDialog(rootPane, "Some of the clients already participate in the selected programme.");
            else if (msg.contains("NullPointerException")){
                //                conn = new DBConnection();
                //                Connection db = conn.getDB();
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Make sure that you have filled everything and clicked the last row of the table.");
                //                PreparedStatement rs = db.prepareStatement("DELETE FROM programme WHERE prg_name = \"" + prog_name.getText() + "\";");
                //                rs.executeUpdate();
                //                rs.close();

            }
            else javax.swing.JOptionPane.showMessageDialog(rootPane, "Unknown error occured. Check if all the client ID's exist.");
        }

    }//GEN-LAST:event_registerP_btn2ActionPerformed

    private void clr_regP_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_regP_btn1ActionPerformed
        // TODO add your handling code here:
        no_part1.setValue(1);
        int cur = 1;
        DefaultTableModel init = new DefaultTableModel(cur + 1,1){
  
       public boolean isCellEditable(int rows, int cols){ 
           if(rows == cur)
           return false;
       else return true;}
       
       };
        String[] idcol = {"Client ID"};
        init.setColumnIdentifiers(idcol);
        part_id1.setModel(init);
    }//GEN-LAST:event_clr_regP_btn1ActionPerformed

    private void no_part1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_no_part1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_no_part1StateChanged

    private void no_part1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_no_part1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_no_part1PropertyChange

    /**
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
            java.util.logging.Logger.getLogger(UpdateProgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProgg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clr_regP_btn;
    private javax.swing.JButton clr_regP_btn1;
    private javax.swing.JButton discard_regP_btn;
    private javax.swing.JButton discard_regP_btn1;
    private javax.swing.JButton discard_regP_btn2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JSpinner no_part;
    private javax.swing.JSpinner no_part1;
    private javax.swing.JTable part_id;
    private javax.swing.JTable part_id1;
    private javax.swing.JComboBox<String> prog_id;
    private javax.swing.JComboBox<String> prog_id1;
    private javax.swing.JButton registerP_btn1;
    private javax.swing.JButton registerP_btn2;
    // End of variables declaration//GEN-END:variables
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
