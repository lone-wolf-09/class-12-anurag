import java.util.Scanner;

public class DequeArray {
    int front, rear, size;
    int deque[];

    // Constructor
    DequeArray(int capacity) {
        size = capacity;
        deque = new int[size];
        front = -1;
        rear = -1;
    }

    // Insert at rear
    void insertRear(int value) {
        if ((front == 0 && rear == size - 1) || (rear + 1 == front)) {
            System.out.println("❌ Deque Overflow!");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
        } else {
            rear++;
        }
        deque[rear] = value;
        System.out.println("✅ Inserted at rear: " + value);
    }

    // Insert at front
    void insertFront(int value) {
        if ((front == 0 && rear == size - 1) || (rear + 1 == front)) {
            System.out.println("❌ Deque Overflow!");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }
        deque[front] = value;
        System.out.println("✅ Inserted at front: " + value);
    }

    // Delete from front
    void deleteFront() {
        if (front == -1) {
            System.out.println("❌ Deque Underflow!");
            return;
        }
        System.out.println("🗑 Deleted from front: " + deque[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
    }

    // Delete from rear
    void deleteRear() {
        if (rear == -1) {
            System.out.println("❌ Deque Underflow!");
            return;
        }
        System.out.println("🗑 Deleted from rear: " + deque[rear]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
    }

    // Display
    void display() {
        if (front == -1) {
            System.out.println("Deque is empty.");
            return;
        }
        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of deque: ");
        int capacity = sc.nextInt();

        DequeArray dq = new DequeArray(capacity);

        while (true) {
            System.out.println("\n1. Insert Front\n2. Insert Rear\n3. Delete Front\n4. Delete Rear\n5. Display\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    dq.insertFront(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    dq.insertRear(sc.nextInt());
                    break;
                case 3:
                    dq.deleteFront();
                    break;
                case 4:
                    dq.deleteRear();
                    break;
                case 5:
                    dq.display();
                    break;
                case 6:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
