class MobilPenumpang extends Mobil {
    String tipeKendaraan;

    public MobilPenumpang(String nomorKendaraan, String warna, String merk, String tipeKendaraan) {
        super(nomorKendaraan, warna, merk);
        this.tipeKendaraan = tipeKendaraan;
    }

    @Override
    public void tambahGigi() {
        if ((isDikopling || "sport".equalsIgnoreCase(tipeKendaraan)) && gigi < 5) {
            gigi++;
            System.out.println("Gigi bertambah, sekarang gigi: " + gigi);
        } else {
            System.out.println("Tidak bisa menambah gigi. Kopling tidak ditekan atau sudah gigi maksimal.");
        }
    }

    @Override
    public void kurangiGigi() {
        if (isDikopling && gigi > 0) {
            gigi--;
            if (gigi == 0) kecepatan = 0;
            else if (kecepatan > batasKecepatanMobilPenumpang(gigi)) kecepatan = batasKecepatanMobilPenumpang(gigi);
            System.out.println("Gigi berkurang, sekarang gigi: " + gigi);
            System.out.println("Kecepatan sekarang: " + kecepatan + " km/h");
        } else {
            System.out.println("Tidak bisa mengurangi gigi. Kopling tidak ditekan atau sudah gigi minimal.");
        }
    }

    private int batasKecepatanMobilPenumpang(int gigi) {
        switch (gigi) {
            case 1: return 10;
            case 2: return 20;
            case 3: return 40;
            case 4: return 70;
            case 5: return 100;
            default: return 0;
        }
    }
}