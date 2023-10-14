/*
 * Name: Ishan Kumar
 * Reg no : 2341011165
* PS link: https://cses.fi/paste/f638dea23965b18270839b/
*/
import java.util.Scanner;
 
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        long expectedSum = (long)n * (n + 1) / 2;
        long givenSum = 0;
        
        for (int i = 0; i < n - 1; i++) {
            givenSum += scanner.nextInt();
        }
        
        long missingNumber = expectedSum - givenSum;
        System.out.println(missingNumber);
        
        scanner.close();
    }
