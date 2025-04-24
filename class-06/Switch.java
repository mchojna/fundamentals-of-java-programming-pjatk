public class Switch {
	
	public static void main(String[] args) {

		int x = 1, y = 0;
		
// instrukcja switch

		switch (x) {
			case 1: System.out.print("case 1: "); y = 10; break;
			case 2: y = 13; break;
			case 3: y = 15; break;
			default: y = -1;
		}
		System.out.println(y);	// case 1: 10

		
		String s = "ppj";
		switch (s) {
			case "ppj": y = 10;
			case "tak": {y = 13; break;}
			case "wsi": y = 15; break;
		}
		System.out.println(y);	// 13

		
		x = 3;
		switch (x) {
			case 1: y = 10; break;
			case 2, 3: y = 15; break;
			default: y = -1;
		}
		System.out.println(y);	// 15

		
		x = 1;
		switch (x) {
			case 1 -> y = 10;
			case 2, 3 -> y = 15;
			default -> y = -1;
		};
		System.out.println(y);	// 10

		
// wyrażenie switch

		y = switch (x) {
				case 1 -> 10;
				case 2, 3 -> 15;
				default -> -1;
		};
		System.out.println(y);	// 10

		
		y = switch (x) {
				case 1 -> {System.out.print("case 1: "); yield 11;}
				case 2, 3 -> 15;
				default -> -1;
		};
		System.out.println(y);	// case 1: 11
		
		
		y = switch (x) {
				case 1: System.out.print("case 1: "); yield 11;
				case 2, 3: {System.out.print("case 2: "); yield 23;} 
				default: yield -1;
		};
		System.out.println(y);	// case 1: 11


		enum poraRoku {wiosna, lato, jesień, zima};
		poraRoku p = poraRoku.zima;

		String poczatek = switch (p) {
			case wiosna -> "marzec";
			case lato -> "czerwiec";
			case jesień -> "wrzesień";
			case zima -> "grudzień";
			// case blad -> "nieTaPora";
			default -> "nie wiem";	// niepotrzebnie bo enum
		};
		System.out.println("Początek \"" + p + "\": " + poczatek);
	}
}