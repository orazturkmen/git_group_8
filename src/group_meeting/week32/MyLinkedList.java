package group_meeting.week32;

public class MyLinkedList {
    Node head;
    Node tail;
    int size;
    void add(int data){
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
            size++;
        }
        else {
            tail.next = node;
            tail = node;
            size++;
        }

    }
}
