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

        print("Pesanan atas nama: ");
        name = input.nextLine();
        
        // Print menu spesial
        printMenu();

        // Input pesanan
        // Do something here
        //Syahfiar Dhani
        printl(("Pesanan Anda [batas pesanan 0-10 porsi]"));
        print("1. Nasi Goreng Spesial = ");
        nasgorQty = input.nextInt();
        print("2. Ayam Bakar Spesial = ");
        ayamQty = input.nextInt();
        print("3. Steak Sirloin Spesial = ");
        steakQty = input.nextInt();
        print("4. Kwetiaw Siram Spesial = ");
        kwetiawQty = input.nextInt();
        print("5. Kambing Guling Spesial = ");
        kambingQty = input.nextInt();
        
        printl("\n\n" + "Selamat menikmati makanan Anda...");
        
        // Continue here
        // Example
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


        System.out.println("Pembelian : ");

        totalPembelian(nasgorQty, totalNasgor, NASGOR, NASGOR_PRICE, 1);
        totalPembelian(ayamQty, totalAyam, AYAM, AYAM_PRICE, 3);
        totalPembelian(steakQty, totalSteak, STEAK, STEAK_PRICE, 2);
        totalPembelian(kwetiawQty, totalKwetiaw, KWETIAW, KWETIAW_PRICE, 4);
        totalPembelian(kambingQty, totalKambing, KAMBING, KAMBING_PRICE, 5);

        System.out.println("============================================================================================");
        System.out.printf("Total Pembelian\t\t\t\t\t\t = Rp.%.2f\n", totalAll);
        System.out.printf("Disc. 10%% <Masa Promosi> \t\t\t\t\t\t = Rp.%.2f", hargaDisc);


    }
    // Print pembelian
    //Naritha Cahya
    public static void totalPembelian(int qty, double totalPrice, String namaMenu, double price, int nomor){
        printl(nomor +". "+ namaMenu + "\t\t" + qty + " porsi " + "*" + " Rp. " + totalPrice + " = " +"\tRp. "+ price);
    }

    
    public static void printMenu() {
        printl("Menu Spesial hari ini");
        printl("=====================");
        
        printl("\t1. " + NASGOR + "\t\t\t\t\t\t" + "@" + NASGOR_PRICE);
        printl("\t2. " + AYAM + "\t\t\t\t\t\t" + "@" + AYAM_PRICE);
        printl("\t3. " + STEAK + "\t\t\t\t" + "@" + STEAK_PRICE);
        printl("\t4. " + KWETIAW + "\t\t\t\t" + "@" + KWETIAW_PRICE);
        printl("\t5. " + KAMBING + "\t\t\t\t" + "@" + KAMBING_PRICE);
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