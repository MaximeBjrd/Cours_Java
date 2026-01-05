import java.util.Random;
import java.util.Scanner;

public class Tp1 {

    // Le scanner permet de saisir au clavier des données lors de l'exécution du programme.
    private static Scanner scanner;

    // Méthode principale
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        // Appel de la méthode de l'exercice 1.1
        // exercice1_1();
        // exercice1_2();
        // exercice2_1();
        exercice2_2();

        scanner.close();
    }

    // Méthode de l'exercice n°1.1
    public static void exercice1_1() {

        // 1° - Déclaration
        String prenom;
        String nom;
        int age;

        // 2° - Initialisation
        System.out.print("Prénom : ");
        prenom = scanner.next();
        System.out.print("Nom : ");
        nom = scanner.next();
        System.out.print("Age : ");
        age = scanner.nextInt();

        // 3° - Utilisation
        System.out.println("Bonjour " + prenom + " " + nom + " (" + age + " ans).");
    }

    // Méthode de l'exercice n°1.2
    public static void exercice1_2() {
        System.out.print("Saisissez la valeur de x: ");
        int x = scanner.nextInt();
        System.out.print("Saisissez la valeur de y: ");
        int y = scanner.nextInt();

        int temp = y;
        y = x;
        x = temp;

        System.out.println("Les valeurs sont permutées: x = " + x + " et y = " + y);
    }

    public static void exercice2_1() {
        System.out.println("Saisissez un permier mot: ");
        String mot1 = scanner.next();
        System.out.println("Saisissez un second mot: ");
        String mot2 = scanner.next();

        if(mot1.length() > mot2.length()) {
            System.out.println(mot1 + " est le mot avec le plus de caractères.");
        }
        else if(mot2.length() > mot1.length()) {
            System.out.println(mot2 + " est le mot avec le plus de caractères.");
        }
        else {
            System.out.println("Les deux mots ont le même nombre de caractères.");
        }
    }

    public static void exercice2_2() {
        System.out.println("Saisissez une année: ");
        int annee = scanner.nextInt();

        if(((annee%4)==0 && (annee%100)!=0) || (annee%400)==0) {
            System.out.println("L'année " + annee + " est bissextile.");
        }
        else {
            System.out.println("L'année " + annee + " n'est pas bissextile.");
        }
    }

}