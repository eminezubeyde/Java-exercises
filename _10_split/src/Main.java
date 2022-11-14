import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("string giriniz");
        String word=scanner.next();

        String [] split=word.split("-");
        for(int i=0;i<split.length;i++){
            System.out.println(split[i]);
        }
    }
}