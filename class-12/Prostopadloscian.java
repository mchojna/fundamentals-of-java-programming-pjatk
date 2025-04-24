public class Prostopadloscian extends Prostokat{
    private double bokC;

    Prostopadloscian(double bokAVal, double bokBVal, double bokCVal){
        super(bokAVal, bokBVal);
        this.bokC = bokCVal;
    }

    Prostopadloscian(Prostokat p, double bokCVal){
        super(p);
        this.bokC = bokCVal;
    }

    @Override
    public void polepowierzchni(){
        System.out.println(2 * (super.returnBokA()*super.returnBokB() + super.returnBokA() * this.bokC + returnBokB() * this.bokC));
    }

    public void objetosc(){
        System.out.println(super.returnBokA() * super.returnBokB() * this.bokC);
    }
}
