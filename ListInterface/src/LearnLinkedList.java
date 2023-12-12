import jdk.jshell.MethodSnippet;

import java.util.LinkedList;
import java.util.List;
/*Methods
* add(), get(), contains(), set(), remove()
* */
public class LearnLinkedList {
    public static void main(String[] args) {
        List<Integer> number = new LinkedList<>();

        //adding elements
        number.add(12);
        number.add(54);
        number.add(75);
        System.out.println(number);

        number.add(78);

        //to retrieve elements
        System.out.println(number.get(1));
        System.out.println(number.contains(75));

        //to Update elements
        number.set(1, 45);
        System.out.println(number);

        number.remove(1);
        System.out.println(number);

    }
}
