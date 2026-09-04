package Day1;

public class KerprekarNumber {
    
    public static void main(String[] args) {
        int num = 45;
        int square = num * num;
        String str = String.valueOf(square);
        int len = str.length();

        for(int i = 1; i < len; i++) {
            String leftPart = str.substring(0,i);
            String rightPart = str.substring(i);
            int left=Integer.parseInt(leftPart);
            int right=Integer.parseInt(rightPart);
            if(left + right == num) {
                System.out.println(num + " is a Kaprekar number");
                return;
            }
        }
    }
}