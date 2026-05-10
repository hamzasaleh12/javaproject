public class BST {
    Student root;

    public BST(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(Student student){
        root = recInsert(root , student); // root = 1
    }

    private Student recInsert(Student currRoot , Student student){
        if(currRoot == null) return student;

        else if (student.grade > currRoot.grade)
            currRoot.right = recInsert(currRoot.right , student); // 1 -r> 2
        else
            currRoot.left = recInsert(currRoot.left , student);

        return currRoot;
    }
}
