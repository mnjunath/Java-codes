//You are given a function, 
//Int FindSumOfRemainder(int n, int div); 
//The function take two integers ‘n’ and ’div’ as input implement the function 
//such that it retunes the sum of remainders given by numbers from 1 to ‘n’ 
//(both inclusive) on being divided by ‘div’ 
//Example: Input: 
//12 
//4 
//Output: 
//18 
//Explanation: 
//The sum of remainders left by numbers from 1 and 12 on being divided by 4 is 
//1+2+3+0+1+2+3+0+1+2+3+0=18 
//Sample Input: 
//n1 15 
//n2 5 
//Sample Output: 
//30 



import java.util.Scanner; 
class MAin{ 
public static void main(String [] args){ 
Scanner kbd = new Scanner (System.in); 
int num = kbd.nextInt(); 
int div = kbd.nextInt(); 
System.out.println(sum_of_remainders(num, div)); 
    } 
     
    public static int sum_of_remainders(int n, int d){ 
        int index; 
        int sum = 0; 
        for(index = 1; index <= n; index++){ 
            sum += index % d; 
        } 
         
        return sum; 
    } 
}