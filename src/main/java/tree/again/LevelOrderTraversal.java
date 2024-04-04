package tree.again;

import tree.zigzagtraversal;

import java.util.*;

public class LevelOrderTraversal {
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
        System.out.println(zigzagLevelOrder(root));
    }
    public static  List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> q =new LinkedList();
        List<List<Integer>> res = new ArrayList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty())
        {
            int sz =q.size();
            List<Integer> lt = new ArrayList<>();
            for(int i =0;i<sz;i++)
            {
                TreeNode r = q.poll();
                lt.add(r.key);
                if(r.left!=null)
                    q.add(r.left);
                if(r.right!=null)
                    q.add(r.right);
            }
            if(flag)
                res.add(lt);

            else {
                Collections.reverse(lt);
                res.add(lt);
            }
            flag=!flag;
        }
        return res;
    }
}
