public class Prostokat {
    private double bokA;
    private double bokB;

    Prostokat(double bokAVal, double bokBVal){
        this.bokA = bokAVal;
        this.bokB = bokBVal;
    }

    Prostokat(Prostokat p){
        this.bokA = p.returnBokA();
        this.bokB = p.returnBokB();
    }

    public void polepowierzchni(){
        System.out.println(this.bokA * this.bokB);
    }

    public double returnBokA(){
        return this.bokA;
    }

    public double returnBokB(){
        return this.bokB;
    }
}
