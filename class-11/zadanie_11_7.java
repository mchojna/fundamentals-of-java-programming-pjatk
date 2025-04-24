public class zadanie_11_7 {
    public static void main(String[] args){
        KulaNa k1 = new KulaNa(new Kwadrat(10));
        KulaNa k2 = new KulaNa(new Walec(5, 5));

        k1.show();
        k2.show();
    }
}
