package Hashing;

import LinkedList.stack_and_queue.Node;

public class HashTable_SeparteChanging {
    private Node[] arr;
    private int size;

    public HashTable_SeparteChanging(int size){
        this.size = size;
        this.arr = new Node[size];
    }

    public int hash(int key){
        return key % size;
    }

    public void insert(int data){
        Node node = new Node(data);
        int hashVal = hash(data);

        Node parent = null;
        Node curr = arr[hashVal];
        while (curr != null && data > curr.data){
            parent = curr;
            curr = curr.next;
        }

        if(parent == null) {
            node.next = arr[hashVal];
            arr[hashVal] = node;
        }
        else {
            node.next = curr;
            parent.next = node;
        }
    }

    public boolean search(int data){
        int hashVal = hash(data);

        Node curr = arr[hashVal];

        while(curr != null && curr.data != data){
            curr = curr.next;
        }
        if(curr == null) return false;

        return true;
    }

    public void delete(int data){
        int hashVal = hash(data);

        Node parent = null;
        Node curr = arr[hashVal];
        while (curr != null && data != curr.data){
            parent = curr;
            curr = curr.next;
        }

        if(curr == null) return;
        if(parent == null) {
            arr[hashVal] = curr.next;
        }
         else {
            parent.next = curr.next;
        }
    }
}
