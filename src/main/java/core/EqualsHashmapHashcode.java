package core;

import java.util.HashMap;

public class EqualsHashmapHashcode {
    public static void main(String[] args) {
        employee e1 = new employee(1,"abc");
        employee e2 = new employee(2,"def");
        //System.out.println(e1.equals(e2));
        //System.out.println(e1.hashCode()==e2.hashCode());
        HashMap<employee,String> hm = new HashMap<>();
        hm.put(e1,"e1");
        hm.put(e2,"e2");
        System.out.println(hm.toString()+" and hm size is"+hm.size());
        System.out.println("printing vals- "+hm.get(e2));
    }
}
