import java.util.HashSet;
import java.util.Set;
public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(24);
        set.add(21);
        set.add(65);
        System.out.println(set);
        //it is not going to allow duplicate values
        set.add(24);
        System.out.println(set);        //duplicate value not added

        //for retrieving elements
        boolean contains = set.contains(32);
        System.out.println(contains);

        //To check elements are present or not
        System.out.println(set.isEmpty());

        //to know the size of the elements
        System.out.println(set.size());

        //for deleting/removing elements
        set.remove(24);
        System.out.println(set);

        //to Delete all elements
        set.clear();
        System.out.println(set);
    }
}
