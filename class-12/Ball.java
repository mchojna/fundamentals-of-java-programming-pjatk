public class Ball {
    private double radius;
    static int ballCounter;

    Ball(){
        this.radius = (Math.random() * 10) + 10;
    }

    public static Ball makeBall(){
        Ball obj = new Ball();
        ballCounter += 1;
        return obj;
    }

    public static void showCounter(){
        System.out.println(ballCounter);
    }
}
