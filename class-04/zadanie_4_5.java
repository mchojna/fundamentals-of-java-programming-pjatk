public class zadanie_4_5{
	public static void main(String[] args){
	
		System.out.println('a' + 2); //znak jest konwertowany na kod i dodaje sie do int 
		System.out.println('a' + '2'); //oba znaki sa konwertowane na int i dodane
		System.out.println((char)('a' + 2)); //funkcja konwertuje wartosc numeryczna 3 na znak 'c'
		System.out.println("ppj"+'a'+'2'); //od lewej jest string wiec wszystko jest brane dalej do string
		System.out.println("ppj"+'a'+'\t'+'2'); //lewej jest string wiec wszystko jest brane dalej do string oraz jest znak tabulacji
		System.out.println('a'+'2'+"ppj");
		
	}

}