/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachine1;

import javax.swing.JOptionPane;

/**
 *
 * @author ijlq_
 */
public class Frame extends javax.swing.JFrame {
    
    int coins = 10;

    /**
     * Creates new form Frame
     */
    public Frame() {
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
        labelSlot1 = new javax.swing.JLabel();
        labelSlot2 = new javax.swing.JLabel();
        labelSlot3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelCoins = new javax.swing.JLabel();
        ButtonPlay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 1));

        labelSlot1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelSlot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSlot1.setText("7");
        labelSlot1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(labelSlot1);

        labelSlot2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelSlot2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSlot2.setText("7");
        labelSlot2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(labelSlot2);

        labelSlot3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelSlot3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSlot3.setText("7");
        labelSlot3.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(labelSlot3);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        labelCoins.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCoins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCoins.setText("$0");
        labelCoins.setMaximumSize(new java.awt.Dimension(100, 44));
        jPanel3.add(labelCoins);

        ButtonPlay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonPlay.setText("Play");
        ButtonPlay.setMaximumSize(new java.awt.Dimension(100, 75));
        ButtonPlay.setPreferredSize(new java.awt.Dimension(100, 75));
        ButtonPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonPlayMouseClicked(evt);
            }
        });
        jPanel3.add(ButtonPlay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPlayMouseClicked
        coins -=1;
        int slot1=(int) (Math.random()*9)+1;
        int slot2=(int) (Math.random()*9)+1;
        int slot3=(int) (Math.random()*9)+1;
        
        labelSlot1.setText(String.valueOf(slot1));
        labelSlot2.setText(String.valueOf(slot2));
        labelSlot3.setText(String.valueOf(slot3));
        
     if(slot1 == slot2 && slot2 == slot3){
            
        switch(slot1){   
            case 5:
            coins += 15;
            JOptionPane.showMessageDialog(this, "Ganate 15 monedas!");
            break;
            case 7:
            coins += 30;
            JOptionPane.showMessageDialog(this, "Ganate 30 monedas!");
            break;
            case 9:
            coins += 20;
            JOptionPane.showMessageDialog(this, "Ganate 20 monedas!");
            break;
            default:
            coins += slot1;
            JOptionPane.showMessageDialog(this, "Ganate " + slot1 + " monedas!");
                    
            }
        }
     
     labelCoins.setText("$" + String.valueOf(coins));
     
        if(coins == 0){           
           int n = JOptionPane.showConfirmDialog(this, 
                    "Quieres jugar de nuevo?",
                    "Tragamonedas",
                    JOptionPane.YES_NO_OPTION);           
           if(n==0){
               coins = 10;
               labelCoins.setText("$" + String.valueOf(coins));
           }
           else{
               System.exit(0);                
            }   
        }
        
    }//GEN-LAST:event_ButtonPlayMouseClicked

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPlay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCoins;
    private javax.swing.JLabel labelSlot1;
    private javax.swing.JLabel labelSlot2;
    private javax.swing.JLabel labelSlot3;
    // End of variables declaration//GEN-END:variables
}
