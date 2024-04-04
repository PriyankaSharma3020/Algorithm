package tree.again;

import tree.LowestCommonAncestor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversalWithStack {
    public static void main(String[] args) {

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> output = new LinkedList();
        if(root==null)
            return output;

        //no recursion use stack intsead
        Stack<TreeNode> st= new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode curr=st.pop();
            output.addFirst(curr.key);
            if(curr.left!=null)st.push(curr.left);
            if(curr.right!=null) st.push(curr.right);
        }
        return output;
    }
}
