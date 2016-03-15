/**
 * Created by StephenManz on 3/14/2016.
 */


public class singlyLinkedList {
    private myNode head;
    int size;

    public singlyLinkedList(){
        head = null;
        size = 0;
    }

    public void add(Object data){
        myNode temp = new myNode(data);
        myNode iterator = head;
        if (head == null){
            head = temp;
        } else if (head.getNext() == null){
            head.setNext(temp);
        } else {
            while(iterator.getNext() != null){
                iterator = iterator.getNext();
            }
            iterator.setNext(temp);
        }
    }

    public void insertBefore(Object newData, Object oldData){
        myNode temp = new myNode(newData);
        myNode iterator = head;
        while(iterator.getNext().getData() != oldData && iterator.getNext().getData() != null){
            iterator = iterator.getNext();
        }
        temp.setNext(iterator.getNext());
        iterator.setNext(temp);
    }

    public void print(){
        myNode iterator = head;
        while(iterator != null){
            System.out.println(iterator.getData());
            iterator = iterator.getNext();
        }
    }

    public void remove(Object data){
        myNode iterator = head;
        if (iterator.getData() == data){
            head = iterator.getNext();
            return;
        }
        while (iterator.getNext().getData() != data) {
            iterator = iterator.getNext();
        }
        if (iterator.getNext().getNext() != null) {
            myNode nextNode = iterator.getNext().getNext();
            iterator.getNext().setNext(null);
            iterator.setNext(nextNode);
        } else {
            iterator.setNext(null);
        }


    }
}
