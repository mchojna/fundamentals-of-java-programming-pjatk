public class zadanie_8_6{
    public static void main(String[] args){
        int[][] tab = new int[(int)(Math.random() * 10) + 1][(int)(Math.random() * 10) + 1];
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                tab[i][j] = (int)(Math.random() * 9.9);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int sumaWiersza = 0;

        for(int i = 0; i < tab.length; i++){
            int aktualnaSuma = 0;
            for(int j = 0; j < tab[i].length; j++){
                aktualnaSuma += tab[i][j];
            }
            // System.out.println(aktualnaSuma);
            
            if(aktualnaSuma > sumaWiersza){
                sumaWiersza = aktualnaSuma;
            }
        }
        System.out.println("Najwieksza suma wiersza: " + sumaWiersza);
        System.out.println();
        
        int sumaKolumn = 9 * tab[0].length;

        for(int i = 0; i < tab[0].length; i++){
            int aktualnaSuma = 0;
            for(int j = 0; j < tab.length; j++){
                System.out.print(tab[j][i] + " ");
                aktualnaSuma += tab[j][i];
            }
            if(aktualnaSuma < sumaKolumn){
                sumaKolumn = aktualnaSuma;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Najmniejsza suma kolumn: " + sumaKolumn);
        System.out.println();
    }
}