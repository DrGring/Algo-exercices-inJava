public class Main {
    public static void main (String[] args) {
        int [] tableau = new int [6];
        tableau[0] = 1;
        int i, k;

        for(k = 1; k < tableau.length; k++) {
            tableau[k] = tableau[k-1]+2;
        }
        for(i = 0; i < tableau.length; i++){
            System.out.println(tableau[i]);
        }
    }
}//Cet algo affiche les nombres impaires 