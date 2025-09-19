// to check two String are Anagram



class Main {
    public static Boolean anagram(String str1, String str2) {
        int[] count = new int[26];
        
        String lower_str1 = str1.toLowerCase();
        String lower_str2 = str2.toLowerCase();
        
        for(int i = 0; i < lower_str1.length(); i++){
            int pointer = (int)lower_str1.charAt(i) - 97;
            count[pointer]++;
        }
        
        for(int i = 0; i < lower_str2.length(); i++){
            int pointer = (int)lower_str2.charAt(i) - 97;
            count[pointer]--;
        }
        
        int sum = 0;
        for(int i = 0; i < 26; i++){
            sum += count[i];
        }
        
         for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "manju";
        
        if(anagram(str1, str2)){
            System.out.println("A N A G R A M");
        }
        else {
            System.out.println("N O T  A N A G R A M");
        }
    }

}
