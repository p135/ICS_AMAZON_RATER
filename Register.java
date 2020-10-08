/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mycompany.booksmart_app;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.File;
import java.util.Scanner;


/**
 *
 * @author kalsi
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        rePassword = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setResizable(false);

        firstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstName.setText("Enter First Name");
        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFocusLost(evt);
            }
        });

        lastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastName.setText("Enter Last Name");
        lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFocusLost(evt);
            }
        });

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setText("Enter Username");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setText("Enter Email");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Register");

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("Enter Password");
        password.setToolTipText("");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        rePassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rePassword.setText("Re-enter Password");
        rePassword.setToolTipText("");
        rePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rePasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rePasswordFocusLost(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("logo.png"))); // NOI18N
        logo.setText("Place holder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(102, 102, 102)
                                    .addComponent(rePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 144, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        if (password.getText().equals(rePassword.getText())) {
            String[] defaults = {"Enter First Name", "Enter Last Name", "Enter Username", "Re-enter Password", "", "Enter Email"};

            JTextField[] fields = {firstName, lastName, username, password, rePassword, email};

            String errors = "";

            int i = 0;

            for (String s : defaults) {
                if (s.equals(fields[i].getText())) {
                    switch (i) {
                        case 0:
                            errors += "First Name\n";
                            break;
                        case 1:
                            errors += "Last Name\n";
                            break;
                        case 2:
                            errors += "Username\n";
                            break;
                        case 3:
                            errors += "Password\n";
                            break;
                        case 4:
                            errors += "Re-enter Password\n";
                            System.out.println(s);
                            break;
                        case 5:
                            errors += "Email\n";
                            break;
                    }
                }
                i++;
            }

            if (errors.length() > 0) {
                JOptionPane.showMessageDialog(null, "The following field(s) have not been filled out:\n" + errors, "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int doesUsrExist = userExists(username.getText(), email.getText());
               if(doesUsrExist == -1){
                   storeUser(username.getText(), firstName.getText(), lastName.getText(), email.getText(), password.getText());
                   
                   JOptionPane.showMessageDialog(null, "You have successfully registered!");
                   
                   new bookSurvey().setVisible(true);
                   this.setVisible(false);
               }else{
                    String message = "";

                    switch (doesUsrExist) {
                        case 2:
                            message = "Your username and email are not unique please change them!";
                            break;
                        
                        case 1:
                            message = "Your username is not unique please change it!";
                            break;

                        case 0:
                            message = "Your email is not unique please change it!";
                            break;

                        default:
                            message = "There was some internal error, sorry about that!";
                            break;
                    }

                JOptionPane.showMessageDialog(null, message, "Error",
                        JOptionPane.ERROR_MESSAGE);
               }
            }
        } else {
            JTextArea textArea = new JTextArea();
            textArea.setText("Password and Password Confirmation Don't Match");
            textArea.setSize(300, Short.MAX_VALUE); // limit = width in pixels, e.g. 500
            textArea.setWrapStyleWord(true);
            textArea.setLineWrap(true);
            textArea.setEditable(false);
            
            JOptionPane.showMessageDialog(null, textArea, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    public void storeUser(String username, String firstName, String lastName, String email, String password){
        final String FILENAME = "Users.txt";

        FileWriter fw;
        
        try{
            fw = new FileWriter(FILENAME, true);

            fw.write(username + "," + firstName + "," + lastName + "," + email + "," + password + "\n");

            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public int userExists(String enteredUsername, String enteredEmail){
        final String FILENAME = "Users.txt";

        //DEV NOTE: only the username and email have to be unique
        File file = new File(FILENAME);
        Scanner reader = null;
        
        try{
            reader = new Scanner(file);
        }catch(Exception e){
            e.printStackTrace();
        }
            

        while(reader.hasNextLine()){
            String [] line = reader.nextLine().split(",");

            for(int i = 0; i < line.length; i++){
                line[i] = line[i].strip();
            }
            
            //DEV NOTE: line format is: username,first name, last name, email, password
            if(line[0].equalsIgnoreCase(enteredUsername) && line[3].equalsIgnoreCase(enteredEmail)){
                return 2;
            } else if(line[0].equalsIgnoreCase(enteredUsername)){
                return 1;
            } else if(line[3].equalsIgnoreCase(enteredEmail)){
                return 0;
            }
        }

        return -1;
    }

    private void firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusLost
        if (firstName.getText().equals("")) {
            firstName.setText("Enter First Name");
        }
    }//GEN-LAST:event_firstNameFocusLost

    private void firstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusGained
        password.setEchoChar((char) 0);
        rePassword.setEchoChar((char) 0);

        if (firstName.getText().equals("Enter First Name")) {
            firstName.setText("");
        }
    }//GEN-LAST:event_firstNameFocusGained

    private void lastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusGained
        if (lastName.getText().equals("Enter Last Name")) {
            lastName.setText("");
        }
    }//GEN-LAST:event_lastNameFocusGained

    private void lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusLost
        if (lastName.getText().equals("")) {
            lastName.setText("Enter Last Name");
        }
    }//GEN-LAST:event_lastNameFocusLost

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if (username.getText().equals("")) {
            username.setText("Enter Username");
        }
    }//GEN-LAST:event_usernameFocusLost

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        if (username.getText().equals("Enter Username")) {
            username.setText("");
        }
    }//GEN-LAST:event_usernameFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        if (email.getText().equals("Enter Email")) {
            email.setText("");
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (email.getText().equals("")) {
            email.setText("Enter Email");
        }
    }//GEN-LAST:event_emailFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if (password.getText().equals("Enter Password")) {
            password.setText("");
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if (password.getText().equals("Enter Password") || password.getText().equals("")) {
            password.setText("Enter Password");
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_passwordFocusLost

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        password.setEchoChar((char) 0);
    }//GEN-LAST:event_passwordActionPerformed

    private void rePasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rePasswordFocusGained
        if (rePassword.getText().equals("Re-enter Password")) {
            rePassword.setText("");
            rePassword.setEchoChar('*');
        }
    }//GEN-LAST:event_rePasswordFocusGained

    private void rePasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rePasswordFocusLost
        if (rePassword.getText().equals("Enter Password") || rePassword.getText().equals("")) {
            rePassword.setText("Enter Password");
            rePassword.setEchoChar((char) 0);
        } else {
            rePassword.setEchoChar('*');
        }
    }//GEN-LAST:event_rePasswordFocusLost

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField rePassword;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
