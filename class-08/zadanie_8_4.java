public class zadanie_8_4{
    public static void main(String[] args){
        int[][] tab = new int[(int)(Math.random() * 10) + 1][(int)(Math.random() * 10) + 1];

        double suma = 0;
        double ilosc = 0;

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                tab[i][j] = (int)(Math.random() * 10);
                System.out.print(tab[i][j] + ", ");
                suma += tab[i][j];
                ilosc += 1;
            }
            System.out.println();
        }

        System.out.println("Suma: " + suma);
        System.out.println("Ilosc: " + ilosc);

        double srednia = suma / ilosc;
        System.out.println("Srednia: " + srednia);
        
        int wartosc = 0;
        double roznicaMin = suma;

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){   
                int element = tab[i][j];
                
                if(Math.pow((element - srednia), 2) < roznicaMin){
                    roznicaMin = Math.pow((element - srednia), 2);
                    wartosc = element;
                }
            }
        }

        System.out.println("Najblizszy element: " + wartosc);

    }
}