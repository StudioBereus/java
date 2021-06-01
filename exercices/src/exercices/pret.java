package exercices;
import java.util.Scanner;

public class pret {

	public static void main(String[] args) {
		String answer, type;
		double sum, interest, value, value1, value2;
		int years;
		Scanner sc=new Scanner(System.in);
		System.out.println("Veuillez entrer la somme, l'interet, puis le nombre d'années de placement, et enfin le type d'intérêt séparés");
		answer=sc.nextLine().toLowerCase();
		String[]tab=answer.split(" ");
		if(tab.length==4) {
			sum=Double.parseDouble(tab[0]);
			interest=Double.parseDouble(tab[1])/100.0;
			years=Integer.parseInt(tab[2]);
			type=tab[3];
			if(type.equals("simple")){
				value=sum*(1+years*interest);
			}
			else if(type.equals("deux")) {
				value1=sum*(1+years*interest);
				value2=sum*Math.pow((1+interest),years);
				System.out.print("Placement intérêt simple: "+nbArrondi(value1)+"\nPlacement intérêt composé: "+nbArrondi(value2));
			}
			else {
				value=sum*Math.pow((1+interest),years);
				System.out.println("La valeur est de : "+nbArrondi(value));
			}
			
		}
		else {
			System.out.println("Entrée incorrecte !!!");
		}
	}
	public static double nbArrondi(double _number) {
		double temp=Math.round(_number*100.0)/100.0;
		return temp;
	}
}
