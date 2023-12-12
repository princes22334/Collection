import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq); //lowest will come first and highest will come last
        pq.poll(); //will remove the lowest priority value
        System.out.println(pq);
        System.out.println(pq.peek());

    }
}
