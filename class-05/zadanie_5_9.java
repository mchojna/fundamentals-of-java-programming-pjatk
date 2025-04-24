public class zadanie_5_9 {
    public static void main(String[] args){

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Prosze podaj numer: ");
        int num = scanner.nextInt();

        if(num >= 10){
            System.out.println(num + " nalezy do zbioru C");
        }else if(num <= -15){
            System.out.println(num + " nalezy do zbioru B");
        }else if(num <= -13){
            System.out.println(num + " nalezy do zbioru A i B");
        }else if(num <=-10){
            System.out.println(num + " nalezy do zbioru A");
        }else if(num <= -8){
            System.out.println(num + " nie nalezy do zadnego zbioru");
        }else if(num <= -5){
            System.out.println(num + " nalezy do zbioru B");
        }else if(num < -4){
            System.out.println(num + " nalezy do zbioru A i B");
        }else if(num <= -3){
            System.out.println(num + " nalezy do zbioru A, B i C");
        }else if(num < 0){
            System.out.println(num + " nalezy do zbioru A i C");
        }else if(num <= 5){
            System.out.println(num + " nalezy do zbioru C");
        }else{
            System.out.println(num + " nalezy do zbioru A i C");
        };

    }
}
