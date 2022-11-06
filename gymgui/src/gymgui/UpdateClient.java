/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gymgui;


import java.io.FileWriter;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
public class UpdateClient extends javax.swing.JDialog {


    public UpdateClient(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        client_dob_up = new com.toedter.calendar.JDateChooser();
        updateC_btn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        clr_upC_btn = new javax.swing.JButton();
        join_date_up = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        membership_type_up = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        client_phone_up = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        client_address_up = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        client_fname_up = new javax.swing.JTextField();
        client_lname_up = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        m_client_up = new javax.swing.JRadioButton();
        f_client_up = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        discard_upC_btn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        update_client_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        client_update_desc = new javax.swing.JTextArea();
        fetch_cl = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Client Record");

        updateC_btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateC_btn1.setText("Update");
        updateC_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateC_btn1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Enter the client's membership date:");

        clr_upC_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clr_upC_btn.setText("Reset");
        clr_upC_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_upC_btnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Choose the client's membership type:");

        membership_type_up.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platinum Tier", "Golden Tier", "None" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Enter client's phone number:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Enter client's address:");

        client_address_up.setColumns(20);
        client_address_up.setLineWrap(true);
        client_address_up.setRows(5);
        client_address_up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                client_address_upKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(client_address_up);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Update a Client Record");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Enter the client's full name:");

        client_fname_up.setText("First Name");

        client_lname_up.setText("Last name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enter the client's sex:");

        m_client_up.setSelected(true);
        m_client_up.setText("Male");
        m_client_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_client_upActionPerformed(evt);
            }
        });

        f_client_up.setText("Female");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Enter the client's date of birth:");

        discard_upC_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        discard_upC_btn.setText("Back");
        discard_upC_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discard_upC_btnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Enter the client's ID:");

        update_client_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_client_idActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Brief description:");

        client_update_desc.setColumns(20);
        client_update_desc.setRows(5);
        jScrollPane2.setViewportView(client_update_desc);

        fetch_cl.setText("Fetch Currunt Record");
        fetch_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetch_clActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_client_up, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f_client_up, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(client_phone_up, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(join_date_up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(client_dob_up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(membership_type_up, 0, 193, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(update_client_id, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(client_fname_up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(client_lname_up, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(fetch_cl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(updateC_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(clr_upC_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(discard_upC_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update_client_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fetch_cl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(client_fname_up, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(client_lname_up, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(m_client_up)
                    .addComponent(f_client_up))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(client_dob_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(join_date_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(membership_type_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(client_phone_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateC_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clr_upC_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discard_upC_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateC_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateC_btn1ActionPerformed
        // TODO add your handling code here:
        Connection db = conn.getDB();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String id; 
        if(update_client_id.getText().equals(""))javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid ID");
        else {id = update_client_id.getText();

        String sqlstring = "UPDATE client SET cfame = ?, clname = ?, csex = ?, cdob = ?, cstart_date = ?, ctier = ?, cphone = ?, caddress = ? WHERE cid = " + id + ";";
        try {
            PreparedStatement stmt = db.prepareStatement(sqlstring);
            stmt.setString(1, client_fname_up.getText());
            stmt.setString(2, client_lname_up.getText());
            stmt.setString(3, ((m_client_up.isSelected())? "M": "F"));
            stmt.setString(4, dateFormat.format(client_dob_up.getDate()));
            stmt.setString(5, dateFormat.format(join_date_up.getDate()));
            stmt.setString(6, membership_type_up.getSelectedItem().toString());
            stmt.setString(7, client_phone_up.getText());
            stmt.setString(8, client_address_up.getText());
            stmt.executeUpdate();
            
            FileWriter update_desc = new FileWriter("desc.txt");
            Date now = new Date();
            String file = now.toString() + "  |" + id + "|  " +  client_update_desc.getText() + "\n";
            update_desc.append(file);
            update_desc.close();
            
          javax.swing.JOptionPane.showMessageDialog(rootPane, "Client record is updated sucessfully!");
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });
    
        this.dispose();
        
        }
        catch (Exception ex){
          String msg = ex.toString();

            if(msg.contains("Null")) javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid Entry: all fields are required. Check you have filled all the fields correctly.");
            else if(msg.contains("dob_constraint")) javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid DOB: Check the client's date of birth and try again.");
            else if(msg.contains(""))javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid membership-date: The client's start date shouldn't \n 1. be earlier than the branch's opening date\n 2. later than today.");
            else javax.swing.JOptionPane.showMessageDialog(rootPane, "Error occured: Check your inputs and try again.");
        
        }
        
        }  
    }

    
    private void clr_upC_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_upC_btnActionPerformed
        // TODO add your handling code here:

        client_fname_up.setText("");
        client_lname_up.setText("");
        client_dob_up.setCalendar(null);
        join_date_up.setCalendar(null);
        membership_type_up.setSelectedIndex(0);
        client_phone_up.setText("");
        client_address_up.setText("");
        

    }

    private void client_address_upKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if(client_address_up.getText().length()>=15){}
    }

    private void m_client_upActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void discard_upC_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });

        this.dispose();
    }

    private void update_client_idActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fetch_clActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
     String id;
    if(update_client_id.getText().equals(""))javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid ID");
    else {
    id = update_client_id.getText();
    try{
        conn = new DBConnection();
        Connection db = conn.getDB();
        Statement fetch = db.createStatement();
        ResultSet rs = fetch.executeQuery("SELECT * FROM client WHERE cid = " + id + ";");
        rs.next();
        client_fname_up.setText(rs.getString("cfame"));
        client_lname_up.setText(rs.getString("clname"));
        
       m_client_up.setSelected(rs.getString("csex").equals("M"));
       f_client_up.setSelected(rs.getString("csex").equals("F"));

        client_dob_up.setDate(rs.getDate("cdob"));
        join_date_up.setDate(rs.getDate("cstart_date"));
        membership_type_up.setSelectedItem(rs.getString("ctier"));
        client_phone_up.setText(rs.getString("cphone"));
        client_address_up.setText(rs.getString("caddress"));
        
    }catch(Exception ex){
             String msg =  ex.toString();   
             javax.swing.JOptionPane.showMessageDialog(rootPane, ex);
             if(msg.contains("empty result set"))javax.swing.JOptionPane.showMessageDialog(rootPane, "There is no client with such ID");
             else javax.swing.JOptionPane.showMessageDialog(rootPane, "Oops! An Error Occured!");
    } 
    }
    
    }//GEN-LAST:event_fetch_clActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateClient dialog = new UpdateClient(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea client_address_up;
    private com.toedter.calendar.JDateChooser client_dob_up;
    private javax.swing.JTextField client_fname_up;
    private javax.swing.JTextField client_lname_up;
    private javax.swing.JTextField client_phone_up;
    private javax.swing.JTextArea client_update_desc;
    private javax.swing.JButton clr_upC_btn;
    private javax.swing.JButton discard_upC_btn;
    private javax.swing.JRadioButton f_client_up;
    private javax.swing.JButton fetch_cl;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser join_date_up;
    private javax.swing.JRadioButton m_client_up;
    private javax.swing.JComboBox<String> membership_type_up;
    private javax.swing.JButton updateC_btn1;
    private javax.swing.JTextField update_client_id;

private DBConnection conn;

}
