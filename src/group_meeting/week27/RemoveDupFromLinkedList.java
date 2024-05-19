package group_meeting.week27;

import java.util.stream.Stream;

public class RemoveDupFromLinkedList {
    public static void main(String[] args) {
        RemoveDupFromLinkedList solution = new RemoveDupFromLinkedList();
        MyLinkedList list = new MyLinkedList();
        Stream.of(1,1,2).forEach(list::add);
        Node head = solution.twoPointer(list.head);
        head.printList();

        MyLinkedList list2 = new MyLinkedList();
        Stream.of(1,1,2,2,3,3,5,5,6,6,8).forEach(list2::add);
        Node head2 = solution.twoPointer(list2.head);
        head2.printList();
    }

    public Node twoPointer(Node head){
        if ( head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head.next;
        while (fast.next != null){
            if (slow.id == fast.id){
                fast = fast.next;
                slow.next = fast;
            }else {
                slow = fast;
                fast = fast.next;
            }
        }
        return head;
    }
}
/*
Question-2 Remove Duplicates From Linked List
You're given the head of a Singly Linked List whose nodes are in sorted order with respect to their values.
Write a function that returns a modified version of the Linked List that doesn't contain any nodes with
duplicate values. The Linked List should be modified in place (i.e., you shouldn't create a brand-new list), and
the modified Linked List should still have its nodes sorted with respect to their values. Each LinkedList node
has an integer value as well as a next node pointing to the next node in the list or to None / null if it's the tail
of the list.
Example 1:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
Example:
Input: [1, 1, 3, 4, 4, 4, 5, 6, 6] // the head node with value 1
Output: [1, 3, 4, 5, 6] // the head node with value 1
Constraints:
• The number of nodes in the list is in the range [0, 300].
• -100 <= Node.val <= 100
• The list is guaranteed to be sorted in ascending order.
 */