import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç eleman gireceksiniz: ");

        int elemanSayisi = scanner.nextInt();

        ArrayList<String> harfler = new ArrayList<String>();

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println("dizinin" + i + ". elemanını giriniz");

            String dizininElemanlari = scanner.next();
            harfler.add(dizininElemanlari);

        }
        System.out.println(harfler);

        //dizi[a,b,c,d]
        System.out.println("bulmak istediğiniz harfi giriniz");
        String arananHarf = scanner.next();
        boolean varMi = false;
        for (int i = 0; i < harfler.size(); i++) {
            if (arananHarf == harfler.get(i)) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("aranan harf dizide vardır");
        } else {
            System.out.println("aranan harf bulunamadı.");
        }
    }
}


