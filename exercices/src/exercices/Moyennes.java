package exercices;
import java.util.Scanner;
public class Moyennes {

	public static void main(String[] args) {
		String answer;
		double moyenne, converted, total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Veuillez entrer tous nombres séparés d'un espace.");
		answer=sc.nextLine();
		String[]tab=answer.split(" ");
		for(int i=0;i<tab.length;i++) {
			converted=Double.parseDouble(tab[i]);
			total+=converted;
		}
		moyenne=total/tab.length;
		System.out.println("La moyenne est de: "+moyenne);
	}
}
