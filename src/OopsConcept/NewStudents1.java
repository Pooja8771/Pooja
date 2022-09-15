package OopsConcept;

public class NewStudents1 {
    public static void main(String[] args) {
        Student s1=new Student();  // 1.creating an object.
                                   // 2.  Initializing an object means storing data into an object.
        s1.id= 100;
        s1.name="LalSingh";

        System.out.println(s1.id);
        System.out.println(s1.name);   // printing in the console.

    }
}
