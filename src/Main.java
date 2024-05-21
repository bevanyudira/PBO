public class Main {
    public static void main(String[] args) {
        MobilPenumpang mobilSport = new MobilPenumpang("B1234XYZ", "Merah", "Ferrari", "sport");
        System.out.println("Mobil Sport - Ferrari");
        mobilSport.kopling();
        mobilSport.tambahGigi();
        mobilSport.gas();
        mobilSport.gas();
        mobilSport.kurangiGigi();
        mobilSport.rem();
        mobilSport.kopling();
        mobilSport.kurangiGigi();

        MobilPenumpang mobilRegular = new MobilPenumpang("B5678ABC", "Hitam", "Toyota", "regular");
        System.out.println("\nMobil Penumpang - Toyota");
        mobilRegular.kopling();
        mobilRegular.tambahGigi();
        mobilRegular.tambahGigi();
        mobilRegular.gas();
        mobilRegular.gas();
        mobilRegular.kurangiGigi();
        mobilRegular.rem();
        mobilRegular.kopling();
        mobilRegular.kurangiGigi();

        MobilAngkutan mobilAngkutan = new MobilAngkutan("D1234EFG", "Putih", "Mitsubishi", 1000);
        System.out.println("\nMobil Angkutan - Mitsubishi");
        mobilAngkutan.kopling();
        mobilAngkutan.tambahGigi();
        mobilAngkutan.gas();
        mobilAngkutan.gas();
        mobilAngkutan.kurangiGigi();
        mobilAngkutan.rem();
        mobilAngkutan.kopling();
        mobilAngkutan.kurangiGigi();
    }
}
