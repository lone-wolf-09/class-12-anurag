import java.util.Scanner;

public class Library {
    String name[];   // stores the names of books
    int point;       // index of the topmost book
    int max;         // maximum capacity of the bookshelf

    // Constructor
    Library(int cap) {
        max = cap;
        name = new String[max];
        point = -1;   // initially shelf is empty
    }

    // Adds the name of the book to the shelf
    void add(String v) {
        if (point == max - 1) {
            System.out.println("SHELF FULL");
        } else {
            name[++point] = v;
            System.out.println(v + " added to shelf.");
        }
    }

    // Displays the last entered book
    void tell() {
        if (point == -1) {
            System.out.println("SHELF EMPTY");
        } else {
            System.out.println("Last entered book: " + name[point]);
        }
    }

    // Displays all the books in the shelf
    void display() {
        if (point == -1) {
            System.out.println("SHELF EMPTY");
        } else {
            System.out.println("Books in shelf:");
            for (int i = point; i >= 0; i--) {
                System.out.println(name[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Library capacity: ");
        int cap = sc.nextInt();
        sc.nextLine(); // clear buffer

        Library shelf = new Library(cap);

        while (true) {
            System.out.println("\n--- Bookshelf Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Tell Last Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String bookName = sc.nextLine();
                    shelf.add(bookName);
                    break;
                case 2:
                    shelf.tell();
                    break;
                case 3:
                    shelf.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
//Question 26 on page no. 553 in Class 12 ISC Computer Science textbook.
