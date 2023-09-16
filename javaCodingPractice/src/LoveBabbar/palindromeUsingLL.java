package LoveBabbar;
/*
* Interview Question: Using Linked List, figure out if a string is a palindrome or not. Create the LL from scratch.
* Return 1, if it's a palindrome.
* Return 0, if it's not.
* */
import java.util.Stack;

public class palindromeUsingLL {
    static class SinglyLinkedListNode {
        public char data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(char nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }


    }
    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep){
        while (node != null) {
//            System.out.print(node.data);
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
//        System.out.println();
    }
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, char data) {
        if (head == null){
            head = new SinglyLinkedListNode(data);
        }
        else {
            SinglyLinkedListNode node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new SinglyLinkedListNode(data);
        }
        return head;
    }
    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        String s = "RADAR";
        int llistCount = s.length();

        for (int i = 0; i < llistCount; i++) {
            char llistItem = s.charAt(i);
            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
            llist.head = llist_head;
        }
//        printSinglyLinkedList(llist.head, " -> ");

        int result = palindrome(llist.head);
        System.out.println("RESULT: " + result);

    }

    private static int palindrome(SinglyLinkedListNode head) {
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        Stack<Character> stack = new Stack<>();
        while(fast!=null){
//            System.out.println("slow data: "+slow.data);
//            System.out.println("fast data: "+fast.data);
            stack.push(slow.data);
//            System.out.println("Stack: "+ stack.peek());
            slow = slow.next;
            if(fast.next == null){
                break;
            }
            fast = fast.next.next;

        }
//        System.out.println("---------------------");

        if(fast == null){ // Even number of elements
            while(slow.next!=null){
                if(!stack.pop().equals(slow.data)){
                    return 0;
                }
                slow=slow.next;
            }
        } else { //Odd number of elements
            // since there exists odd number of elements, and if the string is a palindrome then middle element (the one
            // on top of the stack) will only be one, so need to compare it. So, lets pop it out.
            stack.pop();
//            System.out.println("slow init: "+slow.data);
            while(slow.next!=null){
//                System.out.println("popped:"+stack.peek());
//                System.out.println("slow.data: "+slow.data);
                if(!stack.pop().equals(slow.data)){
                    return 0;
                }
                slow=slow.next;
            }
        }
        return 1;
    }
}
