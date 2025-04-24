public class zadanie_8_5{
    public static void main(String[] args){
        int[][] tab = new int[(int)(Math.random() * 10) + 1][(int)(Math.random() * 10) + 1];
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                tab[i][j] = (int)(Math.random() * 9.9);
            }
        }

        // System.out.println("Wiersze: " + tab[0].length);
        // System.out.println("Kloumny: " + tab.length);

        System.out.println();
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                System.out.print(tab[i][j] + ", ");
            }
            System.out.println();
        }

        // System.out.println();
        // for(int i = 0; i < tab[0].length; i++){
        //     for(int j = 0; j < tab.length; j++){
        //         System.out.print(tab[j][i]);
        //     }
        //     System.out.println();
        // }
        
        System.out.println();

        int[] tabMinMax = new int[tab[0].length];
        int k = 0;

        for(int i = 0; i < tab[0].length; i++){
            int wartoscMin = 20;
            int wartoscMax = 0;

            for(int j = 0; j < tab.length; j++){
                // System.out.print(tab[j][i]);
                int aktualnaWartosc = tab[j][i];
                if(i % 2 == 0){
                    if(aktualnaWartosc > wartoscMax){
                        wartoscMax = aktualnaWartosc;
                    }
                }else{
                    if(aktualnaWartosc < wartoscMin){
                        wartoscMin = aktualnaWartosc;
                    }
                }

            }
            if(i % 2 == 0){
                System.out.println("wartosc max: " + wartoscMax);
                tabMinMax[i] = wartoscMax;
            }else{
                System.out.println("wartosc min: " + wartoscMin);
                tabMinMax[i] = wartoscMin;
            }            
        }
        System.out.println();

        for(int i = 0; i < tabMinMax.length; i++){
            System.out.print(tabMinMax[i] + ", ");
        }

    }
}