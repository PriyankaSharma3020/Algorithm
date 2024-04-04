package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamToMap {
    public static void main(String[] args) {
       // streamToMap();

        //findFirst();

        //find();

        //findDuplicate();

        sortCall();


    }

    private static void findDuplicate() {
        //find duplicate element
        // int[] arr = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34};
        List<Integer> arr = List.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        arr.stream().filter(x-> Collections.frequency(arr,x)>1)
               .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(Collections.frequency(arr,5));
    }

    private static void find() {
        String[] arr = new String[]{"Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last"};
        //find first element
        Arrays.stream(arr).reduce((x,y)->y).ifPresent(System.out::println);

        Arrays.stream(arr).sorted().forEach(System.out::println);
    }

    private static void findFirst() {
        String[] arr = new String[]{"Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last"};
        //find first element
        Arrays.stream(arr).findFirst().ifPresent(System.out::println);
    }

    private static void streamToMap() {
        //Stream to Map
        String input = "Geeks for Geek";
        String[] str=input.split(" ");
        Map<String,Integer> mp =Arrays.stream(str)
                .collect(Collectors.toMap(

                        x->x,
                        x->x.length()
                ));

        System.out.println(mp);
    }
    //sort a map
    private static void sortCall( ){
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a", 5);
        mp.put("b", 1);
        mp.put("c", 2);
        mp.put("d", 8);
        mp.put("e", 4);
         sort(mp);
    }
    private static void sort(HashMap<String,Integer> mp ){

       LinkedHashMap<String,Integer> result =  mp.entrySet().stream().sorted((a,b)->
        {
           return a.getValue().compareTo(b.getValue())==0?
           a.getKey().compareTo(b.getKey()):
           a.getValue().compareTo(b.getValue())    ;
        })
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(o, o2) -> o2,LinkedHashMap::new))
               ;
        System.out.println(result.toString());
    }
}
