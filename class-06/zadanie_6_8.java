public class zadanie_6_8 {
    
    public static void main(String[] args){

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();

        int dayPassed = 0;
        int monthPassed = 0;
        

        for(int i = 1; i < month; i++){
            
            switch(i){
                case 4, 6, 9, 11: {
                    monthPassed += 30;
                    break;
                }
                case 1, 3, 5, 7, 8, 10, 12: {
                    monthPassed += 31;
                    break;
                }
                case 2: {
                    monthPassed += 28;
                    break;
                }
            }

            System.out.println(i + " " + monthPassed);
        }

        dayPassed = day + monthPassed;

        System.out.println("Uplynelo: " + dayPassed + " dni");

    }
}
