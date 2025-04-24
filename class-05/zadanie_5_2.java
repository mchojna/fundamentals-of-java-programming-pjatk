public class zadanie_5_2 {
    
    public static void main(String[] args){

        boolean czyPada = true;

        boolean czySwieciSlonce = true;

        if(czyPada == true){
            if(czySwieciSlonce==false){
                System.out.println("plucha");
            } else {
                System.out.println("tecza");
            }
        }else {
            if(czySwieciSlonce==false){
                System.out.println("pochmurno");
            } else {
                System.out.println("slonecznie");
            }
        }

    }
}
