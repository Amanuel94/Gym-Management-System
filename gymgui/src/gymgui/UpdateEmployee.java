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


public class UpdateEmployee extends javax.swing.JDialog {


    public UpdateEmployee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            this.branches = getBranches();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexes = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emp_fname_up = new javax.swing.JTextField();
        emp_lname_up = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        m_emp_up = new javax.swing.JRadioButton();
        f_emp_up = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        discard_upE_btn = new javax.swing.JButton();
        emp_dob_up = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        update_emp_id = new javax.swing.JTextField();
        updateE_btn1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        emp_update_desc = new javax.swing.JTextArea();
        clr_upE_btn = new javax.swing.JButton();
        start_date_up = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        branch_emp_up = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        emp_phone_up = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emp_address_up = new javax.swing.JTextArea();
        fetch_emp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        emp_dept = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Employee Record");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Update an Employee Record");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Enter the employee's full name:");

        emp_fname_up.setText("First Name");

        emp_lname_up.setText("Last name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enter the employee's sex:");

        sexes.add(m_emp_up);
        m_emp_up.setSelected(true);
        m_emp_up.setText("Male");
        m_emp_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_emp_upActionPerformed(evt);
            }
        });

        sexes.add(f_emp_up);
        f_emp_up.setText("Female");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Enter the employee's date of birth:");

        discard_upE_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        discard_upE_btn.setText("Back");
        discard_upE_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discard_upE_btnActionPerformed(evt);
            }
        });

        emp_dob_up.setDateFormatString("yyyy/MM/dd");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Enter the employee's ID:");

        update_emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_emp_idActionPerformed(evt);
            }
        });

        updateE_btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateE_btn1.setText("Update");
        updateE_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateE_btn1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Brief description of update:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Enter the employee's start date:");

        emp_update_desc.setColumns(20);
        emp_update_desc.setRows(5);
        jScrollPane2.setViewportView(emp_update_desc);

        clr_upE_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clr_upE_btn.setText("Reset");
        clr_upE_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_upE_btnActionPerformed(evt);
            }
        });

        start_date_up.setDateFormatString("yyyy/MM/dd");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Choose the employee's (new) branch ID:");

        branch_emp_up.setModel(new DefaultComboBoxModel(this.branches));
        branch_emp_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branch_emp_upActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Enter employee's phone number:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Enter employee's address:");

        emp_address_up.setColumns(20);
        emp_address_up.setLineWrap(true);
        emp_address_up.setRows(5);
        emp_address_up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emp_address_upKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(emp_address_up);

        fetch_emp.setText("Fetch existing record");
        fetch_emp.setToolTipText("");
        fetch_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetch_empActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Choose the employee's department:");

        emp_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Executives and Heads", "Human Resources", "Health and Paramedics", "Instructors/Trainers", "Others" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_emp_up, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f_emp_up, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(update_emp_id, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emp_fname_up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emp_lname_up, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(fetch_emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emp_dept, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(emp_phone_up, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(start_date_up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emp_dob_up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(branch_emp_up, 0, 193, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(updateE_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(clr_upE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(discard_upE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
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
                        .addComponent(update_emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fetch_emp)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emp_fname_up, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emp_lname_up, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(m_emp_up)
                    .addComponent(f_emp_up))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(emp_dob_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(start_date_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(emp_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(branch_emp_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emp_phone_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateE_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clr_upE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discard_upE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_emp_upActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void discard_upE_btnActionPerformed(java.awt.event.ActionEvent evt) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });

        this.dispose();
    }

    private void update_emp_idActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void updateE_btn1ActionPerformed(java.awt.event.ActionEvent evt) {
       Connection db = conn.getDB();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String id; 
        if(update_emp_id.getText().equals(""))javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid ID");
        else {id = update_emp_id.getText();

        String sqlstring = "UPDATE employee SET efname = ?, elname = ?, esex = ?, edob = ?, estart_date = ?, ebranch = ?, edep = ?,  ephone = ?, eaddress = ? WHERE eid = " + id + ";";
        try {
            PreparedStatement stmt = db.prepareStatement(sqlstring);
            stmt.setString(1, emp_fname_up.getText());
            stmt.setString(2, emp_lname_up.getText());
            stmt.setString(3, ((m_emp_up.isSelected())? "M": "F"));
            stmt.setString(4, dateFormat.format(emp_dob_up.getDate()));
            stmt.setString(5, dateFormat.format(start_date_up.getDate()));
            stmt.setString(6, branch_emp_up.getSelectedItem().toString());
            stmt.setString(7, emp_dept.getSelectedItem().toString());
            stmt.setString(8, emp_phone_up.getText());
            stmt.setString(9, emp_address_up.getText());
            stmt.executeUpdate();
            
            FileWriter update_desc = new FileWriter("desc_emp.txt");
            Date now = new Date();
            String file = now.toString() + "  |" + id + "|  " +  emp_update_desc.getText() + "\n";
            update_desc.append(file);
            update_desc.close();
            
          javax.swing.JOptionPane.showMessageDialog(rootPane, "Employee record is updated sucessfully!");
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
            System.out.println(msg);

            if(msg.contains("Null")) javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid Entry: all fields are required. Check you have filled all the fields correctly.");
            else if(msg.contains("dob_constraint2")) javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid DOB: Check the client's date of birth and try again.");
            else if(msg.contains("Can't update"))javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid start-date: The client's start date shouldn't \n 1. be earlier than the branch's opening date\n 2. later than today.");
            else javax.swing.JOptionPane.showMessageDialog(rootPane, "Error occured: Check your inputs and try again.");
        
        }
        
        }  
    }

    private void clr_upE_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Date TODAY = new Date();

        emp_fname_up.setText("");
        emp_lname_up.setText("");
        emp_dob_up.setDate(TODAY);
        start_date_up.setDate(TODAY);
        branch_emp_up.setSelectedIndex(0);
        emp_phone_up.setText("");
        emp_address_up.setText("");

    }

    private void emp_address_upKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if(emp_address_up.getText().length()>=15){}
    }

    private void branch_emp_upActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:333
    }

    private void fetch_empActionPerformed(java.awt.event.ActionEvent evt) {
String id;
    if(update_emp_id.getText().equals(""))javax.swing.JOptionPane.showMessageDialog(rootPane, "Invalid ID");
    else {
    id = update_emp_id.getText();
    try{
        conn = new DBConnection();
        Connection db = conn.getDB();
        Statement fetch = db.createStatement();
        ResultSet rs = fetch.executeQuery("SELECT * FROM employee WHERE eid = " + id + ";");
        rs.next();
        emp_fname_up.setText(rs.getString("efname"));
        emp_lname_up.setText(rs.getString("elname"));
        
       m_emp_up.setSelected(rs.getString("esex").equals("M"));
       f_emp_up.setSelected(rs.getString("esex").equals("F"));

        emp_dob_up.setDate(rs.getDate("edob"));
        start_date_up.setDate(rs.getDate("estart_date"));
        emp_dept.setSelectedItem(rs.getString("edep"));
        branch_emp_up.setSelectedItem(rs.getString("ebranch"));
        emp_phone_up.setText(rs.getString("ephone"));
        emp_address_up.setText(rs.getString("eaddress"));
        
    }catch(Exception ex){
             String msg =  ex.toString();   
             javax.swing.JOptionPane.showMessageDialog(rootPane, ex);
             if(msg.contains("empty result set"))javax.swing.JOptionPane.showMessageDialog(rootPane, "There is no client with such ID");
             else javax.swing.JOptionPane.showMessageDialog(rootPane, "Oops! An Error Occured!");
    } 
    }    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateEmployee dialog = new UpdateEmployee(new javax.swing.JFrame(), true);
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


    private javax.swing.JComboBox<String> branch_emp_up;
    private javax.swing.JButton clr_upE_btn;
    private javax.swing.JButton discard_upE_btn;
    private javax.swing.JTextArea emp_address_up;
    private javax.swing.JComboBox<String> emp_dept;
    private com.toedter.calendar.JDateChooser emp_dob_up;
    private javax.swing.JTextField emp_fname_up;
    private javax.swing.JTextField emp_lname_up;
    private javax.swing.JTextField emp_phone_up;
    private javax.swing.JTextArea emp_update_desc;
    private javax.swing.JRadioButton f_emp_up;
    private javax.swing.JButton fetch_emp;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton m_emp_up;
    private javax.swing.ButtonGroup sexes;
    private com.toedter.calendar.JDateChooser start_date_up;
    private javax.swing.JButton updateE_btn1;
    private javax.swing.JTextField update_emp_id;
    // End of variables declaration//GEN-END:variables
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
