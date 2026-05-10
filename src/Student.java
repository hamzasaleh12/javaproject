public class Student {
    int id;
    int grade;
    String name;
    Student right;
    Student left;

    public Student(int id, int grade, String name) {
        this.id = id;
        this.grade = grade;
        this.name = name;
    }
}
