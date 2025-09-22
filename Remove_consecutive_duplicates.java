// Remove consecutive duplicates in a string.

class Main {
    public static String remove_dup(String str) {
        if(str.length() == 0) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder("");
        sb.append(str.charAt(0));
        
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)){
                sb.append(str.charAt(i));
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = "aaabbbcccddddddd";
        System.out.println(remove_dup(str));
    }
}