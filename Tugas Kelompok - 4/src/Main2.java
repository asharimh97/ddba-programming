import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[5];
        boolean out = false;

        System.out.println("Selamat Datang di program simulasi");

        while (!out) {
            System.out.println("Menu");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.print("Batas Bawah = ");
                    int lowerBound = input.nextInt();
                    System.out.print("Batas Atas = ");
                    int upperBound = input.nextInt();
                    System.out.println();
                    Random random = new Random();
                    for (int i = 0; i < data.length; i++) {
                        data[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                    }
                    System.out.println(Arrays.toString(data));
                    System.out.println();
                    break;
                case 2:
                    bubbleSort(data, true);
                    break;
                case 3:
                    selectionSort(data, true);
                    break;
                case 4:
                    bubbleSort(data, false);
                    break;
                case 5:
                    selectionSort(data, false);
                    break;
                case 6:
                    out = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
        input.close();
    }

    public static void bubbleSort(int[] data, boolean ascending) {
        int n = data.length;
        boolean swapped = false;
        int pass = 1;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if ((ascending && data[i] > data[i + 1]) || (!ascending && data[i] < data[i + 1])) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println();
            System.out.println("Pass " + pass);
            System.out.println(Arrays.toString(data));
            pass++;
            n--;
        } while (swapped && n > 1);
        System.out.println();
        System.out.println("Result of Pass " + (pass - 1));
        System.out.println(Arrays.toString(data));
        System.out.println();
    }

    public static void selectionSort(int[] data, boolean ascending) {
        int n = data.length;
        int pass = 1;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if ((ascending && data[j] < data[minIndex]) || (!ascending && data[j] > data[minIndex])) {
                    minIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
            System.out.println();
            System.out.println("Pass " + pass);
            System.out.println(Arrays.toString(data));
            pass++;
            n--;
            if (n == 1)
                break;
        }
        System.out.println();
        System.out.println("Result of Pass " + (pass - 1));
        System.out.println(Arrays.toString(data));
        System.out.println();
    }
}
