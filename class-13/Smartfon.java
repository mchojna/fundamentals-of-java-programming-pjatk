public class Smartfon extends Komorka {
    protected Osoba[] znajomi = new Osoba[1];
    protected int iloscZnajomych = 0;

    public Smartfon(String kolorVal){
        super(kolorVal);
    }

    public void dodajZnajomego(Osoba znajomy){
        if(this.znajomi[this.znajomi.length - 1] != null){

            Osoba[] tmpZnajomi = this.znajomi;
            this.znajomi = new Osoba[tmpZnajomi.length * 2];

            for(int i = 0; i < tmpZnajomi.length; i++){
                this.znajomi[i] = tmpZnajomi[i];
            }
        }
    
        this.znajomi[iloscZnajomych++] = znajomy;
    }

    public void wyswietlZnajomych(){
        System.out.println();
        for(int i = 0; i < this.znajomi.length; i++){
            System.out.print(this.znajomi[i] + ", ");
        }
        System.out.println();
    }

    public Osoba wyszukajZnajomego(String numer){

        for(int i = 0; i < this.znajomi.length; i++){
            if(this.znajomi[i] != null){
                if(numer == this.znajomi[i].numer()){
                    return this.znajomi[i];
                };
            }
        }
        return null;
    }

    @Override
    public void wyswietlHistoriePolaczen(){
        System.out.print("historia polaczen smartfona: ");
        for(int i = 0; i < this.polaczenia.length; i++){
            if(wyszukajZnajomego(polaczenia[i]) == null){
                System.out.print(polaczenia[i] + " || ");
            }else{
                System.out.print(wyszukajZnajomego(polaczenia[i]) + " || ");
            };
        }
        System.out.println();
    }
}
