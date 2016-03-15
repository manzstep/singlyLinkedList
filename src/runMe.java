/**
 * Created by StephenManz on 3/14/2016.
 */
public class runMe {
    public static void main(String[] args){
        singlyLinkedList listy = new singlyLinkedList();
        listy.add(5);
        listy.add(6);
        listy.add(7);
        listy.print();
        System.out.println("Inserting 8 before 7");
        listy.insertBefore(8,7);
        listy.print();
        System.out.println("Remove middle element");
        listy.remove(8);
        listy.print();
        System.out.println("Remove tail");
        listy.remove(7);
        listy.print();
        System.out.println("Removing head");
        listy.remove(5);
        listy.print();
    }
}
