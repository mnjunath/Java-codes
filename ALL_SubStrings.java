// Find all substrings of a given string.

class Main {
    public static void substr(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "subString";
        substr(str);
    }
}
