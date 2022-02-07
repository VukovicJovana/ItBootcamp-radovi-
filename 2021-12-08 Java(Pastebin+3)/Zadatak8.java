import java.util.Scanner;

public class Zadatak8<starost> {
    public static void main(String[] args) {
        //8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        //	"Dobrodosao u {x}. razred, {ime} {prezime}",
        //	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
        //    poruku od:
        //	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
        Scanner sc = new Scanner(System.in);
        System.out.print(" Unesi ime ");
        String ime = sc.next();
        System.out.print(" Unesi prezime ");
        String prezime = sc.next();
        System.out.print(" Unesi godinu rodjenja ");
        int godina = sc.nextInt();
        int starost = 2021 - godina;
        if (starost < 7) {
            System.out.println(ime + " " + prezime + " nije zapoceo obrazovanje");
        } else if (starost == 7) {
            System.out.println(ime + " " + prezime + " je prvi razred");
        } else if (starost == 8) {
            System.out.println(ime + " " + prezime + " je drugi razred");
        } else if (starost == 9) {
            System.out.println(ime + " " + prezime + " je treci razred");
        } else if(starost ==10){
            System.out.println(ime + " "+prezime +  " je cetvrti razred");
        }else if(starost==11){
            System.out.println(ime +" "+ prezime+ " je peti razred");
        }else if(starost==12){
            System.out.println(ime +" "+ prezime+ " je sesti razred");
        }else if(starost==13){
            System.out.println(ime+ " "+prezime+" je sedmi razred");
        }else if(starost==14){
            System.out.println(ime+" "+ prezime+  " je osmi razred");
        }else if(starost==15){
            System.out.println(ime+" "+prezime+  " je deveti razred");
        }else if(starost==16){
            System.out.println(ime+" "+prezime+" je deseti razred");
        }else if(starost==17){
            System.out.println(ime+" "+prezime+ " je jedanaesti razred");
        }else if(starost==18){
            System.out.println(ime+" "+prezime+" je dvanaesti razred");
        }else {
            System.out.println( ime+ " "+prezime +" je zavrsio skolu");
        }

    }


    }




