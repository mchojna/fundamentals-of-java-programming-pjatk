public class zadanie_14_4 {
    public static void main(String[] args){
        Drzewo2 d = new Drzewo2();

        Owoc[] arrOwoc = new Owoc[100];
        double lacznaWaga = 0;
        int liczbaJablek = 0;
        int liczbaPomaranczy = 0;
        int liczbaGruszek = 0;

        int i = 0;

        while(i < 100 && lacznaWaga < 5000){
            arrOwoc[i] = d.zerwijOwoc();

            lacznaWaga += arrOwoc[i].masa();
            
            if(arrOwoc[i].nazwa() == "Jablko"){
                liczbaJablek += 1;
            }else if(arrOwoc[i].nazwa() == "Pomarancza"){
                liczbaPomaranczy += 1;
            }else{
                liczbaGruszek += 1;
            }

            System.out.print("iteracja: " + i);
            System.out.print("\towoc:" + arrOwoc[i].nazwa());
            System.out.print("\tmasa:" + arrOwoc[i++].masa());
            System.out.println("\tlaczna waga: " + lacznaWaga);
        }

        System.out.println("licza jablek: " + liczbaJablek + "\tliczba pomaranczy: " + liczbaPomaranczy + "\tliczba gruszek:" + liczbaGruszek);
    }
}
