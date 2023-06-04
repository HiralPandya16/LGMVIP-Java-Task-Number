
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TIC_TAK_TOE_GAME extends javax.swing.JFrame {

   
    
    private String start="X";
    private int i=0;
    public TIC_TAK_TOE_GAME() {
        initComponents();
    }

     private void playing() {
        if (start.equals("X")) {
            start = "O";
        } else {
            start = "X";
        }
    }
 public void winner() {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();

        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();

        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();

        // for no one 
        if (i==9) {
            JOptionPane.showMessageDialog(this, "OOPS!! NO WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);
        }
        // for X player
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            btn1.setBackground(Color.YELLOW);
            btn2.setBackground(Color.YELLOW);
            btn3.setBackground(Color.YELLOW);

            JOptionPane.showMessageDialog(this, "hooray!! X WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);
        }
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {

            btn4.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! X WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {

            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! X WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {

            btn1.setBackground(Color.YELLOW);
            btn4.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! X WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            btn2.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! X WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {

            btn3.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! X WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {

            btn1.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! X WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {

            btn3.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! X WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }

        //for O player
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {

            btn1.setBackground(Color.YELLOW);
            btn2.setBackground(Color.YELLOW);
            btn3.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! O WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {

            btn4.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! O WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {

            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! O WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {

            btn1.setBackground(Color.YELLOW);
            btn4.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! O WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {

            btn2.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! O WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {

            btn3.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! O WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {

            btn1.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! O WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {

            btn3.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "hooray!! O WIN", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_reset = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAK TOE GAME");
        jPanel1.add(jLabel1);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        btn1.setFont(new java.awt.Font("Arial", 3, 80)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);

        btn2.setFont(new java.awt.Font("Arial", 3, 80)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);

        btn3.setFont(new java.awt.Font("Arial", 3, 80)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);

        btn4.setFont(new java.awt.Font("Arial", 3, 80)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);

        btn5.setFont(new java.awt.Font("Arial", 3, 80)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);

        btn6.setFont(new java.awt.Font("Arial", 3, 80)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6);

        btn7.setFont(new java.awt.Font("Arial", 3, 80)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);

        btn8.setFont(new java.awt.Font("Arial", 3, 80)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);

        btn9.setFont(new java.awt.Font("Arial", 3, 80)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);

        jPanel3.setLayout(new java.awt.GridLayout());

        btn_reset.setBackground(new java.awt.Color(0, 153, 153));
        btn_reset.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        btn_reset.setText("Play Again");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel3.add(btn_reset);

        btn_exit.setBackground(new java.awt.Color(0, 153, 153));
        btn_exit.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.setBorderPainted(false);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel3.add(btn_exit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
         btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
      
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        i=0;
        
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(new JFrame("Exit"), "Are you sure? you want Exit?", "TIC TAK TOE", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        btn1.setText(start);
        if (start.equalsIgnoreCase("X")) {
            btn1.setForeground(Color.RED);i++;
        } else {
            btn1.setForeground(Color.GREEN);i++;
        }
        playing();
        winner();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(start);
        if (start.equalsIgnoreCase("X")) {
            btn2.setForeground(Color.RED);i++;
        } else {
            btn2.setForeground(Color.GREEN);i++;
        }
        playing();
        winner();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btn3.setText(start);
        if (start.equalsIgnoreCase("X")) {
            btn3.setForeground(Color.RED);i++;
        } else {
            btn3.setForeground(Color.GREEN);i++;
        }
        playing();
        winner();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(start);
        if (start.equalsIgnoreCase("X")) {
            btn4.setForeground(Color.RED);i++;
        } else {
            btn4.setForeground(Color.GREEN);i++;
        }
        playing();
        winner();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btn5.setText(start);
        if (start.equalsIgnoreCase("X")) {
            btn5.setForeground(Color.RED);i++;
        } else {
            btn5.setForeground(Color.GREEN);i++;
        }
        playing();
        winner();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btn6.setText(start);
        if (start.equalsIgnoreCase("X")) {
            btn6.setForeground(Color.RED);i++;
        } else {
            btn6.setForeground(Color.GREEN);i++;
        }
        playing();
        winner();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(start);
        if (start.equalsIgnoreCase("X")) {
            btn7.setForeground(Color.RED);i++;
        } else {
            btn7.setForeground(Color.GREEN);i++;
        }
        playing();
        winner();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(start);
        if (start.equalsIgnoreCase("X")) {
            btn8.setForeground(Color.RED);i++;
        } else {
            btn8.setForeground(Color.GREEN);i++;
        }
        playing();
        winner();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(start);
        if (start.equalsIgnoreCase("X")) {
            btn9.setForeground(Color.RED);i++;
        } else {
            btn9.setForeground(Color.GREEN);i++;
        }
        playing();
        winner();
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAK_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAK_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAK_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAK_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAK_TOE_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
