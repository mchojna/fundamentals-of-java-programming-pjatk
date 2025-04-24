public class zadanie_7_5 {
    public static void main(String[] args){
        int[] tab = new int[(int)(Math.random() * 10)];

        for(int i = 0; i < tab.length; i++){
            tab[i] = i;
        }

        for(int element: tab){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("...");        

        int[] tabPerm = new int[tab.length];

        for(int i = 0; i < tab.length; i++){

            int randomIndexA = (int)(Math.random() * (tab.length - 1));
            int randomIndexB = (int)(Math.random() * (tab.length - 1));

            int a = tab[randomIndexA];
            int b = tab[randomIndexB];

            tab[randomIndexA] = b;
            tab[randomIndexB] = a;

            tabPerm[i] = randomIndexB;

        }

        for(int element: tab){
            System.out.print(element + " ");
        }
        System.out.println();

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++){
                if(tab[i] == j){
                    System.out.print("* ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
