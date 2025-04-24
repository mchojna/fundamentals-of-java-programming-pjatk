import javax.swing.text.Style;

public class zadanie_5_6 {
    public static void main(String[] args){

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char signHex = scanner.next().charAt(0);

        if(signHex >=0+49 && signHex <= 9+49){
            System.out.println(signHex);
        }else if(signHex == 'A' || signHex == 'a'){
            System.out.println(10);
        }else if(signHex == 'B' || signHex == 'b'){
            System.out.println(11);
        }else if(signHex == 'C' || signHex == 'c'){
            System.out.println(12);
        }else if(signHex == 'D' || signHex == 'd'){
            System.out.println(13);
        }else if(signHex == 'E' || signHex == 'e'){
            System.out.println(14);
        }else if(signHex == 'F' || signHex == 'f'){
            System.out.println(15);
        }else{
            System.out.println(-1);
        }

    }
}
