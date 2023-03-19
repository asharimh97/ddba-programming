import java.util.Scanner;

public class Main {
    // Declaring constants
    static final String NASGOR = "Nasi Goreng Spesial";
    static final double NASGOR_PRICE = 9999.99;

    static final String AYAM = "Ayam Bakar Spesial";
    static final double AYAM_PRICE = 12345.67;

    static final String STEAK = "Steak Sirloin Spesial";
    static final double STEAK_PRICE = 21108.40;

    static final String KWETIAW = "Kwetiaw Siram Spesial";
    static final double KWETIAW_PRICE = 13579.13;

    static final String KAMBING = "Kambing Guling Spesial";
    static final double KAMBING_PRICE = 98765.43;

    public static void main(String[] args) {
        int totalPerson, nasgorQty, ayamQty, steakQty, kwetiawQty, kambingQty;
        double totalNasgor, totalAyam, totalSteak, totalKwetiaw, totalKambing;
        String name;
        int nomor = 1;

        Scanner input = new Scanner(System.in);

        printl("Selamat Siang...");
        print("Pesan untuk berapa orang: ");
        totalPerson = input.nextInt();

        // clean prev input line
        input.nextLine();

        print("Pesanan atas nama: ");
        name = input.nextLine();
        
        // Print menu spesial
        printMenu();

        // Input pesanan
        // Do something here
        //Syahfiar Dhani
        printl(("Pesanan Anda [batas pesanan 0-10 porsi]"));
        print("1. " + NASGOR + " = ");
        nasgorQty = input.nextInt();
        print("2. " + AYAM + " = ");
        ayamQty = input.nextInt();
        print("3. "+ STEAK +" = ");
        steakQty = input.nextInt();
        print("4. "+ KWETIAW + " = ");
        kwetiawQty = input.nextInt();
        print("5. " + KAMBING + " = ");
        kambingQty = input.nextInt();

        printl("\n\n" + "Selamat menikmati makanan Anda...");

        // Calculate each menu price
        totalNasgor = calculatePrice(nasgorQty, NASGOR_PRICE);
        totalAyam = calculatePrice(ayamQty, AYAM_PRICE);
        totalSteak = calculatePrice(steakQty, STEAK_PRICE);
        totalKwetiaw = calculatePrice(kwetiawQty, KWETIAW_PRICE);
        totalKambing = calculatePrice(kambingQty, KAMBING_PRICE);

        // Menghitung total pembelian
        //Naritha Cahya
        double totalAll = totalNasgor+totalAyam+totalSteak+totalKwetiaw+totalKambing;
       
        // Menghitung harga diskon
        double hargaDisc = totalAll * 10/100;
        double finalPrice = totalAll - hargaDisc;
        double pricePerPerson = finalPrice / totalPerson;

        // Clear input value
        input.nextLine();

        printl("Pembelian : ");

        totalPembelian(nasgorQty, totalNasgor, NASGOR, NASGOR_PRICE, 1);
        totalPembelian(ayamQty, totalAyam, AYAM, AYAM_PRICE, 3);
        totalPembelian(steakQty, totalSteak, STEAK, STEAK_PRICE, 2);
        totalPembelian(kwetiawQty, totalKwetiaw, KWETIAW, KWETIAW_PRICE, 4);
        totalPembelian(kambingQty, totalKambing, KAMBING, KAMBING_PRICE, 5);

        printl("============================================================================================");
        System.out.printf("Total Pembelian\t\t\t\t\t\t\t\t\t\t\t\t = \tRp.%.2f\n", totalAll);
        System.out.printf("Disc. 10%% <Masa Promosi> \t\t\t\t\t\t\t\t\t = \tRp. %.2f\n", hargaDisc);
        printl("============================================================================================");
        System.out.printf("Total Pembelian setelah disc 10%% \t\t\t\t\t\t\t = \tRp. %.2f\n", finalPrice);
        System.out.printf("Pembelian per orang (untuk %d orang) \t\t\t\t\t\t = \tRp.  %.2f\n\n", totalPerson, pricePerPerson);

        printl("\t\t\t\t\t\tTerima kasih atas kunjungan Anda...");
        printl("\t\t\t\t\t\t\t...Tekan ENTER untuk keluar...");

        input.nextLine();
    }
    // Print pembelian
    //Naritha Cahya
    public static void totalPembelian(int qty, double totalPrice, String namaMenu, double price, int nomor){
        System.out.printf("%d. %s \t\t %d porsi * Rp. %.2f \t = \tRp. %.2f\n", nomor, namaMenu, qty, price, totalPrice);
    }

    
    public static void printMenu() {
        printl("Menu Spesial hari ini");
        printl("=====================");
        
        printl("\t1. " + NASGOR + "\t\t\t\t\t\t" + "@" + NASGOR_PRICE);
        printl("\t2. " + AYAM + "\t\t\t\t\t\t" + "@" + AYAM_PRICE);
        printl("\t3. " + STEAK + "\t\t\t\t\t" + "@" + STEAK_PRICE);
        printl("\t4. " + KWETIAW + "\t\t\t\t\t" + "@" + KWETIAW_PRICE);
        printl("\t5. " + KAMBING + "\t\t\t\t\t" + "@" + KAMBING_PRICE);
    }

    public static void print(String param) {
        System.out.print(param);
    }

    public static void printl(String param) {
        System.out.println(param);
    }

    public static double calculatePrice(int qty, double price) {
        return qty * price;
    }
}