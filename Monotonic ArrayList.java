// Monotonic ArrayList

import java.util.ArrayList;

class Main {
    public static boolean isMonotonic(ArrayList<Integer> A){
        boolean inc = true;
        boolean dec = true;
        for(int i = 0; i < A.size() - 1; i++){
            if(A.get(i) > A.get(i + 1)){
                inc = false;
            }
            if(A.get(i) < A.get(i + 1)){
                dec = false;
            }
        }
        
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        
        A.add(5);
        A.add(4);
        A.add(3);
        A.add(3);
        A.add(2);
        
        System.out.println(isMonotonic(A));
    }
}