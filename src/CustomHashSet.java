import java.util.HashSet;
import java.util.Set;

public class CustomHashSet {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Prince",25 ));
        students.add(new Student("Rahul", 56));
        students.add(new Student("Joy", 45));
        System.out.println(students);//Will Print object of students

        for (Student data:students){
            System.out.print(data.getName()+" ");
            System.out.println(data.getRollNumber());
        }
    }}
