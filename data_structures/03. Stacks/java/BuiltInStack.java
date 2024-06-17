import java.util.List;
import java.util.ArrayList;

public class BuiltInStack {

    List<Integer> stack;
    public BuiltInStack(){
        List<Integer> stack = new ArrayList<Integer>();
        this.stack = stack;
    }

    private void push(int val){
        this.stack.add(val);
    }

    private Integer pop(){
        if(stack.size() >= 1){
            return this.stack.remove(this.stack.size() -1);
        }else{
            return null;
        }
    }

    /*
      In Java, arrays are of fixed size, 
      which means you cannot directly "push" or "pop" elements 
      as you would in a dynamic array or a stack.
     */
    public static void main(String[] args) {
        BuiltInStack stack = new BuiltInStack();
        stack.push(0);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
