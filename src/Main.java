import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        HighArray arr = new HighArray(5);
//        arr.insert(1); // 0
//        arr.insert(20); // 1
//        arr.insert(3);
//        arr.insert(40);
//        arr.insert(0); // 2
//
//        arr.mergeSort();
//        arr.display();
//
        BST bst = new BST();
        bst.insert(new Student(5,500,"omar"));
        bst.insert(new Student(10,200,"omar"));
        bst.insert(new Student(1,300,"omar"));
        System.out.println();



//        System.out.println("=== 🛡️ 1. TESTING STACK (LIFO) ===");
//        Stack myStack = new Stack();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println("Stack after 3 pushes: " + myStack);
//        System.out.println("Peek: " + myStack.peek());
//        System.out.println("Pop: " + myStack.pop());
//        System.out.println("Stack after 1 pop: " + myStack);
//        System.out.println();
//
//        System.out.println("=== 🛡️ 2. TESTING QUEUE (FIFO) ===");
//        Queue myQueue = new Queue();
//        myQueue.offer(100);
//        myQueue.offer(200);
//        myQueue.offer(300);
//        System.out.println("Queue after 3 offers: " + myQueue);
//        System.out.println("Poll: " + myQueue.poll());
//        System.out.println("Queue after 1 poll: " + myQueue);
//        myQueue.poll();
//        myQueue.poll();
//        System.out.println("Queue after emptying: " + myQueue);
//        System.out.println();
//
//        System.out.println("=== 🛡️ 3. TESTING DEQUE (DOUBLE ENDED) ===");
//        Dequeue myDeque = new Dequeue();
//
//        System.out.println("Inserting at both ends...");
//        myDeque.insertFirst(50); // [50]
//        myDeque.insertLast(60);  // [50, 60]
//        myDeque.insertFirst(40); // [40, 50, 60]
//        System.out.println("Deque: " + myDeque);
//
//        System.out.println("Delete First: " + myDeque.deleteFirst()); // 40
//        System.out.println("Delete Last: " + myDeque.deleteLast());   // 60
//        System.out.println("Deque after deletes: " + myDeque);
//
//        System.out.println("\n--- ⚡ Testing The 'One Element' Edge Case ---");
//        System.out.println("Current: " + myDeque);
//        System.out.println("Deleting the last element: " + myDeque.deleteFirst());
//        System.out.println("Is Empty now? " + myDeque.isEmpty());
//        System.out.println("Final Deque State: " + myDeque);
    }
}
