public class Main {
    public static void main(String[] args) {


        String[] arr = {"10100", "11100"};
        String output = " ";
        for (int i = 0; i < 5; i++) {
            if ((arr[0].charAt(i)== '1')&& (arr[1].charAt(i) =='1')) {
                output +="1";


            } else {
                output += "0";
            }
        }

        System.out.println(output);

    }
}