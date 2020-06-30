/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BIODATA;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ilham
 */
public class biodataktp extends javax.swing.JFrame {

    /**
     * Creates new form biodataktp
     */
    public biodataktp() {
        initComponents();
        this.setTitle("KTP");
        this.setLocationRelativeTo(this);
    }
       public void ReadData(String path) {
        String fileName = path;
        BufferedImage image = null;
        String line = null;

        try {
            carifile.setText(path);
            // membaca file
            FileReader fileReader = new FileReader(fileName);
            // membaca input file / isi file
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int baris = 0;
            while ((line = bufferedReader.readLine()) != null) {
//              
                switch (baris) {
                    case 0:
                        nik.setText(line);
                        break;
                    case 1:
                        nama.setText(line);
                    case 2:
                        ttl.setText(line);
                    case 3:
                        alamat.setText(line);
                    case 4:
                        rt.setText(line);
                    case 5:
                        keldes.setText(line);
                    case 6:
                        kecamatan.setText(line);
                    case 7:
                        agama.setText(line);
                    case 8:
                        kawin.setText(line);
                    case 9:
                        job.setText(line);
                    case 10:
                        pkn.setText(line);
                    

                    default:
                        System.out.println("Proses Pengisian");
                }
                baris++;

            }
            ReadImage(urlimg.getText());
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "File Tidak Ada");
        }

    }

    public void ReadImage(String path) {

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(path));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gambar Kosong");
        }
        ImageIcon imageIcon = new ImageIcon(image);
        pict.setIcon(imageIcon);
    }

    public void SaveDataAs(String path) {

        File file = new File(path);
        FileWriter fr = null;
        BufferedWriter br = null;

        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);

            String getnik = nik.getText() + System.getProperty("line.separator");
            String getnama = nama.getText() + System.getProperty("line.separator");
            String getttl = ttl.getText() + System.getProperty("line.separator");
            String getalamat = alamat.getText() + System.getProperty("line.separator");

            String getrt = rt.getText() + System.getProperty("line.separator");
            String getkeldes = keldes.getText() + System.getProperty("line.separator");
            String getkecamatan = kecamatan.getText() + System.getProperty("line.separator");
            String getagama = agama.getText() + System.getProperty("line.separator");
            String getkawin = kawin.getText() + System.getProperty("line.separator");

            String getjob = job.getText() + System.getProperty("line.separator");
            String getpkn = pkn.getText() + System.getProperty("line.separator");
            String getimg = urlimg.getText() + System.getProperty("line.separator");

           

            br.write(getnik);
            br.write(getnama);
            br.write(getttl);
            br.write(getalamat);
            br.write(getrt);
            br.write(getkeldes);
            br.write(getkecamatan);
            br.write(getagama);
            br.write(getkawin);
            br.write(getjob);
            br.write(getpkn);
         br.write(getimg);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void SaveData() {

        File file = new File(carifile.getText());
        FileWriter fr = null;
        BufferedWriter br = null;

        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);

            String getnik = nik.getText() + System.getProperty("line.separator");
            String getnama = nama.getText() + System.getProperty("line.separator");
            String getttl = ttl.getText() + System.getProperty("line.separator");
            String getalamat = alamat.getText() + System.getProperty("line.separator");

            String getrt = rt.getText() + System.getProperty("line.separator");
            String getkeldes = keldes.getText() + System.getProperty("line.separator");
            String getkecamatan = kecamatan.getText() + System.getProperty("line.separator");
            String getagama = agama.getText() + System.getProperty("line.separator");
            String getkawin = kawin.getText() + System.getProperty("line.separator");

            String getjob = job.getText() + System.getProperty("line.separator");
            String getpkn= pkn.getText() + System.getProperty("line.separator");
         
            String getimg = urlimg.getText() + System.getProperty("line.separator");

            br.write(getnik);
            br.write(getnama);
            br.write(getttl);
            br.write(getalamat);
            br.write(getrt);
            br.write(getkeldes);
            br.write(getkecamatan);
            br.write(getagama);
            br.write(getkawin);
            br.write(getjob);
            br.write(getpkn);
            br.write(getimg);
          

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Path File Tidak Boleh Kosong");
        } finally {
            try {

                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nik = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        ttl = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        rt = new javax.swing.JTextField();
        keldes = new javax.swing.JTextField();
        kecamatan = new javax.swing.JTextField();
        agama = new javax.swing.JTextField();
        kawin = new javax.swing.JTextField();
        job = new javax.swing.JTextField();
        pkn = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        carifile = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        simpanubah = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        panelfoto21 = new javax.swing.JPanel();
        pict = new javax.swing.JLabel();
        urlimg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono CJK TC Regular", 1, 24)); // NOI18N
        jLabel1.setText("PROVINSI JAWA TIMUR");

        jLabel2.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel2.setText("KABUPATEN BLITAR");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("NIK");

        jLabel4.setText("NAMA");

        jLabel5.setText("TEMPAT / TANGGAL LAHIR");

        jLabel6.setText("ALAMAT");

        jLabel7.setText("RT/RW");

        jLabel8.setText("KEL/DESA");

        jLabel9.setText("KECAMATAN");

        jLabel10.setText("AGAMA");

        jLabel11.setText("STATUS");

        jLabel12.setText("PEKERJAAN");

        jLabel13.setText("KEWARGANEGARAAN");

        nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nikActionPerformed(evt);
            }
        });

        cari.setText("CARI FILE");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        simpanubah.setText("SIMPAN PERUBAHAN");
        simpanubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanubahActionPerformed(evt);
            }
        });

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        panelfoto21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelfoto21.setPreferredSize(new java.awt.Dimension(134, 178));

        javax.swing.GroupLayout panelfoto21Layout = new javax.swing.GroupLayout(panelfoto21);
        panelfoto21.setLayout(panelfoto21Layout);
        panelfoto21Layout.setHorizontalGroup(
            panelfoto21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pict, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        panelfoto21Layout.setVerticalGroup(
            panelfoto21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pict, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelfoto21, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelfoto21, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        urlimg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        urlimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlimgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(271, 271, 271))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pkn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(job, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kawin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kecamatan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keldes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nik, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urlimg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carifile, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))))
                .addGap(38, 38, 38)
                .addComponent(simpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simpanubah)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(keldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(kawin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(pkn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urlimg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari)
                    .addComponent(carifile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpan)
                    .addComponent(simpanubah))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nikActionPerformed

    private void urlimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlimgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlimgActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
         File filenya;
        JFileChooser chooser = new JFileChooser(".");
        chooser.setFileFilter(new FileNameExtensionFilter(".txt", "txt"));
        int buka_dialog = chooser.showOpenDialog(biodataktp.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            String filePath = filenya.getPath();
            ReadData(filePath);

        }
    }//GEN-LAST:event_cariActionPerformed

    private void simpanubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanubahActionPerformed
        // TODO add your handling code here:
            JFileChooser chooser = new JFileChooser(".");
        chooser.setFileFilter(new FileNameExtensionFilter(".txt", "txt"));
        int buka_dialog = chooser.showSaveDialog(biodataktp.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            String filename = chooser.getSelectedFile().toString();
            if (!filename.endsWith(".txt")) {
                filename += ".txt";
            }
            SaveDataAs(filename);
            pict.setIcon(null);
            ReadImage(urlimg.getText());
        }
    }//GEN-LAST:event_simpanubahActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
             // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Menyimpan ?");
        if (confirm == JOptionPane.YES_OPTION && carifile.getText() != null) {
            SaveData();
            pict.setIcon(null);
            ReadImage(urlimg.getText());

        } else {
        }
    }//GEN-LAST:event_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(biodataktp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(biodataktp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(biodataktp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(biodataktp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new biodataktp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agama;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton cari;
    private javax.swing.JTextField carifile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JTextField job;
    private javax.swing.JTextField kawin;
    private javax.swing.JTextField kecamatan;
    private javax.swing.JTextField keldes;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JPanel panelfoto21;
    private javax.swing.JLabel pict;
    private javax.swing.JTextField pkn;
    private javax.swing.JTextField rt;
    private javax.swing.JButton simpan;
    private javax.swing.JButton simpanubah;
    private javax.swing.JTextField ttl;
    private javax.swing.JTextField urlimg;
    // End of variables declaration//GEN-END:variables
}
