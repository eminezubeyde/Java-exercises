public class Main {
    public static void main(String[] args) {


        String string = "((((fg)))ghfdg)))(8(hgjy)";
        char openBrackets = '(';
        char closeBrackets = ')';
        int open = 0;
        int close = 0;
        for (int i = 0; i < string.length(); i++) {
            if (openBrackets == string.charAt(i)) {
                open++;
            }
            if (closeBrackets == string.charAt(i)) {
                close++;
            }
        }
        if (open == close) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }

    }
}