import java.util.Scanner;
public class MixtoDeParesPrimos {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int N, X;
		double num=0, den=0, S=0;
		
		System.out.print("Ingrese la cantidad: ");
		N = leer.nextInt();
		System.out.print("Ingrese el valor de X;");
		X = leer.nextInt();
		
		for(int i=1; i <= N; i++)
		{
			num = X - seriePares(i);
			den = X + seriePrimos(i);
			S += (num/den);
			System.out.print((num/den)+" , ");
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
