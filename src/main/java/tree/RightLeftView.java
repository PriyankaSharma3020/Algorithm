package tree;

import java.util.ArrayList;
import java.util.List;

public class RightLeftView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightView(root,res,0);
        return res;
    }
    public void rightView(TreeNode curr, List<Integer> result, int currDepth){

        if(curr==null)
            return;
        if(result.size()==currDepth)
            result.add(curr.val);
        rightView(curr.left,result,currDepth+1);
        rightView(curr.right,result,currDepth+1);

    }
}
