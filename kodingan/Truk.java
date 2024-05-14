class Truk {
    private String merek;
    private int tahunProduksi;
    private double harga;
    private double kapasitasAngkut;

    public Truk(String merek, int tahunProduksi, double harga, double kapasitasAngkut) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
        this.kapasitasAngkut = kapasitasAngkut;
    }

    public void info_spesifik() {
        System.out.println("Kapasitas angkut: " + kapasitasAngkut + " ton");
    }

    public double hitungBiayaLayanan() {
        if (kapasitasAngkut < 16) {
            return harga * 0.1;
        } else {
            return harga * 0.15;
        }
    }

    public void beliSecond(int tahunSekarang) {
        int umur = tahunSekarang - tahunProduksi;
        double hargaSecond = harga - (umur * 2000);
        System.out.println("Terbeli dengan harga: " + hargaSecond);
    }
}
