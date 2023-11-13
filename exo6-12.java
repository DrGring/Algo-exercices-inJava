//Algo qui permet de saisir des valeurs a laquelle on incrémenteras d'une valeur, qui sera stocker dans un tableau et afficher à la fin.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class NotesAStocker {
    public static void main (String[] args) {
        //Création d'une instance de la classe Scanner qui lit les entrées et qui vas récupérer les valeurs saisies
        Scanner scanner = new Scanner(System.in);
        //Création d'instance de la classe ArrayList pour pouvoir utiliser la méthode add() afin de stocker les valeurs
        List<Integer> valeursASaisirAStocker = new ArrayList<>();

        System.out.print("Entrez le nombre de valeurs à saisir :");
        int taille = scanner.nextInt();
        

        for (int i=0; i<taille; i++) {
            System.out.print("Saisir la valeur N°" +(i+1)+ " : ");

            //Variables vleursSaisis qui réccupère les entiers saisis après lecture graçe a la méthode nextInt()
            int valeursSaisis = scanner.nextInt();
            System.out.println("saisis de " +valeursSaisis);
            valeursASaisirAStocker.add(valeursSaisis+1);
        }
        System.out.println(valeursASaisirAStocker);
    }
}