public class zadanie_13_7 {
    public static void main(String[] args){
        Telefon t = new Telefon("bialy");
        Komorka k = new Komorka("czarny");
        Smartfon s = new Smartfon("niebieski");

        s.dodajZnajomego(new Osoba("Adam", "K.", "111-111-111"));
        s.dodajZnajomego(new Osoba("Tomasz", "L.", "333-333-333"));
        s.dodajZnajomego(new Osoba("Michal", "M.", "555-555-555"));
        s.dodajZnajomego(new Osoba("Mikolaj", "N.", "777-777-777"));
        s.dodajZnajomego(new Osoba("Aleksander", "O.", "999-999-999"));
        
        Telefon[] arrT = new Telefon[3];
        arrT[0] = t;
        arrT[1] = k;
        arrT[2] = s;

        String[] numery = {"111-111-111",
                            "222-222-222",
                            "333-333-333",
                            "444-444-444",
                            "555-555-555",
                            "666-666-666",
                            "777-777-777",
                            "888-888-888",
                            "999-999-999",
                            "123-456-789"};

        for(int i = 0; i < 10; i++){
            arrT[0].zadzwon(numery[i]);
            arrT[1].zadzwon(numery[i]);
            arrT[2].zadzwon(numery[i]);
        }

        System.out.println();
        for(int i = 0; i < 3; i++){
            arrT[i].wyswietlHistoriePolaczen();
            System.out.println();
        }
    }
}
