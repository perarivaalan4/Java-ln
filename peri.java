import java.util.*;

public class peri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number a:");
        int a = input.nextInt();
        System.out.print("Enter the second number b:");
        int b = input.nextInt();
        int c = a + b;
        System.out.println("the sum of the numbers is:" + c);
        if (a > b) {
            System.out.println("a is the greatest number:" + a);
        } else if (b > a) {
            System.out.println("b is the greatest number:" + b);
        } else {
            System.out.println("both are equal numbers:" + a);
        }
    }
}