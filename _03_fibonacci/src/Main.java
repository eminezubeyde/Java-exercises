public class Main {
    public static void main(String[] args) {

        printFibonacci(10);
        System.out.println("\n"+findNFibonacci(5));
        totalNFibonacci(5);
    }

    public static int findNFibonacci(int n){
        int [] fibonacci=prepareFibonacci(n+1);
        return fibonacci[n];
    }

    public static void totalNFibonacci(int n){
        int toplam=0;
        int [] fibonacci=prepareFibonacci(n);
        for(int fibo:fibonacci){
            toplam+=fibo;
        }
        System.out.println("total : "+toplam);
    }

    public static void printFibonacci(int n){
        int [] fibonacci=prepareFibonacci(n);
        for(int i=0;i<n;i++){
            System.out.print(fibonacci[i]+" ");
        }
    }

    public static int[] prepareFibonacci(int n){
        int[] fibonacci=new int[n];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for(int i=2;i<n;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        return fibonacci;
    }


}