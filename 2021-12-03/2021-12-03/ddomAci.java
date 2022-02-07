import java.util.Scanner;

public class ddomAci {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite prvi broj: ");
            int a = sc.nextInt();
            System.out.print("Unesite drugi broj: ");
            int b = sc.nextInt();
            System.out.println(a + b);
            System.out.println((a - b));
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);

        }
}
