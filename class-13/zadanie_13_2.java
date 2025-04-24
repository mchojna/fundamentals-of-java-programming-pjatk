public class zadanie_13_2 {
    public static void main(String[] args){
        DrzewoIglaste dI = new DrzewoIglaste(true, 10, "200", 10, 2.5);
        System.out.println(dI);

        DrzewoLisciaste dL = new DrzewoLisciaste(false, 20, "10", 20);
        System.out.println(dL);

        DrzewoOwocowe dO = new DrzewoOwocowe(true, 50, "10", 25, "banan");
        System.out.println(dO);
    }
}
