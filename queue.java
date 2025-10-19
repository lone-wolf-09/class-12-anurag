import java.util.Scanner;

public class QueueArray {
    int front, rear, size;
    int queue[];

    // Constructor
    QueueArray(int capacity) {
        size = capacity;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue - Insert element
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("❌ Queue Overflow! Cannot insert " + value);
        } else {
            if (front == -1) front = 0; // First insertion
            queue[++rear] = value;
            System.out.println("✅ Inserted: " + value);
        }
    }

    // Dequeue - Remove element
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("❌ Queue Underflow! No elements to delete.");
        } else {
            System.out.println("🗑 Removed: " + queue[front]);
            front++;
        }
    }

    // Display queue
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of queue: ");
        int capacity = sc.nextInt();

        QueueArray q = new QueueArray(capacity);

        while (true) {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        }
    }
}
