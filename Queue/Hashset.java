package Queue;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        System.out.println(" " + set);
        System.out.println("set size is -" + set.size());

        // if( set.contains(10)){
        // System.out.println("yes it containing - ");
        // }

        // set.remove(10);
        // System.out.println(" "+set);

        // iterator
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
