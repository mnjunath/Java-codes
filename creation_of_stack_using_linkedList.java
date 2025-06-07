//   creating stack using linked list
//   In the below code I created my own stack class instead of getting it from JAVA collections.
// here are some advantages of doing so:
// 1) You control error handling, performance tweaks, or extra logging if needed.
// 2) You choose between array-based or linked list-based depending on memory needs.
// 3) Useful in embedded systems or low-level environments where memory control matters.
  

// if you want you can add your own methods to the stack and customize the stack operations.



class node{
    int data;
    node next;
    
    node (int data){
        this.data = data;
        next = null;
    }
}

class stack{
    node top;
    int non;  // number of nodes
    
    stack() {
        top = null;
        non = 0;
    }
    
    void push(int data){   //method for pusing element in stack
        node newNode = new node(data);
        newNode.next = top;
        top = newNode;
        non++;
    }
    
    int pop(){   // method to pop elements from the last
        if (top == null){
            return -1;
        }
        
        int pop_element = top.data;
        top = top.next;
        non--;
        return pop_element;
    }
    
    int count(){
        return non;
    }
}

public class Main {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.count());
        System.out.println(s.pop());
        System.out.println(s.pop()); 
        System.out.println(s.count());
        System.out.println(s.pop()); 
        System.out.println(s.pop()); 
        System.out.println(s.pop()); 

        System.out.println(s.count());
    }
}
