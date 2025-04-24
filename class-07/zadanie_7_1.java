public class zadanie_7_1{
    public static void main(String[] args){

        double[] tab = new double[10];

        for(int i = 0; i < tab.length; i++){
            tab[i] = Math.random() * 10;
        }

        System.out.print("[");
        for(double element: tab){
            System.out.print(element + ", ");
        }
        System.out.print("]");

        System.out.println();

        System.out.print("[");
        for(int i = 0; i < tab.length; i++){
            if(i % 2 == 0){
                System.out.print(tab[i] + ", ");
            }
        }
        System.out.print("]");

        System.out.println();

        System.out.print("[");
        for(int i = 0; i < tab.length; i++){
            if((int)(tab[i]) % 2 != 0){
                System.out.print(tab[i] + ", ");
            }
        }
        System.out.print("]");

    }
}