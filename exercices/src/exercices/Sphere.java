package exercices;
import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		double rayon, aire, volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Programme de calcul de l'aire et le volume d'une sphère. \nVeuillez indiquer la taille du rayon.");
		rayon=sc.nextDouble();
		if(rayon>0) {
			aire=4*Math.PI*Math.pow(rayon, 2);
			volume=4/3*Math.PI*Math.pow(rayon, 3);
			System.out.println("Aire : "+aire +"\nVolume: "+volume);
		}
		else {
			System.out.println("La sphère est inexistante !!!");
		}
		
	}

}
