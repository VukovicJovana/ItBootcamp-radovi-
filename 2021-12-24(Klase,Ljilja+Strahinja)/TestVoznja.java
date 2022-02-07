public class TestVoznja {

        public static void main(String[] args) {

            AutomobilDomaci auto1 = new AutomobilDomaci("Ford", "Fiesta", 4, "Jovana Vukovic");
            AutomobilDomaci auto2 = new AutomobilDomaci("BMW", "120d", 7, "Dusan Vukovic");
            //bez vlasnika
            AutomobilDomaci auto3 = new AutomobilDomaci("Honda", "Civic", 5);

            System.out.println(auto1);
            System.out.println(auto2);
            System.out.println(auto3);

            // moze i ovako
        /*System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());*/


        }


    }

