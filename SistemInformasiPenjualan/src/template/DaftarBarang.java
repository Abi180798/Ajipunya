package template;

import javax.swing.JOptionPane;
import static template.HomePage.dafbar;
import static template.HomePage.dafgan;
import static template.HomePage.dafsup;
import static template.HomePage.home;
import static template.HomePage.trabel;
import static template.HomePage.trajul;
import database.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class DaftarBarang extends javax.swing.JFrame {
    private static Database database;
    public DaftarBarang() {
        initComponents();
        database = new Database();
        tabelBarang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        linkhomepage = new javax.swing.JLabel();
        linkdaftarbarang = new javax.swing.JLabel();
        linkpembelian = new javax.swing.JLabel();
        linkpenjualan = new javax.swing.JLabel();
        linkdaftarpelanggan = new javax.swing.JLabel();
        linkdaftarsupplier = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        judulisi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabar = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar Barang");
        setPreferredSize(new java.awt.Dimension(1000, 715));
        setResizable(false);

        judul.setText("Sistem Informasi Penjualan");
        judul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        linkhomepage.setText("Home Page");
        linkhomepage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        linkhomepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkhomepageMouseClicked(evt);
            }
        });

        linkdaftarbarang.setText("Daftar Barang");
        linkdaftarbarang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        linkdaftarbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkdaftarbarangMouseClicked(evt);
            }
        });

        linkpembelian.setText("Transaksi Pembelian");
        linkpembelian.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        linkpembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkpembelianMouseClicked(evt);
            }
        });

        linkpenjualan.setText("Transaksi Penjualan");
        linkpenjualan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        linkpenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkpenjualanMouseClicked(evt);
            }
        });

        linkdaftarpelanggan.setText("Daftar Pelanggan");
        linkdaftarpelanggan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        linkdaftarpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkdaftarpelangganMouseClicked(evt);
            }
        });

        linkdaftarsupplier.setText("Daftar Supplier");
        linkdaftarsupplier.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        linkdaftarsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkdaftarsupplierMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(linkhomepage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(judul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(linkdaftarbarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(linkpenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(linkpembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(linkdaftarpelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(linkdaftarsupplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linkhomepage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkdaftarbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkpembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkpenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkdaftarpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkdaftarsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        judulisi.setText("Selamat Datang Di Sistem Penjualan");
        judulisi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "No Barang", "Nama Barang", "Kategori", "Stok", "Harga Beli", "Harga Jual"
            }
        ));
        jScrollPane1.setViewportView(tabar);
        if (tabar.getColumnModel().getColumnCount() > 0) {
            tabar.getColumnModel().getColumn(0).setPreferredWidth(1);
            tabar.getColumnModel().getColumn(1).setPreferredWidth(30);
            tabar.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabar.getColumnModel().getColumn(3).setPreferredWidth(15);
            tabar.getColumnModel().getColumn(4).setPreferredWidth(1);
            tabar.getColumnModel().getColumn(5).setPreferredWidth(30);
            tabar.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(judulisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );

        file.setText("File");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        edit.setText("Edit");
        jMenuBar1.add(edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelBarang(){
        PreparedStatement ps;
        DefaultTableModel model = (DefaultTableModel) tabar.getModel();
        
        try{
            ps = database.conn.prepareStatement("select * from daftarbarang");
            ResultSet rs = ps.executeQuery();
            int no = 1;
            while(rs.next()){
                
                Object o[] = {
                    no++, 
                    rs.getInt("no_barang"), 
                    rs.getString("nama_barang"),
                    rs.getString("kategori"),
                    rs.getInt("stok"),
                    rs.getInt("harga_beli"),
                    rs.getInt("harga_jual")
                };
                model.addRow(o); 
            }     
        }catch (Exception e){
            
        }
    }
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int opsi = JOptionPane.showConfirmDialog(null, "Yakin Keluar?", "Exit", JOptionPane.YES_NO_OPTION);
        if(opsi == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void linkhomepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkhomepageMouseClicked
        home = new HomePage();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_linkhomepageMouseClicked

    private void linkdaftarbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkdaftarbarangMouseClicked
        dafbar = new DaftarBarang();
        dafbar.setVisible(true);
        dafbar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_linkdaftarbarangMouseClicked

    private void linkpembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkpembelianMouseClicked
        trabel = new TransaksiPembelian();
        trabel.setVisible(true);
        trabel.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_linkpembelianMouseClicked

    private void linkpenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkpenjualanMouseClicked
        trajul = new TransaksiPenjualan();
        trajul.setVisible(true);
        trajul.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_linkpenjualanMouseClicked

    private void linkdaftarpelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkdaftarpelangganMouseClicked
        dafgan = new DaftarPelanggan();
        dafgan.setVisible(true);
        dafgan.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_linkdaftarpelangganMouseClicked

    private void linkdaftarsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkdaftarsupplierMouseClicked
        dafsup = new DaftarSupplier();
        dafsup.setVisible(true);
        dafsup.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_linkdaftarsupplierMouseClicked

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
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel judulisi;
    private javax.swing.JLabel linkdaftarbarang;
    private javax.swing.JLabel linkdaftarpelanggan;
    private javax.swing.JLabel linkdaftarsupplier;
    private javax.swing.JLabel linkhomepage;
    private javax.swing.JLabel linkpembelian;
    private javax.swing.JLabel linkpenjualan;
    private javax.swing.JTable tabar;
    // End of variables declaration//GEN-END:variables
}
