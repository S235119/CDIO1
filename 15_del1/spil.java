public class spil {
    public static void main(String[] args) {
    var sc = new java.util.Scanner(System.in); 
    
    System.out.println("Spillet Starter, tryk enter for at slå med terningerne");

        int terning1 = 0;
        int terning2 = 0;
        var point1 = 0;
        var point2 = 0;
        var i = 0;
    while (point1 < 40 && point2 < 40){
        sc.nextLine();
        var sum1 = 0;
        var sum2 = 0;
        terning1 = slaaTerning(1);
        terning2 = slaaTerning(2);

            if (i % 2 == 0) {
                // spiller 1
                sum1 = terning1 + terning2;

                System.out.println(sum1);
                point1 += sum1;
                if (sum1 == 2) {
                    point1 = 0;
                    System.out.println("Du slog to 1'ere, og mistede alle dine point : (");
                } else if (terning1 == terning2) {
                    var tolv = 0;
                    if (sum1 == 12 && tolv == 12) {
                        System.out.println("Du slog to 6'ere, to gange i streg");
                        break;
                    }
                    System.out.println("Du har slået to: " + terning1 + "'ere, og du får derfor en ekstra tur");
                    System.out.println("Spiller 1 er på: " + point1 + " point");
                    tolv = terning1 + terning2;
                    continue;
                } 

                System.out.println("Spiller 1 er på: " + point1 + " point");
                
            } else {
                // spiller 2
                sum2 = terning1 + terning2;

                System.out.println(sum2);
                point2 += sum2;
                if (sum2 == 2) {
                    point2 = 0;
                    System.out.println("Du slog to 1'ere, og mistede alle dine point : (");
                } else if (terning1 == terning2) {
                    var tolv = 0;
                    if (sum2 == 12 && tolv == 12) {
                        System.out.println("Du slog to 6'ere, to gange i streg");
                        break;
                    }
                    System.out.println("Du har slået to: " + terning1 + "'ere, og du får derfor en ekstra tur");
                    System.out.println("Spiller 2 er på: " + point2 + " point");
                    tolv = terning1 + terning2;
                    continue;
                }
                System.out.println("Spiller 2 er på: " + point2 + " point");
            }

        i++;

    }
    i++;
    while (terning1 != terning2) {
        sc.nextLine();
        terning1 = slaaTerning(1);
        terning2 = slaaTerning(2);

        if (i % 2 == 0) {
            //spiller 1
        } else {
            //spiller 2
        }
        //ikke færdig. Lader spilleren med over 40 point slå igen, selvom de ikke fik 2 ens
        //skal finde en måde at komme ud af loopet, og gøre så både spiller 1 og 2 slår
        //et eller andet er ret galt lige nu
        //skal indføre spiller 1 og 2 i dette loop

    }
    System.out.println("Spillet er slut du har vundet : )");
    sc.close();
    
}

    static int slaaTerning(int t) {
        int terning=0;
        for (int i=1; i<=t; i++){
            terning = (int) (Math.random()*6+1);
        }
        return terning;

    }

}