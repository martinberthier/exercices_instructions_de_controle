import java.util.Scanner;
import java.util.Arrays;

public class Boucle2 {

    public static void main(String[] args) {

              int UserTab[]; //D�claration du tableau Utilisateur
              int LengthTabUser; // D�claration de la taille du tableau
              int SearchTab; // D�claration de la valeur � rechercher dans le tableau


              Scanner Sc = new Scanner(System.in); // R�cup�rer les valeurs entr�es dans le clavier

              System.out.println("Ce programme vous permet de chercher une valeur dans votre tableau");
              System.out.println("Entrez la taille de votre tableau");
              LengthTabUser=Sc.nextInt(); // R�cup�ration de la taille du tableau 

              UserTab = new int[LengthTabUser]; // Cr�ation du tableau 


              System.out.println("Entrez les valeurs de votre trableau");
              for(int i = 0 ; i<LengthTabUser;i++){ // Remplissage du tableau
                  System.out.println("Position "+i+" :"); // Remplir la position i
                  UserTab[i] = Sc.nextInt(); // R�cup�ration de la valeur a la position i 

              }
              Arrays.sort(UserTab); // Pour trier le tableau avec la m�thode sort
              System.out.println("Voici votre tableau tri�");
              for(int l = 0 ; l<UserTab.length; l++) //Pour afficher la longueur du tableau
                  System.out.print(UserTab[l]+ " ");
              System.out.println(); // Pour retour � la ligne

             }



    }