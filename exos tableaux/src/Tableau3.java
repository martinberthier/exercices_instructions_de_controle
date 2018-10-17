
import java.util.*;
// import java.util.Arrays;

public class Tableau3 {

	public static void main(String[] args) {
		int [] tableau = {1, 5, 25};
		
//		boolean contain= false;
//		int valeurATrouver=25;
//
//			for(int i=0; i<tableau.length; i++)
//	        {
//	            if(tableau[i]==valeurATrouver)
//	            {
//	                contain=true;
//	            }
//	        }
//	        if(contain){
//	        	System.out.println("La valeur "+valeurATrouver+" est comprise dans le tableau");
//	        	}else{
//	        		System.out.println("La valeur "+valeurATrouver+" n'est pas comprise dans le tableau");
//	        		}
		
			int valeurATrouver = 25;
		
			for(int i = 0 ; i < tableau.length ; i++){
				if (tableau[i] == valeurATrouver) {
					System.out.println("Le tableau contient "+valeurATrouver+" à l'emplacement "+(i+1));
					break;
				}
			}
		
			
//			if(Arrays.asList(tableau).contains(toFind)) {
//				System.out.println("Le tableau contient "+toFind);
//			}
			Arrays.sort(tableau);
			int toFind = 5;
			
			int searchValue = Arrays.binarySearch(tableau,toFind);
			System.out.println("Le tableau contient "+toFind);
			
//			public static int binarySearch(int[] tableau, int toFind){
//				System.out.println("Le tableau contient "+toFind);
			}

	}






