package group_meeting.week27;

public class MyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }


    void add(int n){
        Node node = new Node(n);
        if (isEmpty()) {
            head = tail = node;
            size++;
        }else {
            tail.next = node;
            tail = node;
            size++;
        }
    }
}
