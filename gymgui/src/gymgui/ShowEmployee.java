/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gymgui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;



public class ShowEmployee extends javax.swing.JDialog {


    public ShowEmployee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            this.branches = getBranches();
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Oops! Error occured with the database.");
        } 
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexes = new javax.swing.ButtonGroup();
        scrl_pane = new javax.swing.JScrollPane();
        client_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        quit_show_client_btn = new javax.swing.JButton();
        show_id_emp = new javax.swing.JTextField();
        toHome_show_client_btn = new javax.swing.JButton();
        edob = new com.toedter.calendar.JDateChooser();
        m_f = new javax.swing.JRadioButton();
        f_f = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filter_emp = new javax.swing.JList<>();
        ebranch_box = new javax.swing.JCheckBox();
        show_name_emp = new javax.swing.JTextField();
        show_dep_emp = new javax.swing.JComboBox<>();
        filter_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        eid_box = new javax.swing.JCheckBox();
        ename_box = new javax.swing.JCheckBox();
        esex_box = new javax.swing.JCheckBox();
        edob_box = new javax.swing.JCheckBox();
        ejoin_box = new javax.swing.JCheckBox();
        edept_box = new javax.swing.JCheckBox();
        ephone_box = new javax.swing.JCheckBox();
        eaddress_box = new javax.swing.JCheckBox();
        show_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        show_branch_emp = new javax.swing.JComboBox<>();
        edob2 = new com.toedter.calendar.JDateChooser();
        date_f = new com.toedter.calendar.JDateChooser();
        date_f2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        client_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrl_pane.setViewportView(client_table);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Filter by");

        quit_show_client_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quit_show_client_btn.setText("QUIT");
        quit_show_client_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_show_client_btnActionPerformed(evt);
            }
        });

        show_id_emp.setText("Enter ID");
        show_id_emp.setDragEnabled(true);
        show_id_emp.setEnabled(false);
        show_id_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_id_empActionPerformed(evt);
            }
        });
        show_id_emp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                show_id_empPropertyChange(evt);
            }
        });

        toHome_show_client_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        toHome_show_client_btn.setText("GO BACK");
        toHome_show_client_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toHome_show_client_btnActionPerformed(evt);
            }
        });

        edob.setDateFormatString("yyyy/MM/dd");
        edob.setEnabled(false);

        sexes.add(m_f);
        m_f.setText("M");
        m_f.setEnabled(false);
        m_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_fActionPerformed(evt);
            }
        });

        sexes.add(f_f);
        f_f.setText("F");
        f_f.setEnabled(false);

        filter_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filter_emp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Employee ID", "Employee Name", "Employee Sex", "Employee Date of Birth", "Employee Start Date", "Employee Department", "Employee Working Branch" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        filter_emp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                filter_empFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(filter_emp);

        ebranch_box.setText("Employee Working Branch");
        ebranch_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebranch_boxActionPerformed(evt);
            }
        });

        show_name_emp.setText("Enter Client Name");
        show_name_emp.setEnabled(false);
        show_name_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_name_empActionPerformed(evt);
            }
        });

        show_dep_emp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Executives and Heads", "Human Resources", "Health and Paramedics", "Instructors/Trainers", "Others" }));
        show_dep_emp.setEnabled(false);
        show_dep_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_dep_empActionPerformed(evt);
            }
        });

        filter_btn.setText("Select");
        filter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Show");

        eid_box.setSelected(true);
        eid_box.setText("Employee ID");
        eid_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eid_boxActionPerformed(evt);
            }
        });

        ename_box.setSelected(true);
        ename_box.setText("Employee Name");
        ename_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ename_boxActionPerformed(evt);
            }
        });

        esex_box.setText("Employee Sex");
        esex_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esex_boxActionPerformed(evt);
            }
        });

        edob_box.setText("Employee Date of Birth");
        edob_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edob_boxActionPerformed(evt);
            }
        });

        ejoin_box.setText("Employee Start Date");
        ejoin_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejoin_boxActionPerformed(evt);
            }
        });

        edept_box.setText("Employee Department");
        edept_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edept_boxActionPerformed(evt);
            }
        });

        ephone_box.setText("Employee Phone Number");
        ephone_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ephone_boxActionPerformed(evt);
            }
        });

        eaddress_box.setText("Employee Address");
        eaddress_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaddress_boxActionPerformed(evt);
            }
        });

        show_btn.setText("Show Records");
        show_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Show Employee Record ");

        show_branch_emp.setModel(new DefaultComboBoxModel(this.branches));
        show_branch_emp.setEnabled(false);

        edob2.setDateFormatString("yyyy/MM/dd");
        edob2.setEnabled(false);

        date_f.setDateFormatString("yyyy/MM/dd");
        date_f.setEnabled(false);

        date_f2.setDateFormatString("yyyy/MM/dd");
        date_f2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toHome_show_client_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quit_show_client_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrl_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(esex_box)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(filter_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                                            .addComponent(eid_box))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(show_id_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(show_name_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(m_f, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(f_f))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(edob, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(edob2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(show_dep_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(174, 174, 174))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(date_f, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(date_f2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(show_branch_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(173, 173, 173)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(edept_box)
                                                    .addComponent(ebranch_box)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(ejoin_box)
                                                            .addComponent(ephone_box))
                                                        .addGap(53, 53, 53)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(show_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(eaddress_box))))
                                                .addGap(53, 53, 53))))
                                    .addComponent(ename_box)
                                    .addComponent(edob_box))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(show_id_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_name_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_f)
                            .addComponent(f_f))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edob2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_dep_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_f, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_f2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_branch_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eid_box)
                        .addComponent(ejoin_box)
                        .addComponent(eaddress_box))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edept_box)
                    .addComponent(ename_box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esex_box)
                    .addComponent(ebranch_box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edob_box)
                    .addComponent(ephone_box)
                    .addComponent(show_btn))
                .addGap(18, 18, 18)
                .addComponent(scrl_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quit_show_client_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toHome_show_client_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quit_show_client_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
    }

    private void show_id_empActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void show_id_empPropertyChange(java.beans.PropertyChangeEvent evt) {
        // TODO add your handling code here:
    }

    private void toHome_show_client_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });
    }

    private void m_fActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void filter_empFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:

    }

    private void ebranch_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here

    }

    private void show_name_empActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void show_dep_empActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void filter_btnActionPerformed(java.awt.event.ActionEvent evt) {
        List<String> vals = filter_emp.getSelectedValuesList();


        ;

        show_id_emp.setEnabled(vals.contains("Employee ID"));

        show_name_emp.setEnabled(vals.contains("Employee Name"));

        m_f.setEnabled(vals.contains("Employee Sex"));
        f_f.setEnabled(vals.contains("Employee Sex"));

        edob.setEnabled(vals.contains("Employee Date of Birth"));
        edob2.setEnabled(vals.contains("Employee Date of Birth"));
        
        date_f.setEnabled(vals.contains("Employee Start Date"));
        date_f2.setEnabled(vals.contains("Employee Start Date"));


        show_dep_emp.setEnabled(vals.contains("Employee Department"));
        show_branch_emp.setEnabled(vals.contains("Employee Working Branch"));

        // TODO add your handling code here:

        if(vals.contains("No filter")){
            show_id_emp.setEnabled(false);
            show_name_emp.setEnabled(false);
            m_f.setEnabled(false);
            f_f.setEnabled(false);
            edob.setEnabled(false);
            edob2.setEnabled(false);
            show_dep_emp.setEnabled(false);
            show_branch_emp.setEnabled(false);

        }
        vals.clear();
    }

    private void eid_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        

    }

    private void ename_boxActionPerformed(java.awt.event.ActionEvent evt) {
          // TODO add your handling code here:
    }

    private void esex_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        
    }

    private void edob_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:''

        
    }

    private void ejoin_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        

    }

    private void edept_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

       

    }

    private void ephone_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        

    }

    private void eaddress_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        

    }

    private void show_btnActionPerformed(java.awt.event.ActionEvent evt) {

        
List<String> vals = filter_emp.getSelectedValuesList();
try{
if(vals.size()>0){
String whereClause = " WHERE "  + createWhereClause(vals);
String select = "SELECT DISTINCT " + selectedBoxes() + " FROM employee";

System.out.println(select+whereClause);
conn = new DBConnection();
Connection db = conn.getDB();
Statement show = db.createStatement();
ResultSet rs = show.executeQuery(select + whereClause);

selectedCols(cols);
ArrayList<String[]> data = new ArrayList<String[]>();
HashMap<String, String> map = new HashMap<String, String> ();
map.put("ID", "eid");
map.put("First Name", "efname");
map.put("Last Name", "elname");
map.put("Sex", "esex");
map.put("DoB", "edob");
map.put("Start Date", "estart_date");
map.put("Department", "edep");
map.put("Phone", "ephone");
map.put("Address", "eaddress");
map.put("Branch", "ebranch");
  
        
String[] dataArray = new String[cols.size()];
while(rs.next()){
    for (int i = 0; i < dataArray.length; i++) {
        dataArray[i] =  rs.getString(map.get(cols.get(i)));
        
    }
    String[] temp = dataArray.clone();
    data.add(temp);



}

   String[][] Data = new String[data.size()][cols.size()];
    for (int i = 0; i < data.size(); i++) {
        for (int j = 0; j < cols.size(); j++) {
            Data[i][j] = data.get(i)[j];
        }
    }
 
String[] title = (String[]) cols.toArray(new String[cols.size()]);
DefaultTableModel model = new DefaultTableModel(Data, title);
client_table.setModel(model);

cols.clear();
data.clear();



}
else{
String select = "SELECT DISTINCT " + selectedBoxes() + " FROM employee;";

conn = new DBConnection();
Connection db = conn.getDB();
Statement show = db.createStatement();
ResultSet rs = show.executeQuery(select);
selectedCols(cols);
ArrayList<String[]> data = new ArrayList<String[]>();
HashMap<String, String> map = new HashMap<String, String> ();
map.put("ID", "eid");
map.put("First Name", "efname");
map.put("Last Name", "elname");
map.put("Sex", "esex");
map.put("DoB", "edob");
map.put("Start Date", "estart_date");
map.put("Department", "edep");
map.put("Phone", "ephone");
map.put("Address", "eaddress");
map.put("Branch", "ebranch");
  
        
String[] dataArray = new String[cols.size()];


while(rs.next()){
    for (int i = 0; i < dataArray.length; i++) {
        dataArray[i] =  rs.getString(map.get(cols.get(i)));
        
    }
    String[] temp = dataArray.clone();
    data.add(temp);



}
   String[][] Data = new String[data.size()][cols.size()];
    for (int i = 0; i < data.size(); i++) {
        for (int j = 0; j < cols.size(); j++) {
            Data[i][j] = data.get(i)[j];
        }
    }
 
String[] title = (String[]) cols.toArray(new String[cols.size()]);
DefaultTableModel model = new DefaultTableModel(Data, title);
client_table.setModel(model);

cols.clear();
data.clear();

}






}
catch(Exception ex){
    javax.swing.JOptionPane.showMessageDialog(rootPane, ex.toString());

}
        
        
        
    }
    private void selectedCols(ArrayList<String> cols){
    if(eid_box.isSelected()) cols.add("ID");
    else cols.remove("ID");
    if(ename_box.isSelected()) {cols.add("First Name"); cols.add("Last Name");}
    else {cols.remove("First Name"); cols.remove("Last Name");}
    if(esex_box.isSelected()) cols.add("Sex");
    else cols.remove("Sex");
    if(edob_box.isSelected()) cols.add("DoB");
    else cols.remove("DoB");
    if(ejoin_box.isSelected()) cols.add("Start Date");
    else cols.remove("Registration Date");
    if(edept_box.isSelected()) cols.add("Department");
    else cols.remove("Membership Type");
    if(ephone_box.isSelected()) cols.add("Phone");
    else cols.remove("Phone");
    if(eaddress_box.isSelected()) cols.add("Address");
    else cols.remove("Address");
    if(ebranch_box.isSelected()) cols.add("Branch");
    else cols.remove("Branch");
 }
    
    
    private String selectedBoxes(){
    ArrayList<String> fields = new ArrayList<String>();
    if(eid_box.isSelected()) fields.add("employee.eid");
    if(ename_box.isSelected()) fields.add("employee.efname, employee.elname");
    if(esex_box.isSelected()) fields.add("employee.esex");
    if(edob_box.isSelected()) fields.add("employee.edob");
    if(ejoin_box.isSelected()) fields.add("employee.estart_date");
    if(edept_box.isSelected()) fields.add("employee.edep");
    if(ephone_box.isSelected()) fields.add("employee.ephone");
    if(eaddress_box.isSelected()) fields.add("employee.eaddress");
    if(ebranch_box.isSelected()) fields.add("employee.ebranch");
    
    return (" " + String.join(", ", (String[])fields.toArray(new String[fields.size()])));
    


    
    
    }
     private String createWhereClause(List<String> vals){
        String param[] =  new String[vals.size()];

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

   
        if(vals.contains("Employee ID")){
        param[vals.indexOf("Employee ID") ] = " employee.eid = " + show_id_emp.getText();}
        
        if(vals.contains("Employee Name")){
        String name[] = show_name_emp.getText().split(" ");
        param[vals.indexOf("Employee Name") ] = " employee.efname = \"" + name[0] +  "\" AND employee.elname = \"" + name[1] + "\"";
        }
        if(vals.contains("Employee Sex")){
        param[vals.indexOf("Employee Sex")] = " employee.esex = " + (m_f.isSelected()?"\"M\"":"\"F\"");}

        if(vals.contains("Employee Date of Birth")){
        param[vals.indexOf("Employee Date of Birth") ] = " employee.edob >= \"" + dateFormat.format(edob.getDate()) + "\" AND employee.edob < \"" + dateFormat.format(edob2.getDate())+ "\"" ;}
        if(vals.contains("Employee Start Date")){
        param[vals.indexOf("Employee Start Date") ] = " employee.estart_date >= \"" + dateFormat.format(date_f.getDate()) + "\" AND employee.estart_date < \"" + dateFormat.format(date_f2.getDate())+ "\"" ;}

        if(vals.contains("Employee Department")){
        param[vals.indexOf("Employee Department") ] = " employee.edep = \"" + show_dep_emp.getSelectedItem().toString()+ "\"";}
        if(vals.contains("Employee Working Branch")){
        param[vals.indexOf("Employee Working Branch") ] = " employee.ebranch = " + show_branch_emp.getSelectedItem().toString() + " ";}

        return String.join(" AND ", param).replace("null", "TRUE");
        
        
       
        
    
    
    }
    
    
    
    
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowEmployee dialog = new ShowEmployee(new javax.swing.JFrame(), true);
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


    private javax.swing.JTable client_table;
    private com.toedter.calendar.JDateChooser date_f;
    private com.toedter.calendar.JDateChooser date_f2;
    private javax.swing.JCheckBox eaddress_box;
    private javax.swing.JCheckBox ebranch_box;
    private javax.swing.JCheckBox edept_box;
    private com.toedter.calendar.JDateChooser edob;
    private com.toedter.calendar.JDateChooser edob2;
    private javax.swing.JCheckBox edob_box;
    private javax.swing.JCheckBox eid_box;
    private javax.swing.JCheckBox ejoin_box;
    private javax.swing.JCheckBox ename_box;
    private javax.swing.JCheckBox ephone_box;
    private javax.swing.JCheckBox esex_box;
    private javax.swing.JRadioButton f_f;
    private javax.swing.JButton filter_btn;
    private javax.swing.JList<String> filter_emp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton m_f;
    private javax.swing.JButton quit_show_client_btn;
    private javax.swing.JScrollPane scrl_pane;
    private javax.swing.ButtonGroup sexes;
    private javax.swing.JComboBox<String> show_branch_emp;
    private javax.swing.JButton show_btn;
    private javax.swing.JComboBox<String> show_dep_emp;
    private javax.swing.JTextField show_id_emp;
    private javax.swing.JTextField show_name_emp;
    private javax.swing.JButton toHome_show_client_btn;

private DBConnection conn;
private String[] branches;
private ArrayList<String> cols = new ArrayList<String>();
    
    
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
