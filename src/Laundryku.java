
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Laundryku extends javax.swing.JFrame {

    /**
     * Creates new form Laundryku
     */
    public Laundryku() {
        initComponents();
    }

    public int Total_Harga;
    
    public void reset() {
combo_jenis.setSelectedItem("Pilih Jenis");
txt_harga.setText("");
txt_berat.setText("");
txt_ttlHarga.setText("");
txt_bayar.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo_jenis = new javax.swing.JComboBox<>();
        txt_bayar = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_berat = new javax.swing.JTextField();
        txt_ttlHarga = new javax.swing.JTextField();
        btn_batal = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20)); // NOI18N
        jLabel1.setText("WAHYU BERSIH LAUNDRY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        jLabel2.setText("Bayar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        jLabel3.setText("Jenis Cuci");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        jLabel4.setText("Harga Per Kilo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        jLabel5.setText("Berat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        jLabel6.setText("Total Harga");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        combo_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis", "Cuci Basah", "Cuci Kering", "Cuci Setrika" }));
        combo_jenis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        combo_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_jenisActionPerformed(evt);
            }
        });
        jPanel1.add(combo_jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, 30));
        jPanel1.add(txt_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 150, 30));

        txt_harga.setEnabled(false);
        jPanel1.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, 30));

        txt_berat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_beratKeyReleased(evt);
            }
        });
        jPanel1.add(txt_berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, 30));

        txt_ttlHarga.setEnabled(false);
        jPanel1.add(txt_ttlHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 150, 30));

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 90, 30));

        btn_transaksi.setText("Transaksi");
        btn_transaksi.setToolTipText("");
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        jPanel1.add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 90, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 490);

        setSize(new java.awt.Dimension(416, 533));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        if (txt_harga.getText().isEmpty()  || txt_berat.getText().isEmpty() || txt_ttlHarga.getText().isEmpty() ) {
          JOptionPane.showMessageDialog(null, "Data Harus Diisi");
                  } 
        else {
            int bayar = Integer.parseInt(txt_bayar.getText());
            int kembalian = bayar - Total_Harga;
            if (kembalian >=0) {
                   JOptionPane.showMessageDialog(null, "Kembalian anda \n" + kembalian);
                   reset();
            }
         
            if (kembalian <=0) {
                 JOptionPane.showMessageDialog(null, "Maaf Uang Anda Kurang");
            }
            
        
}        // TODO add your handling code here:
    // TODO add your handling code here:
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void combo_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_jenisActionPerformed
        if(combo_jenis.getSelectedItem().equals("Pilih Jenis")){
            txt_harga.setText("0");
        }else if(combo_jenis.getSelectedItem().equals("Cuci Basah")){
            txt_harga.setText("3000");
        }else if(combo_jenis.getSelectedItem().equals("Cuci Kering")){
            txt_harga.setText("4000");
        }else if(combo_jenis.getSelectedItem().equals("Cuci Setrika")){
            txt_harga.setText("5000");
        }// // TODO add your handling code here:
    }//GEN-LAST:event_combo_jenisActionPerformed

    private void txt_beratKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_beratKeyReleased
       if (txt_berat.getText().equals("")) {
            txt_ttlHarga.setText("0");
        }
       else{
        int harga = Integer.parseInt(txt_harga.getText());
        float berat = Float.parseFloat(txt_berat.getText());
        Total_Harga =(int) (harga*berat);  
        txt_ttlHarga.setText(String.valueOf(Total_Harga));
       }
    }//GEN-LAST:event_txt_beratKeyReleased

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        reset();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_batalActionPerformed

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
            java.util.logging.Logger.getLogger(Laundryku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laundryku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laundryku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laundryku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laundryku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JComboBox<String> combo_jenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_berat;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_ttlHarga;
    // End of variables declaration//GEN-END:variables
}
