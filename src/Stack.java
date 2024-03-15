public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void puch(int data){
        Node newNode=new Node(data);
        if(this.top==null){
            this.top=newNode;
        }else {
            newNode.setNext(this.top);
            this.top=newNode;
        }
    }
    public int pop(){
        Node temp=this.top;
        if(temp==null){
            System.out.println("this is empty");
        }else {

            this.top=temp.getNext();
        }
        return temp.getData();
    }
    public void display(){
        Node temp=this.top;
        while(temp!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println();
    }
    public boolean isEmpty(){
        if(this.top==null){
            return true;
        }else {
            return false;
        }
    }
}
