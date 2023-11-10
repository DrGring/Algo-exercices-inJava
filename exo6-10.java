//Algo qui Calcule la somme des indices entres deux tableaux et qui affiches ensuite le résultat"
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] firstTab = {4, 8, 7, 9, 1, 5, 4, 6};
        int [] secondTab = {7, 6, 5, 2, 1, 3, 7, 4};
        int [] sumTab = new int [8];

        for (int i=0; i<firstTab.length; i++) {
            sumTab[i] = firstTab[i]+secondTab[i];
        }

        System.out.println("La somme est égale à : "+Arrays.toString(sumTab));
    }
}