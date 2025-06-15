import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find factorial:");
        int a = input.nextInt();
        int b = a;
        int c = 1;
        if (a == 0) {
            System.out.print("the factorial of the number is: 0");
        }
        while (b != 0) {
            c = c * b;
            b = b - 1;

        }
        System.out.print("the factorial of the given number is:" + c);
        input.close();//
    }
}