import java.util.Scanner;

public class Main {
    // Declaring constants
    final String NASGOR = "Nasi Goreng Spesial";
    final double NASGOR_PRICE = 9999.99;

    final String AYAM = "Ayam Goreng Spesial";
    final double AYAM_PRICE = 12345.67;
    final String STEAK = "Steak Sirloin Spesial";
    final double STEAK_PRICE = 21108.40;
    final String KWETIAW = "Kwetiaw Siram Spesial";
    final double KWETIAW_PRICE = 13579.13;
    final String KAMBING = "Kambing Guling Spesial";
    final double KAMBING_PRICE = 98765.43;
    public static void main(String[] args) {
        int totalPerson, nasgorQty, ayamQty, steakQty, kwetiawQty, kambingQty;
        String name;

        Scanner input = new Scanner(System.in);

        printl("Selamat Siang...");
        print("Pesan untuk berapa orang: ");
        totalPerson = input.nextInt();

        print("Pesanan atas nama: ");
        name = input.nextLine();

        // Continue here
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