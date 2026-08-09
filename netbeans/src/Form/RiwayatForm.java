package Form;

import pajakkendaraan.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class RiwayatForm extends javax.swing.JPanel {

    private final FormUtama parent;
    private static final NumberFormat RP = NumberFormat.getInstance(new Locale("id", "ID"));

    public RiwayatForm(FormUtama parent) {
        this.parent = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(0xF8, 0xFA, 0xFC));

        lblTitle.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        lblTitle.setText("Riwayat Transaksi Pajak");

        lblSubtitle.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        lblSubtitle.setForeground(new java.awt.Color(0x64, 0x74, 0x8B));
        lblSubtitle.setText("Daftar perhitungan pajak kendaraan yang telah disimpan.");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Waktu", "Nama Pemilik", "Nomor Polisi", "Jenis", "NJKB", "Total Pajak" }
        ) {
            boolean[] canEdit = new boolean [] { false, false, false, false, false, false };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(34);
        table.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        spTable.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblSubtitle)
                    .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle)
                .addGap(4, 4, 4)
                .addComponent(lblSubtitle)
                .addGap(16, 16, 16)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>

    public void refresh() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (TransaksiPajak t : parent.getRiwayat()) {
            model.addRow(new Object[]{
                    t.getWaktuFormatted(),
                    t.getPemilik().getNama(),
                    t.getKendaraan().getNomorPolisi(),
                    t.getKendaraan().getJenis(),
                    "Rp " + RP.format(t.getKendaraan().getNjkb()),
                    "Rp " + RP.format(t.getPajak().getTotal())
            });
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JTable table;
    // End of variables declaration
}
