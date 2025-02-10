/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.util.Date;
import model.User;


/**
 *
 * @author Admin
 */
public class ViewJPanel extends javax.swing.JPanel {

    private User userObject; // By default it is private
    
    
    /**
     * Creates new form ViewJPanel
     */
    //JPanel btmPanel ;
    
    public ViewJPanel() {
        initComponents();
    }
    
    public ViewJPanel(User userObject){
        initComponents();
        this.userObject = userObject;
        Date selectedDate = userObject.getDob();
        setALLFields();
    }

    public void setALLFields (){
        this.namejTextField1.setText(userObject.getName());
        this.lastjTextField2.setText(userObject.getLast());
        this.genderComboBox1.setSelectedItem(userObject.getGender());
        this.agejTextField3.setText(String.valueOf(userObject.getAge()));
        this.phonejTextField4.setText(userObject.getPhone());
        this.mailjTextField5.setText(userObject.getMail());
        this.hobbyTextArea1.setText(userObject.getHobby());
        this.imgLabel.setIcon(userObject.getScaledIcon());
        this.jDateChooser1.setDate(userObject.getDob());
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
        imgLabel = new javax.swing.JLabel();
        agejLabel = new javax.swing.JLabel();
        agejTextField3 = new javax.swing.JTextField();
        phonejLabel5 = new javax.swing.JLabel();
        phonejTextField4 = new javax.swing.JTextField();
        mailjLabel6 = new javax.swing.JLabel();
        mailjTextField5 = new javax.swing.JTextField();
        hobbyLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hobbyTextArea1 = new javax.swing.JTextArea();
        hobbyLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        profilePicturejLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 102));

        profilejLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        profilejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        profilejLabel1.setText("New User Profile");
        profilejLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        namejLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        namejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        namejLabel1.setText("First Name");

        namejTextField1.setEditable(false);
        namejTextField1.setEnabled(false);

        lastjLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lastjLabel2.setForeground(new java.awt.Color(255, 255, 255));
        lastjLabel2.setText("Last Name");

        lastjTextField2.setEnabled(false);

        genderjLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        genderjLabel3.setForeground(new java.awt.Color(255, 255, 255));
        genderjLabel3.setText("Gender");

        genderComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        genderComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox1.setSelectedIndex(-1);
        genderComboBox1.setEnabled(false);

        imgLabel.setBackground(new java.awt.Color(102, 102, 102));

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

        hobbyLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        hobbyLabel8.setForeground(new java.awt.Color(255, 255, 255));
        hobbyLabel8.setText("Date of Birth");

        jDateChooser1.setEnabled(false);

        profilePicturejLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        profilePicturejLabel.setForeground(new java.awt.Color(255, 255, 255));
        profilePicturejLabel.setText("Profile Picture");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hobbyLabel7)
                            .addComponent(hobbyLabel8))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namejLabel1)
                            .addComponent(lastjLabel2)
                            .addComponent(genderjLabel3)
                            .addComponent(agejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profilejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(agejTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 231, Short.MAX_VALUE)
                                    .addComponent(lastjTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namejTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profilePicturejLabel)
                            .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phonejLabel5)
                            .addComponent(mailjLabel6))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mailjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonejTextField4))))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profilejLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(profilePicturejLabel)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(genderjLabel3)))
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agejLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonejLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailjLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hobbyLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hobbyLabel8))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agejLabel;
    private javax.swing.JTextField agejTextField3;
    private javax.swing.JComboBox<String> genderComboBox1;
    private javax.swing.JLabel genderjLabel3;
    private javax.swing.JLabel hobbyLabel7;
    private javax.swing.JLabel hobbyLabel8;
    private javax.swing.JTextArea hobbyTextArea1;
    private javax.swing.JLabel imgLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
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
    // End of variables declaration//GEN-END:variables
}
