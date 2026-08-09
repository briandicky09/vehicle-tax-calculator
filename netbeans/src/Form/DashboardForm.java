package Form;

import pajakkendaraan.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

public class DashboardForm extends javax.swing.JPanel {

    private final FormUtama parent;

    // Palette
    private static final Color BG          = new Color(0xF8, 0xFA, 0xFC);
    private static final Color CARD_BG     = Color.WHITE;
    private static final Color BORDER      = new Color(0xE2, 0xE8, 0xF0);
    private static final Color MUTED       = new Color(0x64, 0x74, 0x8B);
    private static final Color TEXT        = new Color(0x0F, 0x17, 0x2A);
    private static final Color INPUT_BORDER= new Color(0x3B, 0x82, 0xF6);
    private static final Color BTN_BLUE    = new Color(0x25, 0x63, 0xEB);
    private static final Color BTN_BLUE_HV = new Color(0x1D, 0x4E, 0xD8);

    public DashboardForm(FormUtama parent) {
        this.parent = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblTitle       = new javax.swing.JLabel();
        pnlOwner       = new javax.swing.JPanel();
        lblSec1        = new javax.swing.JLabel();
        sepSec1        = new javax.swing.JSeparator();
        lblNama        = new javax.swing.JLabel();
        tfNama         = new javax.swing.JTextField();
        lblAlamat      = new javax.swing.JLabel();
        spAlamat       = new javax.swing.JScrollPane();
        taAlamat       = new javax.swing.JTextArea();

        pnlVehicle     = new javax.swing.JPanel();
        lblSec2        = new javax.swing.JLabel();
        sepSec2        = new javax.swing.JSeparator();
        lblNopol       = new javax.swing.JLabel();
        tfNopol        = new javax.swing.JTextField();
        lblJenis       = new javax.swing.JLabel();
        cbJenis        = new javax.swing.JComboBox<>();
        lblTahun       = new javax.swing.JLabel();
        tfTahun        = new javax.swing.JTextField();
        lblNjkb        = new javax.swing.JLabel();
        tfNjkb         = new javax.swing.JTextField();

        btnHitung      = new javax.swing.JButton();

        setBackground(BG);

        // ----- Title -----
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 28));
        lblTitle.setForeground(TEXT);
        lblTitle.setText("Input Data Kendaraan");

        // ===== Card 1: Informasi Pemilik =====
        styleCard(pnlOwner);

        lblSec1.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblSec1.setForeground(TEXT);
        lblSec1.setText("Informasi Pemilik");
        sepSec1.setForeground(BORDER);

        styleCaption(lblNama, "NAMA PEMILIK");
        styleInput(tfNama);
        installPlaceholder(tfNama, "Masukkan nama lengkap");

        styleCaption(lblAlamat, "ALAMAT LENGKAP");
        taAlamat.setColumns(20);
        taAlamat.setRows(4);
        taAlamat.setLineWrap(true);
        taAlamat.setWrapStyleWord(true);
        taAlamat.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        taAlamat.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));
        spAlamat.setViewportView(taAlamat);
        spAlamat.setBorder(inputBorder(false));
        installPlaceholder(taAlamat, "Masukkan alamat lengkap sesuai KTP");

        javax.swing.GroupLayout pl1 = new javax.swing.GroupLayout(pnlOwner);
        pnlOwner.setLayout(pl1);
        pl1.setHorizontalGroup(
            pl1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl1.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pl1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSec1)
                    .addComponent(sepSec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNama)
                    .addComponent(tfNama, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(lblAlamat)
                    .addComponent(spAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        pl1.setVerticalGroup(
            pl1.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSec1)
                .addGap(10, 10, 10)
                .addComponent(sepSec1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblNama)
                .addGap(6, 6, 6)
                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblAlamat)
                .addGap(6, 6, 6)
                .addComponent(spAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
        );

        // ===== Card 2: Data Kendaraan =====
        styleCard(pnlVehicle);

        lblSec2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblSec2.setForeground(TEXT);
        lblSec2.setText("Data Kendaraan");
        sepSec2.setForeground(BORDER);

        styleCaption(lblNopol, "NOMOR POLISI");
        styleInput(tfNopol);
        installPlaceholder(tfNopol, "Contoh: B 1234 ABC");

        styleCaption(lblJenis, "JENIS KENDARAAN");
        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Motor", "Mobil Penumpang", "Truk" }));
        cbJenis.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        cbJenis.setBackground(CARD_BG);
        cbJenis.setBorder(inputBorder(false));

        styleCaption(lblTahun, "TAHUN PEMBUATAN");
        styleInput(tfTahun);
        tfTahun.setText("2020");

        styleCaption(lblNjkb, "NJKB (NILAI JUAL KENDARAAN BERMOTOR)");
        styleInput(tfNjkb);
        installPlaceholder(tfNjkb, "Rp  0");

        // ----- Hitung button (force solid blue regardless of L&F) -----
        btnHitung.setBackground(BTN_BLUE);
        btnHitung.setForeground(Color.WHITE);
        btnHitung.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnHitung.setText("HITUNG PAJAK");
        btnHitung.setFocusPainted(false);
        btnHitung.setOpaque(true);
        btnHitung.setContentAreaFilled(true);
        btnHitung.setBorderPainted(false);
        btnHitung.setBorder(BorderFactory.createEmptyBorder(12, 28, 12, 28));
        btnHitung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHitung.addChangeListener(e -> {
            javax.swing.ButtonModel m = btnHitung.getModel();
            btnHitung.setBackground((m.isRollover() || m.isPressed()) ? BTN_BLUE_HV : BTN_BLUE);
        });
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pl2 = new javax.swing.GroupLayout(pnlVehicle);
        pnlVehicle.setLayout(pl2);
        pl2.setHorizontalGroup(
            pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl2.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSec2)
                    .addComponent(sepSec2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl2.createSequentialGroup()
                        .addGroup(pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNopol)
                            .addComponent(tfNopol, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJenis)
                            .addComponent(cbJenis, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                    .addGroup(pl2.createSequentialGroup()
                        .addGroup(pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTahun)
                            .addComponent(tfTahun, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNjkb)
                            .addComponent(tfNjkb, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                    .addComponent(btnHitung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        pl2.setVerticalGroup(
            pl2.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSec2)
                .addGap(10, 10, 10)
                .addComponent(sepSec2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNopol)
                    .addComponent(lblJenis))
                .addGap(6, 6, 6)
                .addGroup(pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNopol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTahun)
                    .addComponent(lblNjkb))
                .addGap(6, 6, 6)
                .addGroup(pl2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNjkb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
        );

        // ===== Root layout =====
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(pnlOwner,   javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle)
                .addGap(22, 22, 22)
                .addComponent(pnlOwner,   javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE)
        );
    }// </editor-fold>

    // ---------- Styling helpers ----------
    private static Border inputBorder(boolean focused) {
        Color c = focused ? INPUT_BORDER : BORDER;
        return BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(c, focused ? 2 : 1, true),
                BorderFactory.createEmptyBorder(focused ? 7 : 8, 11, focused ? 7 : 8, 11));
    }

    private static void styleCard(javax.swing.JPanel p) {
        p.setBackground(CARD_BG);
        p.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDER, 1, true),
                BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    }

    private static void styleCaption(javax.swing.JLabel l, String text) {
        l.setText(text);
        l.setFont(new Font("Segoe UI", Font.BOLD, 11));
        l.setForeground(MUTED);
    }

    private static void styleInput(final JTextComponent tf) {
        tf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        tf.setBorder(inputBorder(false));
        tf.setBackground(CARD_BG);
        tf.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override public void focusGained(java.awt.event.FocusEvent e) { tf.setBorder(inputBorder(true)); }
            @Override public void focusLost  (java.awt.event.FocusEvent e) { tf.setBorder(inputBorder(false)); }
        });
    }

    /** Lightweight placeholder for any JTextComponent. */
    private static void installPlaceholder(final JTextComponent tf, final String hint) {
        final Color hintColor = new Color(0x94, 0xA3, 0xB8);
        final Color realColor = TEXT;
        final boolean[] showing = { false };

        Runnable show = () -> {
            showing[0] = true;
            tf.setForeground(hintColor);
            tf.setText(hint);
        };
        Runnable clearIfHint = () -> {
            if (showing[0]) {
                showing[0] = false;
                tf.setForeground(realColor);
                tf.setText("");
            }
        };

        if (tf.getText() == null || tf.getText().isEmpty()) show.run();

        tf.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override public void focusGained(java.awt.event.FocusEvent e) { clearIfHint.run(); }
            @Override public void focusLost(java.awt.event.FocusEvent e) {
                if (tf.getText().isEmpty()) show.run();
            }
        });
        tf.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {}
            public void removeUpdate(DocumentEvent e) {}
            public void changedUpdate(DocumentEvent e) {}
        });
        tf.putClientProperty("placeholder.showing", (java.util.function.BooleanSupplier) () -> showing[0]);
    }

    private static String realText(JTextComponent tf) {
        Object s = tf.getClientProperty("placeholder.showing");
        if (s instanceof java.util.function.BooleanSupplier && ((java.util.function.BooleanSupplier) s).getAsBoolean()) {
            return "";
        }
        return tf.getText();
    }

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {
        hitung();
    }

    private void hitung() {
        try {
            String nama   = realText(tfNama).trim();
            String alamat = realText(taAlamat).trim();
            String nopol  = realText(tfNopol).trim();
            String jenis  = (String) cbJenis.getSelectedItem();
            String tahunStr = realText(tfTahun).trim();
            String njkbStr  = realText(tfNjkb).trim().replaceAll("[^0-9]", "");

            if (nama.isEmpty() || nopol.isEmpty() || tahunStr.isEmpty() || njkbStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lengkapi semua data terlebih dahulu.", "Validasi", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int tahun = Integer.parseInt(tahunStr);
            long njkb = Long.parseLong(njkbStr);

            Pemilik p = new Pemilik(nama, alamat);
            Kendaraan k = new Kendaraan(nopol, jenis, tahun, njkb);
            Pajak pj = new Pajak(k);
            TransaksiPajak t = new TransaksiPajak(p, k, pj);
            parent.showHasil(t);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Tahun dan NJKB harus berupa angka.", "Format Salah", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNjkb;
    private javax.swing.JLabel lblNopol;
    private javax.swing.JLabel lblSec1;
    private javax.swing.JLabel lblSec2;
    private javax.swing.JLabel lblTahun;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlOwner;
    private javax.swing.JPanel pnlVehicle;
    private javax.swing.JSeparator sepSec1;
    private javax.swing.JSeparator sepSec2;
    private javax.swing.JScrollPane spAlamat;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNjkb;
    private javax.swing.JTextField tfNopol;
    private javax.swing.JTextField tfTahun;
    // End of variables declaration
}
