public class Main {
    public static void main (String[] args) {
//crée un tableau vide appelé alpha,
        int [] tableau = new int [6];
//affecter la valeur 1 à alpha[0], 
        tableau[0] = 1;
        int i, k;
//En utilisant une boucle for, on parcours les indices de 1 à 6 (inclus) du tableau alpha. 
// Et a chaque boucle on calcules la valeur de alpha[k] en ajoutant 2 à la valeur de l'élément précédent.
        for(k = 1; k < tableau.length; k++) {
            tableau[k] = tableau[k-1]+2;
        }
//utilisons une autre boucle for pour parcourir les indices de 0 à 6 du tableau alpha 
        for(i = 0; i < tableau.length; i++){
            System.out.println(tableau[i]);
        }
    }
}


//Cet algo affiche les nombres impaires 