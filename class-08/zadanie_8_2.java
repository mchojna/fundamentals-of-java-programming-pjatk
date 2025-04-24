public class zadanie_8_2{
    public static void main(String[] args){
        int[][] tab = new int[8][8];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                tab[i][j] = (int)(Math.random() * 10);
                // System.out.print(tab[i][j] + ", ");
            }
        }
        int przekatnaPrawa = 0;
        for(int i = 0; i < tab.length; i++){ 
            przekatnaPrawa += tab[i][i];
        }
        System.out.println("Prawa przekatna: " + przekatnaPrawa);

        int przekatnaLewa = 0;
        for(int i = 0; i < tab.length; i++){ 
            przekatnaLewa += tab[i][tab.length - 1 - i];
        }
        System.out.println("Lewa przekatna: " + przekatnaLewa);
    }
}