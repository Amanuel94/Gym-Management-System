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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ShowDept extends javax.swing.JDialog {


    public ShowDept(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            this.branches = getBranches();
            initComponents();
        } catch (SQLException ex) {
            Logger.getLogger(ShowDept.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShowDept.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        dname_box = new javax.swing.JCheckBox();
        dbranch_box = new javax.swing.JCheckBox();
        dhead_box = new javax.swing.JCheckBox();
        dnoemp_box = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        dept_table = new javax.swing.JTable();
        quit_show_dept_btn = new javax.swing.JButton();
        toHome_show_dept_btn = new javax.swing.JButton();
        dept_show_btn = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Show Department Data");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Select the Branch of the Department(s):");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Select Department:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = branches;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Executives and Heads", "Health and Paramedics", "Human Resources", "Instructors/Trainers", "Others" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Show");

        dname_box.setSelected(true);
        dname_box.setText("Name");
        dname_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dname_boxActionPerformed(evt);
            }
        });

        dbranch_box.setSelected(true);
        dbranch_box.setText("Branch");

        dhead_box.setText("Head ID");
        dhead_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dhead_boxActionPerformed(evt);
            }
        });

        dnoemp_box.setText("Number of Employees");

        dept_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Branch"
            }
        ));
        jScrollPane3.setViewportView(dept_table);

        quit_show_dept_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quit_show_dept_btn.setText("QUIT");
        quit_show_dept_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_show_dept_btnActionPerformed(evt);
            }
        });

        toHome_show_dept_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        toHome_show_dept_btn.setText("GO BACK");
        toHome_show_dept_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toHome_show_dept_btnActionPerformed(evt);
            }
        });

        dept_show_btn.setText("Show");
        dept_show_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_show_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(toHome_show_dept_btn)
                                    .addGap(348, 348, 348)
                                    .addComponent(quit_show_dept_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dname_box, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dbranch_box, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dhead_box, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dnoemp_box)
                                        .addGap(18, 18, 18)
                                        .addComponent(dept_show_btn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 87, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dname_box)
                    .addComponent(dbranch_box)
                    .addComponent(dhead_box)
                    .addComponent(dnoemp_box)
                    .addComponent(dept_show_btn)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toHome_show_dept_btn)
                    .addComponent(quit_show_dept_btn))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dname_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void dhead_boxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void toHome_show_dept_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home wind = new Home();
                wind.setVisible(true);
            }
        });
        this.dispose();

    }

    private void quit_show_dept_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
    }

    private void dept_show_btnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // TODO add your handling code here:
            conn = new DBConnection();
            Connection db = conn.getDB();
            Statement show_dep = db.createStatement();
            db.prepareStatement("SET sql_mode = (SELECT REPLACE(@@sql_mode, \'ONLY_FULL_GROUP_BY\', \'\'));").executeUpdate();
            String where = "";
            List<String> vals1 = jList1.getSelectedValuesList();
            List<String> vals2 = jList2.getSelectedValuesList();
            
            if(vals1.size() == 0 && vals2.size() == 0){
            where =  " GROUP BY employee.edep";
            }
            else{
                
                where = createWhereClause(vals1, vals2);
            
            
            }

            String query = "SELECT DISTINCT " + selectedBoxes() + " FROM department INNER JOIN employee ON employee.edep = department.dept_name AND employee.ebranch = department.dept_branch" + where + ";"; 
            
            
            System.out.println(query);
            ResultSet rs = show_dep.executeQuery(query);
            selectedCols(cols);
ArrayList<String[]> data = new ArrayList<String[]>();
HashMap<String, String> map = new HashMap<String, String> ();
map.put("Name", "department.dept_name");
map.put("Branch", "department.dept_branch");
map.put("Head", "department.dept_head");
map.put("Number of employees", "count(*)");

  
        
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
dept_table.setModel(model);

cols.clear();
data.clear();
            
            
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(rootPane,"All fields are required.");
        }
        
        
    }
private void selectedCols(ArrayList<String> cols){
    if(dname_box.isSelected()) cols.add("Name");
    else cols.remove("Name");
    if(dbranch_box.isSelected()) cols.add("Branch");
    else cols.remove("Branch");
    if(dhead_box.isSelected()) cols.add("Head");
    else cols.remove("Head");
    if(dnoemp_box.isSelected()) cols.add("Number of employees");
    else cols.remove("Number of employees");
    
    
    }

    
    
    
    private String selectedBoxes(){
    ArrayList<String> fields = new ArrayList<String>();
    if(dname_box.isSelected()) fields.add("department.dept_name");
    if(dbranch_box.isSelected()) fields.add("department.dept_branch");
    if(dhead_box.isSelected()) fields.add("department.dept_head");
    if(dnoemp_box.isSelected()) fields.add("count(*)");

    
    return (" " + String.join(", ", (String[])fields.toArray(new String[fields.size()])));
    


    
    
    }
    
    
    private String createWhereClause(List<String> vals1, List<String> vals2){
        String[] v1 = new String[vals1.size()];
        String[] v2 = new String[vals2.size()];
        
        for (int i = 0; i < vals1.size(); i++) {
            v1[i] = " department.dept_branch = \"" + vals1.get(i)+ "\"";
            
        }
        

        for (int i = 0; i < vals2.size(); i++) {
            v2[i] = " department.dept_name = \"" + vals2.get(i) + "\"";
            
        }
        
        
        
        return " WHERE "+"(" + String.join(" OR ", v1) + ") AND (" + String.join(" OR ", v2) + ") GROUP BY department.dept_name";
        
        
       
        
    
    
    }
    
    
    
    

    public static void main(String args[]) {

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
    }


    private javax.swing.JCheckBox dbranch_box;
    private javax.swing.JButton dept_show_btn;
    private javax.swing.JTable dept_table;
    private javax.swing.JCheckBox dhead_box;
    private javax.swing.JCheckBox dname_box;
    private javax.swing.JCheckBox dnoemp_box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton quit_show_dept_btn;
    private javax.swing.JButton toHome_show_dept_btn;
    // End of variables declaration//GEN-END:variables
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
