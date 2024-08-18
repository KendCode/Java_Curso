import java.util.Scanner;
public class Sumatoria_1 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		double S = 0, num = 0, den = 0, N;
		
		System.out.print("Ingresar la cantidad: ");
		N = leer.nextInt();
		
		for(int i=1; i<=N; i++)
		{
			num = (double) seriePrimos(i);
			den = (double)  seriePares(i);
			S += (num/den);
			System.out.print((num/den)+ " , ");
		}
		System.out.print("\n Sumatoria es: "+S);

	}

	
	//Subprograma Serie de pares
	public static int seriePares(int posi)
	{
		int a=2;
		for(int i=2; i<=posi; i++)
		{
			a+=2;
		}
		return a;
	}
	
	
	//Subprograma es Primo
	public static boolean esPrimo (int a)
	{
		for(int i=2; i<=Math.sqrt(a);i++)
		{
			if(a % i == 0)
				return false;
		}
		return true;
	}
	
	
	//Subprograma Serie Primos
	public static int seriePrimos (int posi)
	{
		int a=2, c=1;
		
		while(c < posi)
		{
			a++;
			if(esPrimo(a))
				c++;
		}
		return a;
	}
	
	
}
