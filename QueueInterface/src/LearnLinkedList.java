import java.util.LinkedList;
import java.util.Queue;

/*Methods
offer(), poll(), peak()*/


public class LearnLinkedList {
    public static void main(String[] args) {
        //Creating Queue Object
        Queue<Integer> queue = new LinkedList<>();

        //adding elements in queue
        queue.offer(12);
        queue.offer(65);
        queue.add(25);
        System.out.println(queue);

        //to delete queue element
        queue.poll();   //it will remove the first element same like ticket counter
        System.out.println(queue);

        //which next element will poll
        System.out.println(queue.peek());


    }
}
