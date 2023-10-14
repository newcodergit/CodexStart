/*
 * Name: Ishan Kumar
 * Reg no : 2341011165
* PS link: https://cses.fi/paste/643ef699f5b2e7ea70b6c9/
*/
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getGrayCode(n);
    }
 
    private static void getGrayCode(int n) {
        if (n <= 0) {
            return;
        }
 
      
        String[] grayCode = new String[]{"0", "1"};
 
        
        for (int i = 2; i <= n; i++) {
            String[] newGrayCode = new String[2 * grayCode.length];
 
            
            for (int j = 0; j < grayCode.length; j++) {
                newGrayCode[j] = "0" + grayCode[j];
            }
 
            
            for (int j = grayCode.length - 1, k = 0; j >= 0; j--, k++) {
                newGrayCode[k + grayCode.length] = "1" + grayCode[j];
            }
 
            grayCode = newGrayCode;
        }
 
        
        for (String code : grayCode) {
            System.out.println(code);
        }
    }
}
