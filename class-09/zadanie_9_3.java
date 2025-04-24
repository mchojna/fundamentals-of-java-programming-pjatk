public class zadanie_9_3 {
    public static void main(String[] args){
        int wrt = 5;
        System.out.println("var przed modifyValue: " + wrt);
        modifyValue(wrt);
        System.out.println("var po modifyValue: " + wrt); // zmienna nie zmieniła swojej wartości ponieważ metoda tworzy kopie tej zmiennej i na niej przeprowadza operacje
    }
    public static void modifyValue(int val){
        System.out.println(val);
        val *= 5;
        System.out.println(val);
    }
}
