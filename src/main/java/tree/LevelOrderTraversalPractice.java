package tree;

import java.util.LinkedList;

public class LevelOrderTraversalPractice {
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
        LevelOrderTraversalPractice mi = new LevelOrderTraversalPractice();
        System.out.println(mi.levelOrder(root));
    }
    private static int levelOrder( TreeNode root ){

        if(root==null)
            return 0;

        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=0;
        while(q.size()!=0)
        {
            int size = q.size();
            while(size-->0)
            {
                //add to q
                TreeNode curr = q.removeFirst();
                if(curr.left!=null)
                    q.addLast(curr.left);
                if(curr.right!=null)
                    q.addLast(curr.right);
            }
            level++;
        }
        return level;
    }
}
