package group_meeting.week34;

import java.util.stream.Stream;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] n1 = new int[]{6,2,8,0,4,7,9,3,5};
        for (int i = 0; i < 9; i++) {
            tree.insert(n1[i]);
        }

        MyTree tree2 = new MyTree();
        Stream.of(2,1).forEach(tree2::insert);

//        VisualizeTree.printTree(tree.root,null,false);

        TNode p = new TNode(2);
        TNode q = new TNode(8);

        System.out.println(lowestCommonAncestor(tree.root, p, q).value);
        System.out.println(lowestCommonAncestor(tree.root, new TNode(2), new TNode(4)).value);
        System.out.println(lowestCommonAncestor(tree2.root, new TNode(2), new TNode(1)).value);

    }

    public static TNode lowestCommonAncestor(TNode root, TNode p, TNode q){
        int small = Math.min(p.value, q.value);
        int large = Math.max(p.value, q.value);

        while (root != null){
            if (root.value > large) root = root.leftChild;
            else if (root.value < small) root = root.rightChild;
            return root;
        }
        return null;
    }
}
