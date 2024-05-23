package group_meeting.week29;



import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Stream;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        PalindromeLinkedList solution = new PalindromeLinkedList();

        MyLinkedList list = new MyLinkedList();
        Stream.of(1,2,2,1).forEach(list::add);
        Node head = list.head;

        System.out.println(solution.palindrome(head));

    }

    boolean palindrome(Node head){
        Deque<Integer> stack = new LinkedList<>();
        Node current = head;
        while (current != null){
            stack.push(current.id);
            current = current.next;
        }
        current = head;
        while (current != null){
            if (current.id != stack.pop()) return false;
            current = current.next;
        }
        return true;
    }
}
/*
Question-2 Palindrome Linked List
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
Example 1:
Input: head = [1, 2, 2, 1]
Output: true
Example 2:
Input: head = [1, 2]
Output: false
Constraints:
• The number of nodes in the list is in the range [1, 105
].
• 0 <= Node.val <= 9
Follow up: Could you do it in O(n) time and O(1) space?

 */