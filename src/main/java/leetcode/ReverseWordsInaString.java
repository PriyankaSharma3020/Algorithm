package leetcode;

public class ReverseWordsInaString {
    public static void main(String[] args) {
        System.out.println("--"+reverseWords("example   good a")+"--");
    }
    public static String reverseWords(String s) {
        //trim front
        int start=0;
        StringBuilder s1 = new StringBuilder();
        while(start<s.length())
        {
            if(Character.isSpaceChar(s.charAt(start)))
                start++;
            else
                break;
        }
        int end = s.length()-1;
        while(end>0)
        {
            if(Character.isSpaceChar(s.charAt(end)))
                end--;
            else
                break;
        }

        //append first word in stringbuilder
        int word_start=end;
        int word_end=end;
        boolean spcae_done= false;
        char[] sArray= s.toCharArray();
        for(int i =end;i>=start;i--)
        {
            if(!Character.isSpaceChar(sArray[i])) {
                if(i==start)
                {
                    s1.append(sArray,word_start,(word_end-word_start+1));
                }
                word_start--;
                spcae_done=false;
            }
            else
            {
                s1.append(sArray,word_start+1,(word_end-word_start));
                if(!spcae_done)
                 s1.append(" ");
                spcae_done=true;
                word_end=i-1;
                word_start=i-1;
            }

        }
        return s1.toString();
        //trim back

        //use StringBuilder
    }
    }
