public class zadanie_6_2 {
    
    public static void main(String[] args){

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        int daysInMonth;
        int daysInYear;

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            daysInYear = 366;
        }else {
            daysInYear = 365;
        }
        
        switch(month){

            case 1, 3, 4, 5, 7, 8, 10, 12: {
                daysInMonth = 31;
                break;
            }

            case 2: {

                if(daysInYear == 365){
                    daysInMonth = 28;
                }else{
                    daysInMonth = 29;
                };
                break;
            }
            default:{
                daysInMonth = 30;
            }
                

            }
        
            System.out.println(daysInMonth);

        }

    }
