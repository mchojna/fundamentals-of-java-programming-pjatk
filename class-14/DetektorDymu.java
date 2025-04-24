public class DetektorDymu {
    
    public void sprawdz() throws Alarm{
        if((int)(Math.random() * 10) == 0){
            throw new Alarm();
        }
    }
}
