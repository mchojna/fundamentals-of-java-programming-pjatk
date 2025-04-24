public class DrzewoLisciaste extends Drzewo {
    protected int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZieloneVal, int wysokoscVal, String przekrojDrzewaVal, int ksztaltLisciaVal){
        super(wiecznieZieloneVal, wysokoscVal, przekrojDrzewaVal);

        this.ksztaltLiscia = ksztaltLisciaVal;
    }

    @Override
    public String toString(){
        return this.wiecznieZielone + " " + this.wysokosc + " " + this.przekrojDrzewa + " " + this.ksztaltLiscia;
    }
}
