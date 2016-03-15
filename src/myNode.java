/**
 * Created by StephenManz on 3/14/2016.
 */
public class myNode {
    myNode next;
    Object data;

    public myNode(Object data){
        this.data = data;
        this.next = null;
    }

    public myNode getNext(){
        return this.next;
    }

    public void setNext(myNode next){
        this.next = next;
    }

    public Object getData(){
        return this.data;
    }

    public void setData(Object data){
        this.data = data;
    }
}
