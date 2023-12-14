import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
    public static void main(String[] args) {
        //LinkedHashSet maintains order of insertion
        //to Add elements in LinkedHashSet
        Set<Integer> set = new LinkedHashSet<>();
        set.add(25);
        set.add(45);
        set.add(65);
        set.add(69);
        set.add(24);
        System.out.println(set);

        //to retrieve data from LinkedHashSet
        System.out.println(set.contains(69));

        //to check no of elements in Linked List
        System.out.println(set.size());

        //to delete particular element
        set.remove(69);

        //to delete all elements
        set.clear();
        System.out.println(set);
}
}