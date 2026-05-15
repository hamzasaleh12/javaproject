package BinarySearchTree;

public class BST {
    Student root;

    public BST(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(Student student){
        root = recInsert(root , student);
    }

    private Student recInsert(Student currRoot , Student student){
        if(currRoot == null) return student;

        else if (student.grade > currRoot.grade)
            currRoot.right = recInsert(currRoot.right , student); // 1 -r> 2
        else
            currRoot.left = recInsert(currRoot.left , student);

        return currRoot;
    }

    public void delete(Student student){
        recDelete(root , student);
    }

    private Student recDelete(Student currRoot , Student student){
        // base case
        if(currRoot == null) return null;

            // searching
        else if (student.grade > currRoot.grade)
            currRoot.right = recDelete(currRoot.right , student);
        else if(student.grade < currRoot.grade)
            currRoot.left = recDelete(currRoot.left , student);
        else{ // node found
            if(currRoot.right == null && currRoot.left == null){
                currRoot = null;
            } else if(currRoot.right != null){
                Student temp = successor(currRoot);

                currRoot.grade = temp.grade;
                currRoot.id = temp.id;
                currRoot.name = temp.name;

                currRoot.right = recDelete(currRoot.right , temp);
            } else{
                Student temp = predecessor(currRoot);

                currRoot.grade = temp.grade;
                currRoot.id = temp.id;
                currRoot.name = temp.name;

                currRoot.left = recDelete(currRoot.left , temp);
            }
        }
        return currRoot;
    }

    private Student predecessor(Student currRoot) {
        currRoot = currRoot.left;
        while(currRoot.right != null){
            currRoot = currRoot.right;
        }
        return currRoot;
    }

    private Student successor(Student currRoot) {
        currRoot = currRoot.right;
        while(currRoot.left != null){
            currRoot = currRoot.left;
        }
        return currRoot;
    }

    private void traverse(Student root){
        if(root == null) return;

        //System.out.println(root.grade); // preorder
        traverse(root.left);
        System.out.println(root.grade); // inorder
        traverse(root.right);
        //System.out.println(root.grade); // postorder
    }
}