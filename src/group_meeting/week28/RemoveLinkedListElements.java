package group_meeting.week28;

import java.util.stream.Stream;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Stream.of(1,2,6,3,4,5,6).forEach(list::add);
        list.head.printList();
        list.removeElements(6);
        list.head.printList();
        list.removeElements(6);
        list.head.printList();
        System.out.println("****************************************************");


        RemoveLinkedListElements solution = new RemoveLinkedListElements();
        MyLinkedList list2 = new MyLinkedList();
        Stream.of(1,2,3,1,4,1,5,1).forEach(list2::add);
        list2.head.printList();
        Node head2 = solution.twoPointer(list2.head,1);
        head2.printList();
    }

    public Node twoPointer(Node head,int remove){
        if (head == null) return null;
        Node prev = head;
        Node current = head;
        while (current != null){
            if (current.id == remove){
                if (current == head){
                    current = current.next;
                    head = current;
                    prev = current;
                }else {
                    current = current.next;
                    prev.next = current;
                }
            }else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

}
/*
Question-1 Remove Linked List Elements
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has
Node.val == val, and return the new head.
Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:
Input: head = [], val = 1
Output: []
Example 3:
Input: head = [7,7,7,7], val = 7
Output: []
Constraints:
• The number of nodes in the list is in the range [0, 10^4].
• 1 <= Node.val <= 50
• 0 <= val <= 50
 */