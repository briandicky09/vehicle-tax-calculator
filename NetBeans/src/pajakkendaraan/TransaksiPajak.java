package pajakkendaraan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransaksiPajak {
    private Pemilik pemilik;
    private Kendaraan kendaraan;
    private Pajak pajak;
    private LocalDateTime waktu;

    public TransaksiPajak(Pemilik pemilik, Kendaraan kendaraan, Pajak pajak) {
        this.pemilik = pemilik;
        this.kendaraan = kendaraan;
        this.pajak = pajak;
        this.waktu = LocalDateTime.now();
    }

    public Pemilik getPemilik() { return pemilik; }
    public Kendaraan getKendaraan() { return kendaraan; }
    public Pajak getPajak() { return pajak; }
    public LocalDateTime getWaktu() { return waktu; }

    public String getWaktuFormatted() {
        return waktu.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
}
