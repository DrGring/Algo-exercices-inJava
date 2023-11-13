import java.util.Scanner;
import java.util.Arrays;

public class valeursAStocker {

    public static void main (String[] args) {
        //Création d'une instance de la classe Scanner qui lit les entrées et qui vas récupérer les valeurs saisies
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de valeurs à saisir :");
        int taille = scanner.nextInt();
        int[] valeursASaisirAStocker = new int[taille];

        for (int i=0; i<taille; i++) {
            System.out.print("Saisir la valeur N°" +(i+1)+ " : ");

            //Variables vleursSaisis qui réccupère les entiers saisis après lecture graçe à la méthode nextInt()
            int valeursSaisis = scanner.nextInt();
            System.out.println("saisis de " +valeursSaisis);
            valeursASaisirAStocker[i] = valeursSaisis;            
        }
            //Afficher le tableau
             System.out.println("Les Valeurs saisis : " +Arrays.toString(valeursASaisirAStocker)); /* Sans le Arrays.toString le résultat c'est [I@5ad851c9 */

        //Process pour trouver la plus grande valeur avec Arrays.sort
        Arrays.sort(valeursASaisirAStocker);
        int maxNum = valeursASaisirAStocker[valeursASaisirAStocker.length - 1];
        System.out.println("Sa plus grande valeur est : " +maxNum);
        
        // Trouver la position de la plus grande valeur
        int position = 0;
        for (int i=0; i<taille; i++) {
            if (valeursASaisirAStocker[i] == maxNum){

                maxNum = valeursASaisirAStocker[i];
                position = i;
                System.out.println("Sa position dans le tableau est "+position);
            }
        }

    }
}
/* 
// Convertissez la liste en tableau
Integer[] tableauValeurs = valeursASaisirAStocker.toArray(new Integer[valeursASaisirAStocker.size()]);

        int[] intArray = {24, 340, 0, 34, 12, 10, 20};

        Arrays.sort(intArray);

        int maxNum = intArray[intArray.length - 1];
        System.out.println("Maximum number = " + maxNum);
 */