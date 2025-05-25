import java.util.Scanner; 
class Main{ 
	public static void main(String [] args){ 
		Scanner kbd = new Scanner(System.in); 
		int a = kbd.nextInt(); 
		int b = kbd.nextInt(); 
		int start = Math.min(a,b); 
		int end = Math.max(a,b); 
		int sum = 0; 
		for (int i = start; i <= end; i++){ 
			if(is_nobit_number(i)){ 
				sum += i; 
			} 
		} 
		System.out.println(sum); 
	} 
	public static boolean is_nobit_number(int num){ 
		int prev_digit = num % 10; 
		num = num / 10; 
		while(num > 0){ 
			int current_digit = num % 10; 
			if(Math.abs(current_digit - prev_digit) != 1){ 
                		return false; 
            		} 
            		prev_digit = current_digit; 
            		num /= 10; 
        	} 
        	return true; 
    	} 
} 