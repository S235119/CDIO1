public class test {


        double to = 0.0;
        double tre = 0.0;
        double fire = 0.0;
        double fem = 0.0;
        double seks = 0.0;
        double syv = 0.0;
        double otte = 0.0;
        double ni = 0.0;
        double ti = 0.0;
        double elleve = 0.0;
        double tolv = 0.0;
        double ens = 0.0;

        for (int i = 0.0; i <= (1000.0); i++) {
            if (terning == 2) {
                to++;
                ens++;
            } else if (terning == 3) {
                tre++;
            } else if (terning == 4 && terning == dobbel) {
                fire++;
                ens++;
            } else if (terning == 4) {
                fire++;
            } else if (terning == 5) {
                fem++;
            } else if (terning == 6 && terning == dobbel) {
                seks++;
                ens++;
            } else if (terning == 6) {
                seks++;
            } else if (terning == 7) {
                syv++;
            } else if (terning == 8 && terning == dobbel) {
                otte++;
                ens++;
            } else if (terning == 8) {
                otte++;
            } else if (terning == 9) {
                ni++;
            } else if (terning == 10 && terning == dobbel) {
                ti++;
                ens++;
            } else if (terning == 10) {
                ti++;
            } else if (terning == 11) {
                elleve++;
            } else if (terning == 12) {
                tolv++;
                ens++;
            }
        }

        double antalto = (to / 1000.0 * 100.0);
        double antaltre = (tre / 1000.0 * 100.0);
        double antalfire = (fire / 1000 * 100);
        double antalfem = (fem / 1000 * 100);
        double antalseks = (seks / 1000 * 100);
        double antalsyv = (syv / 1000 * 100);
        double antalotte = (otte / 1000 * 100);
        double antalni = (ni / 1000 * 100);
        double antalti = (ti / 1000 * 100);
        double antalelleve = (elleve / 1000 * 100);
        double antaltolv = (tolv / 1000 * 100);
        double antalens = (ens / 1000 * 100);



        System.out.println("forskel mellem teorien og det reelle er: " + (antalto - (1/36)) + " for 2");
        System.out.println("forskel mellem teorien og det reelle er: " + tre + " for 3");
        System.out.println("forskel mellem teorien og det reelle er: " + fire + " for 4");
        System.out.println("forskel mellem teorien og det reelle er: " + fem + " for 5");
        System.out.println("forskel mellem teorien og det reelle er: " + seks + " for 6");
        System.out.println("forskel mellem teorien og det reelle er: "+ syv + " for 7");
        System.out.println("forskel mellem teorien og det reelle er: " + otte + " for 8");
        System.out.println("forskel mellem teorien og det reelle er: " + ni + " for 9");
        System.out.println("forskel mellem teorien og det reelle er: " + ti + " for 10");
        System.out.println("forskel mellem teorien og det reelle er: " + elleve + " for 11");
        System.out.println("forskel mellem teorien og det reelle er: " + tolv + " for 12");
        System.out.println("forskel mellem teorien og det reelle er: " + ens + " for dobbel");    
} 
