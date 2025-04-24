public class Donkey {
    private double mass;
    private Balloon[] balloons;
    private int balloonCount;

    Donkey(double massVal){
        this.mass = massVal;
        this.balloons = new Balloon[10];
        this.balloonCount = 0;
    }

    public void addBalloon(Balloon balloonVal){
        if(this.balloonCount < this.balloons.length){
            this.balloons[this.balloonCount++] = balloonVal;
        }else{
            Balloon[] tmpBalloons = new Balloon[this.balloons.length * 2];

            for(int i = 0; i < this.balloons.length; i++){
                tmpBalloons[i] = this.balloons[i]; 
            }

            this.balloons = tmpBalloons;
            this.balloons[this.balloonCount++] = balloonVal;
        }
    }

    public boolean isFlying(){
        double sumaUdzwigu = 0;

        for(int i = 0; i < this.balloonCount; i++){
            sumaUdzwigu += balloons[i].getLoad();
        }

        if(sumaUdzwigu > this.mass){
            System.out.println("Ja latam!!!");
            return true;
        }else{
            System.out.println("Ja jeszcze nie latam!!!" + "\t\tsuma udzwigu: " + sumaUdzwigu + "\tilosc balnow: " + this.balloonCount);
            return false;
        }
    }
}
