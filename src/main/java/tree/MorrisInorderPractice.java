package tree;

import java.util.ArrayList;
import java.util.List;

public class MorrisInorderPractice {
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
        MorrisInorder mi = new MorrisInorder();
        System.out.println(mi.inorderTraversal(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr= root;
        List<Integer> inorder = new ArrayList<>();
        while(curr!=null)
        {
            if(curr.left==null)
            {
                inorder.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode prev= curr;
                while(prev.right!=null&& prev.right!=curr)
                {
                    prev=prev.right;
                }
                if(prev.right==null)
                {
                    //traverse left side
                    prev.right=curr;
                    curr=curr.left;
                }else{
                    //left side already traversed, traverse right side
                    prev.right=null;
                    inorder.add(curr.val);
                    curr=curr.right;
                }

            }

        }
        return inorder;
    }
}
