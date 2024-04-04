package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class zigzagtraversal {
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
        zigzagtraversal mi = new zigzagtraversal();
        System.out.println(mi.zigzagLevelOrder(root));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>>  ret = new ArrayList<>();
        if(root==null)
            return null;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        List<Integer>  retIn1 = new ArrayList<>();
        retIn1.add(root.val);
        ret.add(retIn1);
        boolean alt=false;
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer>  retIn = new ArrayList<>();
            while(size-- >0) {
                TreeNode curr = q.removeFirst();
                if (curr.left != null) {
                    q.addLast(curr.left);
                }
                if (curr.right != null) {
                    q.addLast(curr.right);
                }
                if(alt) {
                    if (curr.left != null) {
                        retIn.add(curr.left.val);
                    }
                    if (curr.right != null) {
                        retIn.add(curr.right.val);
                    }
                }else{
                    if (curr.right != null) {
                        retIn.add(curr.right.val);
                    }
                    if (curr.left != null) {
                        retIn.add(curr.left.val);
                    }
                }
            }
           if( !retIn.isEmpty())
               ret.add(retIn);
            alt=!alt;
        }
        return ret;
    }
}
