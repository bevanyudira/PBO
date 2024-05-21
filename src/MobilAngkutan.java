class MobilAngkutan extends Mobil {
    int kapasitasMaksimum;

    public MobilAngkutan(String nomorKendaraan, String warna, String merk, int kapasitasMaksimum) {
        super(nomorKendaraan, warna, merk);
        this.kapasitasMaksimum = kapasitasMaksimum;
    }

    @Override
    public void tambahGigi() {
        if (isDikopling && gigi < 6) {
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
            else if (kecepatan > batasKecepatanMobilAngkutan(gigi)) kecepatan = batasKecepatanMobilAngkutan(gigi);
            System.out.println("Gigi berkurang, sekarang gigi: " + gigi);
            System.out.println("Kecepatan sekarang: " + kecepatan + " km/h");
        } else {
            System.out.println("Tidak bisa mengurangi gigi. Kopling tidak ditekan atau sudah gigi minimal.");
        }
    }

    private int batasKecepatanMobilAngkutan(int gigi) {
        switch (gigi) {
            case 1: return 10;
            case 2: return 20;
            case 3: return 30;
            case 4: return 50;
            case 5: return 80;
            case 6: return 100;
            default: return 0;
        }
    }
}