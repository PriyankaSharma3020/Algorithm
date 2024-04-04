package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListToHashMap {

    public static void main(String[] args) {

        List<Integer> lt = new ArrayList<>();
        lt.stream().collect(Collectors.toMap(x->x, x->Collections.frequency(lt,x)));

        //using method reference

    }

}
