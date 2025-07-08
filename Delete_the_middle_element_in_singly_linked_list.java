//Code to Delete the middle element of a Singly Linked List
//This is also a Leet Code question (Question number 2095)


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DeleteMiddleNode {

    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null)
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 7, 1, 2, 6};

        System.out.println("Original List:");
        ListNode head = createList(input);
        printList(head);

        head = deleteMiddle(head);

        System.out.println("After Deleting Middle Node:");
        printList(head);
    }
}
