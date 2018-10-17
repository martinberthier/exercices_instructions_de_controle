import java.util.Scanner;
import java.util.Arrays;

public class Boucle2 {

    public static void main(String[] args) {

              int UserTab[]; //Déclaration du tableau Utilisateur
              int LengthTabUser; // Déclaration de la taille du tableau
              int SearchTab; // Déclaration de la valeur à rechercher dans le tableau


              Scanner Sc = new Scanner(System.in); // Récupérer les valeurs entrées dans le clavier

              System.out.println("Ce programme vous permet de chercher une valeur dans votre tableau");
              System.out.println("Entrez la taille de votre tableau");
              LengthTabUser=Sc.nextInt(); // Récupération de la taille du tableau 

              UserTab = new int[LengthTabUser]; // Création du tableau 


              System.out.println("Entrez les valeurs de votre trableau");
              for(int i = 0 ; i<LengthTabUser;i++){ // Remplissage du tableau
                  System.out.println("Position "+i+" :"); // Remplir la position i
                  UserTab[i] = Sc.nextInt(); // Récupération de la valeur a la position i 

              }
              Arrays.sort(UserTab); // Pour trier le tableau avec la méthode sort
              System.out.println("Voici votre tableau trié");
              for(int l = 0 ; l<UserTab.length; l++) //Pour afficher la longueur du tableau
                  System.out.print(UserTab[l]+ " ");
              System.out.println(); // Pour retour à la ligne

             }



    }