import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();


        int i, j;
        boolean isPrime = true;

        for (i = 3; i < value; i++) {
            isPrime = true;

            for (j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;

                }
            }
            if (isPrime) {
                System.out.print(i + "-");
            }
        }
    }
}