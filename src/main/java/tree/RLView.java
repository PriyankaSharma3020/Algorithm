package tree;

import java.util.ArrayList;
import java.util.List;

public class RLView {
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
        RLView mi = new RLView();
        List<Integer> ret  =new ArrayList<>();
        System.out.println(mi.Rview(root,0,ret));
    }
    public List<Integer> Rview(TreeNode root, int level, List<Integer> ret)
    {

        TreeNode tr = root;
       // while(tr!=null)
        //{
            if(level==ret.size())
                ret.add(tr.val);
            if(tr.right!=null)Rview(tr.right,level+1, ret);
            if(tr.left!=null)Rview(tr.left,level+1, ret);

        //}
        return  ret;
    }
}
