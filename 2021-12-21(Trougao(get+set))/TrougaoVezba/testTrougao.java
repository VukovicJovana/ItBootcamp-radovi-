package TrougaoVezba;

import TrougaoVezba.Trougao;

import java.util.Scanner;

public class testTrougao {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Unesite dimenziju stranice A");
        double A= sc.nextDouble();
        System.out.println("Unesite dimenziju stranice B");
        double B= sc.nextDouble();
        System.out.println("Unesite dimenziju stranice C");
        double C= sc.nextDouble();
        Trougao tr = new Trougao(A,B,C);
        System.out.println("Stranica A trougla =" + tr.getStranicaA()+"cm");
        System.out.println("Stranica B trougla =" + tr.getStranicaB()+"cm");
        System.out.println("Stranica C trougla =" + tr.getStranicaC()+"cm");

        System.out.println("Obim trougla="+ tr.obim()+"cm");
        System.out.println("Povrsina trougla="+tr.povrsina()+"cm");

    }
}
