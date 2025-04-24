public class zadanie_10_3 {
    public static void main(String[] args){
        System.out.println(gcdI(24, 36));
    }
    public static int gcdI(int a, int b){
        while(b != 0){
            int reszta;
            reszta = a % b;
            a = b;
            b = reszta;
        }
        return a;
    }
}
