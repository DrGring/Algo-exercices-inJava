public class Main {
    public static void main(String[] args) {
        int [] Nb = new int[5];
        int i;
        for (i=3 ; i<Nb.length ; i++) {
            Nb[i]= i*i;

            for (i=0; i<Nb.length; i++) {
                System.out.println(Nb[i]);
            }
        }
    }
}
//Ce code affiche 5 valeurs mais quand on lui attribut une valeur dans la première boucle il le calcule au carrée à l'indice indiquée et l'affiche 
//à la position de l'indice et quand l'indice de i est supérieur à l'instructions donnée elle n'affiche rien.