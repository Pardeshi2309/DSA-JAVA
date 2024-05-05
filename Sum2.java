
//Sum of a and b using Scanner (input taking from user)
import java.util.*;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a");
        int a = sc.nextInt();
        System.out.println("Enter the value for b");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is " + sum);

    }
}
