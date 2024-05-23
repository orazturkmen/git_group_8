package group_meeting.week29;

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
}
