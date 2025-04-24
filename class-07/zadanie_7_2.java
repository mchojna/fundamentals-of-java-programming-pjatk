public class zadanie_7_2 {
    public static void main(String[] args){
         boolean[] tab = new boolean[10];

        for(int i = 0; i < tab.length; i++){
            if((int)(Math.random() * 10) % 2 == 0){
                tab[i] = true;
            }else{
                tab[i] = false;
            }
        }

        System.out.print("[");
        for(boolean element: tab){
            System.out.print(element + ", ");
        }
        System.out.print("]");

        boolean[] tabTrue = {};
        boolean[] tabFalse = {};

        for(int i = 0; i < tab.length; i++){

            if(tab[i] == true){

                boolean[] tmpTabTrue = tabTrue;

                tabTrue = new boolean[tmpTabTrue.length + 1];

                for(int j = 0; j < tmpTabTrue.length; j++){
                    tabTrue[j] = tmpTabTrue[j];
                }

                tabTrue[tabTrue.length - 1] = tab[i];
                
            }else{

                boolean[] tmpTabFalse = tabFalse;

                tabFalse = new boolean[tmpTabFalse.length + 1];

                for(int k = 0; k < tmpTabFalse.length; k++){
                    tabFalse[k] = tmpTabFalse[k];
                }

                tabFalse[tabFalse.length - 1] = tab[i];
            }

        }

        System.out.println();

        System.out.print("[");
        for(boolean element: tabTrue){
            System.out.print(element + ", ");
        }
        System.out.print("]");

        System.out.println();

        System.out.print("[");
        for(boolean element: tabFalse){
            System.out.print(element + ", ");
        }
        System.out.print("]");

    }
}
