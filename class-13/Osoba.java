public class Osoba {
    protected String imie;
    protected String nazwisko;
    protected String numer;

    public Osoba(String imieVal, String nazwiskoVal, String numerVal){
        this.imie = imieVal;
        this.nazwisko = nazwiskoVal;
        this.numer = numerVal;
    }

    public String numer(){
        return this.numer;
    }

    @Override
    public String toString(){
        return this.imie + " " + this.nazwisko + " " + this.numer;
    }
}
