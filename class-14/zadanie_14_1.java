public class zadanie_14_1{
    public static void main(String[] args){
        Rakieta r = new Rakieta("Rakieta 1", 100);
        boolean started = false;
        do{
            try{
                r.start();
                started = true;
            }catch(NoFuelException e){
                System.out.println("start anulowany - za malo paliwa");
                r.zatankuj();
            }
        }while(!started);
    }
}