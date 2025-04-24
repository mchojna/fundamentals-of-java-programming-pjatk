public class zadanie_6_7 {
    
    public static void main(String[] args){

        double sumOfNum = 0.0;
        double lastNum = 1.0;
        double nextNum;
        

        for(int i = 0; i < 10; i++){
            
            if(i == 0){
                sumOfNum += 1;
            }else{
                nextNum = lastNum / 2;
                sumOfNum += nextNum;
                lastNum = nextNum;
            }
            
            System.out.println("element" + i + " : " + sumOfNum);

            //sumOfNum += (1/(Math.pow(2, i)));
            //System.out.println(sumOfNum);

        }

    }
}
