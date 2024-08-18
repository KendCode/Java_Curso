import java.util.Scanner;
public class Examen_2 {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		double S=0, i, N, X, num, den;
		
		System.out.print("Ingrese la cantidad para N: ");
		N = leer.nextDouble();
		
		System.out.print("Ingrese la cantidad para X: ");
		X = leer.nextDouble();
		
		for(i = 1 ; i<= N; i++)
		{
			num = (double) (factorial (serieFibonacci(i)) + Math.pow(seriePares(i), serieNaturales(i)));
			den = X - serieMultiplos5(i);
			S += (num / den);
		}
		System.out.print(S);
		
		

	}
	
	
	//Serie Fibonacci
			public static int serieFibonacci(double i2)
			{
				int c, a = 0, b = 1;
				
				for(int i=2 ; i<=i2; i++)
				{
					c = a + b;
					a = b;
					b = c;
				}
				return a;
			}
			
	//Subprograma Serie de pares
	public static int seriePares(double i2)
	{
		int a=2;
		for(int i=2; i<=i2; i++)
		{
			a+=2;
		}
		return a;
		}
	// Factorial
	
	public static int factorial (int a){
		int f=1;
				
		for(int i=2; i<=a; i++)
		{
			f *= i;
		}
		return f;
	}
	
	//Multiplos de tres
		public static int serieMultiplos5 (double i2)
		{
			int a=5,  i;
			
			for(i=2; i<=i2; i++)
			{
				a +=5;
			}
			return (a);
		}
		
	//NUmeros reales
		public static int serieNaturales (double i2){
			int a=1, i;
			
			for(i=2; i<=i2; i++)
			{
				a++;
			}
			return a;
		}
	
}
