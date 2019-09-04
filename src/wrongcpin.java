
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My
 */
public class wrongcpin extends javax.swing.JFrame {

    /**
     * Creates new form wrongcpin
     */
    public wrongcpin() {
        this.setUndecorated(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        double width = toolkit.getScreenSize().getWidth();
        
        double height = toolkit.getScreenSize().getHeight();
        
        this.setSize((int)width, (int)height);
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

        jPanel1 = new javax.swing.JPanel();
        enter_pin_text = new javax.swing.JLabel();
        exit_text = new javax.swing.JLabel();
        wrong_pin_text = new javax.swing.JLabel();
        arr1 = new javax.swing.JLabel();
        select_text = new javax.swing.JLabel();
        arr2 = new javax.swing.JLabel();
        card_slot = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        renter = new javax.swing.JButton();
        wbg = new javax.swing.JLabel();
        main_bg = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        enter_pin_text.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enter_pin_text.setForeground(new java.awt.Color(255, 255, 255));
        enter_pin_text.setText("ENTER PIN AGAIN");
        jPanel1.add(enter_pin_text);
        enter_pin_text.setBounds(750, 260, 140, 17);

        exit_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit_text.setForeground(new java.awt.Color(255, 255, 255));
        exit_text.setText("EXIT");
        jPanel1.add(exit_text);
        exit_text.setBounds(780, 300, 80, 30);

        wrong_pin_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        wrong_pin_text.setText("WRONG PIN ENTERED");
        jPanel1.add(wrong_pin_text);
        wrong_pin_text.setBounds(570, 190, 280, 30);

        arr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARROW3.jpg"))); // NOI18N
        jPanel1.add(arr1);
        arr1.setBounds(740, 250, 170, 40);

        select_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select_text.setText("PLEASE SELECT AN OPTION");
        jPanel1.add(select_text);
        select_text.setBounds(610, 200, 180, 70);

        arr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARROW3.jpg"))); // NOI18N
        arr2.setText("EXIT");
        jPanel1.add(arr2);
        arr2.setBounds(740, 290, 160, 50);

        card_slot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardslot2.jpg"))); // NOI18N
        jPanel1.add(card_slot);
        card_slot.setBounds(910, 470, 120, 40);

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(920, 280, 70, 20);

        renter.setText("Renter");
        renter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renterActionPerformed(evt);
            }
        });
        jPanel1.add(renter);
        renter.setBounds(920, 250, 70, 23);

        wbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg2.jpg"))); // NOI18N
        jPanel1.add(wbg);
        wbg.setBounds(520, 190, 380, 240);

        main_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbgkey.jpg"))); // NOI18N
        jPanel1.add(main_bg);
        main_bg.setBounds(350, 0, 720, 730);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1.jpg"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 20, 1370, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
       trans_cancelled t1=new trans_cancelled();
         t1.setVisible(true);
         dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void renterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renterActionPerformed
        // TODO add your handling code here:
        cpin cp1=new cpin();
        
         cp1.setVisible(true);
         dispose();
    }//GEN-LAST:event_renterActionPerformed

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
            java.util.logging.Logger.getLogger(wrongcpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wrongcpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wrongcpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wrongcpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wrongcpin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel arr1;
    private javax.swing.JLabel arr2;
    private javax.swing.JLabel card_slot;
    private javax.swing.JLabel enter_pin_text;
    private javax.swing.JButton exit;
    private javax.swing.JLabel exit_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_bg;
    private javax.swing.JButton renter;
    private javax.swing.JLabel select_text;
    private javax.swing.JLabel wbg;
    private javax.swing.JLabel wrong_pin_text;
    // End of variables declaration//GEN-END:variables
}