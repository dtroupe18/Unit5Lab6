
/*
 * Created by Dave on 1/31/17.
 */

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program solves the n queens problem. Please enter a number for n: ");
        int n = scan.nextInt();
        Queens problem = new Queens(n);

        if (!problem.solveQueens8(problem.getBoard(), 0)) {
            System.out.println("There is no solution");
        }

        else {
            problem.printSolution(problem.getBoard());
        }
    }
}
