import java.util.Scanner;

public class Tp2 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

//        fibonacci_1();
//        fibonacci_2();
//        fibonacci_3();

        int[] tab = { 4, 6, 4, 2, 10, 2, 4, 8, 10, 1, 4, 9, 8, 9, 4, 1, 8, 2, 9 };
        int[] tab1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        int[] tab2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] tab3 = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        int[] tab4 = { 2023, 2016, 2014, 2032, 2011, 2022, 2014, 1992, 2014, 1998, 2020, 2028, 2011, 2009, 2017, 2001, 2028, 2014, 2025 };

//        triComptage(tab);
        bubbleSort(tab);

        scanner.close();
    }

    public static void fibonacci_1() {
        System.out.println("[FIBO_1] Nombre: ");
        int nombre = scanner.nextInt();

        int fibo0 = 0;
        int fibo1 = 1;

        System.out.print(fibo0 + " " + fibo1 + " ");

        int fiboNmoins2 = fibo0;
        int fiboNmoins1 = fibo1;

        for(int i = 2; i <= nombre; i++) {
           int fiboN = fiboNmoins1 + fiboNmoins2;
            System.out.print(fiboN + " ");

            fiboNmoins2 = fiboNmoins1;
            fiboNmoins1 = fiboN;
        }

        System.out.println();
        System.out.println("-----------------------------");
    }

    public static void fibonacci_2() {
        System.out.println("[FIBO_2] Nombre: ");
        int nombre = scanner.nextInt();

        int[] fibo = new int[nombre+1];
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int i = 0; i < fibo.length; i++) {
            System.out.print(fibo[i] + " ");
        }

        System.out.println();
        System.out.println("-----------------------------");
    }

    public static void fibonacci_3() {
        System.out.println("[FIBO_3] Nombre: ");
        int nombre = scanner.nextInt();

        int fibo = fiboRec(nombre);

        System.out.println("---> " + fibo);
    }

    private static int fiboRec(int nombre) {
        if(nombre <= 1) {
            return nombre;
        }
        return fiboRec(nombre - 1) + fiboRec(nombre - 2);
    }

    private static void printTab(int[] tab) {
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    private static void triComptage(int[] tab) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < tab.length; i++) {
            if(tab[i] > max) {
                max = tab[i];
            }
            else if(tab[i] < min) {
                min = tab[i];
            }
        }

        int[] tableauDeComptage = new int[max - min + 1];

        for(int i = 0; i < tab.length; i++) {  // ?
            tableauDeComptage[tab[i] - min]++;
        }

        int[] tableauTrie = new int[tab.length];
        int indice = 0;

        for(int valeur = 0; valeur < tableauDeComptage.length; valeur++) {
            int nombreDoccurence = tableauDeComptage[valeur];

            for(int i = 0; i < nombreDoccurence; i++) {
                tableauTrie[indice] = valeur + min;
                indice++;
            }
        }

        printTab(tab);
        printTab(tableauDeComptage);
        printTab(tableauTrie);
    }

    public static void bubbleSort(int[] tab) {
        for(int i=0; i<tab.length-1; i++) {
            System.out.println("##### Etape n°" + i + ": #####");

            for(int j=0; j<tab.length-1-i; j++) {
                printTab(tab);

                System.out.print("On compare: " + tab[j] + " avec " + tab[j+1]);
                if(tab[j] > tab[j+1]) {
                    System.out.println(" ---> On permute");
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
                else {
                    System.out.println(" ---> On ne permute pas");
                }
            }
        }
    }
}
