/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;


public class Principal extends javax.swing.JFrame {
     
    public Principal() {
        initComponents();
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        btnnivel1 = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Capture.PNG"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 310, 100));

        btnnivel1.setBackground(new java.awt.Color(255, 0, 51));
        btnnivel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugando-videojuegos.png"))); // NOI18N
        btnnivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnivel1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnnivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 130));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/desktop-wallpaper-snake-for-pc-7353-amazing-z-for-your-mobile-tablet-explore-snake-game-snake-game-snake-snake.jpg"))); // NOI18N
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnivel1ActionPerformed
       
       Vista vista=new Vista();
       vista.setVisible(true);
       dispose();
      
    }//GEN-LAST:event_btnnivel1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnivel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
