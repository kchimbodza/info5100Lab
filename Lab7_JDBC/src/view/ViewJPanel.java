/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;
import utility.DatabaseConnector;


/**
 *
 * @author Admin
 */
public class ViewJPanel extends javax.swing.JPanel {

    private User userObject; // By default it is private
    private ArrayList <User> users;
    
    
    /**
     * Creates new form ViewJPanel
     */
    //JPanel btmPanel ;
    
    public ViewJPanel() {
        initComponents();
        populateTable();
    }
    
    public ViewJPanel(User userObject){
        initComponents();
        this.userObject = userObject;
        setALLFields();
        populateTable();
    }

    public void setALLFields (){
        this.namejTextField1.setText(userObject.getName());
        this.lastjTextField2.setText(userObject.getLast());
        this.genderComboBox1.setSelectedItem(userObject.getGender());
        this.agejTextField3.setText(String.valueOf(userObject.getAge()));
        this.phonejTextField4.setText(userObject.getPhone());
        this.mailjTextField5.setText(userObject.getMail());
        this.hobbyTextArea1.setText(userObject.getHobby());
    }
// Get details from database and populate table
    public void populateTable(){
    //  get data from database
    this.users = DatabaseConnector.getUsers();
    // display in the table
    
    DefaultTableModel model =(DefaultTableModel) this.userjTable.getModel();
    model.setRowCount(0);
    for(User u1: users){
        Object [] row = new Object [8];
        row[0] = u1.getUserId();
        row[1] = u1.getName();
        row[2] = u1.getLast();
        row[3] = u1.getGender();
        row[4] = u1.getAge();
        row[5] = u1.getPhone();
        row[6] = u1.getMail();
        row[7] = u1.getHobby();
        model.addRow(row);
        
    }
    }
    
    public void enableAll(){
        this.namejTextField1.setEnabled(true);
        this.lastjTextField2.setEnabled(true);
        this.genderComboBox1.setEnabled(true);
        this.agejTextField3.setEnabled(true);
        this.phonejTextField4.setEnabled(true);  
        this.mailjTextField5.setEnabled(true);
        this.hobbyTextArea1.setEnabled(true);
    }
    
