public class zadanie_5_4 {
    public static void main(String[] args){
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
            
        System.out.println("Prosze podaj pierwsza podaj dodatnia liczbe calkowiat: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Prosze podaj druga podaj dodatnia liczbe calkowiat: ");
        int num2 = scanner.nextInt();
        
        if(num1 % num2 == 0){
            System.out.println("Liczba " + num2 + " stanowi calkowita wielokrotnosc liczby " + num1);
        } else {
            System.out.println("Liczba " + num2 + "  nie stanowi calkowita wielokrotnosc liczby " + num1);
        }
    }
}
