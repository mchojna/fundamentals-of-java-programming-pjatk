public class KulaNa {
    private double promien;

    KulaNa(Walec w){
        this.promien = Math.sqrt(Math.pow(w.returnPromien() * 2, 2) + Math.pow(w.returnWysokosc(), 2)) / 2;
    }

    KulaNa(Kwadrat k){
        this.promien = Math.sqrt(Math.pow(k.returnBok(), 2) * 2) / 2;
    }

    public void show(){
        System.out.println("promien: " + this.promien);
        System.out.println("objetosc kuli: " + 4 / 3 * 22/7 * Math.pow(this.promien, 3));
    }
}
