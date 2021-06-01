package exercices;
import java.util.Scanner;
public class exchange {

	public static void main(String[] args) {
		String a, b, c;
		String answer;
		Scanner sc=new Scanner(System.in);
		System.out.println("Veuillez entrer un deux nombres, séparés d'un espace");
		answer=sc.nextLine();
		String[]tab=answer.split(" ");
		if(tab.length==2) {
			a=tab[0];
			b=tab[1];
			c=a;
			a=b;
			b=c;
			System.out.println(a+" et "+b);
		}
		else {
			System.out.println("Entrée incorrecte !");
		}	
	}
}
