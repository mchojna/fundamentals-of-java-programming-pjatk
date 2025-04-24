public class PPJ_c9_odpowiedzi {

    public static void main(String[] args) {
        zadanie1();
    }
    private static void zadanie1() {

        int tab[][] = {
                {1, 2, 5, 3, 4},
                {5, 0, 6, 7, 8},
                {9, 3, 0, 5, 6}
            };

        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length ; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        boolean wiersze[] = new boolean[tab.length];    // {false, false, false }
        boolean kolumny[] = new boolean[tab[0].length]; // {false, false, false, false, false}

        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length ; j++) {

                if (tab[i][j] == 0) {
                    wiersze[i] = true;
                    kolumny[j] = true;
                }
            }
        }
        System.out.println();

            // wiersze
        for (int i = 0; i < wiersze.length ; i++)
            System.out.print(wiersze[i] + " ");
        System.out.println();

          // kolumny
        for (int i = 0; i < kolumny.length ; i++)
            System.out.print(kolumny[i] + " ");
        System.out.println();

            // zerowanie wierszy
        for (int i = 0; i < wiersze.length; i++) {
            if (wiersze[i]) {
                for (int j = 0; j < tab[i].length; j++) {
                    tab[i][j] = 0;
                }
            }
        }
            // zerowanie kolumn
        for (int i = 0; i < kolumny.length; i++) {
            if (kolumny[i]) {
                for (int j = 0; j < tab.length; j++) {
                    tab[j][i] = 0;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length ; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

}
