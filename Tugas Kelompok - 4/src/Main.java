public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] sampleArray = { 5, 1, 4, 2, 8 };

        bubbleSortAscending(sampleArray);
        System.out.println("--------------------");
        bubbleSortDescending(sampleArray);
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
    //Naritha Cahya - 2602264101
    public static void bubbleSortDescending(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            System.out.println("Pass " + (i+1) + ":");
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
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