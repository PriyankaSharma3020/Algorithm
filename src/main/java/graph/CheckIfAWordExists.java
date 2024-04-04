package graph;

public class CheckIfAWordExists {
    public static void main(String[] args) {
        char grid[][] = { "axmy".toCharArray(),
                "bgdf".toCharArray(),
                "xeet".toCharArray(),
                "raks".toCharArray() };

        // Function to check if word exists or not
        if (checkGrid(grid, "geeks"))
            System.out.print("Yes");
        else
            System.out.print("No");

    }
    public static boolean checkGrid(char[][] grid,String input)
    {
        int index=0;
        //keep visited as same
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j]==input.charAt(index))
                {
                    boolean ret = dfs(grid,index,input,i,j);
                    if(ret)return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] grid, int index, String input, int i, int j) {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length)
            return false;
        if(index==input.length())
            return true;
        if(index>input.length()||grid[i][j]!=input.charAt(index))
            return false;

        char temp = grid[i][j];
        grid[i][j]='#';
        boolean res =  dfs(grid,index+1,input,i+1,j)
        || dfs(grid,index+1,input,i-1,j)
        || dfs(grid,index+1,input,i,j+1)
        || dfs(grid,index+1,input,i,j-1);
        grid[i][j]=temp;
        return res;
    }

}
