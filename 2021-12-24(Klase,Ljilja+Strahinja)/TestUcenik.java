public class TestUcenik {
    public static void main (String[] args){

        Ucenik ucenik1 = new Ucenik("Jovana", "Vukovic" );

        ucenik1.dodajuOcenu(5);
        ucenik1.dodajuOcenu(3);
        ucenik1.dodajuOcenu(1);
        ucenik1.dodajuOcenu(4);

        System.out.println(ucenik1.prosek());

    }
}
