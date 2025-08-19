import java.util.Stack;

class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Initial Stack: " + stack);
        int popped = stack.pop();
        System.out.println("Popped Element: " + popped);
        int top = stack.peek();
        System.out.println("Top Element: " + top);
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
        System.out.println("Final Stack: " + stack);
    }
}

