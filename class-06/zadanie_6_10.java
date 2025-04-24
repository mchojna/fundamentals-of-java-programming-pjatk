public class zadanie_6_10{
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Podaj liczbe kolumn: ");
        int col = scanner.nextInt();

        System.out.println("Podaj liczbe wierszy: ");
        int row = scanner.nextInt();

        for(int x = 0; x < row; x++){

            for(int y = 0; y < col ; y++){

                if(x % 2 == 0){
                    if(y % 2 ==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(y % 2 !=0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

            }
        
        System.out.println();

        }

    }
}

