/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author gaby
 */
public class APP3 extends javax.swing.JFrame {

    /**
     * Creates new form APP3
     */
    public APP3() {
        initComponents();
        this.setSize(460,610);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCPU = new javax.swing.JTextField();
        txtPantalla = new javax.swing.JTextField();
        txtBateria = new javax.swing.JTextField();
        txtRAM = new javax.swing.JTextField();
        txtGarantia = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
        cbPrincipal = new javax.swing.JCheckBox();
        cbSecundaria = new javax.swing.JCheckBox();
        cbFlash = new javax.swing.JCheckBox();
        txtPrincipal = new javax.swing.JTextField();
        txtSecundaria = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaResultado = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtGPU = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtPuntaje = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("PUNTAJE DE MÓVILES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 30, 190, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("CPU numero de nucleos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 72, 132, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Tamaño de pantalla");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(31, 98, 140, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Cantidad de RAM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(31, 156, 96, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Tiempo de garantía");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(31, 182, 110, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Precio");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(31, 325, 35, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Marca");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(31, 240, 35, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setText("Cámaras");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 270, 50, 20);

        txtCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPUActionPerformed(evt);
            }
        });
        txtCPU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPUKeyTyped(evt);
            }
        });
        getContentPane().add(txtCPU);
        txtCPU.setBounds(190, 70, 195, 20);

        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });
        txtPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantallaKeyTyped(evt);
            }
        });
        getContentPane().add(txtPantalla);
        txtPantalla.setBounds(190, 100, 82, 20);
        getContentPane().add(txtBateria);
        txtBateria.setBounds(190, 130, 81, 20);
        getContentPane().add(txtRAM);
        txtRAM.setBounds(190, 160, 81, 20);

        txtGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarantiaActionPerformed(evt);
            }
        });
        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyTyped(evt);
            }
        });
        getContentPane().add(txtGarantia);
        txtGarantia.setBounds(190, 190, 81, 20);

        cmbMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lenovo", "Nexus", "Pixie", "Huawei", "Sony", "Apple", "Samsung", "Alcatel", "LG", "Otra" }));
        getContentPane().add(cmbMarca);
        cmbMarca.setBounds(190, 250, 77, 20);

        cbPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbPrincipal.setForeground(new java.awt.Color(204, 255, 204));
        cbPrincipal.setText("Principal");
        cbPrincipal.setContentAreaFilled(false);
        cbPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(cbPrincipal);
        cbPrincipal.setBounds(90, 270, 77, 23);

        cbSecundaria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbSecundaria.setForeground(new java.awt.Color(204, 255, 204));
        cbSecundaria.setText("Secundaria");
        cbSecundaria.setContentAreaFilled(false);
        cbSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSecundariaActionPerformed(evt);
            }
        });
        getContentPane().add(cbSecundaria);
        cbSecundaria.setBounds(190, 270, 93, 23);

        cbFlash.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbFlash.setForeground(new java.awt.Color(204, 255, 204));
        cbFlash.setText("Flash");
        cbFlash.setContentAreaFilled(false);
        cbFlash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFlashActionPerformed(evt);
            }
        });
        getContentPane().add(cbFlash);
        cbFlash.setBounds(320, 270, 55, 20);
        getContentPane().add(txtPrincipal);
        txtPrincipal.setBounds(100, 300, 44, 20);

        txtSecundaria.setEnabled(false);
        txtSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecundariaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSecundaria);
        txtSecundaria.setBounds(210, 300, 45, 20);

        btnEjecutar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEjecutar);
        btnEjecutar.setBounds(30, 380, 80, 23);

        jtaResultado.setColumns(20);
        jtaResultado.setRows(5);
        jtaResultado.setText("Puntaje<=7 \tNo es buena inversion\n7<Puntaje<14 \tInversion de Riesgo\n15<=Puntaje<=21 Inversion viable\n22<=Puntaje \tBuena Inversion");
        jScrollPane1.setViewportView(jtaResultado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 471, 357, 90);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 204));
        jLabel10.setText("Capacidad de bateria ma");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(31, 125, 140, 14);
        getContentPane().add(txtGPU);
        txtGPU.setBounds(190, 220, 81, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 204));
        jLabel11.setText("GPU");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(31, 211, 23, 14);
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(100, 330, 44, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 380, 70, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Volver a Menu Principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 380, 163, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PUNTAJE");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(210, 340, 70, 14);

        txtPuntaje.setEditable(false);
        getContentPane().add(txtPuntaje);
        txtPuntaje.setBounds(289, 340, 100, 20);

        jButton3.setText("Borrar datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(160, 430, 120, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\manuel\\Desktop\\Gabriela Cortez\\UES\\Programacion 2\\GUIA2\\GUIA5\\build\\classes\\imagenes\\fondoazulnegro.jpg")); // NOI18N
        jLabel9.setText("Puntaje");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 460, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPUKeyTyped
        char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCPUKeyTyped

    private void txtGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarantiaActionPerformed

    private void txtGarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyTyped
        char c =evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
        
        
    }//GEN-LAST:event_txtGarantiaKeyTyped

    private void txtPantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyTyped
        
        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (caracter!='.')){
        /* lo que deseo colocar aqui es si ya se pulso el caracter (.) el mismo no se pueda repetir*/
        evt.consume();
        }
        char input=evt.getKeyChar();
         if (Character.isLetter(input)) {
             evt.consume();
         }
    
    }//GEN-LAST:event_txtPantallaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu ventana = new Menu();
        this.setVisible(false);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPUActionPerformed
        if (txtCPU.getText().isEmpty()==true) {
            txtCPU.requestFocus();
        }
    }//GEN-LAST:event_txtCPUActionPerformed

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaActionPerformed

    private void cbPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPrincipalActionPerformed
        if (cbPrincipal.isSelected()==true) {
            txtPrincipal.requestFocus();
        }
    }//GEN-LAST:event_cbPrincipalActionPerformed

    private void cbSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSecundariaActionPerformed
         if (cbSecundaria.isSelected()) {
            txtSecundaria.setEnabled(true);
            txtSecundaria.requestFocus();
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSecundariaActionPerformed

    private void cbFlashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFlashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFlashActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        int bateria,indexMarca,precio,garantia,cpu,ram,principal,secundaria;
        double pantalla;
        boolean flash;
        flash=cbFlash.isSelected();
        CPuntaje c= new CPuntaje();
        if (cbPrincipal.isSelected()==false) {
            principal=0;
        } else {
             principal=Integer.parseInt(txtPrincipal.getText());
        }
        if (cbSecundaria.isSelected()==false) {
            secundaria=0;
        } else {
            secundaria=Integer.parseInt(txtSecundaria.getText());
        }
        bateria=Integer.parseInt(txtBateria.getText());
        precio=Integer.parseInt(txtPrecio.getText());
        garantia=Integer.parseInt(txtGarantia.getText());
        cpu=Integer.parseInt(txtCPU.getText());
        ram=Integer.parseInt(txtRAM.getText());
        pantalla=Double.parseDouble(txtPantalla.getText());
        indexMarca=cmbMarca.getSelectedIndex();
        c.BateriaPantalla(bateria, pantalla);
        c.Marca(indexMarca);
        c.Garantia(garantia);
        c.Nucleos(cpu);
        c.RAM(ram);
        c.RangoPrecio(precio);
        c.pixelaje(principal, secundaria,flash);
        txtPuntaje.setText(c.EnviarPuntaje());
        
        
    }                                           

    private void txtCPUKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode()==KeyEvent.VK_ENTER && txtCPU.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Necesita llenar el campo");
        } else if (evt.getKeyCode()==KeyEvent.VK_ENTER && txtCPU.getText().isEmpty()==false){
            txtCPU.transferFocus();
        }
    }                                 

                                      

    private void txtPantallaKeyPressed(java.awt.event.KeyEvent evt) {                                       
         if (evt.getKeyCode()==KeyEvent.VK_ENTER && txtPantalla.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Necesita llenar el campo");
        } else if (evt.getKeyCode()==KeyEvent.VK_ENTER && txtPantalla.getText().isEmpty()==false){
            txtPantalla.transferFocus();
        }
    }                                      

    private void txtRAMKeyTyped(java.awt.event.KeyEvent evt) {                                
         char input=evt.getKeyChar();
         if (Character.isLetter(input)) {
             evt.consume();
         }
    }                               

    private void txtRAMKeyPressed(java.awt.event.KeyEvent evt) {                                  
         if (evt.getKeyCode()==KeyEvent.VK_ENTER && txtRAM.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Necesita llenar el campo");
        } else if (evt.getKeyCode()==KeyEvent.VK_ENTER && txtRAM.getText().isEmpty()==false){
            txtRAM.transferFocus();
        }
                                  

   
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtCPU.setText("");
        txtPantalla.setText("");
        txtRAM.setText("");
        txtGarantia.setText("");
        txtPrincipal.setText("");
        txtSecundaria.setText("");
        txtPrecio.setText("");
        cbPrincipal.setSelected(false);
        cbSecundaria.setSelected(false);
        cbFlash.setSelected(false);
        cmbMarca.setSelectedIndex(0);
        txtBateria.setText("");
        txtPuntaje.setText("");
        txtGPU.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecundariaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSecundariaActionPerformed
   
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
            java.util.logging.Logger.getLogger(APP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APP3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JCheckBox cbFlash;
    private javax.swing.JCheckBox cbPrincipal;
    private javax.swing.JCheckBox cbSecundaria;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaResultado;
    private javax.swing.JTextField txtBateria;
    private javax.swing.JTextField txtCPU;
    private javax.swing.JTextField txtGPU;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrincipal;
    private javax.swing.JTextField txtPuntaje;
    private javax.swing.JTextField txtRAM;
    private javax.swing.JTextField txtSecundaria;
    // End of variables declaration//GEN-END:variables
}