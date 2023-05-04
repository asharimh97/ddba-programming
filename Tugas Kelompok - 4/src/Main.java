import java.util.Scanner;
public class Main {
        static int[] data = new int[5];
        static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println(""
                        + "\nSelamat Datang di Program Simulasi"+"\n"
                        + "Menu"+"\n"
                        + "1. Random Data"+"\n"
                        + "2. Simulasi Bubble Sort - Ascending"+"\n"
                        + "3. Simulasi Selection Sort - Ascending"+"\n"
                        + "4. Simulasi Bubble Sort - Descending"+"\n"
                        + "5. Simulasi Selection Sort - Descending"+"\n"
                        + "6. Keluar"+"\n"
                        + "Masukkan Pilihan Anda."+"\n");
                        
        choice = input.nextInt();
 
        int[] sampleArray = { 5, 1, 4, 2, 8 };
        
        switch (choice) {
            case 1:
                randomData();
                break;
            case 2:
                bubbleSortAscending(sampleArray);
                break;
            //Lanjutkan
            case 6:
                System.out.println("Terimakasih telah menggunakan aplikasi ini");
                break;
            } 
        } while (choice != 6);
    }
    
    public static void randomData() {
            System.out.print("Masukkan batas bawah : ");
                int lowerBound = input.nextInt();
                    System.out.print("Masukkan batas atas : ");
                int upperBound = input.nextInt();

            for (int i = 0; i < data.length; i++) {
                    data[i] = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
                }

            System.out.println("Data yang dihasilkan :");
                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i] + " ");
                    }
                System.out.println();
    }

    public static void bubbleSortAscending(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            System.out.println("Pass " + (i+1) + ":");
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
                printArray(arr);
            }

            System.out.println("Result of pass " + (i+1) + ":");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("\n");
    }
}
