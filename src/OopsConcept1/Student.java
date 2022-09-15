package OopsConcept1;

public class Student {
    int id;
    String name;
    float Salary;

    public void insert(int id, String name, float Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    public void display() {
        System.out.println(id + " " + name + " " + Salary);
    }
}