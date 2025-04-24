public class Graniastoslup extends Trojkat {
    double bokC;

    Graniastoslup(double bokAVal, double bokCVal){
        super(bokAVal);
        this.bokC = bokCVal;
    }

    Graniastoslup(Trojkat t, double bokCVal){
        super(t);
        this.bokC = bokCVal;
    }

    @Override
    public void polepowierzchni(){
        System.out.println((Math.pow(super.returnBokA(), 2) * Math.sqrt(3) / 4.0) * 2 * 3 * super.returnBokA() * this.bokC);
    }

    public void objetosc(){
        System.out.println((Math.pow(super.returnBokA(), 2) * Math.sqrt(3) / 4.0) * super.returnBokA() * this.bokC);
    }
}
