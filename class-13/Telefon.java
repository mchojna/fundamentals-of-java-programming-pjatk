public class Telefon {
    protected String kolor;

    public Telefon(String kolorVal){
        this.kolor = kolorVal;
    }

    public void zadzwon(String numer){
        System.out.println(numer);
    }
    // public String zadzwon(String numer){
    //     System.out.println(numer);
    //     return numer;
    // }

    public void wyswietlHistoriePolaczen(){
        System.out.println("brak historii");
    }
}
