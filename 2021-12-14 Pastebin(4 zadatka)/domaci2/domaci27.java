package domaci2;

import java.util.Scanner;

public class domaci27 {
    public static void main(String[] args) {
        //27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza: ");
        int[] niz = new int[sc.nextInt()];

        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        elementiZadatog(niz);
    }


    public static void elementiZadatog(int[] niz) {

        System.out.println("Svaki drugi element Vaseg niza je: ");
        for (int i = 0; i < niz.length; i += 2) {

            System.out.println(niz[i]);
        }
    }
}


