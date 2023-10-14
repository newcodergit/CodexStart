/*
 * Name: Ishan Kumar
 * Reg no : 2341011165
* PS link:https://cses.fi/paste/9cab40e50fcd5b7c70b751/
*/
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int source = 1, auxiliary = 2, target = 3;
        
        int totalMoves = (1 << n) - 1; // Calculate the total number of moves
        
        System.out.println(totalMoves);
        towerOfHanoi(n, source, auxiliary, target);
    }
 
    private static void towerOfHanoi(int n, int source, int auxiliary, int target) {
        if (n == 1) {
            System.out.println(source + " " + target);
            return;
        }
        
        // Move n-1 disks from source to auxiliary peg using target as the auxiliary peg
        towerOfHanoi(n - 1, source, target, auxiliary);
        
        // Move the nth disk from source to target
        System.out.println(source + " " + target);
        
        // Move the n-1 disks from auxiliary to target using source as the auxiliary peg
        towerOfHanoi(n - 1, auxiliary, source, target);
    }
}
