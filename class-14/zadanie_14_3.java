public class zadanie_14_3 {
    public static void main(String[] args){
        Drzewo[] las = new Drzewo[12];
        
        DrzewoIglaste sosna = new DrzewoIglaste(true, 25, null, 1000, 30);
        DrzewoIglaste modrzew = new DrzewoIglaste(true, 20, null, 500, 20);

        DrzewoLisciaste dab = new DrzewoLisciaste(false, 40, null, 1000);
        DrzewoLisciaste osik = new DrzewoLisciaste(true, 45, null, 4500);

        DrzewoOwocowe moreloweic = new DrzewoOwocowe(false, 30, null, 10, "morela");
        DrzewoOwocowe sliwa = new DrzewoOwocowe(true, 30, null, 40, "sliwka");

        for(int i = 0; i < las.length - 1; i=i+6){
            las[i] = sosna;
            las[i+1] = modrzew;
            las[i+2] = dab;
            las[i+3] = osik;
            las[i+4] = moreloweic;
            las[i+5] = sliwa;
        }

        for(int i = 0; i < las.length; i++){
            System.out.println(las[i]);
            try{
                las[i].zerwijOwoc();
            }catch(DrzewoBezOwocoweException e){
                System.out.println("drzewo bez owocowe!");
            }
        }
    }
}
