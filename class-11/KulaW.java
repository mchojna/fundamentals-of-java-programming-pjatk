public class KulaW {
    private double promien;

    KulaW(Walec w){
        // if(w.returnPromien() > w.returnWysokosc()){
        //     this.promien = w.returnWysokosc() / 2;
        // }else{
        //     this.promien = w.returnPromien();
        // }
        this.promien = (w.returnPromien()*2 > w.returnWysokosc()) ? (w.returnWysokosc() / 2 ) : (w.returnPromien());
    }

    KulaW(Kwadrat k){
        this.promien = k.returnBok() / 2;
    }

    public void show(){
        System.out.println("promien: " + this.promien);
        System.out.println("objetosc kuli: " + 4 / 3 * 22/7 * Math.pow(this.promien, 3));
    }

}
