import java.util.ArrayDeque;
import java.util.List;
import java.util.Vector;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(30);
        adq.offerFirst(15); //will add element at first
        adq.offerLast(45);
        adq.offer(26);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("Poll() "+adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst(): "+adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast(): "+adq);
    }
}
