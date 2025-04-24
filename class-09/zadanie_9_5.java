import java.util.Arrays;

public class zadanie_9_5 {
    public static void main(String[] args){
        splitToDigits(1234);

    }
    public static int[] splitToDigits(int val){
        int[] tab = {};

        for(int i = 1; val > 0; i++){
            int cyfra;
            cyfra  = val % 10;
            // System.out.println(cyfra);
            val = val / 10;
            // System.out.println(val);

            int[] tmpTab = new int[i];

            for(int j = tab.length - 1; j >= 0; j--){
                tmpTab[j + 1] = tab[j];
            }

            tmpTab[0] = cyfra;
            
            tab = new int[i];
            tab = tmpTab;
        }

        for(int element: tab){
            System.out.print(element + ", ");
        }
        return(tab);
    }
}
