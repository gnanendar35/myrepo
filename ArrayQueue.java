public class ArrayQueue {
    int size;
    int[] queue;
    int front, rear;

    public ArrayQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (rear == size - 1) {
            System.out.println("Queue is full (Overflow)");
        } else {
            queue[++rear] = item;
            System.out.println("Enqueued: " + item);
        }
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty (Underflow)");
        } else {
            System.out.println("Dequeued: " + queue[front++]);
        }
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
    }
}


