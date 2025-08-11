import java.util.Scanner;
public class Insertion_sort {
    public void inSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // to move one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public void printarray(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insertion_sort obj = new Insertion_sort();
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Unsorted array:");
        obj.printarray(arr);
        obj.inSort(arr);
        System.out.println("Sorted array:");
        obj.printarray(arr);
        System.out.println("Insertion sort completed.");
        scanner.close();
    }
}