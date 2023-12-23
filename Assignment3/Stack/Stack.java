import java.util.*;

public class Stack{

    static final int MAX = 1000;
    int top;
    int size;
    int stackArray[] = new int[MAX];

    public Stack(int size) {
        this.size=size;
        top = -1;
    }

    public boolean push(int x) {
        if (top >= size - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            stackArray[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            top--;
            int x = stackArray[top];
            System.out.println(x + " popped from stack");
            return x;
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int x = stackArray[top];
            System.out.println("Top element is " +x);
            return x;
        }
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack st = new Stack(n);

        st.push(10);
        st.push(20);
        st.push(30);

        st.pop();
        st.peek();
    }
}
