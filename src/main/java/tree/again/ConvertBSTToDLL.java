package tree.again;


import tree.zigzagtraversal;

import java.util.ArrayList;
import java.util.List;


public class ConvertBSTToDLL {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode rl=new TreeNode(2);
        TreeNode rr=new TreeNode(3);
        root.left=rl;
        root.right=rr;
        TreeNode rll=new TreeNode(4);
        TreeNode rlr=new TreeNode(5);
        root.left.left=rll;
        root.right.right=rlr;
        // root.left.right.right= new TreeNode(6);
        System.out.println(treeToDoublyList(root));
    }
    public static TreeNode treeToDoublyList(TreeNode root) {
        if(root==null)
            return null;
        List<TreeNode> ll =new ArrayList<TreeNode>();
        inOrder(root,ll);
        TreeNode rt=sortedDLL(ll);
        return rt;
    }
    public static void inOrder(TreeNode root,List<TreeNode> ll)
    {
        if(root!=null)
        {
            inOrder(root.left,ll);
            ll.add(root);
            inOrder(root.right,ll);
        }
    }
    public static TreeNode sortedDLL(List<TreeNode> ll)
    {
        TreeNode root=null;
        if(ll.size()==0)
            return null;
        for(int i=0;i<ll.size();i++)
        {
            TreeNode curr=ll.get(i);
            if(i==0)
            {
                curr.left=null;
                //curr.right=null;
            }else{
                TreeNode prev=ll.get(i-1);
                prev.right=curr;
                curr.left=prev;
            }
        }
        return ll.get(0);
    }
}
