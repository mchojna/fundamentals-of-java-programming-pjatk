public class zadanie_7_4 {
    public static void main(String[] args){

        char[] tab = new char[5];

        for(int i = 0; i < tab.length; i++){
            tab[i] = (char)('A' + (int)(Math.random() * 26));
        }

        // System.out.print("[");
        // for(char element: tab){
        //     System.out.print(element + ", ");
        // }
        // System.out.print("]");

        System.out.println();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char c;
        int count = 0;
        int countAll = 0;
        
        do{
            System.out.print("[");
            for(char element: tab){
                System.out.print(element + ", ");
            }
            System.out.print("]");

            System.out.println();

            c = scanner.next().charAt(0);

            for(int i = 0; i < tab.length; i++){
                if(c == tab[i]){
                    tab[i] = '0';
                    count += 1;
                    countAll += 1;
                }
            }

            System.out.println("Znak " + c + " wystapil " + count + " razy");
            count = 0;

        }while(countAll != tab.length);

    }
}
