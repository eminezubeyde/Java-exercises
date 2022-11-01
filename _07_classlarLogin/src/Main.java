public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem= new DortIslem();
        int sonuc=dortIslem.topla(15,3);
        int sonuc1=dortIslem.carp(3,15);
        int sonuc2=dortIslem.cikar(15,3);
        int sonuc3=dortIslem.bol(15,3);
        System.out.println(sonuc);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
    }
}