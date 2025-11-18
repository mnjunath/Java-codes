// Tower of Hanoi using recursion

class Main {
    public static void TowerOfHanoi(int n, String src, String helper, String dist){
        if(n == 1){
            System.out.println("Transfer disc " + n + " from " + src + " to " + dist);
            return;
        }
        
        TowerOfHanoi(n - 1, src, dist, helper);
        System.out.println("Transfer disc " + n + " from " + src + " to " + helper);
        TowerOfHanoi(n - 1, helper, src, dist);
    }
    
    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi(n, "A", "B", "C");
    }
}