// Check if a string is a valid shuffle of two other strings.

class Main {
    public static boolean valid_shuffle(String str1, String str2, String str3) {
        if(str3.length() != str1.length() + str2.length()) {
            return false;
        }
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(k < str3.length()){
            if(i < str1.length() && str1.charAt(i) == str3.charAt(k)){
                i++;
            }
            else if(j < str2.length() && str2.charAt(j) == str3.charAt(k)) {
                j++;
            }
            else {
                return false;
            }
            k++;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = "adbecf";
        
        if(valid_shuffle(str1, str2, str3)) {
            System.out.println("V A L I D  S H U F F L E");
        } else {
            System.out.println("I N V A L I D  S H U F F L E");
        }
    }
}