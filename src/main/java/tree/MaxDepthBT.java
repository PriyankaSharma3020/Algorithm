package tree;

import java.util.LinkedList;

public class MaxDepthBT {
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
        MaxDepthBT mi = new MaxDepthBT();
        System.out.println(mi.maxDepth(root));
    }

    public int maxDepth(TreeNode root)
    {
        int level=0;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        while(!q.isEmpty())
        {
           int size =q.size();
            while(size-- >0)
            {
                TreeNode curr = q.removeFirst();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            level++;
        }
        return level;
    }
}
