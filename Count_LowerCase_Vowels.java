//count how many times lowercase vowels occured in a string entered by the user

import java.util.Scanner;
class Main {
    public static int count(String str){
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(Character.isLowerCase(ch) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String user_input = sc.nextLine();
        
        System.out.println(count(user_input));
    }
}