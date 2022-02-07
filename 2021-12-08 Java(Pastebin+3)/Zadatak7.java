import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Zadatak7 {
    public static void main(String[] args) {
        //7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi mesec");
        String mesec = sc.next();
        int c = 0;
        if(mesec.equals("januar")){
            c=1;
        } else if(mesec.equals("februar")){
            c=2;
        } else if(mesec.equals("mart")){
            c =3;
        } else if(mesec.equals("april")){
            c=4;
        } else if(mesec.equals("maj")){
            c=5;
        } else if(mesec.equals("jun")){
            c = 6;
        } else if(mesec.equals("jul")){
            c = 7;
        } else if(mesec.equals("avgust")){
            c = 8;
        } else if(mesec.equals("septembar")){
            c = 9;
        } else if(mesec.equals("oktobar")){
            c =10;
        } else if(mesec.equals("novembar")){
            c=11;
        } else if(mesec.equals("decembar")) {
            c = 12;
        }
            System.out.println("Uneti dan");
        int i=sc.nextInt();
        if(c==3 || i>=21  && c==4 || i<=20){
            System.out.println("Ovan");
        } else if(c==4 || i>=21 && c==5 || i<=21){
            System.out.println("Bik");
        } else if (c==5 || i>=22 && c==6 || i<=21 ){
            System.out.println("Blizanci");
        } else if(c==6 || i>=22 && c==7 || i<=22 ){
            System.out.println("Rak");
        } else if(c==7 || i>=23 && c==8 || i<=22){
            System.out.println("Lav");
        } else if(c==8 || i>=23 && c==9 || i<=22){
            System.out.println("Devica");
        } else if(c==9 || i>=23 && c==10 || i<=23){
            System.out.println("Vaga");
        }else if(c==10 || i>=24 && c==11 || i<=22){
            System.out.println("Skorpija");
        }else if(c==11 || i>=23 && c==12 || i<=21){
            System.out.println("Strelac");
        } else if(c==12 || i>=22 && c==1 || i<=20){
            System.out.println("Jarac");
        } else if(c==1 || i>=21 && c==2 || i<=19){
            System.out.println("Vodolija");
        }else if(c==2 || i>=20 && c==3 || i<=20 ){
            System.out.println("Riba");
        }
    }

}
