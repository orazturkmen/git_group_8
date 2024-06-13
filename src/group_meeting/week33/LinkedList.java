package group_meeting.week33;

import java.util.stream.Stream;

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Stream.of(1,2,3,4,5,6,7,8,9).forEach(list::add);
        list.printNode();
        delete(list,2,3).printNode();

        MyLinkedList list2 = new MyLinkedList();
        Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14).forEach(list2::add);
        list2.printNode();
        delete(list2,2,3).printNode();
//        while (list.head != null){
//            System.out.println(list.head.val);
//            list.head = list.head.next;
//        }


        Node head = new Node(1);
        Node cur = head;
        for (int i = 2; i < 15; i++) {
            cur.next = new Node(i);
            cur = cur.next;
        }
        head.print();
        deleteNodes(head,2,3);
        head.print();
    }

    public static MyLinkedList delete(MyLinkedList list, int m, int n){
        Node cur = list.head;
        Node lastM = list.head;

        while (cur != null){
            int mCount = m, nCount = n;

            while (cur != null && mCount != 0){
                lastM = cur;
                cur = cur.next;
                mCount--;
            }

            while (cur != null && nCount != 0){
                cur = cur.next;
                nCount--;
            }

            lastM.next = cur;
        }

        return list;
    }

    public static Node deleteNodes(Node head, int m, int n) {
        Node current = head;
        Node lastM = head;
        while (current != null) {
            int mCount = m, nCount = n;
            while (current != null && mCount != 0) {
                lastM = current;
                current = current.next;
                mCount--;
            }
            while (current != null && nCount != 0) {
                current = current.next;
                nCount--;
            }
            lastM.next = current;
        }
        return head;
    }

}
/*
Question-2 Delete N Nodes After M Nodes
You are given the head of a linked list and two integers m and n. Traverse the linked list and remove some
nodes in the following way:
• Start with the head as the current node.
• Keep the first m nodes starting with the
current node.
• Remove the next n nodes.
• Keep repeating steps 2 and 3 until you
reach the end of the list.
Return the head of the modified list after
removing the mentioned nodes
 */