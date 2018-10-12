import java.util.Scanner;

public class Tableau1 {

	public static void main(String[] args) {
	
		Scanner clavier = new Scanner(System.in);
		float [] tableau = new float[5];
		tableau [0] = clavier.nextFloat();
		tableau [1] = clavier.nextFloat();
		tableau [2] = clavier.nextFloat();
		tableau [3] = clavier.nextFloat();
		tableau [4] = clavier.nextFloat();
		clavier.close();
		System.out.println(tableau[0] +" / "+ tableau[1]+" / "+ tableau[2] +" / "+ tableau[3] +" / 5"
				+ " / "+ tableau[4]);
	}

}
