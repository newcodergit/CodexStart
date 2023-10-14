/*
 * Name: Ishan Kumar
 * Reg no : 2341011165
* PS link: https://cses.fi/paste/2679ac6a245ff60b70b258/
*/
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
 
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
 
        System.out.println(count);
    }
