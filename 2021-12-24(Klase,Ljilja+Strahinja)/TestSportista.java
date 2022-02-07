public class TestSportista {
    public static void main(String[] args) {

        Sportista sp1 = new Sportista("Dusan Nikolic", "Odbojka", "Vojvodina", 15);
        Sportista sp2 = new Sportista("Pavle Peric", "Odbojka", 13);

        Sportista sp3 = new Sportista("Srecko Lisinac", "Odbojka","Vojvodina", 10);

        //Srecko Lisinac je promenio klub iz Vojvodine u Crvena Zvezda
        sp3.setKlub("Crvena zvezda");

        System.out.println(sp1.toString());
        System.out.println(sp2.toString());
        System.out.println(sp3.toString());

    }



}
