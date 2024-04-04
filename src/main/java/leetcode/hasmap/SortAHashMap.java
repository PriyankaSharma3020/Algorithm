package leetcode.hasmap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortAHashMap {
    public static void main(String[] args) {
        //sort a hashmap based on values
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(1, 5);
        mp.put(2, 1);
        mp.put(3, 2);
        mp.put(4, 8);
        mp.put(5, 4);
        //immutable list below
        List<Integer> vals = mp.values().stream().toList();
        // vals.sort((a,b)->{
        //     return a>b?1:(a==b?0:-1);
        //});

        Stream<Map.Entry<Integer, Integer>> sorted = mp.entrySet().stream().sorted((e1, e2) ->
        {
            return e1.getValue().compareTo(e2.getValue());
        });
        sorted.forEach(e -> System.out.println(e));


    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap, final boolean order) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());
        list.sort((a,b)->{
            return a.getValue().compareTo(b.getValue())==0?a.getKey().compareTo(b.getKey()):a.getValue().compareTo(b.getValue());
        });
        return list.stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(a,b)->b, LinkedHashMap<String,Integer>::new));

    }
}