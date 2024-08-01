import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  number:");
        int num = scan.nextInt();
        int num1 = num;
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Сумма всех цифр числа " + num1 + " = " + sum);
    }
}
