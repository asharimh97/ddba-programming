import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name = "";

        
        while(name.length() < 1 || name.length() > 25){
            print("Masukkan Nama Anda [1..25] : ");
            name = input.nextLine();
        }

        

    }

    public static void print(String param) {

        System.out.print(param);
    }

    public static void printl(String param) {

        System.out.println(param);
    }

    public static void printf(String param) {

        System.out.printf(param);
    }
}
