public class zadanie_4_7{

	public static void main(String[] args){
	
		char z = 'a';
		z+=1;
		System.out.println(z);
		
		char x = 'a';
		x++;
		System.out.println(x);
		
		char y = 'a';
		//y = y + 1; to nie dziala poniewaz probuje sie dodac typ char do typu int 
		System.out.println(y);
		
		char t = 'a';
		t = ((char)(t+1));
		System.out.println(t);
		
	
	}

}