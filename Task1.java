import java.util.Scanner;

public class Task1 {
    public static void PrintTask1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть довжину першого катету 'a' прямокутного трикутника: ");
        double catet1 = input.nextDouble();

        System.out.print("Введіть довжину другого катету 'b' прямокутного трикутника: ");
        double catet2 = input.nextDouble();


        double area = ((catet1 * catet2) / 2) ;

        System.out.println("Площа прямокутного трикутника = " + area);
    }
}
