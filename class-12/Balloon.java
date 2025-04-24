public class Balloon {
    private double wielkoscLatexu;
    private double iloscHelu;
    private double udzwig;

    Balloon(){
        this.wielkoscLatexu = 9;
        this.iloscHelu = (Math.random() * 0.005) + 0.004;
        this.udzwig = getLoad();
    }

    public double getLoad(){
        return (this.iloscHelu * this.wielkoscLatexu / 0.007) * 0.001;
    }
} 
