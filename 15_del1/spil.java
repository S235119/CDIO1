public class spil {
    public static void main(String[] args) {
    var sc = new java.util.Scanner(System.in); 
    
    System.out.println("Spillet Starter");
        var point1 = 0;
        var point2 = 0;
        var i = 0;
    while (point1 < 40 && point2 < 40){
        sc.nextLine();
        var sum1 = 0;
        var sum2 = 0;

            if (i % 2 == 0) {
                // spiller 2
                int terning = (int) (Math.random()*6+1);
                sum2 += terning;

                System.out.println(sum2);
                point2 += sum2;
                System.out.println("Du er på: " + point2 + " point");
            } else {
                // spiller 1
                int terning = (int) (Math.random()*6+1);
                sum1 += terning;

                System.out.println(sum1);
                point1 += sum1;
                System.out.println("Du er på: " + point1 + " point");
            }

        i++;
        
    }
    System.out.println("Spillet er slut du har vundet : )");
    sc.close();
}
}
