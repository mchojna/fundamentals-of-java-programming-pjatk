public class zadanie_10_5 {
    public static void main(String[] args){
        int index = (int)(Math.random() * 10);
        int[] tab = new int[(int)(Math.random() * 10) + 10];
        
        for(int i = 0; i < tab.length; i++){
            tab[i] = (int)(Math.random() * 10);
        }

        for(int element: tab){
            System.out.print(element + ", ");
        }
        System.out.println("from: " + index);

        System.out.println(maxElem(tab, index));
    }
    public static int maxElem(int[] arr, int from){
        if(from == arr.length - 1){
            return arr[from];
        }else{
            if(arr[from] > maxElem(arr, from + 1)){
                return arr[from];
            }else{
                return maxElem(arr, from + 1);
            }
        }      
    }
}
