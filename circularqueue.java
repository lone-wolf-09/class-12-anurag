import java.util.Scanner;

public class CircularQueue {
    int front, rear, size;
    int queue[];

    CircularQueue(int capacity) {
        size = capacity;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue (Insert)
    void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("❌ Queue Overflow!");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println("✅ Inserted: " + value);
    }

    // Dequeue (Delete)
    void dequeue() {
        if (front == -1) {
            System.out.println("❌ Queue Underflow!");
            return;
        }
        System.out.println("🗑 Deleted: " + queue[front]);
        if (front == rear) { 
            front = -1;
            rear = -1; 
        } else {
            front = (front + 1) % size;
        }
    }

    // Display Queue
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of circular queue: ");
        int capacity = sc.nextInt();

        CircularQueue cq = new CircularQueue(capacity);

        while (true) {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    cq.enqueue(sc.nextInt());
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
