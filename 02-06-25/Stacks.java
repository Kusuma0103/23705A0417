class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.print();
        System.out.println("The PEEk value is : " + stack.peek());
    }
}
class Stack{
    int[] stack;
    int size;
    int top;
    Stack(int size){
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }
    boolean isFull(){
    if (top == size - 1) {
        System.err.println("Stack is full");
        return true;
    } else {
        return false;
    }
    }
    boolean isEmpty(){
        if(top == -1){
            System.err.println("Stack is EMPTY");
            return true;
        }else{
            return false;
        }
    }
    void push(int val){
        if(isFull()){
           
            return;
        }
        top = top+1;
        stack[top] = val;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=stack[top];
        top=top-1;
        return val;
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        return stack[top];
    }
    void print(){
        for(int i=top; i>=0; i--){
            System.out.println("|" + stack[i] + "|");
        }
    }
}