/*
 * Name: Ishan Kumar
 * Reg no : 2341011165
* PS link: https://cses.fi/paste/4a29f3b029195bb070b1e6/
*/
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        
        long moves = 0;
        int min = array[0];
 
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                moves += (min - array[i]);
            } else {
                min = array[i];
            }
        }
 
        System.out.println(moves);
    }
}
