package group_meeting.week29;

public class MyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }

    void add(int data){
        Node node = new Node(data);
        if (isEmpty()){
            head = tail = node;
            size++;
        }else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void printList(){
        Node current = head;
        while (current != null){
            if (current.next == null) System.out.println(current.id + "=> null");
            else System.out.print(current.id + "=> ");
            current = current.next;
        }
    }


}
