/*
 * Name: Ishan Kumar
 * Reg no : 2341011165
* PS link: https://cses.fi/paste/de47d3a55f463bdb70b105/
*/
import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int k = 1; k <= n; k++) {
            long result = ways(k);
            System.out.println(result);
        }
    }

    private static long ways(int n) {
        long nSq = (long) n * n;
        long ways = (nSq * (nSq - 1)) / 2 - 4 * (n - 1) * (n - 2);
        return ways;
    }
}

    

