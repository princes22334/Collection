//Stack Class = Last in first Out
import java.util.Stack;
//Methods: push(), peak(), Pop()
public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.push("Dog");
        animals.push("Panther");

        System.out.println("Stack: "+animals);
        //to see which element at peak
        System.out.println(animals.peek());
        //to remove peak element
        animals.pop();
        System.out.println(animals);
        }
    }
