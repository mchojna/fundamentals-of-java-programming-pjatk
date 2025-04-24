public class zadanie_4_8{
	public static void main(String[] args){
		
		double x = 1, d = 1e-16, y = x + d;
		
		System.out.println(x + ", " + d + ", " + y);
		
		System.out.println(d > 0);
		System.out.println(x < y);
		System.out.println(x == y); //liczba d jest za mala aby miec wplyw na liczbe x
		System.out.println(x > y); //liczba d jest za mala aby miec wplyw na liczbe x
	
		}

}