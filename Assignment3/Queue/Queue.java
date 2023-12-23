import java.util.*;

public class Queue {

    static final int MAX = 1000;
    int front, rear;
    int queueArray[] = new int[MAX];

    public Queue() {
        front = -1;
        rear = -1;
    }

    public void enqueue(int x) {
        if (rear == MAX - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            queueArray[++rear] = x;
            System.out.println(x + " enqueued into queue");
        }
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int x = queueArray[front];
            if (front == rear) {
                front =-1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(x + " dequeued from queue");
            return x;
        }
    }

    public int peek() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int x = queueArray[front];
            System.out.println("Front element is " +x);
            return x;
        }
    }

    
    public boolean isEmpty() {
        return (front == -1);
    }

    public static void main(String[] args) {
         
        Queue qu = new Queue();

        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);

        qu.dequeue();
        
        qu.peek();
    }
}
