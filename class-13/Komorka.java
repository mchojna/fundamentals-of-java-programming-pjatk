public class Komorka extends Telefon {
    protected String[] polaczenia = new String[10];

    public Komorka(String kolorVal){
        super(kolorVal);
    }

    @Override
    public void zadzwon(String numer){
        System.out.println(numer);

        for(int i = (this.polaczenia.length - 2); i >= 0; i--){
            this.polaczenia[i+1] = this.polaczenia[i];
        }

        this.polaczenia[0] = numer;
    }

    // public void polaczenia(){
    //     System.out.println();
    //     for(int i = 0; i < this.polaczenia.length; i++){
    //         System.out.print(this.polaczenia[i] + ", ");
    //     }
    //     System.out.println();
    // }

    @Override
    public void wyswietlHistoriePolaczen(){
        System.out.print("historia polaczen komorki: ");
        for(int i = 0; i < this.polaczenia.length; i++){
            System.out.print(this.polaczenia[i] + " || ");
        }
        System.out.println();
    }
}
