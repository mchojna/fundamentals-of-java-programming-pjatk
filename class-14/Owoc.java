public class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwaVal, double masaVal){
        this.nazwa = nazwaVal;
        this.masa = masaVal;
    }

    public String nazwa(){
        return this.nazwa;
    }

    public double masa(){
        return this.masa;
    }
}
