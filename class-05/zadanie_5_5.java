public class zadanie_5_5 {
    public static void main(String[] args){

        java.util.Scanner scanner = new java.util.Scanner(System.in);
            
        System.out.println("Prosze podaj pierwszy kat: ");
        int kat1 = scanner.nextInt();
        
        System.out.println("Prosze podaj drugi kat: ");
        int kat2 = scanner.nextInt();

        System.out.println("Prosze podaj trzeci kat: ");
        int kat3 = scanner.nextInt();

        if(kat1 + kat2 + kat3 == 180){
            System.out.println("Trojkat o katach: " + kat1 + ", " + kat2 + ", " + kat3 + " moze istniec na plaszczyznie euklidesowej");
            if(kat1 < 90 && kat2 < 90 && kat3 < 90){
                System.out.println("Trojkat jest ostrokatny");
            }
        }else{
            System.out.println("Trojkat o katach: " + kat1 + ", " + kat2 + ", " + kat3 + " nie moze istniec na plaszczyznie euklidesowej");
        }
    }
}
