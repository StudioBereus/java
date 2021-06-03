package exercices;
import java.util.Scanner;
public class perfectNumber {

	public static void main(String[] args) {
		try {
			int max=0;
			Scanner sc= new Scanner(System.in);
			System.out.println("Veuillez entrer le nombre maximal");
			max=sc.nextInt();
			System.out.println("Voici les nombres: ");
			for (int i=1;i<=max;i++) {
				if(isPerfect(i)) {
					System.out.println(i);
				}
			}
		}
		catch(Exception e) {
				System.out.println(e);
			}
	}
	public static boolean isPerfect(int _number) {
		int sum=0;
		for(int i=1;i<=_number/2;i++) {
			if(_number%i==0) { 
				sum+=i;
			}
		}
		if(sum==_number) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
