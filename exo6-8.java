//Algo qui permet de saisir des données et de les stockées dans un tableau après afficher les valeurs négatives différentes des autres  
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class NotesAStocker {

    public static void main (String[] args) {
        //Création d'une instance de la classe Scanner qui lit les entrées et qui vas récupérer les valeurs saisies
        Scanner scanner = new Scanner(System.in);
        //Création d'instance de la classe ArrayList pour pouvoir utiliser la méthode add() afin de stocker les valeurs
        List<Integer> notesASaisirAStocker = new ArrayList<>();
        List<Integer> notesNegatif = new ArrayList<>();
        List<Integer> notesPositif = new ArrayList<>();


        System.out.print("Entrez le nombre de valeurs :");
        int taille = scanner.nextInt();

        for (int i=0; i<taille; i++) {
            System.out.print("Saisir la note N°" +(i+1)+ " : ");
            //Variables notesSaisis qui réccupère les entiers saisis après lecture graçe a la méthode nextInt()
            int notesSaisis = scanner.nextInt();
            System.out.println("saisis de " +notesSaisis);
            notesASaisirAStocker.add(notesSaisis);

            
            //condition pour séparer les valeurs négatives des positives
            if(notesSaisis<0){
                notesNegatif.add(notesSaisis);
            }else {
                notesPositif.add(notesSaisis);
            }
        }
        //La méthode scanner.close() ferme l'objet Scanner et libère les ressources associées à la lecture des entrées de l'utilisateur
        scanner.close();

        //Afficher les valeurs saisis et stockées 
        System.out.println("Vous aviez saisis et stocker : " +notesASaisirAStocker+ ", comme valeurs négatifs : " + notesNegatif + " et comme valeurs positifs : " + notesPositif);
    } 
}