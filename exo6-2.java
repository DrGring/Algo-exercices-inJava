//Algo qui affiche un tableaux avec les 6 voyelles de l'alphabet latin

//création de l'objet Arrays qui permet l'utilisation des arrays(tableaux)
import java.util.Arrays;

public class Voyelles{
  
    public static void main (String[] args){
      String[] sixVoyelles = {"a","e","u","i","o","y"};
        /* 
        sixVoyelles[0] = "a";
        sixVoyelles[1] = "e";
        sixVoyelles[2] = "u";
        sixVoyelles[3] = "i";
        sixVoyelles[4] = "o";
        sixVoyelles[5] = "y"; 
        */

      System.out.println(/* Arrays.toString */(sixVoyelles));
    // System.out.println(sixVoyelles);
    }
}

/*String[] helloWorld = {"Hello", "World"};
1==>> System.out.println(helloWorld);
2==>> System.out.println(Arrays.toString(helloWorld));

//is

1==>> [Ljava.lang.String;@45a877
2==>> [Hello, World]
*/
