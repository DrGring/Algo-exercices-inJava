//Algorithme déclarant un tableau et le remplissant de valeurs numériques toutes mis a zéro

//création de l'objet Arrays qui permet l'utilisation des arrays(tableaux)

public class numberAZero {
  
    public static void main (String[] args){
      int [] valeursNum = new int [7];
      
      for (int i = 0; i<valeursNum.length; i++) {
        valeursNum[i]=0;
        
      System.out.println(valeursNum[i]);
      }
    }
}//Effectivement il fallait savoir quoi écrire 