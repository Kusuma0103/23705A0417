import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        revOfStack(s);
        System.out.println("Elements in the stack are : ");
        System.out.print(s);
    }

   public static void revOfStack(Stack<Integer>stack){
       if(stack.isEmpty()){
           return;
       }
       int val = stack.pop();
       stack.push(val);
    }
}    