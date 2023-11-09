//Algo qui affiches un ensembles de 9 notes que saisis l'utilisateur

//création de l'objet Arrays qui permet l'utilisation des arrays(tableaux)
import java.util.Arrays;
//création de l'objet Scanner qui lit les entrées de l'utilisateur 
import java.util.Scanner;

public class Notes {
    public static void main (String[] args) {
        int [] notesASaisir = {3, 4, 5, 10, 14, 20, 0, 1, 15};
        //Création d'une instance de la classe Scanner qui lit les entrées et qui vas récupérer les valeurs saisies
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<notesASaisir.length; i++) {

            System.out.print("Entrez la note correspondant à ===> " +notesASaisir[i]+ " : ");
            //Variables notesSaisis qui réccupère les entiers saisis après lecture graçe a la méthode nextInt()
            int notesSaisis = scanner.nextInt();

            System.out.println("Vous aviez Saisis " +notesSaisis);

        }
        //La méthode scanner.close() ferme l'objet Scanner et libère les ressources associées à la lecture des entrées de l'utilisateur
        scanner.close();
    } 
}

/* 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<3; i++) {
            System.out.print("Entrez une valeur : ");
            int valeur = scanner.nextInt();

            System.out.println("Vous avez saisi : " + valeur);
        }

        scanner.close();
    }
}
 */