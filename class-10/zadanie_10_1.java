public class zadanie_10_1{
    public static void main(String[] args){

        int a = (int)(Math.random() * 10) + 1;
        int b = (int)(Math.random() * 10) + 1;

        int[][] tab1 = new int[a][a];
        int[][] tab2 = new int[a][a];

        for(int i = 0; i < tab1.length; i++){
            for(int j = 0; j < tab1[i].length; j++){
                tab1[i][j] = (int)(Math.random() + 10);
                tab2[i][j] = tab1[i][j];
            }
        }

        int[][] tab3 = new int[a][b];
        int[][] tab4 = new int[a][b];

        for(int i = 0; i < tab3.length; i++){
            for(int j = 0; j < tab3[i].length; j++){
                tab3[i][j] = (int)(Math.random() + 10);
                tab4[i][j] = tab3[i][j];
            }
        }
        
        
        int[][] tab5 = new int[a][b];
        int[][] tab6 = new int[b][a];

        for(int i = 0; i < tab5.length; i++){
            for(int j = 0; j < tab5[i].length; j++){
                tab5[i][j] = (int)(Math.random() + 10);
            }
        }
        for(int i = 0; i < tab6.length; i++){
            for(int j = 0; j < tab6[i].length; j++){
                tab6[i][j] = (int)(Math.random() + 10);
            }
        }

        System.out.println(jestRowna(tab1, tab2));
        System.out.println(jestRowna(tab3, tab4));
        System.out.println(jestRowna(tab5, tab6));
    }

    public static boolean jestRowna(int[][] arr1, int[][] arr2){
        
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i].length != arr2[i].length){
                    return false;
                }
            }

            for(int j = 0; j < arr1.length; j++){
                for(int k = 0; k < arr1[j].length; k++){
                    if(arr1[j][k] != arr2[j][k]){
                        return false;
                    }
                }
            }

            return true;

        }else{
            return false;
        }
    }
}