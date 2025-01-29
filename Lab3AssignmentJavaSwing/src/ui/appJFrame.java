/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Admin
 */
public class appJFrame extends javax.swing.JFrame {

    /**
     * Creates new form appJFrame
     */
    public appJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appjPanel1 = new javax.swing.JPanel();
        profilejLabel1 = new javax.swing.JLabel();
        namejLabel1 = new javax.swing.JLabel();
        namejTextField1 = new javax.swing.JTextField();
        lastjLabel2 = new javax.swing.JLabel();
        genderjLabel3 = new javax.swing.JLabel();
        agejLabel4 = new javax.swing.JLabel();
        phonejLabel5 = new javax.swing.JLabel();
        mailjLabel6 = new javax.swing.JLabel();
        lastjTextField2 = new javax.swing.JTextField();
        agejTextField3 = new javax.swing.JTextField();
        phonejTextField4 = new javax.swing.JTextField();
        mailjTextField5 = new javax.swing.JTextField();
        submitjButton2 = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        genderComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        hobbyTextArea1 = new javax.swing.JTextArea();
        hobbyLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appjPanel1.setBackground(new java.awt.Color(0, 102, 153));

        profilejLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        profilejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        profilejLabel1.setText("New User Profile");

        namejLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        namejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        namejLabel1.setText("First Name");

        lastjLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lastjLabel2.setForeground(new java.awt.Color(255, 255, 255));
        lastjLabel2.setText("Last Name");

        genderjLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        genderjLabel3.setForeground(new java.awt.Color(255, 255, 255));
        genderjLabel3.setText("Gender");

        agejLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        agejLabel4.setForeground(new java.awt.Color(255, 255, 255));
        agejLabel4.setText("Age");

        phonejLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        phonejLabel5.setForeground(new java.awt.Color(255, 255, 255));
        phonejLabel5.setText("Phone Number");

        mailjLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        mailjLabel6.setForeground(new java.awt.Color(255, 255, 255));
        mailjLabel6.setText("Email");

        phonejTextField4.setForeground(new java.awt.Color(102, 102, 102));
        phonejTextField4.setText("e.g 123-345-6789");

        mailjTextField5.setForeground(new java.awt.Color(102, 102, 102));
        mailjTextField5.setText("e.g name@domain.com");

