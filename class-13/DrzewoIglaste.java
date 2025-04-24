public class DrzewoIglaste extends Drzewo{
    protected int iloscIgiel;
    protected double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZieloneVal, int wysokoscVal, String przekrojDrzewaVal, int iloscIgielVal, double dlugoscSzyszkiVal){
        super(wiecznieZieloneVal, wysokoscVal, przekrojDrzewaVal);

        this.iloscIgiel = iloscIgielVal;
        this.dlugoscSzyszki = dlugoscSzyszkiVal;
    }

    @Override
    public String toString(){
        return this.wiecznieZielone + " " + this.wysokosc + " " + this.przekrojDrzewa + " " + this.iloscIgiel + " " + this.dlugoscSzyszki;
    }
}
