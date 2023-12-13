import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(52);
        set.add(65);
        set.add(42);

        System.out.println(set);

        //to Check elements
        System.out.println(set.contains(65));

        //to check elements are present or not
        System.out.println(set.isEmpty());

        //
    }
}
