import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" pozitif bir sayı giriniz.");
        int sayi = scanner.nextInt();

        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            }
        }
        if (asalMi) {
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değildir.");
        }
    }
}
