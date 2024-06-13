package group_meeting.week33;

public class MyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }

    void add(int n){
        Node node = new Node(n);
        if (isEmpty()){
            head = tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void printNode(){
        Node current = head;
        while (current != null){
            if (current.next == null) System.out.println(current.val + "=> null");
            else System.out.print(current.val + "=> ");
            current = current.next;
        }
    }
}
