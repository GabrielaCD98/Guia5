/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.awt.event.KeyEvent;

/**
 *
 * @author gaby
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setSize(380,400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtLogin = new javax.swing.JTextField();
        jbtnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        lblAdvertencia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel\\Desktop\\Gabriela Cortez\\UES\\Programacion 2\\GUIA2\\GUIA5\\build\\classes\\imagenes\\fondoazul.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Login:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 190, 60, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel\\Desktop\\Gabriela Cortez\\UES\\Programacion 2\\GUIA2\\GUIA5\\build\\classes\\imagenes\\Logo.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 50, 270, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 240, 90, 17);
        getContentPane().add(jtxtLogin);
        jtxtLogin.setBounds(170, 190, 115, 20);

        jbtnIngresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnIngresar.setText("Ingresar");
        jbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnIngresar);
        jbtnIngresar.setBounds(70, 290, 100, 23);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(200, 290, 90, 23);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(170, 240, 115, 20);

        lblAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblAdvertencia);
        lblAdvertencia.setBounds(74, 295, 208, 21);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel\\Desktop\\Gabriela Cortez\\UES\\Programacion 2\\GUIA2\\GUIA5\\build\\classes\\imagenes\\persona.png")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-170, -30, 550, 460);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel\\Desktop\\Gabriela Cortez\\UES\\Programacion 2\\GUIA2\\GUIA5\\build\\classes\\imagenes\\persona.png")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(94, 144, 150, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarActionPerformed
        String usr= jtxtLogin.getText();
        String psw= new String (jPasswordField1.getPassword());
        
        if(usr.equals(usuario) && psw.equals(password)){
            Menu ventana = new Menu();
            this.setVisible(false);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        } else{
            lblAdvertencia.setText("Login o password incorrectos");
        }
        
    }//GEN-LAST:event_jbtnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jbtnIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbtnIngresar;
    private javax.swing.JTextField jtxtLogin;
    private javax.swing.JLabel lblAdvertencia;
    // End of variables declaration//GEN-END:variables
    String usuario="ADMIN";
    String password="123ABC";
}
