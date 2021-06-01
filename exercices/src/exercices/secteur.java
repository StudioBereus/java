package exercices;
import java.util.Scanner;
public class secteur {

	public static void main(String[] args) {
		double rayon, angle,aire;
		String Answer;
		Scanner sc=new Scanner(System.in);
		System.out.println("Veuillez entrer le rayon, puis l'angle du secteur, séparés d'un espace");
		Answer=sc.nextLine();
		String[]tab=Answer.split(" ");
		if(tab.length==2) {
			rayon=Double.parseDouble(tab[0]);
			angle=Double.parseDouble(tab[1]);
			aire=(Math.PI*Math.pow(rayon, 2)*angle)/360;
			System.out.println("L'aire est de: "+aire);
		}
		else {
			System.out.println("Entrée incorrecte !!!");
		}
		
	}

}
