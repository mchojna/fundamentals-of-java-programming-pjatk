
class Program2 {

	public static void main(String[] ags) {

		klasa2();

	} //koniec metody main


	static void klasa2() {

		Cookie x;

		Cookie y = new Cookie(), z = new Cookie("melon", 70);

		// System.out.println(flavour);		// NIE, nie ma obiektu
		System.out.println(y.flavour);		// pole publiczne w klasie Cookie - apple

		z.flavour = "banana";
		//z.setFlavour("banana");

		//System.out.println(y.mass);		// NIE - pole prywatne w klasie Cookie
		System.out.println(z.getMass());	// 70.0

		z.show();							// Cookie: banana, 70.0

		y.show();

		System.out.println(y.showNumber());			// 1	numer ciasteczka
		System.out.println(z.showNumber());			// 2	numer ciasteczka
		System.out.println(Cookie.counter());		// 2	liczba ciasteczek
	}
}

	// klasa
class Cookie {

		// pola
	public String flavour;
	private double mass;

	private static int counter = 0;
	private int number;			// private int number = ++counter;

		// konstruktor
	public Cookie() {
		this("apple", 50);		// musi wystąpić jako pierwsza instrukcja w konstruktorze

//		flavour = "apple";
//		mass = 50;
//		number = ++counter;
	}

		// konstruktor
	public Cookie(String f, double m) {
		flavour = f;	// this.flavour = s;
		mass = m;		// this.mass = m
		number = ++counter;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getMass() {
		return mass;	// this.mass
	}

		// metoda
	public void show() {
		System.out.println("Cookie: " + this.flavour + ", " + this.mass);
	}

	public int showNumber() {
		return number;
	}

	public static int counter() {
		return counter;
	}
}
