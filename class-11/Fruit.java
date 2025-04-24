public class Fruit {
    private String name;
    private double weight;

    Fruit(String nameVal){
        this.name = nameVal;
        this.weight = (Math.random() * 0.5) + 0.3;
    }

    public void show(){
        System.out.println("owoc: " + this.name + "\t" + "waga: " + this.weight);
    }
}