    public void disableAll(){
        this.namejTextField1.setEnabled(false);
        this.lastjTextField2.setEnabled(false);
        this.genderComboBox1.setEnabled(false);
        this.agejTextField3.setEnabled(false);
        this.phonejTextField4.setEnabled(false);  
        this.mailjTextField5.setEnabled(false);
        this.hobbyTextArea1.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profilejLabel1 = new javax.swing.JLabel();
        namejLabel1 = new javax.swing.JLabel();
        namejTextField1 = new javax.swing.JTextField();
        lastjLabel2 = new javax.swing.JLabel();
        lastjTextField2 = new javax.swing.JTextField();
        genderjLabel3 = new javax.swing.JLabel();
        genderComboBox1 = new javax.swing.JComboBox<>();
        agejLabel = new javax.swing.JLabel();
        agejTextField3 = new javax.swing.JTextField();
        phonejLabel5 = new javax.swing.JLabel();
        phonejTextField4 = new javax.swing.JTextField();
        mailjLabel6 = new javax.swing.JLabel();
        mailjTextField5 = new javax.swing.JTextField();
        hobbyLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hobbyTextArea1 = new javax.swing.JTextArea();
        profilePicturejLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userjTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 102));

        profilejLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        profilejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        profilejLabel1.setText("Registration ");
        profilejLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        namejLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        namejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        namejLabel1.setText("First Name");

        namejTextField1.setEnabled(false);

        lastjLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lastjLabel2.setForeground(new java.awt.Color(255, 255, 255));
        lastjLabel2.setText("Last Name");

        lastjTextField2.setEnabled(false);

        genderjLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        genderjLabel3.setForeground(new java.awt.Color(255, 255, 255));
        genderjLabel3.setText("Gender");

        genderComboBox1.setEditable(true);
        genderComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        genderComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox1.setSelectedIndex(-1);
        genderComboBox1.setEnabled(false);

        agejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        agejLabel.setForeground(new java.awt.Color(255, 255, 255));
        agejLabel.setText("Age");

        agejTextField3.setEnabled(false);

        phonejLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        phonejLabel5.setForeground(new java.awt.Color(255, 255, 255));
        phonejLabel5.setText("Phone Number");

        phonejTextField4.setForeground(new java.awt.Color(102, 102, 102));
        phonejTextField4.setEnabled(false);

        mailjLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        mailjLabel6.setForeground(new java.awt.Color(255, 255, 255));
        mailjLabel6.setText("Email");

        mailjTextField5.setForeground(new java.awt.Color(102, 102, 102));
        mailjTextField5.setEnabled(false);

        hobbyLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        hobbyLabel7.setForeground(new java.awt.Color(255, 255, 255));
        hobbyLabel7.setText("Hobbies");

        hobbyTextArea1.setColumns(20);
        hobbyTextArea1.setRows(5);
        hobbyTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(hobbyTextArea1);

        profilePicturejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        profilePicturejLabel.setForeground(new java.awt.Color(255, 255, 255));

        userjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FirstName", "LastName", "Gender", "Age", "Phone", "Email", "Hobbies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(userjTable);

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profilejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(238, 238, 238))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phonejLabel5)
                            .addComponent(mailjLabel6)
                            .addComponent(hobbyLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phonejTextField4)
                                    .addComponent(mailjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submitButton)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namejLabel1)
                            .addComponent(lastjLabel2)
                            .addComponent(genderjLabel3)
                            .addComponent(agejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(agejTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastjTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namejTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(profilePicturejLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(deleteButton)
                                .addGap(0, 257, Short.MAX_VALUE)))))
                .addGap(0, 106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(profilejLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editButton)
                            .addComponent(deleteButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profilePicturejLabel)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namejLabel1)
                            .addComponent(namejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastjLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderjLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agejLabel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phonejLabel5)
                            .addComponent(phonejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailjLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hobbyLabel7)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        //select row to delete
        int selectedRowIndex = this.userjTable.getSelectedRow();
        try{
            this.userObject = this.users.get(selectedRowIndex);
            DatabaseConnector.deleteUser(userObject);
            System.out.println("User deleted Successfull");
            populateTable();
        }catch(Exception e){
            System.out.println("Unable to delete");
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = this.userjTable.getSelectedRow();
        try{
            this.userObject = this.users.get(selectedRowIndex);
            setALLFields();
            enableAll();
           
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_editButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        User updatedUser = new User();
        updatedUser.setName(this.namejTextField1.getText());
        updatedUser.setLast(this.lastjTextField2.getText());
        updatedUser.setGender(this.genderComboBox1.getSelectedItem().toString());
        updatedUser.setAge(Integer.parseInt(this.agejTextField3.getText()));
        updatedUser.setPhone(this.phonejTextField4.getText());
        updatedUser.setMail(this.mailjTextField5.getText());
        updatedUser.setHobby(this.hobbyTextArea1.getText());
        
        try{
            DatabaseConnector.updateUser(userObject, updatedUser);
            System.out.println("Record Updated!");
            JOptionPane.showMessageDialog(this,"Record Updated!" , "Success!", HEIGHT);
            populateTable();
            
        }catch (Exception e){
            System.out.println(e);
        }
        
      
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agejLabel;
    private javax.swing.JTextField agejTextField3;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> genderComboBox1;
    private javax.swing.JLabel genderjLabel3;
    private javax.swing.JLabel hobbyLabel7;
    private javax.swing.JTextArea hobbyTextArea1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastjLabel2;
    private javax.swing.JTextField lastjTextField2;
    private javax.swing.JLabel mailjLabel6;
    private javax.swing.JTextField mailjTextField5;
    private javax.swing.JLabel namejLabel1;
    private javax.swing.JTextField namejTextField1;
    private javax.swing.JLabel phonejLabel5;
    private javax.swing.JTextField phonejTextField4;
    private javax.swing.JLabel profilePicturejLabel;
    private javax.swing.JLabel profilejLabel1;
    private javax.swing.JButton submitButton;
    private javax.swing.JTable userjTable;
    // End of variables declaration//GEN-END:variables
}
