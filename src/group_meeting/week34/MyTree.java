package group_meeting.week34;

public class MyTree {
    TNode root;

    public MyTree() {
    }
    void insert(int val){
        TNode newNode = new TNode(val);
        if (root == null){
            root = newNode;
            return;
        }

        TNode cur = root;

        while (true){
            if (val <= cur.value){
                if (cur.leftChild == null){
                    cur.leftChild = newNode;
                    break;
                }
                cur = cur.leftChild;
            }else {
                if (cur.rightChild == null){
                    cur.rightChild = newNode;
                    break;
                }
                cur = cur.rightChild;
            }
        }
    }
}
