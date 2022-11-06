/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gymgui;


import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
public class RegisterClient extends javax.swing.JDialog {


    public RegisterClient(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try{
        branches = this.getBranches();
    }
    catch (Exception e){System.out.println(e);}
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        birthdayEvaluator1 = new com.toedter.calendar.demo.BirthdayEvaluator();
        birthdayEvaluator2 = new com.toedter.calendar.demo.BirthdayEvaluator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        client_fname = new javax.swing.JTextField();
        client_lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        m_client = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        client_dob = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        join_date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        membership_type = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        client_phone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        client_address = new javax.swing.JTextArea();
        discard_regC_btn = new javax.swing.JButton();
        registerC_btn1 = new javax.swing.JButton();
        clr_regC_btn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        client_branch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register a new Client");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Register a New Client");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Enter the client's full name:");

        client_fname.setText("First Name");

        client_lname.setText("Last name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enter the client's sex:");

        buttonGroup1.add(m_client);
        m_client.setText("Male");
        m_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_clientActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Female");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Enter the client's date of birth:");

        client_dob.setDateFormatString("yyyy/MM/dd");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Enter the client's membership date:");

        join_date.setDateFormatString("yyyy/MM/dd");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Choose the client's membership type:");

        membership_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platinum Tier", "Golden Tier", "None" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Enter client's phone number:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Enter client's address:");

        client_address.setColumns(20);
        client_address.setLineWrap(true);
        client_address.setRows(5);
        client_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                client_addressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(client_address);

        discard_regC_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        discard_regC_btn.setText("Back");
        discard_regC_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discard_regC_btnActionPerformed(evt);
            }
        });

        registerC_btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerC_btn1.setText("Register");
        registerC_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerC_btn1ActionPerformed(evt);
            }
        });

        clr_regC_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clr_regC_btn.setText("Reset");
        clr_regC_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_regC_btnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Choose the client's registration branch ID");

        client_branch.setModel(new DefaultComboBoxModel(this.branches));
        client_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_branchActionPerformed(evt);
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
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(client_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(client_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(m_client, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(client_phone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(client_branch, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(join_date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(client_dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(membership_type, 0, 193, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(registerC_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(clr_regC_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(discard_regC_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(client_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(client_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(m_client)
                    .addComponent(jRadioButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(client_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(join_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(membership_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(client_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(client_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clr_regC_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discard_regC_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerC_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_clientActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void client_addressKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if(client_address.getText().length()>=15){}
    }

    private void discard_regC_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });
    
        this.dispose();
    }

    private void clr_regC_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        client_fname.setText("");
        client_lname.setText("");

        client_dob.setCalendar(null);
        join_date.setCalendar(null);
//        client_dob.setDate(TODAY);
//        join_date.setDate(TODAY);
        membership_type.setSelectedIndex(0);
        client_phone.setText("");
        client_address.setText("");
        
    }

    private void registerC_btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Connection db = conn.getDB();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String sqlstring = "INSERT INTO client(cfame, clname, cdob, csex, cstart_date, ctier,cphone, caddress, cbid) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = db.prepareStatement(sqlstring);
            stmt.setString(1, client_fname.getText());
            stmt.setString(2, client_lname.getText());
            stmt.setString(3, dateFormat.format(client_dob.getDate()));
            stmt.setString(4, ((m_client.isSelected())? "M": "F"));
            stmt.setString(5, dateFormat.format(join_date.getDate()));
            stmt.setString(6, membership_type.getSelectedItem().toString());
            stmt.setString(7, client_phone.getText());
            stmt.setString(8, client_address.getText());
            stmt.setString(9, client_branch.getSelectedItem().toString());
            stmt.executeUpdate();
            
          javax.swing.JOptionPane.showMessageDialog(rootPane, "Client is now registered sucessfully!");
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });
    
        this.dispose();
            


        } catch (Exception ex) {

            String msg = ex.toString();


            if(msg.contains("Null")) javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid Entry: all fields are required. Check you have filled all the fields correctly.");
            else if(msg.contains("dob_constraint")) javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid DOB: Check the client's date of birth and try again.");
            else if(msg.contains("Unhandled"))javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid membership-date: The client's start date shouldn't \n 1. be earlier than the branch's opening date\n 2. later than today.");
            else javax.swing.JOptionPane.showMessageDialog(rootPane, "Error occured: Check your inputs and try again.");
           

           
            
            
//           if(ex.getMessage().contains("dob_constraint")){
//                      javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid DOB: Check the client's date of birth and try again.");
//
//           } 
//           else if (ex.toString().equals("java.lang.NullPointerException")){
//                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid Entry: all fields are required.");
//
//           }
           
            
        }


        
        
        
        
    }

    private void client_branchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterClient dialog = new RegisterClient(new javax.swing.JFrame(), true);
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


    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator1;
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea client_address;
    private javax.swing.JComboBox<String> client_branch;
    private com.toedter.calendar.JDateChooser client_dob;
    private javax.swing.JTextField client_fname;
    private javax.swing.JTextField client_lname;
    private javax.swing.JTextField client_phone;
    private javax.swing.JButton clr_regC_btn;
    private javax.swing.JButton discard_regC_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser join_date;
    private javax.swing.JRadioButton m_client;
    private javax.swing.JComboBox<String> membership_type;
    private javax.swing.JButton registerC_btn1;

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

