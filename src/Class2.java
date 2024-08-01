import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год :");
        int scanYear = scan.nextInt();
        boolean isLeap = scanYear % 4 == 0 ? true : false;
        if (isLeap) {
            System.out.println(scanYear + " - высокосный год");
        } else  {
            System.out.println(scanYear + " - невысокосный год");
        }
    }
}
