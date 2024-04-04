package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combination {
    public static void main(String[] args) {
        combination c = new combination();
        System.out.println(c.combine(4,2));
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res =  new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(curr,res,n,k,1);
        return res;
    }

    public void backtrack(List<Integer> curr,List<List<Integer>> res,int n,int k,int index)
    {
        if(curr.size()==k)
        {
            System.out.println("curr is:"+curr+" and res is"+res);
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i =index;i<=n;i++)
        {
            curr.add(i); //3
            System.out.println("backtrack index is"+index+" and i for loop is:"+i+" and curr has:"+curr);

            backtrack(curr,res,n,k,i+1);
            curr.remove(curr.size()-1);
        }
    }
}
