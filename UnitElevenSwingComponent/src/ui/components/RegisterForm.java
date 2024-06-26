/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.components;

import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Color;

/**
 *
 * @author Mangal Tamang
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
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

        label_title = new javax.swing.JLabel();
        label_register = new javax.swing.JLabel();
        label_fullname = new javax.swing.JLabel();
        text_fullname = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        text_email = new javax.swing.JTextField();
        label_contact = new javax.swing.JLabel();
        text_contact = new javax.swing.JTextField();
        label_gender = new javax.swing.JLabel();
        cmb_gender = new javax.swing.JComboBox<>();
        label_address = new javax.swing.JLabel();
        text_address = new javax.swing.JTextField();
        button_register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_title.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("DAV Appointment System");

        label_register.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        label_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_register.setText("Register Here");

        label_fullname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        label_fullname.setText("Full Name:");

        text_fullname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        text_fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_fullnameActionPerformed(evt);
            }
        });

        label_email.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        label_email.setText("Email:");

        text_email.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        text_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_emailActionPerformed(evt);
            }
        });

        label_contact.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        label_contact.setText("Contact:");

        text_contact.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        text_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_contactActionPerformed(evt);
            }
        });

        label_gender.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        label_gender.setText("Gender:");

        cmb_gender.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        label_address.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        label_address.setText("Address:");

        text_address.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        button_register.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button_register.setText("REGISTER");
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_email, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_address, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_address))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title)
                .addGap(18, 18, 18)
                .addComponent(label_register)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_register, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_fullnameActionPerformed

    private void text_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_emailActionPerformed

    private void text_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_contactActionPerformed

    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed
        // TODO add your handling code here:
        // taking data from input field i.e full name
        String full_name = text_fullname.getText();
        String email = text_email.getText();
        String contact = text_contact.getText();
        String address = text_address.getText();

        // taking data from combobox and converting into String
        String gender = cmb_gender.getSelectedItem().toString();

        if (full_name.equals("")) {
            System.out.println("Please enter full name");
            // changing label color when the field is empty
            label_fullname.setForeground(Color.red);
        }
        if (email.equals("")) {
            System.out.println("Please enter email");
            label_email.setForeground(Color.red);
        }
        if (contact.equals("")) {
            System.out.println("Please enter contact");
            label_contact.setForeground(Color.red);
        }
        if (address.equals("")) {
            System.out.println("Please enter address");
            label_address.setForeground(Color.red);
        }

        System.out.println("Full Name: " + full_name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);
    }//GEN-LAST:event_button_registerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        IntelliJTheme.setup(RegisterForm.class.getResourceAsStream("/template.theme.json"));
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_register;
    private javax.swing.JComboBox<String> cmb_gender;
    private javax.swing.JLabel label_address;
    private javax.swing.JLabel label_contact;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_fullname;
    private javax.swing.JLabel label_gender;
    private javax.swing.JLabel label_register;
    private javax.swing.JLabel label_title;
    private javax.swing.JTextField text_address;
    private javax.swing.JTextField text_contact;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_fullname;
    // End of variables declaration//GEN-END:variables
}
