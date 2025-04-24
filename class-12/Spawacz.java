public class Spawacz extends Osoba9 {
    private int stazPracy;

    Spawacz(String imieVal, int stazPracyVal){
        super(imieVal);
        this.stazPracy = stazPracyVal;
    }

    @Override
    public String wyswietl(){
        return super.wyswietl() + "\tstaz pracy: " + this.stazPracy;
    }
}
