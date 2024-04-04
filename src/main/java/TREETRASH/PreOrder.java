package TREETRASH;

public class PreOrder {
    public static void main(String[] args) {
        PreOrder pr = new PreOrder();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        pr.preorder(root);
    }

    public void preorder(Node root)
    {
        if(root==null)
            return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right)   ;
    }


}
class Node{
    Node left;
    Node right;
    int val;

    Node(int val)
    {
        this.val = val;
    }

}
