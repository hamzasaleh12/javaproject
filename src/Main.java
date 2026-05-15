import BinarySearchTree.BST;
import BinarySearchTree.Student;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        Student std = new Student(1,200,"Ahmed");

        bst.insert(new Student(1,100,"Omar"));
        bst.insert(new Student(1,50,"Ibrahim"));
        bst.insert(std);

        bst.delete(std);

        System.out.println();
    }
}
