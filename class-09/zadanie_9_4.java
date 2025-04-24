public class zadanie_9_4 {
    public static void main(String[] args){
        System.out.println(findMax(7, 22, 7));
    }
    public static int findMax(int val1, int val2, int val3){
        if((val1 >= val2) && (val1 >= val3)){
            return val1;
        }else if((val2 >= val1) && (val2 >= val3)){
            return val2;
        }else{
            return val3;
        }
    }
}
