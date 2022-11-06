/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymgui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        big_panel = new javax.swing.JPanel();
        home_banner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        home_tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        client_label = new javax.swing.JLabel();
        register_client = new javax.swing.JButton();
        update_client = new javax.swing.JButton();
        delete_client = new javax.swing.JButton();
        show_client = new javax.swing.JButton();
        quit_client = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        emp_label = new javax.swing.JLabel();
        register_emp = new javax.swing.JButton();
        update_emp = new javax.swing.JButton();
        delete_emp = new javax.swing.JButton();
        show_emp = new javax.swing.JButton();
        quit_emp = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        emp_label4 = new javax.swing.JLabel();
        update_dept = new javax.swing.JButton();
        show_dept = new javax.swing.JButton();
        quit_dept = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        emp_label1 = new javax.swing.JLabel();
        register_branch = new javax.swing.JButton();
        update_branch = new javax.swing.JButton();
        delete_branch = new javax.swing.JButton();
        show_branch = new javax.swing.JButton();
        quit_branch = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        prop_label = new javax.swing.JLabel();
        register_prop = new javax.swing.JButton();
        update_prop = new javax.swing.JButton();
        delete_prop = new javax.swing.JButton();
        quit_branch1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        branch_label1 = new javax.swing.JLabel();
        register_prog = new javax.swing.JButton();
        del_prog = new javax.swing.JButton();
        show_prog = new javax.swing.JButton();
        quit_branch3 = new javax.swing.JButton();
        register_prog1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Managment");
        setResizable(false);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        big_panel.setBackground(new java.awt.Color(204, 204, 255));

        home_banner.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout home_bannerLayout = new javax.swing.GroupLayout(home_banner);
        home_banner.setLayout(home_bannerLayout);
        home_bannerLayout.setHorizontalGroup(
            home_bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_bannerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        home_bannerLayout.setVerticalGroup(
            home_bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_bannerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        client_label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        client_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        client_label.setText("CLIENT");

        register_client.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        register_client.setText("Register a New Client");
        register_client.setMaximumSize(new java.awt.Dimension(300, 38));
        register_client.setMinimumSize(new java.awt.Dimension(300, 38));
        register_client.setPreferredSize(new java.awt.Dimension(300, 38));
        register_client.setRequestFocusEnabled(false);
        register_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_clientActionPerformed(evt);
            }
        });

        update_client.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        update_client.setText("Update an Existing Client Record");
        update_client.setToolTipText("");
        update_client.setActionCommand("Update an Existing Client Data");
        update_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_clientActionPerformed(evt);
            }
        });

        delete_client.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        delete_client.setText("Delete a Client Record");
        delete_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_clientActionPerformed(evt);
            }
        });

        show_client.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        show_client.setText("Show Client Record");
        show_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_clientActionPerformed(evt);
            }
        });

        quit_client.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quit_client.setText("Quit");
        quit_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_clientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quit_client, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_client, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_client, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_client, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_client, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(client_label, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(client_label, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(register_client, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(update_client, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(delete_client, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(show_client, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quit_client, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        home_tabs.addTab("CLIENT", jPanel1);

        emp_label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        emp_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp_label.setText("EMPLOYEE");

        register_emp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        register_emp.setText("Register a New Employee");
        register_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_empActionPerformed(evt);
            }
        });

        update_emp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        update_emp.setText("Update an Existing Employee Record");
        update_emp.setToolTipText("");
        update_emp.setActionCommand("Update an Existing Client Data");
        update_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_empActionPerformed(evt);
            }
        });

        delete_emp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        delete_emp.setText("Delete an Employee Record");
        delete_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_empActionPerformed(evt);
            }
        });

        show_emp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        show_emp.setText("Show Employee Record");
        show_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_empActionPerformed(evt);
            }
        });

        quit_emp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quit_emp.setText("Quit");
        quit_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_empActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(register_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quit_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_emp)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(emp_label, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(emp_label, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(register_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(update_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(delete_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(show_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quit_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        home_tabs.addTab("EMPLOYEE", jPanel7);

        emp_label4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        emp_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp_label4.setText("DEPARTMENT");

        update_dept.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        update_dept.setText("Change Department Head");
        update_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_deptActionPerformed(evt);
            }
        });

        show_dept.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        show_dept.setText("Show Department Data");
        show_dept.setToolTipText("");
        show_dept.setActionCommand("Update an Existing Client Data");
        show_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_deptActionPerformed(evt);
            }
        });

        quit_dept.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quit_dept.setText("Quit");
        quit_dept.setToolTipText("");
        quit_dept.setActionCommand("Update an Existing Client Data");
        quit_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_deptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(show_dept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quit_dept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_dept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(emp_label4)
                .addGap(314, 314, 314))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(emp_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(update_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(show_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quit_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        home_tabs.addTab("DEPARTMENT", jPanel11);

        emp_label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        emp_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp_label1.setText("BRANCH");

        register_branch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        register_branch.setText("Add New Branch Data");
        register_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_branchActionPerformed(evt);
            }
        });

        update_branch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        update_branch.setText("Update an Existing Branch Data");
        update_branch.setToolTipText("");
        update_branch.setActionCommand("Update an Existing Client Data");
        update_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_branchActionPerformed(evt);
            }
        });

        delete_branch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        delete_branch.setText("Remove Closed Branch Data");
        delete_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_branchActionPerformed(evt);
            }
        });

        show_branch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        show_branch.setText("Show Branch Statistcs");
        show_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_branchActionPerformed(evt);
            }
        });

        quit_branch.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quit_branch.setText("Quit");
        quit_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_branchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quit_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(emp_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(emp_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(register_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(update_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(delete_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(show_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quit_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        home_tabs.addTab("BRANCH", jPanel8);

        prop_label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        prop_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prop_label.setText("PROPERTIES");

        register_prop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        register_prop.setText("Register New Property");
        register_prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_propActionPerformed(evt);
            }
        });

        update_prop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        update_prop.setText("Show Property Record");
        update_prop.setToolTipText("");
        update_prop.setActionCommand("Update an Existing Client Data");
        update_prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_propActionPerformed(evt);
            }
        });

        delete_prop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        delete_prop.setText("Delete Property Record");
        delete_prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_propActionPerformed(evt);
            }
        });

        quit_branch1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quit_branch1.setText("Quit");
        quit_branch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_branch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quit_branch1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(register_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(prop_label, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(prop_label, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(register_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(update_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(delete_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quit_branch1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        home_tabs.addTab("PROPERTIES", jPanel9);

        branch_label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        branch_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        branch_label1.setText("PROGRAMME");

        register_prog.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        register_prog.setText("Register New Programme");
        register_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_progActionPerformed(evt);
            }
        });

        del_prog.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        del_prog.setText("Close Existing Programme");
        del_prog.setToolTipText("");
        del_prog.setActionCommand("Update an Existing Client Data");
        del_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_progActionPerformed(evt);
            }
        });

        show_prog.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        show_prog.setText("Show Programme Data");
        show_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_progActionPerformed(evt);
            }
        });

        quit_branch3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quit_branch3.setText("Quit");
        quit_branch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_branch3ActionPerformed(evt);
            }
        });

        register_prog1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        register_prog1.setText("Register/Remove Members");
        register_prog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_prog1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(register_prog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(del_prog, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(show_prog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quit_branch3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register_prog1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(branch_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(branch_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(register_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(register_prog1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(del_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(show_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quit_branch3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        home_tabs.addTab("PROGRAMME", jPanel12);

        javax.swing.GroupLayout big_panelLayout = new javax.swing.GroupLayout(big_panel);
        big_panel.setLayout(big_panelLayout);
        big_panelLayout.setHorizontalGroup(
            big_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(big_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(big_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, big_panelLayout.createSequentialGroup()
                        .addComponent(home_banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(home_tabs)))
        );
        big_panelLayout.setVerticalGroup(
            big_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(big_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(home_banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_tabs)
                .addGap(12, 12, 12))
        );

        home_tabs.getAccessibleContext().setAccessibleName("client_tab");

        getContentPane().add(big_panel);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quit_branch1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        
    }

    private void delete_propActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
        this.dispose();
    }

    private void update_propActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowProp dialog = new ShowProp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
        this.dispose();
        
        
        
        
    }

    private void register_propActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterProp dialog = new RegisterProp(new javax.swing.JFrame(), true);
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

    private void quit_branchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void show_branchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void delete_branchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteBranch dialog = new DeleteBranch(new javax.swing.JFrame(), true);
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

    private void update_branchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBranch().setVisible(true);
            }
        });
        this.dispose();
    }

    private void register_branchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterBranch dialog = new RegisterBranch(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
         this.dispose();
        
    }

    private void quit_deptActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
    }

    private void show_deptActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        
       
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowDept dialog = new ShowDept(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
                 this.dispose();
    }

    private void update_deptActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
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

    private void quit_branch3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
    }

    private void show_progActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowProg dialog = new ShowProg(new javax.swing.JFrame(), true);
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

    private void del_progActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
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

    private void register_progActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterProg dialog = new RegisterProg(new javax.swing.JFrame(), true);
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

    private void quit_empActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        
        this.dispose();
    }

    private void show_empActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
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

    private void delete_empActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteEmployee dialog = new DeleteEmployee(new javax.swing.JFrame(), true);
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

    private void update_empActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
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

    private void register_empActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterEmp dialog;
                try {
                    dialog = new RegisterEmp(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    private void quit_clientActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();
    }

    private void show_clientActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowClient().setVisible(true);
            }
        });
    }

    private void delete_clientActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteClient dialog = new DeleteClient(new javax.swing.JFrame(), true);
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

    private void update_clientActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

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
        this.dispose();
    }

    private void register_clientActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

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
        this.dispose();
    }

    private void register_prog1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProgg().setVisible(true);
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
                Home wind = new Home();
                wind.setVisible(true);
            }
        });

    }


    private javax.swing.JPanel big_panel;
    private javax.swing.JLabel branch_label1;
    private javax.swing.JLabel client_label;
    private javax.swing.JButton del_prog;
    private javax.swing.JButton delete_branch;
    private javax.swing.JButton delete_client;
    private javax.swing.JButton delete_emp;
    private javax.swing.JButton delete_prop;
    private javax.swing.JLabel emp_label;
    private javax.swing.JLabel emp_label1;
    private javax.swing.JLabel emp_label4;
    private javax.swing.JPanel home_banner;
    private javax.swing.JTabbedPane home_tabs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel prop_label;
    private javax.swing.JButton quit_branch;
    private javax.swing.JButton quit_branch1;
    private javax.swing.JButton quit_branch3;
    private javax.swing.JButton quit_client;
    private javax.swing.JButton quit_dept;
    private javax.swing.JButton quit_emp;
    private javax.swing.JButton register_branch;
    private javax.swing.JButton register_client;
    private javax.swing.JButton register_emp;
    private javax.swing.JButton register_prog;
    private javax.swing.JButton register_prog1;
    private javax.swing.JButton register_prop;
    private javax.swing.JButton show_branch;
    private javax.swing.JButton show_client;
    private javax.swing.JButton show_dept;
    private javax.swing.JButton show_emp;
    private javax.swing.JButton show_prog;
    private javax.swing.JButton update_branch;
    private javax.swing.JButton update_client;
    private javax.swing.JButton update_dept;
    private javax.swing.JButton update_emp;
    private javax.swing.JButton update_prop;

}
