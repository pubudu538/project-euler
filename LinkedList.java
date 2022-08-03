public class LinkedList{
    
    Node head;
    
    static class Node {
        int data;
        Node next;
        
        Node(int value){
            data = value;
            next = null;
        }
    }
    
    public static void main(String[] args) {
       
       LinkedList lk = new LinkedList();
       
       lk.head =  new Node(1);
       Node second = new Node(2);
       Node three = new Node(3);
       
       lk.head.next = second;
       second.next = three;
       


       
       while (lk.head != null) {
            System.out.print(lk.head.data + " ");
            lk.head = lk.head.next;
    }
    }
    
    
}