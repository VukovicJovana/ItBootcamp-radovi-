import java.util.ArrayList;

public class domaciArryList {
    public static void main(String[] args) {
        ArrayList<String> voce = new ArrayList<>();
        voce.add("Jagoda");
        voce.add("Tresnja");
        voce.add("Malina");
        voce.add("Kruska");
        voce.add("Banana");
        voce.add("Sljiva");
        voce.add("grozdje");
        System.out.println(voce);


        System.out.println("Treci element iz liste je: " + voce.get(2));

        voce.set(0, "Malina");
        System.out.println("Menjam naziv prvog elementa u : " + voce.get(0));

        System.out.println("Uklanjam 5 element iz niza");
        voce.remove(4);
        System.out.println(voce);


        System.out.println("Velicina liste je: " + voce.size());

        System.out.println(" ");
        System.out.println("Elementi ove liste su: ");
        for (int i = 0; i < voce.size(); i++) {
            String element = voce.get(i);
            System.out.println((i + 1) + " " + element);
        }

        System.out.println("\n");
    }}
