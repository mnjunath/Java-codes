//Find lonely numbers in an ArrayList

import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = 1; i < nums.size() - 1; i++){
            if(nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)){
                result.add(nums.get(i));
            }
        }
        
        if(nums.size() == 1){
            result.add(nums.get(0));
        }
        if(nums.size() > 1){
            if(nums.get(0) + 1 < nums.get(1)){
                result.add(nums.get(0));
            }
            if(nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)){
                result.add(nums.get(nums.size() - 1));
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        
        System.out.println(findLonely(nums));
    }
}