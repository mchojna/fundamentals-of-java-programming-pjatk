public class zadanie_11_6 {
    public static void main(String[] args){
        KulaW k1 = new KulaW(new Kwadrat(10));
        KulaW k2 = new KulaW(new Walec(5, 5));

        k1.show();
        k2.show();
    }
}
