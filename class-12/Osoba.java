public class Osoba {
    private String imie;
    private int rokUrodzenia;

    Osoba(String imieVal, int rokUrodzeniaVal){
        this.imie = imieVal;
        this.rokUrodzenia = rokUrodzeniaVal;
    }

    Osoba(String imieVal){
        this.imie = imieVal;
        this.rokUrodzenia = 1990;
    }

    public String zwrocImie(){
        return this.imie;
    }

    public int zwrocWiek(){
        return 2023 - this.rokUrodzenia;
    }

    public static Osoba zwrocStarszaOsobe(Osoba osobaVal1, Osoba osobaVal2){
        if(osobaVal1.zwrocWiek() > osobaVal2.zwrocWiek()){
            return osobaVal1;
        }else{
            return osobaVal2;
        }
    }

    public static Osoba zwrocNajstarszaOsobe(Osoba[] osobaArr){
        Osoba najstarszaOsoba = osobaArr[0];
        
        for(int i = 1; i < osobaArr.length; i++){
            if(najstarszaOsoba.zwrocWiek() < osobaArr[i].zwrocWiek()){
                najstarszaOsoba = osobaArr[i];
            }
        }
        return najstarszaOsoba;
    }
}
