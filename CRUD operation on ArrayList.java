// CRUD operations on ArrayList

import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //adding elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        
        //get elements
        int el = list.get(1);
        System.out.println(el);
        
        //add element in between
        list.add(1, 1);
        System.out.println(list);
        
        //set element
        list.set(0, 5);
        System.out.println(list);
        
        //remove an element
        list.remove(3);
        System.out.println(list);
        
        //size of arraylist
        int size = list.size();
        System.out.println(size);
        
        //sort
        Collections.sort(list);
        
        //loops
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}