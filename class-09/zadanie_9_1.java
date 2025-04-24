public class zadanie_9_1{
    public static void main(String[] args){

        int rowsNum = (int)(Math.random() * 10) + 1;
        int columnsNum = (int)(Math.random() * 10) + 1;

        int[][] tab = new int[rowsNum][columnsNum];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                tab[i][j] = (int)(Math.random() * 10);
            }
        }

        showTab(tab);

        boolean[] zeroRows = new boolean[rowsNum];
        boolean[] zeroColumns = new boolean[columnsNum];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                if(tab[i][j] == 0){
                    zeroColumns[j] = true;
                    zeroRows[i] = true;
                }
            }
        }

        for(boolean element: zeroRows){
            System.out.print(element + ", ");
        }

        System.out.println();

        for(boolean element: zeroColumns){
            System.out.print(element + ", ");
        }
        
        System.out.println();
        System.out.println();

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                if((zeroRows[i] == true) || (zeroColumns[j] == true)){
                    tab[i][j] = 0;
                }
            }
        }

        showTab(tab);
        
    }
    public static void showTab(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}