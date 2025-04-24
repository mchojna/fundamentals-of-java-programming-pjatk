
class Program3 {
	
	public static void main(String[] ags) {
		
		dziedziczenie();
	
	} //koniec metody main

	private static void dziedziczenie() {
		
		Osoba2 o = new Osoba2("Janek");
		Student s1=  new Student("Bronek", "matematyka");
		Student s2 = new Student("Leszek");
		
		System.out.println(o.wyswietl());
		System.out.println(s1.wyswietl());
		System.out.println(s2.wyswietl());
		
		System.out.println();
		
		System.out.println(o);			// o.toString()
		System.out.println(s1);			// s1.StoString()
		System.out.println(s2);			// s2.toString()
		
		System.out.println();
		
		Osoba2[] os = {o, s1, s2, new Osoba2("Marek"), new Student("Mirek", "Malarstwo")};
		
			// wywołanie polimorficzne metod
		for (int i = 0; i < os.length; i++) {
			System.out.println(os[i].wyswietl());
			//System.out.println(os[i]);			// os[i].toString()
		}
	}

}

class Osoba2 {
	
	private String imie;
	
	public Osoba2(String imie) {
		this.imie = imie;
	}
	
//	public Osoba2() {
//		//...
//	}

	protected String wyswietl() {
		return ("imie = " + imie);
	}

	@Override
	public String toString() {
		return ("imie = " + imie);
	}

}

class Student extends Osoba2 {
	
	private String kierunek;
	
	public Student(String imie, String kierunek) {
		
		super(imie);
		this.kierunek = kierunek;
	}
	
	public Student(String imie) {
		this(imie, "informatyka");	
	}
	
	@Override
	protected String wyswietl() {
		return (super.wyswietl() + ", kierunek = " + this.kierunek);
		
	}
	
	@Override
	public String toString() {
		return (super.toString() + ", kierunek = " + this.kierunek);
	}
}
