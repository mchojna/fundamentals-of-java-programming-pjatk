public class zadanie_12_2_3 {
    public static void main(String[] args){
        Donkey d1 = new Donkey(1);

        while(!d1.isFlying()){
            Balloon b = new Balloon();
            d1.addBalloon(b);
        }
    }
}
