import java.util.Scanner;
//import javax.swing.*;
//import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //maFonction();
        //somme();
        //division();
        //volume();

    }

    public static void maFonction() {
// Contenu de la fonction
        // creer une classe scanner qui permet de lire des info saisies en console
        Scanner scanner = new Scanner(System.in);

        int unEntier = scanner.nextInt(); // lire donnees si entier
        float unReel = scanner.nextFloat(); // lire donnees si reel

        System.out.println("J'ai recupere un entier:" + unEntier);
        System.out.println("J'ai aussi recupere un reel:" + unReel);
        //L’instruction System.out.println() permet d’afficher des informations en console.

        System.out.println("Bonjour, quel est votre prenom ?");
        String unCaractere = scanner.next();
        System.out.println("Bonjour," + unCaractere);
    }

    public static void somme() {
// Contenu de la fonction
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + somme);

    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextFloat();
        float division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + division);
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la largeur");
        float a = scanner.nextFloat();
        System.out.println("Veuillez saisir la longueur");
        float b = scanner.nextFloat();
        System.out.println("Veuillez saisir la hauteur");
        float h = scanner.nextFloat();
        float volume = a * b * h;
        System.out.println("Le volume de " + a + " avec " + b + " avec " + h + " est egale a " + volume);
    }

    //System.out.println("Saisir un entier");
    // On saisit ’11’
    // int entier = scanner.nextInt();
    //System.out.println("Saisir une operation");
    // Parce que le caractere newline n’a pas ete lu, c’est lui qui va se
    // retrouver dans la variable operation
    // Il va aussi etre impossible de saisir une autre valeur pour operation
    //String operation = scanner.nextLine();

    
//public class rect extends JPanel {
    //public  void paint (Graphics G){

    //}
//}
}
