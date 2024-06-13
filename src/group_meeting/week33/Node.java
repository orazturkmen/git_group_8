package group_meeting.week33;

public class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public void print() {
        Node current = this;

        while (current != null) {
            System.out.print(current);
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return val + " -> ";
    }
}
