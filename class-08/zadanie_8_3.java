public class zadanie_8_3{
    public static void main(String[] args){
        int[][] tab = {
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 0, 1},
        };
        
        int dlugosc = 0;

        for(int i = 0; i < tab.length; i++){
            dlugosc += tab[i].length;
        }

        int[] tab1D = new int[dlugosc];
        int index1D = 0;

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                tab1D[index1D] = tab[i][j];
                index1D += 1;
            }
        }

        for(int element: tab1D){
            System.out.print(element + ", ");
        }
    }
}