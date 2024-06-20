package group_meeting.week32;

public class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
    void print(){
        Node cur = this;
        while (cur != null){
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println();
    }
}
