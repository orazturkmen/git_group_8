package group_meeting.week28;

public class Node {
    int id;
    Node next;

    public Node(int id) {
        this.id = id;
    }

    public Node(int id, Node next) {
        this.id = id;
        this.next = next;
    }

    void printList(){
        Node current = this;
        while (current != null){
            if (current.next == null) System.out.println(current.id + "=> null");
            else System.out.print(current.id +"=> ");
            current = current.next;
        }
    }
}
