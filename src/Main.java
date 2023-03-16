import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //discriminant();
        //parite();
        //egaliteStr();
        //max();
        //min();
        //factorielle();
        //countdown();
        //carre();
        //tabledemultiplication();
        //regle();
        //nombrePremier();
        //initialisationTableau();
    }
    public static void discriminant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        float a= scanner.nextFloat();
        System.out.println("Quelle est la valeur de b ?");
        float b= scanner.nextFloat();
        System.out.println("Quelle est la valeur de c ?");
        float c= scanner.nextFloat();
        int delta = (int) (Math.pow(b, 2)- 4 * a * c);
        if (delta<0){
            float r =(float) Math.sqrt(-delta);
            float real= -b/2*a;
            float im=r/2*a;
            System.out.println("les solutions de l'équation "+ a +"x^2"+ b +"x"+ c+" sont :" + real +" +i"+im +" et"+  real +" -i"+im);

        } else if (delta==0) {
            float solution = -b/2*a;
            System.out.println("la solution de l'équation "+ a +"x^2"+ b +"x"+ c+" est :" + solution);
        }else {
            float solution1=(float) (-b+Math.sqrt(delta))/2*a;
            float solution2=(float) (-b-Math.sqrt(delta))/2*a;
            System.out.println("les solutions de l'équation "+ a +"x^2"+ b +"x"+ c+" sont :" + solution1 +" et"+ solution2);
        }

    }
    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un  entier");
        float a = scanner.nextInt();
        int r= (int) (a % 2);
        if(r==0){
            System.out.println("Le nombre" +a+ " est paire ");
        }else{
            System.out.println("Le nombre" +a+ " est impaire ");
        }

    }
    public static void max (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        float a = scanner.nextFloat();
        System.out.println("Veuillez saisir un autre  nombre");
        float b = scanner.nextFloat();
        float c = a-b;
        if (c < 0){
            System.out.println("le maximum entre " +a+ " et " +b+ " est " +b);
        } else if (c == 0) {
            System.out.println("les nombres " +a+ " et " +b+ " sont egaux");
        }else{
            System.out.println("le maximum entre " +a+ " et " +b+ " est " +a);
        }
    }
    public static void min(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        float a = scanner.nextFloat();
        System.out.println("Veuillez saisir un autre  nombre");
        float b = scanner.nextFloat();
        float c = a-b;
        if (c < 0){
            System.out.println("le minimum entre " +a+ " et " +b+ " est  " +a);
        } else if ( c==0 )  {
            System.out.println("les nombres " +a+ " et " +b+ " sont egaux");
        }else{
            System.out.println("le minimum entre " +a+ " et " +b+ " est " +b);
        }
    }


    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase");
        String a = scanner.next();
        System.out.println("Veuillez saisir une autre phrase");
        String b = scanner.next();
        if (a.equals(b)){
            System.out.println("ces chaines de charactères sont identiques");
        }
        else{
            System.out.println("ces chaines de charactères sont differentes");
        }
    }

    public static void factorielle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i=1;i<=n;i++){
            factorielle = factorielle * i;
        }
        System.out.println(n + "! = " + factorielle);
    }
    public static void countdown(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int i = 0;
        int w = 0;
        while(i <= n){
            int c = n-i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(c);
            i++;
        }
        System.out.println("BOOM");
    }
    public static void carre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        float a = scanner.nextFloat();
        float c = a*a;
        System.out.println("le carre de votre nombre " +a+ " est "+c);

    }
    public static void tabledemultiplication(){
        System.out.print("Saisir le nombre de lignes dans la matrice: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.print("Saisir le nombre de colonnes dans la matrice: ");
        int n = scanner.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (i+1)*(j+1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
    public static void regle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("longueur:");
        int l = scanner.nextInt();
        while (l<=0){
            System.out.print("longueur:");
            l = scanner.nextInt();
        }
        for(int i = 0;i<=l;i++){
            int t = i%10;
            if(t==0){
                System.out.print("|");
            }else{
                System.out.print("_");
            }


        }
    }
    public static void nombrePremier(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif non  nul");
        int n = scanner.nextInt();
        while (n <= 0){
            System.out.print("Saisir un entier positif non  nul");
            n = scanner.nextInt();
        }
        int reste;
        boolean flag = true;
        for(int i = 2; i <= n/2; i++)
        {
            reste = n%i;
            if(reste == 0)
            {
                flag = false;
            }
        }
        if(flag) {
            System.out.println(n + " est un nombre premier");
        }else {
            System.out.println(n + " n'est pas un nombre premier");
        }

    }
    public static void initialisationTableau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" veuiller saisir la longueur de votre tableau");
        int n = scanner.nextInt();


        int[] tableau = new int[n];
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        int max=tableau[0];
        int min=tableau[0];
        int somme=0;
        int nbpaire=0;
        int t2=tableau.length%2;
        int len;
        int j=0;
        if (t2==0){
            len=tableau.length/2;
        }else{
            int x=tableau.length-1;
            len=x/2;
        }
        int[] indicepaire= new int[len];
        for (int i = 0; i < tableau.length; i++) {
            //System.out.println(tableau[i]);
            if (tableau[i]>max){
                max=tableau[i];
            }
            if (tableau[i]<min){
                min=tableau[i];
            }
            int paire=tableau[i]%2;
            if(paire==0){
                nbpaire=nbpaire+1;
            }
            somme=somme+tableau[i];

        }
        int[] tableaupaire= new int[nbpaire];
        int count=0;
        while (count<tableaupaire.length) {
            //System.out.println(tableaupaire.length);
            for (int i = 0; i < tableau.length; i++) {
                int paire = i % 2;
                if (paire == 0) {
                    tableaupaire[count] = tableau[i];
                    System.out.println(" la valeur max de ce tableau est " +i);
                    count=count+1;

                }
            }

        }

        System.out.println(" la valeur max de ce tableau est : " +max);
        System.out.println(" la valeur min de ce tableau est : " +min);
        System.out.println(" la somme des valeurs de ce tableau est : " +somme);
        System.out.print(" les nombre paire de votre tableau sont : ");
        for (int i = 0; i <tableaupaire.length; i++) {
            System.out.print(tableaupaire[i] + ",\t");
        }
        System.out.print(" les valeur ayant un indice paire sont : ");
        for (int i = 0; i <indicepaire.length; i++) {
            System.out.print(indicepaire[i] + ",\t");
        }
    }
}



