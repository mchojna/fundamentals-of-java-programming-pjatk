public class zadanie_13_6 {
    public static void main(String[] args){
        Telefon t = new Telefon("bialy");
        t.zadzwon("111-111-111");
        t.wyswietlHistoriePolaczen();

        Komorka k = new Komorka("czarny");
        k.zadzwon("222-222-222");
        k.wyswietlHistoriePolaczen();
        k.zadzwon("333-333-333");
        k.zadzwon("444-444-444");
        k.zadzwon("555-555-555");
        k.zadzwon("666-666-666");
        k.zadzwon("777-777-777");
        k.wyswietlHistoriePolaczen();

        Smartfon s = new Smartfon("niebieski");
        s.dodajZnajomego(new Osoba("Tomasz", "Kowalski", "111-111-111"));
        s.dodajZnajomego(new Osoba("Adam", "Nowakowski", "222-222-222"));
        s.wyswietlZnajomych();
        s.zadzwon("111-111-111");
        s.zadzwon("222-222-222");
        s.zadzwon("333-333-333");
        s.wyswietlHistoriePolaczen();

        s.dodajZnajomego(new Osoba("Mikolaj", "Wisniewski", "444-444-444"));
        s.wyswietlZnajomych();
        s.zadzwon("444-444-444");
        s.wyswietlHistoriePolaczen();

    }
}
