package tree.again;

class Balanced{
    public static void main(String[] args) {

    }

    public int isBalancedTree(Node root){
        if(root==null)
            return 0;
        int l=isBalancedTree(root.left);
        if(l==-1)
            return -1;
        int r=isBalancedTree(root.right);
        if(r==-1)
            return -1;
        if(Math.abs(l-r)>1)
            return -1;
        else
            return Math.max(l,r)+1;


    }
}

class Node{
    Node left;
    Node right;
    int key;
    Node(int key)
    {
        this.key=key;
        left=right=null;
    }
}
