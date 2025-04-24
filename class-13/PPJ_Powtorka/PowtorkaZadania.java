class PowtorkaZadania {

    public static void main(String[] args) {
        
    }

    private static void zadanie01() {

        int sizeLimit = 10, valueLimit = 20;
        int size = 1 + (int)(Math.random()*sizeLimit);

        int array[] = new int[size];

        int sum = 0;

            // wypelnianie tablicy i wyswietlanie elementow tablicy
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*valueLimit);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();

        double aMean = sum/(double)size;

        System.out.println("Średnia arytmetyczna: " + aMean);

        int minIndex = 0;
        int closest = array[minIndex];
        double minDiff = (closest - aMean>0)?(closest - aMean):(aMean-closest); // Math.abs(closet-aMean)

        for (int i = 1; i < size; i++){
            if (minDiff >= Math.abs(array[i]-aMean)) {
                minDiff = Math.abs(array[i] - aMean);
                minIndex = i;
            }
        }

        System.out.println("Wynik = " + array[minIndex]);
    }

    private static void zadanie02(char[] str)
    {
        for (int i = 0; i < str.length; i++) {

            char z = str[i];
            int ile = 0;
            boolean bylo = false;

            for (int j = 0; j < i && !bylo; j++)
                if (z == str[j]) {
                    bylo = true;
                }

            if (!bylo) {
                for (int j = i; j < str.length; j++)
                    if (z == str[j]) ile++;

                System.out.println(z + " występuje " + ile + ((ile==1)?" raz.":" razy."));
            }
        }
    }

        // scalanie 2 tablic naprzemiennie
    private static int[] merge (int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length+arr2.length];

        int i = 0, j = 0;

        for (int k = 0; k < arr.length;) {

            if (i<arr1.length)
                arr[k++] = arr1[i++];

            if (j<arr2.length)
                arr[k++] = arr2[j++];
        }

        return arr;
    }

        // transponowanie tablicy
    private static int[][] trans(int[][] arr) {

        int[][] trans = new int[arr[0].length][arr.length];

        for (int i = 0; i < trans.length; i++)
            for (int j = 0; j < trans[i].length; j++)
                trans[i][j] = arr[j][i];

        return trans;
    }

        // rotacja w prawo o 90 stopni
    private static int[][] rotate(int[][] arr) {

        int[][] rot = new int[arr[0].length][arr.length];

        for (int i = 0; i < rot.length; i++) {
            for (int j = 0; j < rot[i].length; j++) {
                rot[i][j] = arr[rot[i].length-j-1][i];
            }
        }

        return rot;
    }

    private static int binSearch (int arr[], int begin, int end, int value) {

        if (begin > end) return -1;

        int center = (begin + end)/2;
        if (value < arr[center]) return binSearch(arr, begin, center-1, value);
        else if (value > arr[center]) return binSearch(arr, center+1, end, value);
        else return center;
    }

    private static void zadanie06() {
        int arr[] = {1, 3, 4, 6, 7, 8, 9};
        System.out.println(binSearch(arr,2,arr.length-1, 3));   // -1
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = tmp;
    }

    private static void bubleSortRe(int[] arr, int n) {

        if (n == 1)
            return;

        for (int i = 0; i < n-1; i++)
            if (arr[i] > arr[i+1])
                swap(arr, i, i+1);

        bubleSortRe(arr, n-1);
    }

    private static void zadanie09() {

        String[] A = {"PSG", "Atletico Madryt","Sporting CP", "Inter",
                "Benfica", "Villarreal", "RB Salzburg", "Chelsea"},
                B = {"Manchester City", "Liverpool", "Ajax Amsterdam",
                        "Real Madryt", "Bayern Monachium", "Manchester United",
                        "Lille", "Juventus"};

        MyQueue mq = new MyQueue();

        int a = 0, b = 0;
        boolean exit = false;

            // z koszyków do kolejki
        while (!exit) {
            if (a < A.length) {
                mq.put(A[a]);
                a++;
                //A[a] = null;
            }
            if (b < B.length) {
                mq.put(B[b]);
                b++;
                //B[b] = null;
            }

            exit = (a == A.length) && (b == B.length);
        }
        mq.show();

        System.out.println();

        while (!mq.isEmpty()) {
            System.out.println(mq.get() + " - " + mq.get());
        }
        mq.show();
    }
}
class MyQueue{

    private String[] arr;
    private int size = 5;	// rozmiar początkowy
    private int pos = 0;	// pozycja kolejnego wstawionego elementu = ile elementów w kolejce

    public MyQueue() {
        arr = new String[size];
    }

    public void put(String el) {

        if (pos >= arr.length) {	// za mała tablica/kolejka
            size = size*2;
            String[] tmp = new String[size];
            for (int i = 0; i < arr.length ; i++) {
                tmp[i] = arr[i];
            }
            arr = tmp;
        }

        arr[pos++] = el;
    }

    public String get() {

        if (arr[0] == null) return null;	// pusta kolejka

        String rem = arr[0];	// element do usunięcia z kolejki

        for (int i = 0; i < pos-1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[pos-1]= null;

        pos--;

        return rem;
    }

    public boolean isEmpty() {
        return pos == 0;
    }

    public void show() {

        if (pos == 0)
            System.out.println("Empty queue!");

        for (int i = 0; i < pos ; i++)
            System.out.print(arr[i] + "...");
        System.out.println();
    }
}
