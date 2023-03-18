import java.util.Scanner;

public class Main {
    // Declaring constants
    static final String NASGOR = "Nasi Goreng Spesial";
    static final double NASGOR_PRICE = 9999.99;

    static final String AYAM = "Ayam Goreng Spesial";
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
        
        printl("\n\n" + "Selamat menikmati makanan Anda...");
        
        // Print receipt

        // Continue here
        // Example
        totalNasgor = calculatePrice(nasgorQty, NASGOR_PRICE);
    }
    
    public static void printMenu() {
        printl("Menu Spesial hari ini");
        printl("=====================");
        
        printl("\t1. " + NASGOR + "\t\t\t\t" + "@" + NASGOR_PRICE);
        printl("\t2. " + AYAM + "\t\t\t\t" + "@" + AYAM_PRICE);
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
