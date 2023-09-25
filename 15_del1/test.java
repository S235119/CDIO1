public class test {

        int to = 0;
        int tre = 0;
        int fire = 0;
        int fem = 0;
        int seks = 0;
        int syv = 0;
        int otte = 0;
        int ni = 0;
        int ti = 0;
        int elleve = 0;
        int tolv = 0;
        int ens = 0; 

        for (int i = 0; i < 1000; i++) {
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

        System.out.println("2 = " + to);
        System.out.println("3 = " + tre);
        System.out.println("4 = " + fire);
        System.out.println("5 = " + fem);
        System.out.println("6 = " + seks);
        System.out.println("7 = " + syv);
        System.out.println("8 = " + otte);
        System.out.println("9 = " + ni);
        System.out.println("10 = " + ti);
        System.out.println("12 = " + tolv);
        System.out.println("Dobbel = " + dobbel);    
} 
