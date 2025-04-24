public class zadanie_14_2 {
    public static void main(String[] args){
        DetektorDymu d = new DetektorDymu();
        boolean alarm = false;
        do{
            try{
                d.sprawdz();
                System.out.println("bezpiecznie");
            }catch(Alarm a){
                alarm = true;
                System.out.print("alarm!");
            }
        }while(!alarm);
    
    }
}