        submitjButton2.setText("Submit profile");
        submitjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButton2ActionPerformed(evt);
            }
        });

        genderComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        genderComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox1.setSelectedIndex(-1);

        hobbyTextArea1.setColumns(20);
        hobbyTextArea1.setRows(5);
        jScrollPane1.setViewportView(hobbyTextArea1);

        hobbyLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        hobbyLabel7.setForeground(new java.awt.Color(255, 255, 255));
        hobbyLabel7.setText("Hobbies");

        javax.swing.GroupLayout appjPanel1Layout = new javax.swing.GroupLayout(appjPanel1);
        appjPanel1.setLayout(appjPanel1Layout);
        appjPanel1Layout.setHorizontalGroup(
            appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appjPanel1Layout.createSequentialGroup()
                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appjPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(appjPanel1Layout.createSequentialGroup()
                                .addComponent(namejLabel1)
                                .addGap(64, 64, 64)
                                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profilejLabel1)
                                    .addComponent(namejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(appjPanel1Layout.createSequentialGroup()
                                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastjLabel2)
                                    .addComponent(genderjLabel3)
                                    .addComponent(agejLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phonejLabel5)
                                    .addComponent(mailjLabel6)
                                    .addComponent(hobbyLabel7))
                                .addGap(39, 39, 39)
                                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(agejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phonejTextField4)
                                    .addGroup(appjPanel1Layout.createSequentialGroup()
                                        .addComponent(genderComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imgLabel))
                                    .addComponent(mailjTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                    .addComponent(lastjTextField2)
                                    .addComponent(jScrollPane1)))))
                    .addGroup(appjPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(submitjButton2)))
                .addGap(0, 113, Short.MAX_VALUE))
        );
        appjPanel1Layout.setVerticalGroup(
            appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appjPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(profilejLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejLabel1)
                    .addComponent(namejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastjLabel2))
                .addGap(18, 18, 18)
                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderjLabel3)
                    .addComponent(imgLabel)
                    .addComponent(genderComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agejLabel4))
                .addGap(18, 18, 18)
                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonejLabel5))
                .addGap(18, 18, 18)
                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailjLabel6))
                .addGap(18, 18, 18)
                .addGroup(appjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hobbyLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(submitjButton2)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appjPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appjPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButton2ActionPerformed
        
  try  {
      
        User userObject = new User();
        //File selectedFile - new File();
        File selectedFile = null;  
        
       // 1. Get user details
        // Initialize the Objects
        userObject.setName(this.namejTextField1.getText());
        userObject.setLast(this.lastjTextField2.getText());
        userObject.setGender(this.genderComboBox1.getSelectedItem().toString());
        userObject.setAge(Integer.parseInt(this.agejTextField3.getText()));
        userObject.setPhone(this.phonejTextField4.getText());
        userObject.setMail(this.mailjTextField5.getText());
        userObject.setHobby(this.hobbyTextArea1.getText());
        userObject.setPhoto(selectedFile);
        
// Display result.
        System.out.println(userObject.getName());
        System.out.println(userObject.getLast());
        System.out.println(userObject.getGender());
        System.out.println(userObject.getAge());
        System.out.println(userObject.getPhone());
        System.out.println(userObject.getMail());
        System.out.println(userObject.getHobby());
        System.out.println(userObject.getPhoto());
        System.out.print(userObject);

        // Validate Inputs
        
        if(userObject.getName().isBlank()) {
        JOptionPane.showMessageDialog(rootPane, "Enter your First Name", "Wait!", HEIGHT);
        } else if (userObject.getLast().isBlank()){
              JOptionPane.showMessageDialog(rootPane, "Enter your Last Name", "Wait!", HEIGHT);  
        } else if (userObject.getGender().isBlank()){
              JOptionPane.showMessageDialog(rootPane, "Select Your Gender", "Wait!", HEIGHT);     
        } else if (userObject.getPhone().isBlank()){
              JOptionPane.showMessageDialog(rootPane, "Enter your Phone Number", "Wait!", HEIGHT);
        } else if (!isValidPhoneNumber(userObject.getPhone())) {
                JOptionPane.showMessageDialog(rootPane, "Enter a valid Phone Number", "Wait!", HEIGHT);
        } else if (userObject.getMail().isBlank()){
              JOptionPane.showMessageDialog(rootPane, "Enter your e-mail", "Wait!", HEIGHT);
        } else if (!isValidEmail(userObject.getMail())) {
                JOptionPane.showMessageDialog(rootPane, "Enter a valid Email", "Wait!", HEIGHT);
        } else if (userObject.getHobby().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Enter your Hobbies", "Wait!", HEIGHT);
        } else if (selectedFile == null) {
                JOptionPane.showMessageDialog(rootPane, "Please upload your photo", "Wait!", JOptionPane.WARNING_MESSAGE);    
       
           JFileChooser file = new JFileChooser();
            if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile = file.getSelectedFile();
                try {
                    BufferedImage img = ImageIO.read(selectedFile);
                    ImageIcon icon = new ImageIcon(img);
                   // Image edited_image = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
                    Image edited_image = icon.getImage().getScaledInstance(100, 100,  Image.SCALE_SMOOTH);
                    if (edited_image != null) {
                        imgLabel.setText(selectedFile.getAbsolutePath());
                        imgLabel.setIcon(new ImageIcon(edited_image));
                        ImageIcon scaledIcon = new ImageIcon(edited_image);
                        
               JOptionPane.showMessageDialog(rootPane, userObject ,"Success!", HEIGHT,scaledIcon);
                             }
                    } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Please upload the image correctly.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                     }
            }
        }

        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Please select your gender.", "Error!", JOptionPane.ERROR_MESSAGE);            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Please enter your Age", "Error!", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_submitjButton2ActionPerformed

     // Method to validate phone number 
    private boolean isValidPhoneNumber(String phone) {
        //String phoneStyle = "^(\\+\\d{1,3}[- ]?)?\\d{10}$"; // Example pattern for phone numbers
        String phoneStyle = "^(\\d{3}-\\d{3}-\\d{4})$";
        Pattern pattern = Pattern.compile(phoneStyle);
        Matcher matchstyle = pattern.matcher(phone);
        return matchstyle.matches();
    }

    // Method to validate email address 
    private boolean isValidEmail(String email) {
        String emailFormat = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailFormat);
        Matcher emailstyle = pattern.matcher(email);
        return emailstyle.matches();
    }
    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(appJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new appJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agejLabel4;
    private javax.swing.JTextField agejTextField3;
    private javax.swing.JPanel appjPanel1;
    private javax.swing.JComboBox<String> genderComboBox1;
    private javax.swing.JLabel genderjLabel3;
    private javax.swing.JLabel hobbyLabel7;
    private javax.swing.JTextArea hobbyTextArea1;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastjLabel2;
    private javax.swing.JTextField lastjTextField2;
    private javax.swing.JLabel mailjLabel6;
    private javax.swing.JTextField mailjTextField5;
    private javax.swing.JLabel namejLabel1;
    private javax.swing.JTextField namejTextField1;
    private javax.swing.JLabel phonejLabel5;
    private javax.swing.JTextField phonejTextField4;
    private javax.swing.JLabel profilejLabel1;
    private javax.swing.JButton submitjButton2;
    // End of variables declaration//GEN-END:variables

        }
    

