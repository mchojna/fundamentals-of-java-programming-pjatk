import java.util.*;

public class Ppjz12 {

    public static void main(String[] args) {
        zadanie12_01();
    }

    static void zadanie12_01() {
        Product p1 = new Product("masło", 6),
                p2 = new Product("laptop", 4000);

        ShoppingCart sc1 = new ShoppingCart("Satan Claus");
        ShoppingCart sc2 = new ShoppingCart("Satan Claus");


        p1.addToShoppingCart(sc1);
        p2.addToShoppingCart(sc2);

//        sc.addProduct(p1);
//        sc.addProduct(p2);

        sc1.displayProducts();
        sc2.displayProducts();
    }
    static void zadanie12_02a() {
        Baloon bal = new Baloon();
        bal.show();
    }

    static void zadanie12_02_03() {
        flyingDonkeyTest();
    }

    static void zadanie12_05() {
        Dzem d1 = new Dzem("truskawkowy", 50);
        Dzem d2 = new Dzem("bananowy");
        Dzem d3 = new Dzem(200);
    }

    static void zadanie12_06() {
        for (int i = 0; i < 10; i++)
            Ball.makeBall();

        Ball.showCounter();
    }

    static void zadanie12_07() {

        Osoba o1 = new Osoba("Anna"), o2 = new Osoba("Bella", 1921),
                o3 = new Osoba("Janek", 1950), o4 = new Osoba("Marek", 1980);

        Osoba[] tab = {o1, o2, o3,  o4};

        for (int i = 0; i < tab.length ; i++) {
            tab[i].show();
        }

        System.out.println();

        Osoba osoba = Osoba.zwrocNajstarszaOsobe(tab);
        osoba.show();

        System.out.println(osoba);
        Osoba.zwrocNajstarszaOsobe(tab).show();

    }
    static void zadanie12_08() {
        Prostokat p = new Prostokat(5,  10);
        System.out.println("Prostokat: " + p);
        System.out.println("Pole powierzchni prostokata = " + p.pole());

        System.out.println();

        Prostopadloscian pr = new Prostopadloscian(3,  4,  5);
        //Prostopadloscian pr = new Prostopadloscian(new Prostokat(3,4),  5);

        System.out.println("Prostopadloscian: " + pr);
        System.out.println("Calkowite pole powierzchni prostopadloscianu = " + pr.pole());
        System.out.println("Objetosc prostopadloscianu = " + pr.obj());
    }

    private static void zadanie12_09() {
        Os o = new Os("Janek");
        Spawacz s = new Spawacz("Bronek", 10);

        System.out.println(o.wyswietl());
        System.out.println(s.wyswietl());
    }
    static void flyingDonkeyTest() {

        Donkey don = new Donkey();
        don.show();

        boolean loadMore = true;
        while (loadMore) {

            Baloon b = new Baloon();
            b.show();
            don.addBaloon(b);
            //don.addBaloon2(b);
            if (don.isFlying()) {
                loadMore = false;
                System.out.println("Ja latam");
            }

        }

    }

}

class Product {
    private String name;
    private double price;
    private ShoppingCart shoppingCart;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addToShoppingCart(ShoppingCart sc) {
        shoppingCart = sc;
        sc.addProduct(this);
    }

    public void display() {
        System.out.println(this.name + ", " + this.price);
    }
}
class ShoppingCart {
    private String customerName;
    private Product[] products;
    private int productCount = 0;

    public ShoppingCart(String customerName) {
        this.customerName = customerName;
        products = new Product[20];
    }
    public void addProduct(Product p) {
        if (productCount < products.length)
            products[productCount++] = p;

        // ewentualne rozszerzenie tablicy produktów
    }
    public void displayProducts() {
//        for (Product p : products)
//            if (p != null)
//                p.display();

        for (int i = 0; i < productCount ; i++)
            products[i].display();
    }
}

class Baloon {

    private double filling;
    private final double LOAD_NORM = 6, FILLING_NORM = 0.007;

    public Baloon() {
        filling = new Random().nextDouble(0.005, 0.009);;
    }

    public double getLoad() {
        return LOAD_NORM*filling/FILLING_NORM;
    }

    public void show() {
        System.out.println(n + ". Baloon: " + String.format("%.4f", filling) + " m^3 - " + String.format("%.4f", getLoad()) + " g");
    }

    private static int c = 0;
    private int n = ++c;

}

class Donkey {

    private double mass;
    private Baloon[] baloons;

    public Donkey() {
        int size = 100;				// poczatkowy rozmiar tablicy balonów
        mass = Math.random()*5;		// waga osła
        baloons = new Baloon[size];
    }

