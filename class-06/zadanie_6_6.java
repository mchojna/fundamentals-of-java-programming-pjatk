public class zadanie_6_6 {
    
    public static void main(String[] args){

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int num;
        int numOfNum = 0;
        int sumOfNum = 0;

        num = scanner.nextInt();

        while(num != 0){

            sumOfNum += num;
            numOfNum += 1;

            System.out.println("Sum numerow: " + sumOfNum);
            System.out.println("Liczba numerow: " + numOfNum);

            num = scanner.nextInt();
        }

        System.out.println("Sum numerow: " + sumOfNum);
        System.out.println("Liczba numerow: " + numOfNum);


    }
}
