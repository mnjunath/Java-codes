// Rotate a string by k positions.

class Main {
    public static String leftRotate(String str, int pos) {
        int n = str.length();
        pos = pos % n; 
        return str.substring(pos) + str.substring(0, pos);
    }

    public static String rightRotate(String str, int pos) {
        int n = str.length();
        pos = pos % n; 
        return str.substring(n - pos) + str.substring(0, n - pos);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        int pos = 2;

        System.out.println("Left Rotation: " + leftRotate(str, pos));
        System.out.println("Right Rotation: " + rightRotate(str, pos));
    }
}
