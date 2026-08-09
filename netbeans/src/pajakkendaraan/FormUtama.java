package pajakkendaraan;

import Form.DashboardForm;
import Form.HasilForm;
import Form.RiwayatForm;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;

public class FormUtama extends javax.swing.JFrame {

    public static final java.awt.Color BG_DARK = new java.awt.Color(0x0F, 0x16, 0x23);
    public static final java.awt.Color SIDEBAR = new java.awt.Color(0x11, 0x18, 0x27);
    public static final java.awt.Color CONTENT_BG = new java.awt.Color(0xF8, 0xFA, 0xFC);
    public static final java.awt.Color PRIMARY = new java.awt.Color(0x25, 0x63, 0xEB);
    public static final java.awt.Color TEXT_LIGHT = new java.awt.Color(0xE5, 0xE7, 0xEB);
    public static final java.awt.Color TEXT_MUTED = new java.awt.Color(0x94, 0xA3, 0xB8);

    private final List<TransaksiPajak> riwayat = new ArrayList<>();

    private DashboardForm dashboardForm;
    private HasilForm hasilForm;
    private RiwayatForm riwayatForm;

    public FormUtama() {
        initComponents();
        setSize(1200, 720);
        setLocationRelativeTo(null);
        // hook custom panels into CardLayout
        dashboardForm = new DashboardForm(this);
        hasilForm = new HasilForm(this);
        riwayatForm = new RiwayatForm(this);
        cards.add(dashboardForm, "input");
        cards.add(hasilForm, "hasil");
        cards.add(riwayatForm, "riwayat");
        showInput();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        lblBrand = new javax.swing.JLabel();
        lblBrandSub = new javax.swing.JLabel();
        navInput = new javax.swing.JLabel();
        navRiwayat = new javax.swing.JLabel();
        cards = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Pajak Kendaraan Bermotor");

        sidePanel.setBackground(SIDEBAR);

        lblBrand.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
        lblBrand.setForeground(java.awt.Color.WHITE);
        lblBrand.setText("Sistem Pajak");

        lblBrandSub.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        lblBrandSub.setForeground(TEXT_MUTED);
        lblBrandSub.setText("Dashboard");

        navInput.setBackground(PRIMARY);
        navInput.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        navInput.setForeground(java.awt.Color.WHITE);
        navInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navInput.setText("Input Data");
        navInput.setOpaque(true);
        navInput.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        navInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navInputMouseClicked(evt);
            }
        });

        navRiwayat.setBackground(SIDEBAR);
        navRiwayat.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        navRiwayat.setForeground(TEXT_LIGHT);
        navRiwayat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navRiwayat.setText("Riwayat");
        navRiwayat.setOpaque(true);
        navRiwayat.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        navRiwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navRiwayatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBrand)
                    .addComponent(lblBrandSub)
                    .addComponent(navInput, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(navRiwayat, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblBrand)
                .addGap(4, 4, 4)
                .addComponent(lblBrandSub)
                .addGap(28, 28, 28)
                .addComponent(navInput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(navRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cards.setBackground(CONTENT_BG);
        cards.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void navInputMouseClicked(java.awt.event.MouseEvent evt) {
        showInput();
    }

    private void navRiwayatMouseClicked(java.awt.event.MouseEvent evt) {
        showRiwayat();
    }

    private void styleNav(javax.swing.JLabel lbl, boolean active) {
        if (active) {
            lbl.setBackground(PRIMARY);
            lbl.setForeground(java.awt.Color.WHITE);
        } else {
            lbl.setBackground(SIDEBAR);
            lbl.setForeground(TEXT_LIGHT);
        }
    }

    public void showInput() {
        styleNav(navInput, true);
        styleNav(navRiwayat, false);
        ((CardLayout) cards.getLayout()).show(cards, "input");
    }

    public void showHasil(TransaksiPajak t) {
        hasilForm.tampilkan(t);
        ((CardLayout) cards.getLayout()).show(cards, "hasil");
    }

    public void showRiwayat() {
        styleNav(navInput, false);
        styleNav(navRiwayat, true);
        riwayatForm.refresh();
        ((CardLayout) cards.getLayout()).show(cards, "riwayat");
    }

    public void simpanRiwayat(TransaksiPajak t) {
        riwayat.add(t);
    }

    public List<TransaksiPajak> getRiwayat() {
        return riwayat;
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel cards;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblBrandSub;
    private javax.swing.JLabel navInput;
    private javax.swing.JLabel navRiwayat;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration
}
