public class Queue {
    private Stack stack_01=new Stack();
    private Stack stack_02=new Stack();

    public Queue() {

    }
    public void moving_stack_02(){
        while(!stack_01.isEmpty()){
            int move_element=stack_01.pop();
            stack_02.puch(move_element);
        }
    }
    public void moving_to_stack_01(){
        while(!stack_02.isEmpty()){
            int move_element=stack_02.pop();
            stack_01.puch(move_element);
        }
    }
    public void display(){
        moving_stack_02();
        stack_02.display();
        moving_to_stack_01();

    }

    public void enqueue(int data){
        this.stack_01.puch(data);
    }

    public void dequeue(){
        moving_stack_02();
        stack_02.pop();
        moving_to_stack_01();

    }

}
