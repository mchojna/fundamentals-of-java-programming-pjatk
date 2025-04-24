public class Kwadrat {
    private double bok;

    Kwadrat(double blokVal){
        this.bok = blokVal;
    }

    public void show(){
        System.out.println("pole: " + this.bok * this.bok);
        System.out.println("objetosc: " + this.bok * this.bok * 6);
    }

    public double returnBok(){
        return this.bok;
    }
}
