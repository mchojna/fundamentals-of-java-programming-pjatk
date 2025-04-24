public class zadanie_10_2 {
    public static void main(String[] args){
        int[][] tab = calculateSquares(3980, 1440, 540);

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j< tab[i].length; j++){
                System.out.print(tab[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side){
        
        int iloscKwadratowPionowo = screenHeight / side;
        int iloscKwadratowPoziomo = screenWidth / side;

        // System.out.println(iloscKwadratowPionowo);
        // System.out.println(iloscKwadratowPoziomo);

        int iloscKwadratow = iloscKwadratowPionowo * iloscKwadratowPoziomo;

        // System.out.println(iloscKwadratow);
        
        int[][] wspolrzedneKwadratow = new int[iloscKwadratow][2];

        int mnoznikX = 0;
        int mnoznikY = 0;

        for(int i = 0; i < wspolrzedneKwadratow.length; i++){
            for(int j = 0; j < wspolrzedneKwadratow[i].length; j++){
                int wspolrzedne = 0;

                if(j == 0){
                    wspolrzedne = mnoznikX;

                    if((mnoznikX + 2 * side) <= screenWidth){ // tutaj problem 
                        mnoznikX += side;
                    }else{
                        mnoznikX = 0;
                    }
                }else if(j == 1){
                    wspolrzedne = mnoznikY;

                    if(((mnoznikY + 2 * side) <= screenHeight) && (mnoznikX == 0)){
                        mnoznikY += side;
                    }
                }
                wspolrzedneKwadratow[i][j] = wspolrzedne;
            }
        }

        return wspolrzedneKwadratow;

        // for(int i = 0; i < wspolrzedneKwadratow.length; i++){
        //     for(int j = 0; j< wspolrzedneKwadratow[i].length; j++){
        //         System.out.print(wspolrzedneKwadratow[i][j] + ", ");
        //     }
        //     System.out.println();
        // }
    }
}
