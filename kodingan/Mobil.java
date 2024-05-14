class Mobil {
    private String merek;
    private int tahunProduksi;
    private double harga;
    private String tipe;

    public Mobil(String merek, int tahunProduksi, double harga, String tipe) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
        this.tipe = tipe;
    }

    public void info_spesifik() {
        System.out.println("Tipe mobil: " + tipe);
    }

    public double hitungBiayaLayanan() {
        if (tipe.equals("SUV") || tipe.equals("Crossover")) {
            return harga * 0.05;
        } else {
            return harga * 0.03;
        }
    }

    public void beliSecond(int tahunSekarang) {
        int umur = tahunSekarang - tahunProduksi;
        double hargaSecond = harga - (umur * 1000);
        System.out.println("Terbeli dengan harga: " + hargaSecond);
    }
}
