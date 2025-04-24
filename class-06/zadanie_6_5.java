public class zadanie_6_5 {
    
    public static void main(String[] args){

        int while_i = 1;

        while(while_i<1){
            System.out.println("Petla while: " + while_i);
            while_i++;
        }

        int do_while_i = 1;

        do{
            System.out.println("Petla do-while: " + do_while_i);
            do_while_i++;
        }while(do_while_i<1);


        System.out.println("Koncowa wartosc while: " + while_i);
        
        System.out.println("Koncowa wartosc do-while: " + do_while_i);
    }
}
