package leetcode.string;

public class prefix {
    public static void main(String[] args) {
        prefix pf = new prefix();
        String fl = pf.longestCommonPrefix(new String[]{"flow","flower","flon"});
        System.out.println(fl);
    }
    public String longestCommonPrefix(String[] strs) {
        String assume = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(assume)!=0)
            {
                assume=assume.substring(0,assume.length()-1);
            }
            if(assume.length()==0)
                return "";
        }
        return assume;
    }
}
