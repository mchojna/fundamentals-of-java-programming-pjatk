public class Rakieta {
    protected String nazwa;
    protected int wagaPaliwa;

    public Rakieta(String nazwaVal, int wagaPaliwaVal){
        this.nazwa = nazwaVal;
        this.wagaPaliwa = wagaPaliwaVal;
    }

    public void zatankuj(){
        this.wagaPaliwa += (int)(Math.random() * 100);
    }

    public void start() throws NoFuelException{
        if(this.wagaPaliwa < 1000){
            throw new NoFuelException();
        }else{
            System.out.print("start za 10, 9, 8...");
        }
    }
}
