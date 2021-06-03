package exercices;
import java.util.*;
public class nbprime {
	public static void main(String[] args) {
		boolean prime=true;
		int number, divider;
		Scanner sc=new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre entier");
		number=sc.nextInt();
		if(number>=2) {
			divider=1;
			do {
				divider++; //Starts at 2
				if(number%divider==0) {
					prime=false;
				}
			}
			while(divider<number && prime==true);
			if(divider>=number) {
				System.out.println("Le nombre "+ number +" est premier");
			}
			else {
				System.out.println("Le nombre "+number+" n'est pas premier");
			}
		}
		else {
			System.out.println("Veuillez entrer un nombre supérieur ou égal à 2");
		}
		int[]tabdiv=nbprime.findDiv(number);
			System.out.println("La liste des diviseurs est: ");
			for(int el:tabdiv) {
				if(el!=0) {
					System.out.print(el+" ");
				}
			}
		
		sc.close();

	}
	public static int[] findDiv(int _number) {
		int count=0;
		int divider=1;
		int[]divs=new int[10];
		do {
			divider++;
			if(_number%divider==0) {
				divs[count]=divider;
				count++;
			}
		}
		while(divider<_number-1);
		return divs;
	}

}
