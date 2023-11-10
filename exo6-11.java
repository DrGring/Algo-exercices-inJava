
import java.util.Arrays;
public class Main {
    public static void main (String[] args) {
        int [] firstTab = {4, 8, 7, 12};
        int [] secondTab = {3, 6};
        int sum = 0;

        for (int i = 0; i<firstTab.length; i++) {
            for(int k = 0; k<secondTab.length; k++) {
                sum += firstTab[i]*secondTab[k];
            }
        }
        System.out.println(sum);
    }
}