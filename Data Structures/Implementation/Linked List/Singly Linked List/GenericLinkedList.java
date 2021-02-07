import java.util.Iterator;

public class GenericLinkedList {
    public static void main(String[] args){
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Node<Integer> list = new Node<>(arr);

        for(Object n: list){
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Size: " + list.size());

    }
}

class Node <E> implements Iterable {
    E data;
    Node head;
    Node next;
    int n = 0;

    Node(E data){
        this.data = data;
        if(head == null){
            n++;
            head = this;
        }
    }

    Node(E[] data){
        if(head == null){
            this.data = data[0];
            n++;
            head = this;
        }
        for(int i = 1; i < data.length; i++){
            add(data[i]);
        }
    }

    void add(E value){
        Node current = head;
        while(current != null){
            if(current.next == null){
                current.next = new Node(value);
                n++;
                break;
            }
            current = current.next;
        }

    }

    void remove(E value){
        Node current = head;
        Node previous = null;

        if(current.data == value){
            head = current.next;
            n--;
            return;
        }

        while(current != null){
            if(current.data == value){
                previous.next = current.next;
                n--;
                break;
            }
            previous = current;
            current = current.next;
        }

    }

    boolean contains(E value){
        Node current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    int size(){
        return n;
    }

    boolean isEmpty(){
        return n == 0;
    }

    void traverse(){
       for(Node current = head; current != null; current = current.next){
           System.out.print(current.data + " ");
       }
       System.out.println();

    }

    public ListIterator iterator(){
        return new ListIterator();
    }

    /* Inner class */
    class ListIterator implements Iterator{
        Node current = head;

        public boolean hasNext(){
            return current != null;
        }

        public E next(){
            Node<E> nextNode = current;
            current = current.next;
            return nextNode.data;
        }

    }
}

