public class zadanie_6_1{

    public static void main(String[] args){


        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char ch = scanner.next().charAt(0);

        switch(ch){

            case 'e', 'y', 'u', 'i', 'o', 'a': {
                System.out.println("Samogloska"); 
                break;}
            
            case 'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm': {
                System.out.println("Spolgloska");
                break;
            }
            default: {
                System.out.println("Nie rozpoznaje");
            }
                


        }

        String typLitery;
        typLitery = switch(ch){

            case 'e', 'y', 'u', 'i', 'o', 'a' -> "Samogloska";
            
            case 'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm' -> "Spolgloska";
            
            default -> "Nie rozpoznaje";

        };

        System.out.println(typLitery);
    }

}