class Node{
    int data;
    Node next;
    
    Node (int data){
        this.data = data;    //creation of node
        next = null;
    }
}

class List{
    Node head;
    Node Tail;
    int number_of_nodes;
                             // creation of list
    List(){
        head = null;
        tail = null;
        number_of_nodes = 0;
    }
    
    void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;           //append method for linked list
            number_of_nodes = 1;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            number_of_nodes += 1;
        }
    }
    
    void insertAt(int pos, int data){     //insertAt method inserts element at specified position
        Node newNode = new Node(data);
        if(head == null){
             head = newNode;
            tail = newNode;           
            number_of_nodes = 1;
            return;
        }
        if(pos >= number_of_nodes){
           tail.next = newNode;
           tail = newNode;
           number_of_nodes += 1;
           return;
        }
        if(pos <= 0){
            newNode.next = head;
            head = newNode;
            number_of_nodes++;
            return++
        }
        int ctr;
        Node curr;
        Node prev;
        for(ctr = 0, curr = null, prev = null; ctr < pos; ctr++, prev = curr, curr = curr.next);
        prev.next = newNode;
        newNode.next = curr;
        number_of_nodes++;
        return;
    }
    
    void remove(int delval){  //remove method removes the node that contains the value mentioned
        if(head == null){
            return;
        }
        int prev;
        int curr;
        prev = null;
        for(curr = head; curr != null && curr.data != delval; prev = curr, cur = curr.next);
        if(curr = null){
            return;
        }
        else if(head == tail){
            head = null;
            tail = null;
            number_of_nodes = 0;
        }
        else if(curr == head){
            head = head.next;
            number_of_nodes--;
        }
        else if(curr == tail){
            tail = prev;
            tail.next = null;
            number_of_nodes--;
        }
        else{
            prev.next = curr.next;
            number_of_nodes--;
        }
    }
    
    void removeAt(int pos){ // removes element based on position
        if(head == null){
            return;
        }
        int ctr;
        int curr;
        int prev;
        for(ctr = 0, prev = null, curr = null; ctr < pos; ctr++, prev = curr,  curr = curr.next);
        if(pos == 0){
            head = null;
            tail = null;
            number_of_nodes = 0;
        }
        else if(curr == tail){
            tail = prev;
            tail.next = null;
            number_of_nodes--;
        }
        else{
            prev.next = curr.next;
            number_of_nodes--;
        }
    }
    
    void delete(){  //deletes the complete list
        head = null;
        tail = null;
        number_of_nodes = 0;
    }
    
    void count(){  //gives number of elements in the list
        return number_of_nodes;
    }
    
     void print()  //prints the list
	 {
	    Node tref;
		for( tref =head; tref != null; tref=tref.next)
		   System.out.printf("%d ", tref.data);
	   System.out.println();
	   System.out.println();
	   
	 }
	 
}
class List_trials
{
     public static void main(String [] args)
	 {
		List b1_list = new List();
		b1_list.append(31);
		b1_list.append(10);
		b1_list.append(28);
		b1_list.append(57);
		b1_list.append(61);
		b1_list.append(21);
		b1_list.append(32);
		b1_list.append(17);
		b1_list.append(27);
		b1_list.append(33);
		b1_list.append(34);
		b1_list.append(26);
		b1_list.append(99);
		b1_list.print();
		b1_list.remove( 27 );
		b1_list.print();
		b1_list.remove( 31 );
		b1_list.print();
		b1_list.remove( 99 );
		b1_list.print();
		
		//b1_list.delete();
		
		b1_list.insertAt( 6, 55);
		b1_list.print();
		b1_list.insertAt( -6, 26);
		b1_list.print();
		b1_list.insertAt( 66, 29);
		b1_list.print();
		b1_list.removeAt ( 0);
		b1_list.print();
		b1_list.removeAt ( 4);
		b1_list.print();
		b1_list.removeAt ( 10);
		b1_list.print();
		
		b1_list.reverse();
		b1_list.print();
		
		b1_list.delete();
		b1_list.append(10);
		b1_list.append(20);
		b1_list.print();
		
		
		
		
		
		
		
		
		
		
	 }
}