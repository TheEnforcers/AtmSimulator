
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import sql1.db;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My
 */
public class trans_processed extends javax.swing.JFrame {
      static double  am[]=new double[20];
       static String tp[]=new String[20];
       int p;
      static double am1;

    /**
     * Creates new form trans_processed
     */
    public trans_processed() {
          this.setUndecorated(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        double width = toolkit.getScreenSize().getWidth();
        
        double height = toolkit.getScreenSize().getHeight();
        
        this.setSize((int)width, (int)height);

        initComponents();
        
        
        
        
         Timer time=new Timer();
         time.schedule(new TimerTask(){
             
             @Override
             public void run()
                 {
                      money m1 =new money();
                         m1.setVisible(true);
                        dispose();
                 }
         } , 2500);
    }
   public   void get() throws java.sql.SQLException
    {
        db db1=new db();
        cpin c1=new cpin();
        p=c1.disp();
        am=db1.db_bal();
        tp=db1.db_pin();
        withdraw();
        
      //  System.out.println(am[p]);
      
    }
 public void withdraw() throws SQLException
 {
     ammount a1 = new ammount();
     am1=a1.getAm();
     am[p]=am[p]-am1;
     System.out.println(am[p]);
     db db1=new db();
     db1.db_balPut(am[p],tp[p]);
 }
 public   double[] amtUpdate()
 {
    return am;
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
        card_slot = new javax.swing.JLabel();
        trans1_text = new javax.swing.JLabel();
        trans_text = new javax.swing.JLabel();
        w_bg = new javax.swing.JLabel();
        main_bg = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        card_slot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardslot2.jpg"))); // NOI18N
        jPanel1.add(card_slot);
        card_slot.setBounds(900, 470, 110, 50);

        trans1_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        trans1_text.setText("BEING PROCESSED.....");
        jPanel1.add(trans1_text);
        trans1_text.setBounds(560, 310, 310, 60);

        trans_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        trans_text.setText("YOUR TRANSACTION IS ");
        jPanel1.add(trans_text);
        trans_text.setBounds(560, 200, 330, 100);

        w_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg2.jpg"))); // NOI18N
        jPanel1.add(w_bg);
        w_bg.setBounds(520, 190, 380, 240);

        main_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbgkey.jpg"))); // NOI18N
        jPanel1.add(main_bg);
        main_bg.setBounds(350, 0, 700, 730);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1.jpg"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 1370, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
       // get();
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
            java.util.logging.Logger.getLogger(trans_processed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trans_processed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trans_processed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trans_processed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trans_processed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel card_slot;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_bg;
    private javax.swing.JLabel trans1_text;
    private javax.swing.JLabel trans_text;
    private javax.swing.JLabel w_bg;
    // End of variables declaration//GEN-END:variables
}