    public void addBaloon(Baloon newBaloon) {

        int i = 0;
            // i - pierwsze puste miejsce w tablicy
        while (i < baloons.length && baloons[i] != null) {
            i++;
        }

            // jeśli jest puste miejsce w tablicy
        if (i< baloons.length) {
            baloons[i] = newBaloon;		// wstawienie nowego elementu do tablicy
        } else {
                // powiększanie tablicy 2 razy
            int size = baloons.length * 2;
            Baloon[] temp = new Baloon[size];
                // kopiowanie z starej tablicy do nowej
            for (int j = 0; j < i ; j++) {
                temp[j] = baloons[j];
            }
            temp[i] = newBaloon; 	// wstawienie nowego elementu do tablicy

            baloons = temp;
        }

    }

	/*
	int firstFree = 0;
	public void addBaloon2(Baloon newBaloon) {

			// jeśli są miejsca w tablicy
		if (firstFree < baloons.length) {
			baloons[firstFree++] = newBaloon;		// wstawienie nowego elementu do tablicy
		} else {
				// powiększanie tablicy 2 razy
			int size = baloons.length * 2;
			Baloon[] temp = new Baloon[size];
				// kopiowanie z starej tablicy do nowej
			for (int j = 0; j < firstFree ; j++) {
				temp[j] = baloons[j];
			}
			temp[firstFree++] = newBaloon; 	// wstawienie nowego elementu do tablicy

			baloons = temp;
		}

	}
	*/

    public boolean isFlying() {

        double load = 0;

        int i = 0;
        while (i < baloons.length && baloons[i] !=  null) {
            load += baloons[i++].getLoad();
        }

        if (load/1000 > mass) {
            System.out.println("Load = " + String.format("%.4f", load/1000) + " kg");
        }

        return (load/1000 > mass);

    }

    public void show() {
        System.out.println("Donkey: " + String.format("%.4f", mass) + " kg");
    }

}

class Dzem {

    private String smak;
    private double waga;

    Dzem(String s, double w)
    {
        smak = s;
        waga = w;
    }

    Dzem(String s)
    {
        this(s, 100);
    }

    Dzem(double w)
    {
        this("No name", w);
    }

    public String toString()
    {
        return smak + ", " + waga;
    }
}

class Ball {
    private double radius;
    private static int ballCounter;

    public static Ball makeBall() {
        Ball b = new Ball();
        b.radius = new Random().nextDouble(10, 20);
        ballCounter++;
        return b;
    }

    public static void showCounter() {
        System.out.println("Balls = " + ballCounter);
    }
}
class Osoba {

    private String imie;
    private int rokUrodzenia;

    Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    Osoba(String imie) {
        this.imie = imie;
        rokUrodzenia = 1990;
        // this(imie, 1990);
    }

    public String zwrocImie() {
        return this.imie;
    }

    public int zwrocWiek() {
        return 2023 - this.rokUrodzenia;
    }

    public static Osoba zwrocStarszaOsobe(Osoba o1, Osoba o2) {
        return (o1.zwrocWiek() > o2.zwrocWiek())?o1:o2;
    }

    public static Osoba zwrocNajstarszaOsobe(Osoba[] tab) {

        Osoba najstarsza = tab[0];
        for (int i = 1; i < tab.length ; i++)
            najstarsza = zwrocStarszaOsobe(najstarsza, tab[i]);

        return najstarsza;
    }

    public void show() {
        System.out.println(this.imie + ", " + this.zwrocWiek());
    }

    public String toString() {
        return this.imie + ", " + this.zwrocWiek();
    }
}

class Prostokat {

    private int sz, dl;

    public Prostokat(int sz, int dl) {
        this.sz = sz;
        this.dl = dl;
    }

    protected int pole() {
        return sz*dl;
    }

    public int getSz() {
        return sz;
    }

    public int getDl() {
        return dl;
    }

    @Override
    public String toString() {
        return "szerokosc = " + sz + ", dlugosc = " + dl;
    }

}

class Prostopadloscian extends Prostokat {

    private int wys;

    public Prostopadloscian(int sz, int dl, int wys) {
        super(sz, dl);
        this.wys = wys;
    }

    //	public Prostopadloscian(Prostokat pr, int wys) {
//		super(pr.getSz(), pr.getDl());
//		this.wys = wys;
//	}
//
    public int pole() {
        return 2*(super.pole() + getDl()*wys + getSz()*wys);
    }

    public int obj() {
        return super.pole()*this.wys;
    }

    @Override
    public String toString() {
        return super.toString() + ", wysokosc = " + wys;
    }
}

class Os {

    private String imie;

    public Os(String imie) {
        this.imie = imie;
    }

    protected String wyswietl() {
        return ("imie = " + imie);
    }
}

class Spawacz extends Os {
    private int stazPracy;

    public Spawacz(String imie, int stazPracy) {
        super(imie);
        this.stazPracy = stazPracy;
    }

    @Override
    protected String wyswietl() {
        return (super.wyswietl() + ", staz pracy " + this.stazPracy);

    }
}