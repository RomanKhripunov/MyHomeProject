package roman.part11;

public class StackCollision {

    public static void main(String[] args) {
        roman.part11.Stack<String> stack = new roman.part11.Stack<String>();
        for (String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }
        while ( ! stack.empty()){
            System.out.print(stack.pop() + " ");
        }

        System.out.println();

        java.util.Stack<String> stack2 = new java.util.Stack<String>();
        for (String s2 : "My dog has fleas".split(" ")){
            stack2.push(s2);
        }
        while ( ! stack2.empty()){
            System.out.print(stack2.pop() + " ");
        }
    }
}
