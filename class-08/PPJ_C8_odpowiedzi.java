public class PPJ_C8_odpowiedzi {

	public static void main(String[] args) {

		tablice2D();

		zadanie08_01();
		zadanie08_02();
		zadanie08_03();
		zadanie08_04();
		zadanie08_06();
	}


			// tablice wielowymiarowe: przykłady użycia
		private static void tablice2D() {

				/*
				1 2
				3 4 5
				6
				*/
			int[] tab1[] = {{1, 2}, {3, 4, 5}, {6}};	// int[][] tab1;
				/*
				tab1[0][0]  tab1[0][1]
				tab1[1][0]  tab1[1][1]  tab1[1][2]
				tab1[2][0]

				tab1.length = liczba wierszy

				tab1[0].length = liczba elementów pierwszego wiersza
				tab1[1].length = liczba elementów drugiego wiersza
				...

				*/

				/*
				0 0 0
				0 0 0
				*/
			int[][] tab2 = new int[2][3];

			for (int i = 0; i < tab2.length; i++) {
				for (int j = 0; j < tab2[i].length; j++) {
					System.out.print(tab2[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println();

			/*
			 0 0
			 0
			 1 2 3
			 5 6 7 8
			 */
			int[][] tab3 = new int[4][];
			int[] tab4 = {1, 2, 3};

			tab3[0] = new int[2];
			tab3[1] = new int[1];
			tab3[2] = tab4;
			tab3[3] = new int[] {5, 6, 7, 8};

			for (int i = 0; i < tab3.length; i++) {
				for (int j = 0; j < tab3[i].length; j++) {
					System.out.print(tab3[i][j] + " ");
				}
				System.out.println();
			}

			/*	// tablica dwuwymiarowa kwadratowa tab[][]

	     elementy tab[i][j]

		  	 j| 0 1 2 3
		   i  | 				  indeksy (ij)			tab[0][0] = 1
		   ------------                                 tab[0][1] = 3
		   0  | 1 3 2 4			  00 01 02 03           tab[1][0] = 5
		   1  | 5 7 6 6           10 11 12 13	        tab[2][0] = 9
		   2  | 9 1 2 0           20 21 22 23           ...
		   3  | 4 7 1 8           30 31 32 33       	tab[3][3] = 8

			*/
		}

		// tablica tablic
	private static void zadanie08_01() {

			// tablice elementów typu int
		int[] tab1 = {1, 2, 3}, tab2 = {4, 5, 6, 7, 8};
		int tab3[] = {9, 10, 11};

			// tablica tablic
		int[] tabtab[] = {tab1, tab2, tab3};	// int[][] tabtab;

		for (int i = 0; i < tabtab.length; i++){
			for (int j = 0; j < tabtab[i].length ; j++)
				System.out.print(tabtab[i][j] + " ");
			System.out.println();
		}
	}
		// przekątne tablicy dwuwymiarowej
	private static void zadanie08_02() {

		int zakres = 10;
		int[][] tab = new int[8][8];

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = (int)(Math.random()*zakres);
				System.out.printf("%2d ", tab[i][j]);
			}
			System.out.println();
		}

		int przekatna1 = 0;
		for (int i = 0; i < tab.length ; i++)
			przekatna1 = przekatna1 + tab[i][i];

		int przekatna2 = 0;
		for (int i = 0; i < tab.length ; i++)
			przekatna2 = przekatna2 + tab[i][tab.length-i-1];

		System.out.println(przekatna1 + ", " + przekatna2);

	}
		// tab2D -> tab1D
	private static void zadanie08_03() {
		int[][] arr2D = {
					{1 , 0 , 0 , 0 , 0} ,
					{0 , 1 , 0 , 0} ,
					{0 , 0 , 1}
		};

		int length = 0;
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				length++;
			}
		}

//		int length = 0;
//		for (int i = 0; i < arr2D.length; i++) {
//			length = length + arr2D[i].length;
//		}

		int[] arr1D = new int[length];

		int k = 0;
		for (int i = 0; i < arr2D.length ; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				arr1D[k] = arr2D[i][j];
				k++;
			}
		}

		for (int i = 0; i < arr1D.length ; i++)
			System.out.print(arr1D[i] + " ");
		System.out.println();
	}

		// element najbliższy średniej
	private static void zadanie08_04() {

		int tab[][] = new int[3][5];

			// losowanie wartości
		for (int i = 0; i < tab.length ; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = (int)(Math.random()*10);
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}

			// suma elementów tablicy
		int suma = 0;
		for (int i = 0; i < tab.length ; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				suma = suma + tab[i][j];
			}
		}

		double srednia = (double)suma/(tab.length*tab[0].length);

			// element najbliższy średniej
		int imin = 0, jmin = 0;
		double min = Math.abs(tab[0][0] - srednia);
		for (int i = 0; i < tab.length ; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (min > Math.abs(tab[i][j] - srednia)) {
					min = Math.abs(tab[i][j] - srednia);
					imin = i;
					jmin = j;
				}
			}
		}
		System.out.println("Średnia: " + srednia);
		System.out.println("Element najbliższy średniej: " + tab[imin][jmin]);
	}

		// wiersz o największej sumie, kolumna o najmniejszej sumie
	private static void zadanie08_06() {
		int tab[][] = new int[4][5];

			// losowanie wartości
		for (int i = 0; i < tab.length ; i++) {
			for (int j = 0; j < tab[i].length ; j++) {
				tab[i][j] = (int) (Math.random()*10);
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}

		int wiersz = 0;
		int sumaWiersza = 0, sumaMaxWierszy = 0;
		for (int i = 0; i < tab.length ; i++) {
			sumaWiersza= 0;
			for (int j = 0; j < tab[i].length ; j++) {
				sumaWiersza = sumaWiersza + tab[i][j];
			}
			System.out.println(sumaWiersza);

			if (i == 0)
				sumaMaxWierszy = sumaWiersza;
			else
				if (sumaMaxWierszy < sumaWiersza) {
					sumaMaxWierszy = sumaWiersza;
					wiersz = i;
				}
		}

		System.out.println("Indeks wiersza z największą sumą elementów: " + wiersz);

		int kolumna = 0;
		int sumaKolumny = 0, sumaMinKolumn = 0;
		for (int i = 0; i < tab[0].length ; i++) {
			sumaKolumny= 0;
			for (int j = 0; j < tab.length ; j++) {
				sumaKolumny = sumaKolumny + tab[j][i];
			}
			System.out.println(sumaKolumny);

			if (i == 0)
				sumaMinKolumn = sumaKolumny;
			else
				if (sumaMinKolumn > sumaKolumny) {
					sumaMinKolumn = sumaKolumny;
					kolumna = i;
				}
		}
		System.out.println("Indeks kolumny z najmniejszą sumą elementów: " + kolumna);
	}
}
