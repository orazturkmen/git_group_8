package group_meeting.week35;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree1 = new MyTree();
        Stream.of(1, 2, 3).forEach(tree1::insert);
        VisualizeTree.printTree(tree1.root, null, false);
        tree1.inOrder(tree1.root);

        System.out.println("*************************************************");

        System.out.println(inorderTraversal(tree1.root));
    }

    public static List<Integer> inorderTraversal(TNode root) {
        List<Integer> res = new ArrayList<>();

        inorder(root, res);
        return res;
    }

    private static void inorder(TNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.leftChild, res);
        res.add(node.value);
        inorder(node.rightChild, res);
    }
}
/*
Question-1 Binary Tree Inorder Traversal
Given the root of a binary tree, return the inorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2: Example 3:
Input: root = [] Input: root = [1]
Output: [] Output: [1]
Constraints:
• The number of nodes in the tree is in the range [0, 100].
• -100 <= Node.val <= 100
Follow up: Recursive solution is trivial, could you do it iteratively?
 */