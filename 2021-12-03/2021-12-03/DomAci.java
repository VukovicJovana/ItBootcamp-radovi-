import java.util.Scanner;

public class DomAci {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Unesite celobrojni nenegativan broj n: ");
        int n = scanner.nextInt();



        String fizz = "Fizz";
        String buzz = "Buzz";
        String zarez = ", ";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {

                    System.out.print(fizz + buzz + zarez);
                } else {

                    System.out.print(fizz + zarez);
                }
            } else {
                if (i % 5 == 0) {

                    System.out.print(buzz + zarez);
                }
                else {

                    System.out.print(i + zarez);
                }
            }
        }

    }
}

