/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichu;

/**
 *
 * @author matzaflokos
 */
public class Mahjong extends javax.swing.JFrame {

    /**
     * Creates new form Mahjong
     */
    public Mahjong() {
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

        jLabel1 = new javax.swing.JLabel();
        wish2 = new javax.swing.JButton();
        wish3 = new javax.swing.JButton();
        wish4 = new javax.swing.JButton();
        wish5 = new javax.swing.JButton();
        wish6 = new javax.swing.JButton();
        wish7 = new javax.swing.JButton();
        wish8 = new javax.swing.JButton();
        wish9 = new javax.swing.JButton();
        wish10 = new javax.swing.JButton();
        wish11 = new javax.swing.JButton();
        wish12 = new javax.swing.JButton();
        wish13 = new javax.swing.JButton();
        wish14 = new javax.swing.JButton();
        wishNone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WISH FOR ...");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 13, 167, 81));

        wish2.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix2.jpg")); // NOI18N
        wish2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish2MouseClicked(evt);
            }
        });
        getContentPane().add(wish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 111, 110, 171));

        wish3.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix3.jpg")); // NOI18N
        wish3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish3MouseClicked(evt);
            }
        });
        getContentPane().add(wish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 111, 110, 171));

        wish4.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix4.jpg")); // NOI18N
        wish4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish4MouseClicked(evt);
            }
        });
        wish4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wish4ActionPerformed(evt);
            }
        });
        getContentPane().add(wish4, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 111, 110, 171));

        wish5.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix5.jpg")); // NOI18N
        wish5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish5MouseClicked(evt);
            }
        });
        getContentPane().add(wish5, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 111, 110, 171));

        wish6.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix6.jpg")); // NOI18N
        wish6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish6MouseClicked(evt);
            }
        });
        getContentPane().add(wish6, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 111, 110, 171));

        wish7.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix7.jpg")); // NOI18N
        wish7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish7MouseClicked(evt);
            }
        });
        getContentPane().add(wish7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 300, 110, 171));

        wish8.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix8.jpg")); // NOI18N
        wish8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish8MouseClicked(evt);
            }
        });
        getContentPane().add(wish8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 110, 171));

        wish9.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix9.jpg")); // NOI18N
        wish9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish9MouseClicked(evt);
            }
        });
        getContentPane().add(wish9, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 300, 110, 171));

        wish10.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix10.jpg")); // NOI18N
        wish10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish10MouseClicked(evt);
            }
        });
        getContentPane().add(wish10, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 300, 110, 171));

        wish11.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix11.jpg")); // NOI18N
        wish11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish11MouseClicked(evt);
            }
        });
        getContentPane().add(wish11, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 300, 110, 171));

        wish12.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix12.jpg")); // NOI18N
        wish12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish12MouseClicked(evt);
            }
        });
        getContentPane().add(wish12, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 499, 110, 171));

        wish13.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix13.jpg")); // NOI18N
        wish13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish13MouseClicked(evt);
            }
        });
        getContentPane().add(wish13, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 499, 110, 171));

        wish14.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\phoix14.jpg")); // NOI18N
        wish14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wish14MouseClicked(evt);
            }
        });
        getContentPane().add(wish14, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 499, 110, 171));

        wishNone.setIcon(new javax.swing.ImageIcon("C:\\Users\\matzaflokos\\Documents\\NetBeansProjects\\TICHU!\\CardImages\\defaultASK.jpg")); // NOI18N
        wishNone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wishNoneMouseClicked(evt);
            }
        });
        getContentPane().add(wishNone, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 523, 96, 124));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wishNoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wishNoneMouseClicked
        // TODO add your handling code here:
        
        TICHU.wish = 0;
        this.dispose();
    }//GEN-LAST:event_wishNoneMouseClicked

    private void wish14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish14MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 14;
        this.dispose();
    }//GEN-LAST:event_wish14MouseClicked

    private void wish13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish13MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 13;
        this.dispose();
    }//GEN-LAST:event_wish13MouseClicked

    private void wish12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish12MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 12;
        this.dispose();
    }//GEN-LAST:event_wish12MouseClicked

    private void wish11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish11MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 11;
        this.dispose();
    }//GEN-LAST:event_wish11MouseClicked

    private void wish10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish10MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 10;
        this.dispose();
    }//GEN-LAST:event_wish10MouseClicked

    private void wish9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish9MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 9;
        this.dispose();
    }//GEN-LAST:event_wish9MouseClicked

    private void wish8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish8MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 8;
        this.dispose();
    }//GEN-LAST:event_wish8MouseClicked

    private void wish7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish7MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 7;
        this.dispose();
    }//GEN-LAST:event_wish7MouseClicked

    private void wish6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish6MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 6;
        this.dispose();
    }//GEN-LAST:event_wish6MouseClicked

    private void wish5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish5MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 5;
        this.dispose();
    }//GEN-LAST:event_wish5MouseClicked

    private void wish4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish4MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 4;
        this.dispose();
    }//GEN-LAST:event_wish4MouseClicked

    private void wish3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish3MouseClicked
        // TODO add your handling code here:
       TICHU.wish = 3;
        this.dispose();
    }//GEN-LAST:event_wish3MouseClicked

    private void wish2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wish2MouseClicked
        // TODO add your handling code here:
        TICHU.wish = 2;
        this.dispose();
    }//GEN-LAST:event_wish2MouseClicked

    private void wish4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wish4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wish4ActionPerformed

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
            java.util.logging.Logger.getLogger(Mahjong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahjong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahjong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahjong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahjong().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton wish10;
    private javax.swing.JButton wish11;
    private javax.swing.JButton wish12;
    private javax.swing.JButton wish13;
    private javax.swing.JButton wish14;
    private javax.swing.JButton wish2;
    private javax.swing.JButton wish3;
    private javax.swing.JButton wish4;
    private javax.swing.JButton wish5;
    private javax.swing.JButton wish6;
    private javax.swing.JButton wish7;
    private javax.swing.JButton wish8;
    private javax.swing.JButton wish9;
    private javax.swing.JButton wishNone;
    // End of variables declaration//GEN-END:variables
}