public class Drzewo {
    protected boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    public Drzewo(boolean wiecznieZieloneVal, int wysokoscVal, String przekrojDrzewaVal){
        this.wiecznieZielone = wiecznieZieloneVal;
        this.wysokosc = wysokoscVal;
        this.przekrojDrzewa = przekrojDrzewaVal;
    }

    @Override
    public String toString(){
        return this.wiecznieZielone + " " + this.wysokosc + " " + this.przekrojDrzewa;
    }
}
