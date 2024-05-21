abstract class Mobil {
    String nomorKendaraan;
    String warna;
    String merk;
    boolean isDikopling;
    int gigi;
    int kecepatan;

    public Mobil(String nomorKendaraan, String warna, String merk) {
        this.nomorKendaraan = nomorKendaraan;
        this.warna = warna;
        this.merk = merk;
        this.isDikopling = false;
        this.gigi = 0;
        this.kecepatan = 0;
    }

    public void kopling() {
        isDikopling = !isDikopling;
        System.out.println("Kondisi kopling: " + (isDikopling ? "Dikopling" : "Tidak Dikopling"));
    }

    public abstract void tambahGigi();

    public abstract void kurangiGigi();

    public void gas() {
        if (gigi == 0) {
            System.out.println("Tidak bisa gas, gigi netral.");
        } else {
            kecepatan += 10;
            System.out.println("Kecepatan sekarang: " + kecepatan + " km/h");
        }
    }

    public void rem() {
        if (kecepatan >= 10) {
            kecepatan -= 10;
        } else {
            kecepatan = 0;
        }
        System.out.println("Kecepatan sekarang: " + kecepatan + " km/h");
    }
}