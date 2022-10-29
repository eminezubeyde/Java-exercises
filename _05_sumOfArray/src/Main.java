public class Main {
    public static void main(String[] args) {

        int []array ={1,3,5,8,10};
        System.out.println(sumOfArr(array));
        System.out.println(findAvaregeofArr(array));
        System.out.println(findMaxOfArray(array));





    }
    public static double findAvaregeofArr(int [] arr) {
            int total=sumOfArr(arr);
            int arrayLength= arr.length;
            return (double) total/arrayLength;

    }


    public static int sumOfArr (int[] array){
        int arrayLenght=array.length;
        int total=0;
        for(int i=0;i<arrayLenght;i++){
            total+=array[i];
        } return total ;


    }
    public static int findMaxOfArray (int[] array){
        int max=array[0];
        int arrayLength=array.length;
        for(int i=0;i<arrayLength;i++){
            if(max<array[i]){
                max=array[i];
            }
        }return max ;
    }
}