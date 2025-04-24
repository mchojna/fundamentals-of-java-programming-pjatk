public class PPJ_powtorka_zadania{
    public static void main(String[] args){
        // zadanie_01();

        // char[] c = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a', ' ', 'a', ' ', 'k', 'o', 't', ' ', 'm', 'a', ' ', 'A', 'l', 'e'};
        // zadanie_02(c);

        // int[] t1 = {1, 32, 435, 654, 54, 3, 2, 6, 7, 8};
        // int[] t2 = {44, 32, 67, 90, 84, 4, 1, 2, 3, 4};
        // zadanie_03(t1, t2);

        // int[][] t = {
        //     {1, 3, 2},
        //     {4, 6, 5},
        //     {8, 7, 9},
        //     {0, 3, 1},
        //     {6, 9, 5}
        // };

        // zadanie_04(t);

        // zadanie_05(t);
        
        // int[] tab = {0, 2, 5, 10, 11, 14, 25, 40, 59, 89, 90};
        // System.out.print(zadanie_06(tab, 3, 8, 59));

        // zadanie_07(tab, 0, 1);

        // int[] tab = new int[(int)(Math.random() * 20) + 10];
        // for(int i = 0; i < tab.length; i++){
        //     tab[i] = (int)(Math.random() * 100);
        // }

        // zadanie_08(tab, 5);

        MyQueue queue = new MyQueue();

        MyQueue A = new MyQueue();
        MyQueue B = new MyQueue();

        A.put("PSG");
        A.put("Atletico Madryt");
        A.put("Sporting CP");
        A.put("Inter");
        A.put("Beneficia");
        A.put("Villarreal");
        A.put("RB Salzburg");
        A.put("Chelsea");
        A.show();
        System.out.println("A len: " + A.len());

        B.put("Manchester City");
        B.put("Liverpool");
        B.put("Ajax Amsterdam");
        B.put("Real Madryt");
        B.put("Bayern Monachium");
        B.put("Manchester United");
        B.put("Lille");
        B.put("Juventus");
        B.show();
        System.out.println("B len: " + B.len());

        while(A.len() > 0){
            queue.put(A.get());
            queue.put(B.get());
        }

        A.show();
        B.show();
        queue.show();
        System.out.println("queue: " + queue.len());

        while(queue.len() > 0){
            System.out.println(queue.get() + "\t" + queue.get());
            System.out.println("queue len:" + queue.len());
        }
    }

    public static void zadanie_01(){
        int[] arr = new int[(int)(Math.random() * 10) + 10];

        double srednia = 0.0;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
            srednia += arr[i];

            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        srednia /= arr.length;

        int najblizszaWartosc = 100;

        double odchylenie = Math.pow((najblizszaWartosc - srednia), 2);

        for(int i = 0; i < arr.length; i++){
            double odchylenieAktulane = Math.pow((arr[i] - srednia), 2);

            if(odchylenie > odchylenieAktulane){
                odchylenie = odchylenieAktulane;
                najblizszaWartosc = arr[i];
            }
        }

        System.out.println("srednia: " + srednia + "\t" + "odchylenie: " + odchylenie);
        System.out.println("najblizsza wartosc: " + najblizszaWartosc);
    }

    public static void zadanie_02(char[] c){
        
        char[] znak = new char[c.length];
        int[] liczba = new int[c.length];

        int nextLetterIndex = 0;
        
        for(int i = 0; i < c.length; i++){

            boolean isAlready = false;
            

            for(int j = 0; j < znak.length; j++){
                if(c[i] == znak[j]){
                    isAlready = true;
                    liczba[j] += 1;
                }else{

                }
            }

            if(!isAlready){
                znak[nextLetterIndex] = c[i];
                liczba[nextLetterIndex] = 1;
                nextLetterIndex += 1;
            }
        }

        char[] tmpTabC = znak;
        int [] tmpTabI = liczba;

        znak = new char[nextLetterIndex];
        liczba = new int[nextLetterIndex];

        for(int i = 0; i < nextLetterIndex; i++){
            znak[i] = tmpTabC[i];
            liczba[i] = tmpTabI[i];
            System.out.println("znak: " + znak[i] + "\t" + "liczba: " + liczba[i]);
        }

    }

    public static void zadanie_03(int[] a1, int[] a2){
        int len = a1.length > a2.length ? a2.length : a1.length;

        int[] a3 = new int[a1.length + a2.length];

        int index1 = 0, 
            index2 = 0;

        for(int i = 0; i < len * 2; i++){
            if(i % 2 == 0){
                a3[i] = a1[index1++];
            }else{
                a3[i] = a2[index2++];
            }
        }

        for(int i = len * 2; i < a3.length; i++){
            a3[i] = a1.length > a2.length ? a1[index1++] : a2[index2++];
        }

        System.out.println();
        for(int i = 0; i < a1.length; i++){
            System.out.print(a1[i] + ", ");
        }

        System.out.println();
        for(int i = 0; i < a2.length; i++){
            System.out.print(a2[i] + ", ");
        }

        System.out.println();
        for(int i = 0; i < a3.length; i++){
            System.out.print(a3[i] + ", ");
        }
    }

    public static void zadanie_04(int[][] arr){
        int[][] arrT = new int[arr.length][arr.length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arrT[j][i] = arr[i][j];
            }
        }

        for(int i = 0; i < arrT.length; i++){
            for(int j = 0; j < arrT[i].length; j++){
                System.out.print(arrT[i][j] + ", ");
            }
            System.out.println();
        }


    }

    public static void zadanie_05(int[][] arr){
        int[][] arrT = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                arrT[i][arrT[0].length - j - 1] = arr[j][i];
            }
        }

        for(int i = 0; i < arrT.length; i++){
            for(int j = 0; j < arrT[0].length; j++){
                System.out.print(arrT[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static int zadanie_06(int[] arr, int begin, int end, int value){

        int middle = 1  + (begin + end) / 2;

        if(value > arr[end] || value < arr[begin] || begin > end || end < begin || end > arr.length - 1 || begin < 0){
            return -1;
        }else if(value == arr[middle]){
            return middle;
        }else if(value > arr[middle]){
            return zadanie_06(arr, middle, end, value);
        }else if(value < arr[middle]){
            return zadanie_06(arr, begin, middle, value);
        }else{
            return -1;
        }
    }

    public static void zadanie_07(int[] tab, int source, int destination){
        if(source > tab.length || source < 0 || destination > tab.length || destination < 0){
            System.out.println("-1");
        }else{
            System.out.print("before: ");
            for(int i = 0; i < tab.length; i++){
                System.out.print(tab[i] + ", ");
            }
            System.out.println();
    
            int a = tab[source];
            tab[source] = tab[destination];
            tab[destination] = a;

            System.out.print("after: ");
            for(int i = 0; i < tab.length; i++){
                System.out.print(tab[i] + ", ");
            }
        }
    }

    public static void zadanie_08(int[] arr, int n){
        
        boolean anyChanges = false;
        int counter = 0;

        do{
            anyChanges = false;

            for(int i = 0; i < n; i++){

                if(i < arr.length - 1){

                    if(arr[i] > arr[i + 1]){

                        int tmp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = tmp;

                        anyChanges = true;
                    }
                }
            }

            System.out.print("[round: " + (counter++) + "] tab: ");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + ", ");
            }
            System.out.println();

            n -= 1;

        }while(anyChanges);
    }

}