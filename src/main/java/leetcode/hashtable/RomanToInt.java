package leetcode.hashtable;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt ri= new RomanToInt();
        System.out.println(ri.romanToInt("LVIII"));
    }
    public int romanToInt(String s) {

        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        //return romanToIntCal(s,hm);

        return romancalCompare(s,hm);

    }

    private int romancalCompare(String s, HashMap<Character, Integer> hm) {

        char prev=s.charAt(s.length()-1);
        char curr=0;
        int total=hm.get(prev);
        for(int i=s.length()-2;i>=0;i--)
        {
            curr=s.charAt(i);
            int no=hm.get(curr);
            if(hm.get(prev)>hm.get(curr))
                total-=no;
            else
                total+=no;
            prev=curr;
        }
        return total;
    }

    public int romanToIntCal(String s, HashMap<Character, Integer> hm) {
        int final_num=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char curr=s.charAt(i);
            int no=0;
            if(hm.containsKey(curr))
            {
                switch (curr) {
                    case 'V':
                        if(i>0)
                        {
                            char prev=s.charAt(i-1);
                            no= prev=='I'?4:hm.get(curr);
                            i--;
                        }else
                            no=hm.get(curr);
                        break;
                    case 'X':
                        if(i>0)
                        {
                            char prev=s.charAt(i-1);
                            no= prev=='I'?9:hm.get(curr);
                            i--;
                        }else
                            no=hm.get(curr);
                        break;
                    case 'L':
                        if(i>0)
                        {
                            char prev=s.charAt(i-1);
                            no= prev=='X'?40:hm.get(curr);
                            i--;
                        }else
                            no=hm.get(curr);
                        break;
                    case 'C':
                        if(i>0)
                        {
                            char prev=s.charAt(i-1);
                            no= prev=='X'?90:hm.get(curr);
                            i--;
                        }else
                            no=hm.get(curr);
                        break;
                    case 'D':
                        if(i>0)
                        {
                            char prev=s.charAt(i-1);
                            no= prev=='X'?400:hm.get(curr);
                            i--;
                        }else
                            no=hm.get(curr);
                        break;
                    case 'M':
                        if(i>0)
                        {
                            char prev=s.charAt(i-1);
                            no= prev=='X'?900:hm.get(curr);
                            i--;
                        }else
                            no=hm.get(curr);
                        break;
                    case 'I':
                        no=hm.get(curr);
                        break;

                }




            }
            final_num=final_num+no;
        }
        return final_num;
    }
}
