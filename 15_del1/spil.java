public class spil {
    public static void main(String[] args) {
    var sc = new java.util.Scanner(System.in); 
    
    System.out.println("Spillet Starter");
    int point = 0;
    while (point < 40){
        sc.nextLine();
        int terning1 = slaaTerning(1);
        int terning2 = slaaTerning(2);
        int sum = terning1 + terning2;
        System.out.println(sum);
        if (terning1 == terning2) {
            System.out.println("Du har slået to: " +terning1 + "'ere");
        }
        point += sum;

        System.out.println("Du er på: " +point+ " point");
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
