
//import balance.bal;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.applet.*;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarve
 */
public class service extends javax.swing.JFrame {
        File wavFile = new File("src\\beep-3.wav");
    AudioClip sound;


    /**
     * Creates new form service
     */
    public service() {
        
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
        service_txt = new javax.swing.JLabel();
        cash_with_txt = new javax.swing.JLabel();
        balance_txt = new javax.swing.JLabel();
        arrowbal = new javax.swing.JLabel();
        arrowcw = new javax.swing.JLabel();
        atmbg = new javax.swing.JLabel();
        main_bg = new javax.swing.JLabel();
        cash_withdrawal = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        service_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        service_txt.setText("SELECT THE SERVICE");
        jPanel1.add(service_txt);
        service_txt.setBounds(610, 170, 315, 80);

        cash_with_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cash_with_txt.setForeground(new java.awt.Color(255, 255, 255));
        cash_with_txt.setText("CASH WITHDRAWAL");
        jPanel1.add(cash_with_txt);
        cash_with_txt.setBounds(760, 240, 160, 40);

        balance_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balance_txt.setForeground(new java.awt.Color(255, 255, 255));
        balance_txt.setText("BALANCE ENQUIRY");
        jPanel1.add(balance_txt);
        balance_txt.setBounds(765, 285, 160, 40);

        arrowbal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARROW3.jpg"))); // NOI18N
        jPanel1.add(arrowbal);
        arrowbal.setBounds(760, 285, 160, 40);

        arrowcw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ARROW3.jpg"))); // NOI18N
        jPanel1.add(arrowcw);
        arrowcw.setBounds(760, 240, 170, 40);

        atmbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg2.jpg"))); // NOI18N
        jPanel1.add(atmbg);
        atmbg.setBounds(540, 185, 380, 240);

        main_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmgif0.jpg"))); // NOI18N
        main_bg.setText("jLabel2");
        jPanel1.add(main_bg);
        main_bg.setBounds(370, 0, 720, 780);

        cash_withdrawal.setText("cash");
        cash_withdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cash_withdrawalActionPerformed(evt);
            }
        });
        jPanel1.add(cash_withdrawal);
        cash_withdrawal.setBounds(940, 237, 80, 30);

        balance.setText("balance");
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        jPanel1.add(balance);
        balance.setBounds(940, 275, 80, 30);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1.jpg"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 1370, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cash_withdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cash_withdrawalActionPerformed
           // TODO add your handling code here:
           try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();

             ammount a1=new ammount();
             a1.setVisible(true);
             dispose(); 
    }//GEN-LAST:event_cash_withdrawalActionPerformed

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
        // TODO add your handling code here:
        try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
     sound.play();

        balance b1=new balance();
        try {
            b1.get();
        } catch (SQLException ex) {
            Logger.getLogger(service.class.getName()).log(Level.SEVERE, null, ex);
        }
         b1.setVisible(true);
         dispose();        
    }//GEN-LAST:event_balanceActionPerformed

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
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new service().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel arrowbal;
    private javax.swing.JLabel arrowcw;
    private javax.swing.JLabel atmbg;
    private javax.swing.JButton balance;
    private javax.swing.JLabel balance_txt;
    private javax.swing.JLabel cash_with_txt;
    private javax.swing.JButton cash_withdrawal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_bg;
    private javax.swing.JLabel service_txt;
    // End of variables declaration//GEN-END:variables
}
