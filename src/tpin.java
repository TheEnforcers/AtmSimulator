
//import static balance.p;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class tpin extends javax.swing.JFrame {
     int i=-1;
     static int p;
     int row;
     static String tp[]=new String[20];
     String out;
    int j;
    char inpass[];
    char pin[]=new char[4];
     static String name[]=new String[20];


    /**
     * Creates new form tpin
     */
    public tpin() {
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
        bCancel = new javax.swing.JButton();
        b_clear = new javax.swing.JButton();
        b_enter = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        disp_name = new javax.swing.JTextField();
        hello_text = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        card_sl = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        pin_text = new javax.swing.JLabel();
        atm_bg = new javax.swing.JLabel();
        pin2 = new javax.swing.JTextField();
        main_bg = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        bCancel.setText("cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });
        jPanel1.add(bCancel);
        bCancel.setBounds(790, 693, 70, 30);

        b_clear.setText("clear");
        b_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clearActionPerformed(evt);
            }
        });
        jPanel1.add(b_clear);
        b_clear.setBounds(790, 650, 70, 30);

        b_enter.setText("enter");
        b_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_enterActionPerformed(evt);
            }
        });
        jPanel1.add(b_enter);
        b_enter.setBounds(790, 600, 60, 30);

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(720, 700, 60, 23);

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(640, 700, 70, 23);

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(570, 700, 60, 20);

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(720, 650, 60, 30);

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(640, 650, 70, 30);

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(570, 650, 60, 30);

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(650, 600, 60, 30);

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(570, 600, 60, 30);

        disp_name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        disp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disp_nameActionPerformed(evt);
            }
        });
        jPanel1.add(disp_name);
        disp_name.setBounds(700, 210, 110, 40);

        hello_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hello_text.setText("HELLO ");
        jPanel1.add(hello_text);
        hello_text.setBounds(590, 220, 100, 29);

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(720, 600, 60, 30);

        card_sl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardslot2.jpg"))); // NOI18N
        jPanel1.add(card_sl);
        card_sl.setBounds(920, 470, 120, 40);
        jPanel1.add(passfield);
        passfield.setBounds(620, 320, 180, 50);

        pin_text.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        pin_text.setText("ENTER YOUR PIN");
        jPanel1.add(pin_text);
        pin_text.setBounds(540, 260, 330, 50);

        atm_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbg2.jpg"))); // NOI18N
        jPanel1.add(atm_bg);
        atm_bg.setBounds(520, 190, 380, 240);
        jPanel1.add(pin2);
        pin2.setBounds(640, 380, 130, 40);

        main_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmbgkey.jpg"))); // NOI18N
        jPanel1.add(main_bg);
        main_bg.setBounds(350, 0, 720, 730);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='2';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b2ActionPerformed

    private void b_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clearActionPerformed
        // TODO add your handling code here:
         i--;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i+1]='\0';
        String string=new String(inpass);
        passfield.setText(string);
        displayc();
    }//GEN-LAST:event_b_clearActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
      // }
        pin[i]='1';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='3';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='4';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='5';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='6';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='7';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='8';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         i++;
        j=i+1;
        if(j<7)
        {
        inpass=new char[j];
        }
        pin[i]='9';
        String string=new String(inpass);
        passfield.setText(string);
        display();
    }//GEN-LAST:event_b9ActionPerformed

    private void b_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_enterActionPerformed
        // TODO add your handling code here:
       
        int a;
        
        try {
            // TODO add your handling code here:
       
            get();
          a=compare();
          

            if(a==1)
            {
            trans_processed t1=new trans_processed();
            t1.get();
            t1.setVisible(true);
            dispose();
            
            }
            else
            {
                wrongtpin tp1=new wrongtpin();
                 tp1.setVisible(true);
                 dispose();

            }
        } catch (SQLException ex) {
            Logger.getLogger(cpin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_b_enterActionPerformed
public int compare() throws SQLException
    {
        int r=0;
        
       
       while(r<=1)  // since 2 rows present in database
      {
          
       // System.out.println(tp[r]);
       // System.out.println(out);
        
       if(out.equals(tp[r])==true)
        {
            
            return 1;
            
          //  System.out.println("dhfjhfj");
        }
      
       r++;
     }
       return 0;
    }
      // return 0;
       /*
       else
        {
             System.out.println("dhfjhfj");
              System.out.println(pin.equals(cp));
              System.out.println();
        } */
       // System.out.println(out);
    
    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        // TODO add your handling code here:
        trans_cancelled t1=new trans_cancelled();
         t1.setVisible(true);
         dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void disp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disp_nameActionPerformed
     public void display()
    {
           out=new String(pin);
        
     pin2.setText(out);   
    }
     public void displayc()
    {
          out=new String(pin);
        
     pin2.setText(out);   
    }
     public  void get() throws SQLException
    {
        db db1=new db();
        name = db1.db_name();
        tp = db1.db_pin();
       
        disp_name.setText(name[p]); 
    
    }
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
            java.util.logging.Logger.getLogger(tpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tpin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tpin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel atm_bg;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton b_clear;
    private javax.swing.JButton b_enter;
    private javax.swing.JLabel card_sl;
    private javax.swing.JTextField disp_name;
    private javax.swing.JLabel hello_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_bg;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField pin2;
    private javax.swing.JLabel pin_text;
    // End of variables declaration//GEN-END:variables
}




