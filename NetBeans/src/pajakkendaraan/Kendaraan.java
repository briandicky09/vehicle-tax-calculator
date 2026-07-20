package pajakkendaraan;

public class Kendaraan {
    private String nomorPolisi;
    private String jenis; // Motor, Mobil Penumpang, Truk
    private int tahun;
    private long njkb;

    public Kendaraan(String nomorPolisi, String jenis, int tahun, long njkb) {
        this.nomorPolisi = nomorPolisi;
        this.jenis = jenis;
        this.tahun = tahun;
        this.njkb = njkb;
    }

    public String getNomorPolisi() { return nomorPolisi; }
    public String getJenis() { return jenis; }
    public int getTahun() { return tahun; }
    public long getNjkb() { return njkb; }
}
