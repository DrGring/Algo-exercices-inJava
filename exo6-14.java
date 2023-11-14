import java.util.Scanner;
import java.util.Arrays;

public class valeursAStocker {

    public static void main (String[] args) {
        //Création d'une instance de la classe Scanner qui lit les entrées et qui vas récupérer les valeurs saisies
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de valeurs à saisir :");
        int taille = scanner.nextInt();
        int[] valeursASaisirAStocker = new int[taille];

        int somme = 0;

        for (int i=0; i<taille; i++) {
            System.out.print("Saisir la valeur N°" +(i+1)+ " : ");

            //Variables vleursSaisis qui réccupère les entiers saisis après lecture graçe à la méthode nextInt()
            int valeursSaisis = scanner.nextInt();
            System.out.println("saisis de " +valeursSaisis);
            valeursASaisirAStocker[i] = valeursSaisis;

            //calcule moyenne des valeurs
           somme += valeursASaisirAStocker[i];

        }
        
        float moyenneValeur = 0;
        // Calcule moyenne        
        moyenneValeur = somme/(float)taille;
        int [] nombreValeurSuperieurMoy = new int[taille];
        
        for (int j = 0; j<taille; j++) {
            if (val>moyenneValeur){
                nombreValeurSuperieurMoy[j] = val;
            }else {
                System.out.println("Vous n'avez pas de valeurs supérieur à la moyenne");
            }
        }    
       

        //Affichage
        System.out.println("Les Valeurs saisis : " +Arrays.toString(valeursASaisirAStocker)); /* Sans le Arrays.toString le résultat c'est [I@5ad851c9 */
        System.out.println("la somme est de : "+somme);
        System.out.println("la moyenne est de : "+moyenneValeur);
        System.out.println("le nombres de valeurs supérieur à la moyenne est de : "+(nombreValeurSuperieurMoy.length));
    }
 } 
/* public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            System.out.print("Quelle est le nombre de valeur à saisir ? : ");
            int taille = scanner.nextInt();

        int[] notesaSaisir = new int[taille];
        float moyenneNoteSaisis = 0;

        

        for (int i = 0; i < taille; i++) {

            System.out.print("Saisir la valeur N°" + (i + 1) + ": ");
            int noteSaisie = scanner.nextInt();            
            notesaSaisir[i] = noteSaisie;
            //calcul moyenne note
            moyenneNoteSaisis += noteSaisie / (float) taille;
        }

        int[] notesSuperieurMoyenne = new int[taille];
        int i = 0;

        for (int note : notesaSaisir) {
            if (note > moyenneNoteSaisis) {
                notesSuperieurMoyenne[i] = note; i++;
            }
        }
        // Affichage..
        System.out.println("les notes saisies sont: " );
        for (int note : notesaSaisir) {
            System.out.println(note);
        }
        System.out.println("Et leur moyenne est de : " + moyenneNoteSaisis);
        System.out.println("notes supérieures à la moyenne : " + i);
    }
} */