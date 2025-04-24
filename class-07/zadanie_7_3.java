public class zadanie_7_3 {
    public static void main(String[] args){

        int[] tab = {1,2,3,4,4,3,2,1};
        int check = 0;

        for(int i = 0; i < tab.length / 2; i++){
            if(tab[i] == tab[tab.length - 1 - i]){
                check += 2;
            }
        }
        if(check == tab.length){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
}
