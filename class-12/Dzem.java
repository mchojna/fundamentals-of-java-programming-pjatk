public class Dzem {
    private String smak;
    private double waga;

    Dzem(String smakVal, double wagaVal){
        this.smak = smakVal;
        this.waga = wagaVal;
    }

    Dzem(double wagaVal){
        this.waga = wagaVal;
        this.smak = "No name";
    }

    Dzem(String smakVal){
        this.smak = smakVal;
        this.waga = 100.0;
    }

    public void show(){
        System.out.println("smak: " + this.smak + "\t" + "waga: " + this.waga);
    }
}
