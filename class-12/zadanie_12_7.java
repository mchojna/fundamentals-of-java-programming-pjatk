public class zadanie_12_7 {
    public static void main(String[] args){
        Osoba o0 = new Osoba("Kasia");
        Osoba o1 = new Osoba("Michal", 2002);
        Osoba o2 = new Osoba("Asia", 1998);
        Osoba o3 = new Osoba("Adam", 1966);
        Osoba o4 = new Osoba("Iwona", 1963);
        Osoba o5 = new Osoba("Mikolaj", 2002);
        Osoba o6 = new Osoba("Aleksander", 2003);
        Osoba o7 = new Osoba("Ala", 1995);
        Osoba o8 = new Osoba("Tomasz", 2000);
        Osoba o9 = new Osoba("Kamil", 2010);
        Osoba o10 = new Osoba("Zosia", 1954);

        System.out.println(o0.zwrocImie());
        System.out.println(o0.zwrocWiek());

        System.out.println(o1.zwrocImie());
        System.out.println(o1.zwrocWiek());

        Osoba oStarsza1 = Osoba.zwrocStarszaOsobe(o1, o2);
        Osoba oStarsza2 = Osoba.zwrocStarszaOsobe(o10, o4);
        Osoba oStarsza3 = Osoba.zwrocStarszaOsobe(o4, o6);

        System.out.println("osoba starsza 1: " + oStarsza1.zwrocImie());
        System.out.println("osoba starsza 2: " + oStarsza2.zwrocImie());
        System.out.println("osoba starsza 3: " + oStarsza3.zwrocImie());

        Osoba[] osobaArr1 = {o1, o2, o3, o4, o5};
        Osoba[] osobaArr2 = {o6, o7, o8, o9, o10};
        Osoba[] osobaArr3 = {o1, o2, o3, o4, o5, o6, o7, o8, o9, o10};

        Osoba oNajstarsza1 = Osoba.zwrocNajstarszaOsobe(osobaArr1);
        Osoba oNajstarsza2 = Osoba.zwrocNajstarszaOsobe(osobaArr2);
        Osoba oNajstarsza3 = Osoba.zwrocNajstarszaOsobe(osobaArr3);

        System.out.println("osoba najstarsza 1: " + oNajstarsza1.zwrocImie());
        System.out.println("osoba najstarsza 2: " + oNajstarsza2.zwrocImie());
        System.out.println("osoba najstarsza 3: " + oNajstarsza3.zwrocImie());
    }
}
