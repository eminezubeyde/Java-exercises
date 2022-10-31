import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //çift sayıtek sayı ,,teklerin toplamı,çiftlerin toplamı,tek ort,çift ort bul

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] oddNumber = findOddNumber(array);
        System.out.println(Arrays.toString(oddNumber));
        int[] evenNumber = findEvenNumber(array);
        System.out.println(Arrays.toString(evenNumber));
        System.out.println(findTotal(evenNumber));
        System.out.println(findAverage(evenNumber));


    }

    public static int[] findOddNumber(int[] array) {

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                k++;
            }
        }
        int[] oddNumber = new int[k];
        k=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddNumber[k] = array[i];
                k++;
            }
        }
        return oddNumber;

    }


    public static int[] findEvenNumber(int[] array) {

        int k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                k++;

            }
        }
        int[] evenNumber = new int[k];
        k=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumber[k] = array[i];
                k++;

            }
        }
        return evenNumber;
    }

    public static int findTotal(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }

    public static int findAverage(int[] array) {
        int arrayLength = array.length;
        int total = findTotal(array);
        return total / arrayLength;

    }
}