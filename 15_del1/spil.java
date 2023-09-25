public class spil {
    public static void main(String[] args) {
    var sc = new java.util.Scanner(System.in); 
    System.out.println("Spillet Starter");
    sc.nextLine();

    var sum = 0;
    for (int i=0; i<2; i++){
    int terning = (int) (Math.random()*6+1);
    sum += terning;
    }
    System.out.println(sum);
    sc.close();
}
}
