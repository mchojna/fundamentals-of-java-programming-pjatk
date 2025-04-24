public class zadanie_10_4{
    public static void main(String[] args){
        System.out.println(gcdR(15, 60));
    }
    public static int gcdR(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcdR(b, a%b);
        }
    }
}