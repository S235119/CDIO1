public class test {
    public static void main (String[] args){

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

        for (int i = 0; i <= (1000); i++) {
            int terning1 = slaaTerning(1);
            int terning2 = slaaTerning(2);
            int sum = terning1 + terning2;
            if (sum == 2) {
                to++;
                ens++;
            } else if (sum == 3) {
                tre++;
            } else if (sum == 4 && terning1 == terning2) {
                fire++;
                ens++;
            } else if (sum == 4) {
                fire++;
            } else if (sum == 5) {
                fem++;
            } else if (sum == 6 && terning1 == terning2) {
                seks++;
                ens++;
            } else if (sum == 6) {
                seks++;
            } else if (sum == 7) {
                syv++;
            } else if (sum == 8 && terning1 == terning2) {
                otte++;
                ens++;
            } else if (sum == 8) {
                otte++;
            } else if (sum == 9) {
                ni++;
            } else if (sum == 10 && terning1 == terning2) {
                ti++;
                ens++;
            } else if (sum == 10) {
                ti++;
            } else if (sum == 11) {
                elleve++;
            } else if (sum == 12) {
                tolv++;
                ens++;
            }
        }

        double realto = 1.0 / 36.0 * 1000.0;
        double realtre = 2.0 / 36.0 * 1000.0;
        double realfire = 3.0 / 36.0 * 1000.0;
        double realtfem = 4.0 / 36.0 * 1000.0;
        double realseks = 5.0 / 36.0 * 1000.0;
        double realsyv = 6.0 / 36.0 * 1000.0;
        double realotte = 5.0 / 36.0 * 1000.0;
        double realni = 4.0 / 36.0 * 1000.0;
        double realti = 3.0 / 36.0 * 1000.0;
        double realelve = 2.0 / 36.0 * 1000.0;
        double realtolv = 1.0 / 36.0 * 1000.0;
        double realens = 6.0 / 36.0 *1000.0;


        System.out.println("Teoretisk udfalde: " + realto + " reelle udfald: " + to + " for 2");
        System.out.println("Teoretisk udfalde: " + realtre + " reelle udfald: " + tre + " for 3");
        System.out.println("Teoretisk udfalde: " + realfire + " reelle udfald: " + fire + " for 4");
        System.out.println("Teoretisk udfalde: " + realtfem + " reelle udfald: " + fem + " for 5");
        System.out.println("Teoretisk udfalde: " + realseks + " reelle udfald: " + seks + " for 6");
        System.out.println("Teoretisk udfalde: " + realsyv + " reelle udfald: " + syv + " for 7");
        System.out.println("Teoretisk udfalde: " + realotte + " reelle udfald: " + otte + " for 8");
        System.out.println("Teoretisk udfalde: " + realni + " reelle udfald: " + ni + " for 9");
        System.out.println("Teoretisk udfalde: " + realti + " reelle udfald: " + ti +" for 10");
        System.out.println("Teoretisk udfalde: " + realelve + " reelle udfald: " + elleve + " for 11");
        System.out.println("Teoretisk udfalde: " + realtolv + " reelle udfald: " + tolv + " for 12");
        System.out.println("Teoretisk udfalde: " + realens + " reelle udfald: " + ens + " for dobbel");    
    }
        static int slaaTerning(int t) {
            int terning=0;
            for (int i=1; i<=t; i++){
                terning = (int) (Math.random()*6+1);
            }
            return terning;
    
        }
    }
