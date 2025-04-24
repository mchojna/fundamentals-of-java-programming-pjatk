import java.util.Random;

public class Ppjz11 {

    public static void main(String[] args) {
        zadanie11_01();
        //zadanie11_02();
        //zadanie11_03();
        //zadanie11_04_05_06_07();
    }

    static void zadanie11_01() {
        System.out.println(MathOperations.CalculateCircleArea(5.0));
    }

    static void zadanie11_02() {

        Person p1 = new Person(), p2 = new Person();

        p1.name = "Jan";
        p1.surname = "Janiak";
        p1.birthyear = 2000;
    }

    static void zadanie11_03() {
        Fruit f = new Fruit("mango");
        f.show();
    }

    static void zadanie11_04_05_06_07() {

        Kwadrat k1 = new Kwadrat(5);
        k1.show();

        Walec w1 = new Walec(5, 10);
        w1.show();

        KulaW kw1 = new KulaW(k1);
        kw1.show();

        KulaW kw2 = new KulaW(w1);
        kw2.show();

        KulaNa kn1 = new KulaNa(k1);
        kn1.show();

        KulaNa kn2 = new KulaNa(w1);
        kn2.show();
    }
}
class MathOperations {
    static final double Pi = 3.14;
    static double CalculateCircleArea(double radius) {
        return Pi*radius*radius;
    }
}

class Person {

    public String name;
    public String surname;
    public int birthyear;
}

class Fruit {

    private String name;
    private double weight;

    public Fruit (String name) {
        this.name = name;
        weight = new Random().nextDouble(0.5, 0.8);
    }

    public void show() {
        System.out.println("Fruit: " + name + ", " + weight);
    }
}

class Kwadrat {

    private double bok;

    public Kwadrat(int b) {
        bok = b;
    }

    public void show()
    {	System.out.print("Bok = " + bok + "; ");
        System.out.print("Pole = " + bok*bok + "; ");
        System.out.println("Objętość = " + bok*bok*bok);
    }

//	public void showWalec()
//	{
//		Walec w = new Walec(bok/2,bok);
//		w.show();
//	}

    public double getBok()
    {
        return bok;
    }
}

class Walec {

    private double promien, wysokosc;
    public Walec(double p, double w) { promien = p; wysokosc = w; };

    public void show()
    {
        System.out.print("Promień = " + promien + ", " + "wysokość = " + wysokosc + "; ");
        System.out.print("Pole powierzchni = " + Math.PI*promien*promien + "; ");	// pi*r^2
        System.out.println("Objętośc = " + Math.PI*promien*promien*wysokosc);			// pi*r^2*h
    }

    public double getPromien()
    {
        return promien;
    }

    public double getWysokosc()
    {
        return wysokosc;
    }

}

class KulaW {

    private double r;

    public KulaW(Kwadrat k) {
        r = k.getBok()/2;
    }

    public KulaW(Walec w) {
        r = Math.min(w.getPromien(), w.getWysokosc()/2);
    }

    public void show()
    {
        System.out.print("KulaW: ");
        System.out.println("promien = " + r);
    }
}

class KulaNa {

    private double r;

    public KulaNa(Kwadrat k) {

        double b = k.getBok();
        r = Math.sqrt(b*b + (b*b + b*b))/2;
    }

    public KulaNa(Walec w) {

        double h = w.getWysokosc();
        double r = w.getPromien();

        r = Math.sqrt((2*r)*(2*r) + h*h)/2;
    }

    public void show()
    {
        System.out.print("KulaNa: ");
        System.out.println("promien = " + r);
    }
}