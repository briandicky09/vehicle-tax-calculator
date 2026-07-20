package Form;

import pajakkendaraan.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class HasilForm extends javax.swing.JPanel {

    private final FormUtama parent;
    private TransaksiPajak current;
    private static final NumberFormat RP = NumberFormat.getInstance(new Locale("id", "ID"));

    public HasilForm(FormUtama parent) {
        this.parent = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        capNama = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        capNopol = new javax.swing.JLabel();
        lblNopol = new javax.swing.JLabel();
        capJenis = new javax.swing.JLabel();
        lblJenis = new javax.swing.JLabel();
        capNjkb = new javax.swing.JLabel();
        lblNjkb = new javax.swing.JLabel();
        lblRincian = new javax.swing.JLabel();
        capPkb = new javax.swing.JLabel();
        lblPkb = new javax.swing.JLabel();
        capSwd = new javax.swing.JLabel();
        lblSwd = new javax.swing.JLabel();
        sepRincian = new javax.swing.JSeparator();
        capTotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(0xF8, 0xFA, 0xFC));

        lblTitle.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblTitle.setText("Hasil Perhitungan Pajak");

        lblSubtitle.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        lblSubtitle.setForeground(new java.awt.Color(0x64, 0x74, 0x8B));
        lblSubtitle.setText("Rincian pajak kendaraan bermotor yang harus dibayarkan.");

        capNama.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 11));
        capNama.setForeground(new java.awt.Color(0x64, 0x74, 0x8B));
        capNama.setText("NAMA PEMILIK");
        lblNama.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        lblNama.setText("-");

        capNopol.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 11));
        capNopol.setForeground(new java.awt.Color(0x64, 0x74, 0x8B));
        capNopol.setText("NOMOR POLISI");
        lblNopol.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        lblNopol.setText("-");

        capJenis.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 11));
        capJenis.setForeground(new java.awt.Color(0x64, 0x74, 0x8B));
        capJenis.setText("JENIS KENDARAAN");
        lblJenis.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        lblJenis.setText("-");

        capNjkb.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 11));
        capNjkb.setForeground(new java.awt.Color(0x64, 0x74, 0x8B));
        capNjkb.setText("NJKB (NILAI JUAL KENDARAAN BERMOTOR)");
        lblNjkb.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        lblNjkb.setText("-");

        lblRincian.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        lblRincian.setText("Rincian Pajak");

        capPkb.setText("PKB Pokok");
        lblPkb.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        lblPkb.setText("-");

        capSwd.setText("SWDKLLJ");
        lblSwd.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        lblSwd.setText("-");

        capTotal.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
        capTotal.setForeground(new java.awt.Color(0x64, 0x74, 0x8B));
        capTotal.setText("TOTAL PAJAK");

        lblTotal.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 30));
        lblTotal.setForeground(new java.awt.Color(0x25, 0x63, 0xEB));
        lblTotal.setText("Rp 0");

        styleBlueButton(btnBack, "KEMBALI");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        styleBlueButton(btnSave, "SIMPAN KE RIWAYAT");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblSubtitle)
                    .addComponent(capNama)
                    .addComponent(lblNama)
                    .addComponent(capNopol)
                    .addComponent(lblNopol)
                    .addComponent(capJenis)
                    .addComponent(lblJenis)
                    .addComponent(capNjkb)
                    .addComponent(lblNjkb)
                    .addComponent(lblRincian)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(capPkb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPkb))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(capSwd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSwd))
                    .addComponent(sepRincian, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(capTotal)
                    .addComponent(lblTotal)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(10, 10, 10)
                        .addComponent(btnSave)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle)
                .addGap(4, 4, 4)
                .addComponent(lblSubtitle)
                .addGap(20, 20, 20)
                .addComponent(capNama)
                .addComponent(lblNama)
                .addGap(10, 10, 10)
                .addComponent(capNopol)
                .addComponent(lblNopol)
                .addGap(10, 10, 10)
                .addComponent(capJenis)
                .addComponent(lblJenis)
                .addGap(10, 10, 10)
                .addComponent(capNjkb)
                .addComponent(lblNjkb)
                .addGap(22, 22, 22)
                .addComponent(lblRincian)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capPkb)
                    .addComponent(lblPkb))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capSwd)
                    .addComponent(lblSwd))
                .addGap(14, 14, 14)
                .addComponent(sepRincian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(capTotal)
                .addGap(4, 4, 4)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>

    private static final java.awt.Color BTN_BLUE    = new java.awt.Color(0x25, 0x63, 0xEB);
    private static final java.awt.Color BTN_BLUE_HV = new java.awt.Color(0x1D, 0x4E, 0xD8);

    private static void styleBlueButton(final javax.swing.JButton b, String text) {
        b.setText(text);
        b.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
        b.setBackground(BTN_BLUE);
        b.setForeground(java.awt.Color.WHITE);
        b.setFocusPainted(false);
        b.setOpaque(true);
        b.setContentAreaFilled(true);
        b.setBorderPainted(false);
        b.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 22, 10, 22));
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.addChangeListener(e -> {
            javax.swing.ButtonModel m = b.getModel();
            b.setBackground((m.isRollover() || m.isPressed()) ? BTN_BLUE_HV : BTN_BLUE);
        });
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        parent.showInput();
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        if (current != null) {
            parent.simpanRiwayat(current);
            JOptionPane.showMessageDialog(this, "Transaksi disimpan ke riwayat.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            parent.showRiwayat();
        }
    }

    public void tampilkan(TransaksiPajak t) {
        this.current = t;
        lblNama.setText(t.getPemilik().getNama());
        lblNopol.setText(t.getKendaraan().getNomorPolisi());
        lblJenis.setText(t.getKendaraan().getJenis());
        lblNjkb.setText("Rp " + RP.format(t.getKendaraan().getNjkb()));
        lblPkb.setText("Rp " + RP.format(t.getPajak().getPkbPokok()));
        lblSwd.setText("Rp " + RP.format(t.getPajak().getSwdkllj()));
        lblTotal.setText("Rp " + RP.format(t.getPajak().getTotal()));
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel capJenis;
    private javax.swing.JLabel capNama;
    private javax.swing.JLabel capNjkb;
    private javax.swing.JLabel capNopol;
    private javax.swing.JLabel capPkb;
    private javax.swing.JLabel capSwd;
    private javax.swing.JLabel capTotal;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNjkb;
    private javax.swing.JLabel lblNopol;
    private javax.swing.JLabel lblPkb;
    private javax.swing.JLabel lblRincian;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblSwd;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSeparator sepRincian;
    // End of variables declaration
}
