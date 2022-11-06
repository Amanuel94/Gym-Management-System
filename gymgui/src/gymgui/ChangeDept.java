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


public class ChangeDept extends javax.swing.JDialog {


    public ChangeDept(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            this.branches = getBranches();
            initComponents();
        } catch (SQLException ex) {
            Logger.getLogger(ChangeDept.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChangeDept.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        new_head = new javax.swing.JTextField();
        chng_btn = new javax.swing.JButton();
        del_cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        change_dept_branch = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        change_dept_name = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Change Department Data");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Select Department");

        new_head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_headActionPerformed(evt);
            }
        });

        chng_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chng_btn.setText("Change");
        chng_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chng_btnActionPerformed(evt);
            }
        });

        del_cancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        del_cancel.setText("Cancel");
        del_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_cancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Select the Branch of the Department:");

        change_dept_branch.setModel(new DefaultComboBoxModel(this.branches));
        change_dept_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_dept_branchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Enter the new head ID:");

        change_dept_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Human Resources", "Health and Paramedics", "Instructors/Trainers", "Others" }));
        change_dept_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_dept_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(change_dept_branch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(change_dept_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(new_head)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(chng_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(del_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(change_dept_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(change_dept_name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(new_head, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chng_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void new_headActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:
    }

    private void chng_btnActionPerformed(java.awt.event.ActionEvent evt) {
        
            // TODO add your handling code here:
            String msg = "Are you sure you want to change the department head to "+ new_head.getText();
            try {
            conn = new DBConnection();
            Connection db = conn.getDB();
            String query = "UPDATE department SET dept_head = ? WHERE dept_name = ? AND dept_branch = ?;";
            PreparedStatement cng_dep = db.prepareStatement(query);
            cng_dep.setString(1, new_head.getText());
            cng_dep.setString(2, change_dept_name.getSelectedItem().toString());
            cng_dep.setString(3, change_dept_branch.getSelectedItem().toString());
            int res = javax.swing.JOptionPane.showConfirmDialog(rootPane, msg);
            if(res == javax.swing.JOptionPane.YES_OPTION){
            
            cng_dep.executeUpdate();
           
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Changed successfully!");}
            
            else if(res == javax.swing.JOptionPane.NO_OPTION){}
            else {this.dispose(); new Home();}
        } catch (Exception ex) {
            String err = ex.toString();
            if (err.contains("NullPointer")) javax.swing.JOptionPane.showMessageDialog(rootPane, "There is unfilled required position");
            else if(err.contains("intergrity_const")) javax.swing.JOptionPane.showMessageDialog(rootPane, "Only an employee from the \'Executives and Heads\' department can be a head of a department.");
            else javax.swing.JOptionPane.showMessageDialog(rootPane, "Oops! Unknown error occured with the database.");
        }
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

    private void change_dept_branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_dept_branchActionPerformed
        // TODO add your handling code here:
    }

    private void change_dept_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_dept_nameActionPerformed
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeDept dialog = new ChangeDept(new javax.swing.JFrame(), true);
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


    private javax.swing.JComboBox<String> change_dept_branch;
    private javax.swing.JComboBox<String> change_dept_name;
    private javax.swing.JButton chng_btn;
    private javax.swing.JButton del_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField new_head;

private DBConnection conn;
    private String[] branches;
    
    
    private String[] getBranches() throws SQLException, ClassNotFoundException {
       ArrayList<String> branches = new ArrayList<String>();
       String entry = "";
        try{conn = new DBConnection();
        Connection db = conn.getDB();
        Statement fetch = db.createStatement();
        ResultSet rs = fetch.executeQuery("SELECT bid FROM branch;");
        while(rs.next()){
        entry = rs.getInt("bid") + "";
        branches.add(entry);
        }}
        catch (Exception e){System.out.println(e);}
        return (String[]) branches.toArray(new String[branches.size()]);
        
    }
    
}
