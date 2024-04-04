package tree.again;

import java.util.ArrayList;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int key;
    TreeNode(int key)
    {
        this.key=key;
        left=right=null;
    }
}
public class GetInorder {
    public static void main(String[] args) {

    }
   //inorder of tree
    public static void getInorder(TreeNode node,ArrayList<Integer> res)
    {
        if(node ==null)
            return;
        getInorder(node.left,res);
        res.add(node.key);
        getInorder(node.right,res);
    }
    //bst from sorted inorder

    public static TreeNode createBST(ArrayList<Integer> inorder,int l,int r)
    {
        if(l>r)
            return null;
        int mid=(l+r)/2;
        TreeNode root=new TreeNode(inorder.get(mid));
        root.left=createBST(inorder,l,mid-1);
        root.right=createBST(inorder,mid+1,r);
        return root;
    }

    public TreeNode balanceBST(TreeNode root)
    {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root,inorder);
        root = createBST(inorder,0,inorder.size()-1);
        return root;
    }



}
