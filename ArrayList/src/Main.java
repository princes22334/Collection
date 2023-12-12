import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     /*   //Creating simple Arrays
        String[] student = new String[10];
        student[0]="Prince";
        student[0]="Akhilesh";
        student[0]="Putnam";
        System.out.println(Arrays.toString(student));*/

        //Creating arrayList
        ArrayList<Integer> student = new ArrayList<>();
        //adding names in my ArrayList
        student.add(2);
        student.add(5);
        student.add(3);
        student.add(50);    //it will add 50 at end of the line
        System.out.println(student);    //To String method inbuilt in ArrayList

        //adding data by using index
        student.add(2, 62); //it will add 62 at index 2
        System.out.println(student);

        //To add Complete new list inside old list
        List<Integer> newList = new ArrayList<>();
        newList.add(125);
        newList.add(254);

        student.addAll(newList);    //will add at end of the list
        System.out.println(student);

        //if i have to add all newList at particular position
        student.addAll(2, newList);
        System.out.println(student);

        //to Retrieve data/element from the list
        Integer index2 = student.get(2);
        System.out.println(index2);
        System.out.println(student.get(4));

        //To update elements from the List
        student.set(2, 1000);
        System.out.println(student);

        //to check elements directly by using elements
        System.out.println( student.contains(125));      //will return true or false

        //To delete/Remove element/data by using index number
        student.remove(2);
        System.out.println(student);

        //delete/remove element by using data
        student.remove(Integer.valueOf(3));
        System.out.println(student);

        //For iterating the List
        for (int element:student){
            System.out.println("ForEach Student: "+element);
        }

        //To remove complete list
        student.clear();
        System.out.println(student);
       // Note: - Big of n time complexity whenever we remove or insert any element inside it




    }
}