/*
 * Name: Ishan Kumar
 * Reg no : 2341011165
* PS link: https://cses.fi/paste/1ab115f0d6af5f0d70b395/
*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
 
        Set<String> resultSet = new TreeSet<>(); // Use a TreeSet to store strings in alphabetical order
        generatePermutations(input, "", resultSet);
 
        System.out.println(resultSet.size());
        for (String result : resultSet) {
            System.out.println(result);
        }
    }
 
    private static void generatePermutations(String input, String current, Set<String> resultSet) {
        if (input.length() == 0) {
            resultSet.add(current);
        } else {
            for (int i = 0; i < input.length(); i++) {
                String newInput = input.substring(0, i) + input.substring(i + 1);
                generatePermutations(newInput, current + input.charAt(i), resultSet);
            }
        }
    }
}
