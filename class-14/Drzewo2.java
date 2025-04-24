public class Drzewo2 {
    
    public static Owoc zerwijOwoc(){
        Owoc o;
        int los = (int)(Math.random() * 11);
        
        if(los >= 8){
            o = new Jablko();
        }else if(los >= 3){
            o = new Pomarancza();
        }else{
            o = new Gruszka();
        }
        
        return o;
    }
}
