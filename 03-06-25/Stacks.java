class Main {
    public static void main(String[] args) {
        Stack q = new Stack();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.pop();
        q.print();
       
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
class Stack{
   
    Node top ;
    Stack(){
        this.top = null;
    }
    boolean isEmpty(){
        if(top== null){
            return true;
        }
        else{
            return false;
        }
    }
     void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;  
        top = newNode;       
    }
    int pop(){
        if(isEmpty()){
            System.err.println("Stack is Empty");
            return -1;
        }else{
            int val = top.data;
            top= top.next;
            return val;
        }
    }
    void print(){
        var temp =top;
        System.out.println("----------");
        while(temp != null){
            System.out.println(temp.data + "  ");
            temp= temp.next;
        }
        System.out.println("\n-----------");
    }
}