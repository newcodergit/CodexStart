/*
 * Name: Ishan Kumar
 * Reg no : 2341011165
* PS link: https://cses.fi/paste/f0e8807940e713527094d3/
*/
 import java.util.Scanner;
public class repitition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Sequence = scanner.next();
        int lr = flr(Sequence);
        System.out.println(lr);
    }
 
    public static int flr(String Sequence) {
        int maxLength = 0;
        int currentLength = 1;
 
        for (int i = 1; i < Sequence.length(); i++) {
            if (Sequence.charAt(i) == Sequence.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
 
        maxLength = Math.max(maxLength, currentLength);
 
        return maxLength;
    }
}
 
