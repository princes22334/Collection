import java.util.Set;
import java.util.TreeSet;
public class LearnTreeSet {
    public static void main(String[] args) {
        //it maintains Order in a sorted form
        //it doesn't allow duplicate values
        Set<Integer> set = new TreeSet<>();
        //adding elements in TreeSet
        set.add(52);
        set.add(65);
        set.add(63);
        set.add(89);
        set.add(32);
        System.out.println(set);    //will generate output in sorted form

        //to retrieve the elements
        boolean contains = set.contains(63);
        System.out.println(contains);

        //To check total no of elements in TreeSet
        System.out.println(set.size());

        //To delete/remove element
        boolean remove = set.remove(63);
        System.out.println(remove);
    }
}
