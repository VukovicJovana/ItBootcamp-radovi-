package domaci2;

import java.util.Scanner;

public class Zadatak29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza: ");
        int[] niz = new int[sc.nextInt()];

        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        svakiTreci(niz);
    }

    public static void svakiTreci(int[] niz) {

        System.out.println("Svaki treci element Vaseg niza u obrnutom redosledu je: ");
        for (int i = niz.length-1; i >= 0; i-=3) {

            System.out.println(niz[i]);
        }



    }}



