//Climbing Stairs problem 
//This is an basic Dynamic programming problem 
//the problem is based on fibonacci series  
//LeetCode problem number 70



import java.util.Scanner;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stairs (n): ");
        int n = scanner.nextInt();
        int ways = climbStairs(n);
        System.out.println("Number of distinct ways to climb to the top: " + ways);
    }
}
