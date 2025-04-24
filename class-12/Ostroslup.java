public class Ostroslup extends Trojkat {
    private double wysokosc;
    private double wysokoscBoku;
    
    Ostroslup(double bokAVal, double wysokoscVal){
        super(bokAVal);
        this.wysokosc = wysokoscVal;
        this.wysokoscBoku = Math.sqrt((Math.pow((super.returnBokA() * Math.sqrt(3.0) / 2.0) * (1.0 / 3.0), 2.0) + Math.pow(this.wysokosc, 2.0)));
    }

    Ostroslup(Trojkat t, double wysokoscVal){
        super(t);
        this.wysokosc = wysokoscVal;
        this.wysokoscBoku = Math.sqrt((Math.pow((super.returnBokA() * Math.sqrt(3.0) / 2.0) * (1.0 / 3.0), 2.0) + Math.pow(this.wysokosc, 2.0)));

    }

    @Override
    public void polepowierzchni(){
        System.out.println((Math.pow(super.returnBokA(), 2.0) * Math.sqrt(3.0) / 4.0) * 3.0 * super.returnBokA() * this.wysokoscBoku / 2.0);
    }

    public void objetosc(){
        System.out.println((1.0 / 3.0) * this.wysokosc * (Math.pow(super.returnBokA(), 2) * Math.sqrt(3) / 4.0));
    }
}
