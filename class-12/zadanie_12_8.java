public class zadanie_12_8 {
    public static void main(String[] args){
        Prostokat p1 = new Prostokat(10, 5);
        Prostokat p2 = new Prostokat(p1);

        p1.polepowierzchni();
        p2.polepowierzchni();

        Prostopadloscian ps1 = new Prostopadloscian(10, 5, 5);
        Prostopadloscian ps2 = new Prostopadloscian(p1, 5);

        ps1.polepowierzchni();
        ps1.objetosc();

        ps2.polepowierzchni();
        ps2.objetosc();

        Trojkat t1 = new Trojkat(10);
        Trojkat t2 = new Trojkat(t1);

        t1.polepowierzchni();
        t2.polepowierzchni();

        Ostroslup o1 = new Ostroslup(10, 5);
        Ostroslup o2 = new Ostroslup(t1, 5);

        o1.polepowierzchni();
        o1.objetosc();

        o2.polepowierzchni();
        o2.objetosc();

        Graniastoslup g1 = new Graniastoslup(10, 5);
        Graniastoslup g2 = new Graniastoslup(t1, 5);

        g1.polepowierzchni();
        g1.objetosc();

        g2.polepowierzchni();
        g2.objetosc();
    }
}