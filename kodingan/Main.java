public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2019, 20000, "SUV");
        mobil.info_spesifik();
        System.out.println("Biaya layanan mobil: " + mobil.hitungBiayaLayanan());
        mobil.beliSecond(2024);

        SepedaMotor sepedaMotor = new SepedaMotor("Honda", 2020, 10000, 150);
        sepedaMotor.info_spesifik();
        System.out.println("Biaya layanan sepeda motor: " + sepedaMotor.hitungBiayaLayanan());
        sepedaMotor.beliSecond(2024);

        Truk truk = new Truk("Isuzu", 2018, 50000, 20);
        truk.info_spesifik();
        System.out.println("Biaya layanan truk: " + truk.hitungBiayaLayanan());
        truk.beliSecond(2024);
    }
}