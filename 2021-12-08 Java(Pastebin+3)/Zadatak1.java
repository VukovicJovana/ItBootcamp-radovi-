import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int n = sc.nextInt();

        if ( n % 2 == 0 )
            System.out.println("Broj je paran");
        else
            System.out.println("Broj je neparan");

    }
}
