public class Main {
    public static void main (String[] args) {
        int [] suite = new int[7];
        int i;
        //Attribution de valeur à l'indice 0 et 1
        suite[0]=1;
        suite[1]=1;

        for( i = 2; i<suite.length; i++) {
            suite[i]=suite[i-1] + suite[i-2];
        }

        for ( i=0; i<suite.length; i++) {
            System.out.println(suite[i]);
        }

    }
}
//Cet algorithme donne les premiers termes de la séquence de Fibonacci.