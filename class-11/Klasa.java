public class Klasa {

	public static void main(String[] ags) {

		klasa();
	}
	private static void klasa() {

		Cookie y = new Cookie(), z = new Cookie("melon", 70);

		// System.out.println(flavour);		// NIE, nie ma obiektu
		System.out.println(y.flavour);		// pole publiczne w klasie Cookie - apple

		z.flavour = "banana";
		//z.setFlavour("banana");

		//System.out.println(y.mass);		// NIE - pole prywatne w klasie Cookie
		System.out.println(z.getMass());	// 70.0

		z.show();							// Cookie: banana, 70.0

		Cookie.welcome();	// wywołanie metody statycznej (bez obiektu!)
	}
}
    // klasa Cookie
class Cookie {
			// pola
	public String flavour;		// null
	private double mass;		//0
		// konstruktor
	public Cookie() {
		flavour = "apple";
		mass = 50;
	}
		// konstruktor
	public Cookie(String f, double m) {
		flavour = f;	// this.flavour = f;
		mass = m;
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

	static final String text = "Hi Cookie";
		// metoda statyczna
	static void welcome() {
		System.out.println(text);
	}
}