//Cet Algorithme présente la suite de l'exercice6-3, calculant la moyenne des notes saisis et affichant la reponse à l'écran
import java.util.Scanner;

public class Notes {
    public static void main (String[] args) {
        int [] notesASaisir = {3, 4, 5, 10, 14, 20, 0, 1, 15};
        int sum=0;
        int moyenne=0;
        //Création d'une instance de la classe Scanner qui lit les entrées et qui vas récupérer les valeurs saisies
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<notesASaisir.length; i++) {

            System.out.print("Entrez la note correspondant à ===> " +notesASaisir[i]+ " : ");
            //Variables notesSaisis qui réccupère les entiers saisis après lecture graçe a la méthode nextInt()
            int notesSaisis = scanner.nextInt();

            System.out.println("Vous aviez Saisis " +notesSaisis);
            sum += notesASaisir[i];
            moyenne= sum/notesASaisir.length;    
        }
        //La méthode scanner.close() ferme l'objet Scanner et libère les ressources associées à la lecture des entrées de l'utilisateur
        scanner.close();

        //Calcul de la somme et de la moyenne
        //Afficher la moyenne
        System.out.println("la moyenne est de : " +moyenne);
    } 
}
//DON'T FORGET TO PUSH YOUR WORK RENE