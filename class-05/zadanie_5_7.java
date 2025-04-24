public class zadanie_5_7 {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Prosze podaj wartosc a: ");
        double a = scanner.nextDouble();
        
        System.out.println("Prosze podaj wartosc b: ");
        double b = scanner.nextDouble();

        System.out.println("Prosze podaj wartosc c: ");
        double c = scanner.nextDouble();

        double delta = ((b * b) - (4 * a * c));

        //System.out.println(delta);

        if(delta < 0){
            System.out.println("Rownanie nie ma miejsc zerowych");
        } else if (delta == 0){
            double x0 = ((-b) / (2 * a));
            System.out.println("Rownanie ma jedno miejsce zerowe rowne: " + x0);
        } else {
            double x1 = (((-b) - Math.sqrt(delta) ) / (2 * a));
            double x2 = (((-b) + Math.sqrt(delta) ) / (2 * a));
            System.out.println("Rownanie ma 2 miejsca zerowe rowne: " + x1 + " i " + x2);

        }
    }
}
