import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
        System.out.println("kelime giriniz");
        String word=scanner.next();
        String opposite=" ";

        for(int i= word.length()-1;i>=0 ;i--){
        opposite=opposite+ word.charAt(i);


        }
        System.out.println(opposite);
    }
}