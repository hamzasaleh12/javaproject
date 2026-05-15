package Final2025.Q1.Q3;

public class Student {
    int id;
    int grade; // key
    String name;

    Student left;
    Student right;

    public Student(int id , int grade , String name){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
