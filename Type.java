// Code for Type conversion, Converting integer into float value
/*import java.util.Scanner;

public class Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        System.out.println(a);
    }
} */


//Code for Type Casting (while Conversion data will be loss)
import java.util.Scanner;

public class Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 3.14f; //floating to int
        int b = (int) a;  //Type casting - Data Loss
        System.out.println(b);
    }
} 