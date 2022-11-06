/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
import javax.swing.table.TableColumn;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;


public class ShowClient extends javax.swing.JFrame {



    public ShowClient() {
        try{
//
        branches = this.getBranches();
        programs = this.getProg();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
                initComponents();
        cid_box.setEnabled(false);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        show_id_client = new javax.swing.JTextField();
        date_f = new com.toedter.calendar.JDateChooser();
        m_f = new javax.swing.JRadioButton();
        f_f = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filter_client = new javax.swing.JList<>();
        show_name_client = new javax.swing.JTextField();
        show_tier_client = new javax.swing.JComboBox<>();
        filter_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cid_box = new javax.swing.JCheckBox();
        cname_box = new javax.swing.JCheckBox();
        csex_box = new javax.swing.JCheckBox();
        cdob_box = new javax.swing.JCheckBox();
        cjoin_box = new javax.swing.JCheckBox();
        ctier_box = new javax.swing.JCheckBox();
        cphone_box = new javax.swing.JCheckBox();
        caddress_box = new javax.swing.JCheckBox();
        show_btn = new javax.swing.JButton();
        scrl_pane = new javax.swing.JScrollPane();
        client_table = new javax.swing.JTable();
        quit_show_client_btn = new javax.swing.JButton();
        toHome_show_client_btn = new javax.swing.JButton();
        cbranch_box = new javax.swing.JCheckBox();
        show_branch_client = new javax.swing.JComboBox<>();
        no_of_progs = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        show_client_dob = new com.toedter.calendar.JDateChooser();
        count_prog = new javax.swing.JCheckBox();
        show_client_dob2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date_f2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show Client Record");
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Show Client Record ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Filter by");

        show_id_client.setText("Enter ID");
        show_id_client.setDragEnabled(true);
        show_id_client.setEnabled(false);
        show_id_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_id_clientActionPerformed(evt);
            }
        });
        show_id_client.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                show_id_clientPropertyChange(evt);
            }
        });

        date_f.setDateFormatString("yyyy/MM/dd");
        date_f.setEnabled(false);

        buttonGroup1.add(m_f);
        m_f.setSelected(true);
        m_f.setText("M");
        m_f.setEnabled(false);
        m_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_fActionPerformed(evt);
            }
        });

        buttonGroup1.add(f_f);
        f_f.setText("F");
        f_f.setEnabled(false);

        filter_client.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filter_client.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Client ID", "Client Name", "Client Sex", "Client Date of Birth", "Client Membership Date", "Client Membership Type", "Client Registration Branch", "Number of Programmes" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        filter_client.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                filter_clientFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(filter_client);

        show_name_client.setText("Enter Client Name");
        show_name_client.setEnabled(false);
        show_name_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_name_clientActionPerformed(evt);
            }
        });

        show_tier_client.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platinum Tier", "Golden Tier", "None" }));
        show_tier_client.setSelectedIndex(2);
        show_tier_client.setEnabled(false);
        show_tier_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_tier_clientActionPerformed(evt);
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

        cid_box.setSelected(true);
        cid_box.setText("Client ID");
        cid_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cid_boxActionPerformed(evt);
            }
        });

        cname_box.setSelected(true);
        cname_box.setText("Client Name");
        cname_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cname_boxActionPerformed(evt);
            }
        });

        csex_box.setText("Client Sex");
        csex_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csex_boxActionPerformed(evt);
            }
        });

        cdob_box.setText("Client Date of Birth");
        cdob_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdob_boxActionPerformed(evt);
            }
        });

        cjoin_box.setText("Registration Date");
        cjoin_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjoin_boxActionPerformed(evt);
            }
        });

        ctier_box.setText("Membership Type");
        ctier_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctier_boxActionPerformed(evt);
            }
        });

        cphone_box.setText("Client Phone Number");
        cphone_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cphone_boxActionPerformed(evt);
            }
        });

        caddress_box.setText("Client Address");
        caddress_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caddress_boxActionPerformed(evt);
            }
        });

        show_btn.setText("Show Records");
        show_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_btnActionPerformed(evt);
            }
        });

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

        quit_show_client_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quit_show_client_btn.setText("QUIT");
        quit_show_client_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_show_client_btnActionPerformed(evt);
            }
        });

        toHome_show_client_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        toHome_show_client_btn.setText("GO BACK");
        toHome_show_client_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toHome_show_client_btnActionPerformed(evt);
            }
        });

        cbranch_box.setText("Client Registration Branch");
        cbranch_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbranch_boxActionPerformed(evt);
            }
        });

        show_branch_client.setModel(new DefaultComboBoxModel(this.branches));
        show_branch_client.setToolTipText("");
        show_branch_client.setEnabled(false);

        no_of_progs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 11, 1));
        no_of_progs.setEnabled(false);

        jLabel4.setText("Choose programme set:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = programs;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        show_client_dob.setToolTipText("Enter Date of Birth Eg(2002/06/28 to 2002/12/12)");
        show_client_dob.setDateFormatString("yyyy/MM/dd");
        show_client_dob.setEnabled(false);

        count_prog.setText("Programmes");
        count_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count_progActionPerformed(evt);
            }
        });

        show_client_dob2.setDateFormatString("yyyy/MM/dd");
        show_client_dob2.setEnabled(false);

        jLabel5.setText("to");

        jLabel6.setText("to");

        date_f2.setDateFormatString("yyyy/MM/dd");
        date_f2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(toHome_show_client_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quit_show_client_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(filter_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(no_of_progs, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(show_id_client)
                                            .addComponent(date_f, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                            .addComponent(show_client_dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(date_f2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(show_client_dob2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(show_name_client, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(m_f, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(f_f))
                                            .addComponent(show_tier_client, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(show_branch_client, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cid_box)
                                    .addComponent(cname_box)
                                    .addComponent(csex_box)
                                    .addComponent(cdob_box))
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cjoin_box)
                                    .addComponent(cphone_box)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(caddress_box)
                                            .addComponent(cbranch_box))
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(show_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(count_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ctier_box)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(scrl_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(no_of_progs, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filter_btn)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_f, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(f_f, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(show_id_client, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(show_name_client, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(show_client_dob2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(show_tier_client)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(show_client_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_f, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_f2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_branch_client, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)))
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cid_box)
                    .addComponent(ctier_box)
                    .addComponent(caddress_box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname_box)
                    .addComponent(cphone_box)
                    .addComponent(count_prog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(csex_box)
                    .addComponent(cjoin_box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdob_box)
                    .addComponent(cbranch_box)
                    .addComponent(show_btn))
                .addGap(18, 18, 18)
                .addComponent(scrl_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toHome_show_client_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quit_show_client_btn))
                .addGap(105, 105, 105))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void show_id_clientPropertyChange(java.beans.PropertyChangeEvent evt) {

    }

    private void m_fActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void show_id_clientActionPerformed(java.awt.event.ActionEvent evt) {

        
        
    }

    private void filter_clientFocusLost(java.awt.event.FocusEvent evt) {

        
               
        
    }

    private void show_name_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_name_clientActionPerformed
        // TODO add your handling code here:
    }

    private void filter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_btnActionPerformed
List<String> vals = filter_client.getSelectedValuesList();
  
        //System.out.println(date_f.isEnabled());
         ;
         
        
        
            show_id_client.setEnabled(vals.contains("Client ID"));
            
            
        
       
            show_name_client.setEnabled(vals.contains("Client Name"));
            
        
            m_f.setEnabled(vals.contains("Client Sex"));
            f_f.setEnabled(vals.contains("Client Sex"));
            
        
        
        date_f.setEnabled(vals.contains("Client Membership Date"));
                date_f2.setEnabled(vals.contains("Client Membership Date"));

       
       
        show_tier_client.setEnabled(vals.contains("Client Membership Type"));
       show_branch_client.setEnabled(vals.contains("Client Registration Branch"));
       no_of_progs.setEnabled(vals.contains("Number of Programmes"));
       show_client_dob.setEnabled(vals.contains("Client Date of Birth"));
        show_client_dob2.setEnabled(vals.contains("Client Date of Birth"));

       
       
        
               // TODO add your handling code here:
               

               vals.clear();
    }//GEN-LAST:event_filter_btnActionPerformed

    private void cdob_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdob_boxActionPerformed

        

    }

    private void cjoin_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjoin_boxActionPerformed

        
        
     }



    private void cphone_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cphone_boxActionPerformed
        // TODO add your handling code here:
   }
        


    private void caddress_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caddress_boxActionPerformed
        // TODO add your handling code here:
        

        
    }//GEN-LAST:event_caddress_boxActionPerformed

    private void show_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_btnActionPerformed


List<String> vals = filter_client.getSelectedValuesList();
try{
if(vals.size()>0){
String whereClause = " WHERE " + pids() + " AND " + createWhereClause(vals);
String select = "SELECT DISTINCT " + selectedBoxes() + " FROM client LEFT JOIN client_programme ON client.cid = client_programme.cid ";

System.out.println(select+whereClause);
conn = new DBConnection();
Connection db = conn.getDB();
Statement show = db.createStatement();
ResultSet rs = show.executeQuery(select + whereClause);

selectedCols(cols);
ArrayList<String[]> data = new ArrayList<String[]>();
HashMap<String, String> map = new HashMap<String, String> ();
map.put("ID", "cid");
map.put("First Name", "cfame");
map.put("Last Name", "clname");
map.put("Sex", "csex");
map.put("DoB", "cdob");
map.put("Registration Date", "cstart_date");
map.put("Membership Type", "ctier");
map.put("Phone", "cphone");
map.put("Address", "caddress");
map.put("Branch", "cbid");
map.put("Number of programmes", "COUNT(client_programme.cid)");
  
        
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
DefaultTableModel model = new DefaultTableModel(Data, title);//DefaultTableModel(data.toArray(Data, title)
client_table.setModel(model);

cols.clear();
data.clear();



}
else{
String select = "SELECT DISTINCT " + selectedBoxes() + " FROM client LEFT JOIN client_programme ON client.cid = client_programme.cid WHERE " + pids() + " GROUP BY client.cid ;";

System.out.println(select);
conn = new DBConnection();
Connection db = conn.getDB();
Statement show = db.createStatement();
ResultSet rs = show.executeQuery(select);
selectedCols(cols);
ArrayList<String[]> data = new ArrayList<String[]>();
HashMap<String, String> map = new HashMap<String, String> ();
map.put("ID", "cid");
map.put("First Name", "cfame");
map.put("Last Name", "clname");
map.put("Sex", "csex");
map.put("DoB", "cdob");
map.put("Registration Date", "cstart_date");
map.put("Membership Type", "ctier");
map.put("Phone", "cphone");
map.put("Address", "caddress");
map.put("Branch", "cbid");
map.put("Number of programmes", "count(client_programme.cid)");
  
        
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
DefaultTableModel model = new DefaultTableModel(Data, title);//DefaultTableModel(data.toArray(Data, title)
client_table.setModel(model);

cols.clear();
data.clear();

}






}
catch(Exception ex){
    javax.swing.JOptionPane.showMessageDialog(rootPane, "Oops! Unknown Error occured with the database.");


}



    }
    private void selectedCols(ArrayList<String> cols){
    if(cid_box.isSelected()) cols.add("ID");
    else cols.remove("ID");
    if(cname_box.isSelected()) {cols.add("First Name"); cols.add("Last Name");}
    else {cols.remove("First Name"); cols.remove("Last Name");}
    if(csex_box.isSelected()) cols.add("Sex");
    else cols.remove("Sex");
    if(cdob_box.isSelected()) cols.add("DoB");
    else cols.remove("DoB");
    if(cjoin_box.isSelected()) cols.add("Registration Date");
    else cols.remove("Registration Date");
    if(ctier_box.isSelected()) cols.add("Membership Type");
    else cols.remove("Membership Type");
    if(cphone_box.isSelected()) cols.add("Phone");
    else cols.remove("Phone");
    if(caddress_box.isSelected()) cols.add("Address");
    else cols.remove("Address");
    if(cbranch_box.isSelected()) cols.add("Branch");
    else cols.remove("Branch");
    if(count_prog.isSelected()) cols.add("Number of programmes");
    else cols.remove("Number of Programmes");
    
    
    
    }

    
    private String pids(){
    List<String> vals = jList1.getSelectedValuesList();
    String prgs = "";

    String temp[] = new String[vals.size()];
    if(vals.size() == 0 || vals.get(0) ==  "All"){ prgs = " TRUE ";}
    else 
    {

        for (int i = 0; i < vals.size(); i++) {
            
            temp[i] = "client_programme.pid = " + vals.get(i);
            
        }
      prgs =  prgs + "(" + String.join(" OR ", temp) + ")";
   
    }
    return prgs;
    }
    
    
    private String selectedBoxes(){
    ArrayList<String> fields = new ArrayList<String>();
    if(cid_box.isSelected()) fields.add("client.cid");
    if(cname_box.isSelected()) fields.add("client.cfame, client.clname");
    if(csex_box.isSelected()) fields.add("client.csex");
    if(cdob_box.isSelected()) fields.add("client.cdob");
    if(cjoin_box.isSelected()) fields.add("client.cstart_date");
    if(ctier_box.isSelected()) fields.add("client.ctier");
    if(cphone_box.isSelected()) fields.add("client.cphone");
    if(caddress_box.isSelected()) fields.add("client.caddress");
    if(cbranch_box.isSelected()) fields.add("client.cbid");
    if(count_prog.isSelected()) fields.add("count(client_programme.cid)");
    
    return (" " + String.join(", ", (String[])fields.toArray(new String[fields.size()])));
    


    
    
    }
    
    
    private String createWhereClause(List<String> vals){
        String param[] =  new String[vals.size()];

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        String count;
        if(vals.contains("Number of Programmes") && Integer.parseInt(no_of_progs.getValue().toString()) > 0)
               count = " AND NOT ISNULL(pid) GROUP BY client.cid HAVING count(*) = " + no_of_progs.getValue().toString()+ ";";
        else if (vals.contains("Number of Programmes") && Integer.parseInt(no_of_progs.getValue().toString()) == 0 )
               count = " AND ISNULL(pid) GROUP BY client.cid;";
        else
             count = " GROUP BY client.cid;";
        if(vals.contains("Client ID")){
        param[vals.indexOf("Client ID") ] = " client.cid = " + show_id_client.getText();}
        
        if(vals.contains("Client Name")){
        String name[] = show_name_client.getText().split(" ");
        param[vals.indexOf("Client Name") ] = " client.cfame = \"" + name[0] +  "\" AND client.clname = \"" + name[1] + "\"";
        }
        if(vals.contains("Client Sex")){
        param[vals.indexOf("Client Sex")] = " client.csex = " + (m_f.isSelected()?"\"M\"":"\"F\"");}
//
        if(vals.contains("Client Date of Birth")){
        param[vals.indexOf("Client Date of Birth") ] = " client.cdob >= \"" + dateFormat.format(show_client_dob.getDate()) + "\" AND client.cdob < \"" + dateFormat.format(show_client_dob2.getDate())+ "\"" ;}
        if(vals.contains("Client Membership Date")){
        param[vals.indexOf("Client Membership Date") ] = " client.cstart_date >= \"" + dateFormat.format(date_f.getDate()) + "\" AND client.cstart_date < \"" + dateFormat.format(date_f2.getDate())+ "\"" ;}

        if(vals.contains("Client Membership Type")){
        param[vals.indexOf("Client Membership Type") ] = " client.ctier = \"" + show_tier_client.getSelectedItem().toString()+ "\"";}
        if(vals.contains("Client Registration Branch")){
        param[vals.indexOf("Client Registration Branch") ] = " client.cbid = " + show_branch_client.getSelectedItem().toString() + " ";}

        return String.join(" AND ", param).replace("null", "TRUE") + count;
        
        
       
        
    
    
    }
    
    private void cid_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cid_boxActionPerformed

          
        
    }

    private void cname_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cname_boxActionPerformed



    }//GEN-LAST:event_cname_boxActionPerformed

    private void csex_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csex_boxActionPerformed
    }





    private void ctier_boxActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void quit_show_client_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
     this.dispose();
    }

    private void show_tier_clientActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cbranch_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }



    private void count_progActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowClient().setVisible(true);
            }
        });
    }


    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox caddress_box;
    private javax.swing.JCheckBox cbranch_box;
    private javax.swing.JCheckBox cdob_box;
    private javax.swing.JCheckBox cid_box;
    private javax.swing.JCheckBox cjoin_box;
    private javax.swing.JTable client_table;
    private javax.swing.JCheckBox cname_box;
    private javax.swing.JCheckBox count_prog;
    private javax.swing.JCheckBox cphone_box;
    private javax.swing.JCheckBox csex_box;
    private javax.swing.JCheckBox ctier_box;
    private com.toedter.calendar.JDateChooser date_f;
    private com.toedter.calendar.JDateChooser date_f2;
    private javax.swing.JRadioButton f_f;
    private javax.swing.JButton filter_btn;
    private javax.swing.JList<String> filter_client;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton m_f;
    private javax.swing.JSpinner no_of_progs;
    private javax.swing.JButton quit_show_client_btn;
    private javax.swing.JScrollPane scrl_pane;
    private javax.swing.JComboBox<String> show_branch_client;
    private javax.swing.JButton show_btn;
    private com.toedter.calendar.JDateChooser show_client_dob;
    private com.toedter.calendar.JDateChooser show_client_dob2;
    private javax.swing.JTextField show_id_client;
    private javax.swing.JTextField show_name_client;
    private javax.swing.JComboBox<String> show_tier_client;
    private javax.swing.JButton toHome_show_client_btn;
    // End of variables declaration//GEN-END:variables
private DBConnection conn;
public String[] branches;
private String[] programs;
private ArrayList<String> cols = new ArrayList<String>();
    
    
    public String[] getBranches() throws SQLException, ClassNotFoundException {
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
    private String[] getProg() throws SQLException, ClassNotFoundException {
       ArrayList<String> progs = new ArrayList<String>();
       progs.add("All");
       String entry = "";
        try{conn = new DBConnection();
        Connection db = conn.getDB();
        Statement fetch = db.createStatement();
        ResultSet rs = fetch.executeQuery("SELECT pid FROM programme;");
        while(rs.next()){
        entry = rs.getInt("pid") + "";
       progs.add(entry);
        }}
        catch (Exception e){System.out.println(e);}
        return (String[]) progs.toArray(new String[progs.size()]);
        
    }
    

}
