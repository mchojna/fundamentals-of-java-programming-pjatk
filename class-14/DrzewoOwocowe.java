public class DrzewoOwocowe extends DrzewoLisciaste {
    protected String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZieloneVal, int wysokoscVal, String przekrojDrzewaVal, int ksztaltLisciaVal, String nazwaOwocaVal){
        super(wiecznieZieloneVal, wysokoscVal, przekrojDrzewaVal, ksztaltLisciaVal);

        this.nazwaOwoca = nazwaOwocaVal;
    }

    @Override
    public String toString(){
        return this.wiecznieZielone + " " + this.wysokosc + " " + this.przekrojDrzewa + " " + this.ksztaltLiscia + " " + this.nazwaOwoca;
    }

    @Override
    public void zerwijOwoc() throws DrzewoBezOwocoweException{
        if(this.nazwaOwoca == null){
            throw new DrzewoBezOwocoweException();
        }else{
            System.out.println("owoc: " + this.nazwaOwoca);
        }
        
    }
}
