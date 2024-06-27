package group_meeting.week35;

public class MyTree {
    TNode root;
    public MyTree() {
    }

    void insert(int data){
        TNode node = new TNode(data);
        if (root == null) {
            root = node;
            return;
        }

        TNode cur = root;

        while (true){
            if (data <= root.value){
                if (cur.leftChild == null){
                    cur.leftChild = node;
                    break;
                }
                cur = cur.leftChild;
            }else {
                if (cur.rightChild == null){
                    cur.rightChild = node;
                    break;
                }
                cur = cur.rightChild;
            }
        }
    }

    void inOrder(TNode root){
        if (root == null) return;
        inOrder(root.leftChild);
        System.out.print(root.value + ", ");
        inOrder(root.rightChild);
    }
}
