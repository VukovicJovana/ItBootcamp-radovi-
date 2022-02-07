import java.util.Scanner;

public class Sintaksa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite sirinu zida ");
        int sirina = scanner.nextInt();
        System.out.print("Unesite visinu zida ");
        int visina = scanner.nextInt();
         System.out.print(sirina * visina + "m2");
    }
}
