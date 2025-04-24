public class Walec {
    private double promien;
    private double wysokosc;

    Walec(double promienVal, double wysokoscVal){
        this.promien = promienVal;
        this.wysokosc = wysokoscVal;
    }

    public void show(){
        System.out.println("pole powierzchni walca: " + 22/7 * Math.pow(this.promien, 2));
        System.out.println("objetosc walca: " + 22/7 * Math.pow(this.promien, 2) * this.wysokosc);
    }

    public double returnPromien(){
        return this.promien;
    }

    public double returnWysokosc(){
        return this.wysokosc;
    }
}
