class SepedaMotor {
    private String merek;
    private int tahunProduksi;
    private double harga;
    private int cc;

    public SepedaMotor(String merek, int tahunProduksi, double harga, int cc) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
        this.cc = cc;
    }

    public void info_spesifik() {
        System.out.println("CC: " + cc);
    }

    public double hitungBiayaLayanan() {
        if (cc < 250) {
            return harga * 0.02;
        } else {
            return harga * 0.03;
        }
    }

    public void beliSecond(int tahunSekarang) {
        int umur = tahunSekarang - tahunProduksi;
        double hargaSecond = harga - (umur * 500);
        System.out.println("Terbeli dengan harga: " + hargaSecond);
    }
}