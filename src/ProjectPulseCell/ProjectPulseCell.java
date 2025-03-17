
package ProjectPulseCell;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ProjectPulseCell extends javax.swing.JFrame {
    private void kosongkan_form(){
        operator.setEditable(true);
        operator.setSelectedItem(this);
        operator1.setText(null);
        nominal1.setSelectedItem(this);
        total.setText(null);
        totalbonus.setText(null);
        totalbayar.setText(null);
        bayar.setText(null);
        kembalian.setText(null);
    }
    private void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Kode Nomor HP");
        model.addColumn("Jenis Operator");
        model.addColumn("Kode Pembelian Pulsa");
        model.addColumn("Detail Pembayaran");
        model.addColumn("Bonus Pulsa");
        model.addColumn("Totsl Pembayaran");
        model.addColumn("Uang yang dibayar");
        model.addColumn("Uang Kembalian");
     
     try{
         int no = 1;
         String sql = "SELECT * FROM jualpulsa";
         java.sql.Connection conn = (Connection)Konfig.configDB();
         java.sql.Statement stm = conn.createStatement();
         java.sql.ResultSet res = stm.executeQuery(sql);
         while (res.next()){
             
             model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)});
             
             
         }
         tabeljual.setModel(model);
     
         
     }catch(SQLException e){
         System.out.println("Error : "+ e.getMessage());
         
     }
        
    }
    private static final long serialVersionUID = 1L;
    
    public ProjectPulseCell() {
        initComponents();
        setTitle("Production by Anisa, Najma Jihan Radja, Qorina Setyaningrum");
        tampilkan_data();
        
    
    }
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
        operator = new javax.swing.JComboBox<>();
        operator1 = new javax.swing.JTextField();
        nominal1 = new javax.swing.JComboBox<>();
        total = new javax.swing.JTextField();
        totalbonus = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        total1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bonus1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        totalbayar = new javax.swing.JTextField();
        uangbayar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeljual = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        batal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel1.setText("Pulse Cell");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 229, -1));

        jLabel2.setText("Kode Nomor Hp");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel3.setText("Jenis Operator");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel4.setText("Kode Pembelian Pulsa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel5.setText("Bonus Pulsa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 90, -1));

        jLabel6.setText("Detail Pembayaran");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 20));

        jLabel7.setText("Uang yang dibayar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel8.setText("Uang Kembalian");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 122, -1));

        operator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "081", "085", "089", "088" }));
        operator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorActionPerformed(evt);
            }
        });
        getContentPane().add(operator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 131, -1));

        operator1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator1ActionPerformed(evt);
            }
        });
        getContentPane().add(operator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 131, -1));

        nominal1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10k", "25k", "50k", "100k" }));
        nominal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominal1ActionPerformed(evt);
            }
        });
        getContentPane().add(nominal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 131, -1));

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 131, -1));

        totalbonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbonusActionPerformed(evt);
            }
        });
        getContentPane().add(totalbonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 131, -1));

        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        getContentPane().add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 131, -1));

        kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianActionPerformed(evt);
            }
        });
        getContentPane().add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 131, -1));

        total1.setText("Proses Total Pembayaran");
        total1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total1ActionPerformed(evt);
            }
        });
        getContentPane().add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 250, -1));

        jButton2.setText("Ulang");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 114, -1));

        jButton5.setText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 112, -1));

        bonus1.setText("Hitung Bonus Pulsa");
        bonus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonus1ActionPerformed(evt);
            }
        });
        getContentPane().add(bonus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 250, -1));

        jLabel9.setText("Total Pembayaran");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        totalbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbayarActionPerformed(evt);
            }
        });
        getContentPane().add(totalbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 131, -1));

        uangbayar.setText("Proses Pembayaran");
        uangbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uangbayarActionPerformed(evt);
            }
        });
        getContentPane().add(uangbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 250, -1));

        tabeljual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeljual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeljualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeljual);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 800, 310));

        simpan.setText("Simpan Data");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 140, -1));

        edit.setText("Edit Data");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 130, -1));

        hapus.setText("Hapus Data");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 130, -1));

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalbonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbonusActionPerformed
        
    }//GEN-LAST:event_totalbonusActionPerformed

    private void operatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatorActionPerformed
       String kode, jenisoperator;
        
        kode = String.valueOf(operator.getSelectedItem());
        
        switch (kode){
            case ("081"): 
                jenisoperator= "Telkomsel"; 
                break;
            case ("085"): 
                jenisoperator= "Indosat Oredoo";
                break;
            case ("089"): 
                jenisoperator= "Three"; 
                break;
            case ("088"):
                jenisoperator="Smartfren";
                break;
            default:
                jenisoperator="Tidak terdaftar";
        }
        operator1.setText(""+jenisoperator);
    }//GEN-LAST:event_operatorActionPerformed

    private void nominal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominal1ActionPerformed
        String kode;
        int detailbayar;
        
        kode = String.valueOf(nominal1.getSelectedItem());
            if (kode.equals("10k")){
            detailbayar = 10660;
        }else
            if (kode.equals("25k")){
            detailbayar = 25650;
        }else
            if (kode.equals("50k")){
            detailbayar = 50600;
        }else
            if (kode.equals("100k")){
            detailbayar = 100500;
        }else {
            detailbayar = 0;
        }
            total.setText(""+detailbayar);
    }//GEN-LAST:event_nominal1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        operator1.setText("");
        total.setText("");
        totalbonus.setText("");
        kembalian.setText("");
        totalbayar.setText("");
        bayar.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
              
    }//GEN-LAST:event_totalActionPerformed

    private void bonus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonus1ActionPerformed
        int totalbayar, bonus;
        
        totalbayar = Integer.parseInt(total.getText());
        
        if (totalbayar > 25000) {
            bonus = (int) (totalbayar * 0.2);
        }else{
            bonus = 0;
        }
       totalbonus.setText(""+bonus);
    }//GEN-LAST:event_bonus1ActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        
    }//GEN-LAST:event_bayarActionPerformed

    private void kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalianActionPerformed
        
    }//GEN-LAST:event_kembalianActionPerformed

    private void totalbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbayarActionPerformed
        
    }//GEN-LAST:event_totalbayarActionPerformed

    private void total1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total1ActionPerformed
        int detailbayar, bonus, totalbayar1;
        
        detailbayar = Integer.parseInt(total.getText());
        bonus = Integer.parseInt(totalbonus.getText());
        
        totalbayar1 = detailbayar - bonus;
        totalbayar.setText(""+totalbayar1);
    }//GEN-LAST:event_total1ActionPerformed

    private void uangbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uangbayarActionPerformed
        int totalbayar1, uangbayar1, kembalian1;
        
        totalbayar1 = Integer.parseInt(totalbayar.getText());
        uangbayar1 = Integer.parseInt(bayar.getText());
        
        if (uangbayar1 > totalbayar1){
            kembalian1 = uangbayar1 - totalbayar1;
            kembalian.setText(""+kembalian1);
        }else{
            kembalian.setText("Uang Anda Kurang");
        }
    }//GEN-LAST:event_uangbayarActionPerformed

    private void operator1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operator1ActionPerformed
        
    }//GEN-LAST:event_operator1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try{
            String sql = "INSERT INTO jualpulsa VALUES ('"+operator.getSelectedItem()+"','"+operator1.getText()+"','"+nominal1.getSelectedItem()+"','"+total.getText()+"','"+totalbonus.getText()+"','"+totalbayar.getText()+"','"+bayar.getText()+"','"+kembalian.getText()+"')";
        java.sql.Connection conn = (Connection)Konfig.configDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Proses Simpan Berhasil..");
        tampilkan_data();
        kosongkan_form();
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void tabeljualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeljualMouseClicked
        int baris = tabeljual.rowAtPoint(evt.getPoint());
        String kode = tabeljual.getValueAt(baris, 1).toString();
        operator.setSelectedItem(kode);
        
        String jenis = tabeljual.getValueAt(baris, 2).toString();
        operator1.setText(jenis);
        
        String kode2 = tabeljual.getValueAt(baris, 3).toString();
        nominal1.setSelectedItem(kode2);
        
        String detail = tabeljual.getValueAt(baris, 4).toString();
        total.setText(detail);
        
        String bonus = tabeljual.getValueAt(baris, 5).toString();
        totalbonus.setText(bonus);
        
        String total = tabeljual.getValueAt(baris, 6).toString();
        totalbayar.setText(total);
        
        String total2 = tabeljual.getValueAt(baris, 7).toString();
        bayar.setText(total2);
        
        String kembali = tabeljual.getValueAt(baris, 8).toString();
        kembalian.setText(kembali);
        
        
    }//GEN-LAST:event_tabeljualMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try{
            String sql = "UPDATE jualpulsa SET kodenomor_hp='"+operator.getSelectedItem()+"',jenis_operator='"+operator1.getText()+"',pembelian_pulsa='"+nominal1.getSelectedItem()+"',detail_pembayaran='"+total.getText()+"',bonus_pulsa='"+totalbonus.getText()+"',total_pembayaran='"+totalbayar.getText()+"',uang_dibayar='"+bayar.getText()+"',uang_kembalian='"+kembalian.getText()+"'WHERE kodenomor_hp= '"+operator.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil..");
          
        } catch (HeadlessException | SQLException e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
    try{
        String sql = "DELETE FROM jualpulsa WHERE kodenomor_hp='"+operator.getSelectedItem()+"'";
        java.sql.Connection conn = (Connection)Konfig.configDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement (sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Hapus Data Berhasil..");
    
    }catch (HeadlessException | SQLException e){
        JOptionPane.showInputDialog(this, e.getMessage());
    }
    tampilkan_data();
    kosongkan_form();
    }//GEN-LAST:event_hapusActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
    kosongkan_form();
    }//GEN-LAST:event_batalActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new ProjectPulseCell().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JTextField bayar;
    private javax.swing.JButton bonus1;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kembalian;
    private javax.swing.JComboBox<String> nominal1;
    private javax.swing.JComboBox<String> operator;
    private javax.swing.JTextField operator1;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabeljual;
    private javax.swing.JTextField total;
    private javax.swing.JButton total1;
    private javax.swing.JTextField totalbayar;
    private javax.swing.JTextField totalbonus;
    private javax.swing.JButton uangbayar;
    // End of variables declaration//GEN-END:variables
}
