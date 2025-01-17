package tree;

import java.util.ArrayList;
import java.util.List;

public class MorrisPreOrderPractice {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode rl=new TreeNode(2);
        TreeNode rr=new TreeNode(3);
        root.left=rl;
        root.right=rr;
        TreeNode rll=new TreeNode(4);
        TreeNode rlr=new TreeNode(5);
        root.left.left=rll;
        root.left.right=rlr;
        root.left.right.right= new TreeNode(6);
        MorrisPreOrderPractice mi = new MorrisPreOrderPractice();
        System.out.println(mi.preorderTraversal(root));
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null)
        {
            if(curr.left==null)
            {
                preorder.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode prev = curr.left;
                while(prev.right!=null && prev.right!=curr)
                {
                    prev= prev.right;
                }
                if(prev.right==null)
                {
                    //traverse left side
                    preorder.add(curr.val);
                    prev.right=curr;
                    curr=curr.left;
                }
                else{
                    prev.right=null;
                    curr=curr.right;
                }
            }
        }
        return preorder;
    }
}
