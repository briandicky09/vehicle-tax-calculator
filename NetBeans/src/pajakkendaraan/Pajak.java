package pajakkendaraan;

public class Pajak {
    private long pkbPokok;
    private long swdkllj;
    private long total;

    public Pajak(Kendaraan k) {
        // PKB = 1.5% dari NJKB
        this.pkbPokok = Math.round(k.getNjkb() * 0.015);
        this.swdkllj = hitungSwdkllj(k.getJenis());
        this.total = this.pkbPokok + this.swdkllj;
    }

    private long hitungSwdkllj(String jenis) {
        switch (jenis) {
            case "Motor": return 35000L;
            case "Mobil Penumpang": return 143000L;
            case "Truk": return 163000L;
            default: return 143000L;
        }
    }

    public long getPkbPokok() { return pkbPokok; }
    public long getSwdkllj() { return swdkllj; }
    public long getTotal() { return total; }
}
