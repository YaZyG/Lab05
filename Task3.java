import java.util.Scanner;

public class Task3 {
    public static void PrintTask3() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.println("Масив:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}