import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 number:");
        int num1 = scan.nextInt();
        System.out.println("Enter 2 number:");
        int num2 = scan.nextInt();
        System.out.println("Enter 3 number:");
        int num3 = scan.nextInt();

        int max1 = num1 > num2 ? num1 : num2;
        int max2 = max1 > num3 ? max1 : num3;
        System.out.println("MAX number: "+max2);

    }
}
