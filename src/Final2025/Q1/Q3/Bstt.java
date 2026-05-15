package Final2025.Q1.Q3;

public class Bstt {
    private Student root;

    public Bstt(){
        root = null;
    }

    public void insert(Student student){
        root = recInsert(root , student);
    }

    private Student  recInsert(Student currRoot, Student student) {
        if(currRoot == null){
            return student;
        }

        if(student.grade < currRoot.grade){
            currRoot.left = recInsert(currRoot.left , student);
        } else{
            currRoot.right = recInsert(currRoot.right , student);
        }

        return currRoot;
    }

    public void delete(Student student){
        recDelete(root , student);
    }

    private Student recDelete(Student currRoot, Student student) {
        if(currRoot == null){ // not found
            return null;
        }

        // searching
        if(student.grade < currRoot.grade){
            currRoot.left = recDelete(currRoot.left , student);
        } else if(student.grade > currRoot.grade){
            currRoot.right = recDelete(currRoot.right , student);
        } else{ // found
            if(currRoot.left == null && currRoot.right == null){ // leaf node
                currRoot = null;
            } else if(currRoot.left != null){
                Student temp = pred(currRoot);

                currRoot.name = temp.name;
                currRoot.id = temp.id;
                currRoot.grade = temp.grade;

                currRoot.left = recDelete(currRoot.left , temp);
            } else{
                Student temp = succ(currRoot);

                currRoot.name = temp.name;
                currRoot.id = temp.id;
                currRoot.grade = temp.grade;

                currRoot.right = recDelete(currRoot.right , temp);
            }
        }

        return currRoot;
    }

    private Student pred(Student currRoot){
        currRoot = currRoot.left;
        while(currRoot.right != null){
            currRoot = currRoot.right;
        }
        return currRoot;
    }
    private Student succ(Student currRoot){
        currRoot = currRoot.right;
        while(currRoot.left != null){
            currRoot = currRoot.left;
        }
        return currRoot;
    }
}
