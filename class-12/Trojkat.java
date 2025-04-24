public class Trojkat {
    private double bokA;

    Trojkat(double bokAVal){
        this.bokA = bokAVal;
    }

    Trojkat(Trojkat t){
        this.bokA = t.returnBokA();
    }

    public void polepowierzchni(){
        System.out.println(Math.pow(this.bokA, 2) * Math.sqrt(3) / 4.0);
    }

    public double returnBokA(){
        return this.bokA;
    }
}
