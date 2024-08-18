import java.util.Scanner;
public class UltimaPracticaParaExamen {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		double N, x, y, num, den, S=0;
		int i;
		
		System.out.print("Ingrese un numero para N: ");
		N = leer.nextDouble();
		
		System.out.print("Ingrese un numero para X: ");
		x = leer.nextDouble();
		
		System.out.print("Ingrese un numero para Y: ");
		y = leer.nextDouble();
		
		for(i = 1; i <= N; i++)
		{
			num = Math.pow((x + serieMultiplos3(i)), seriePares(i));
			den = factorial ((int) (y - serieFibonacci(i)));
			S = S +(num / den);
		}
		System.out.print(S);
	}
	
	
	//Multiplos de tres
	public static int serieMultiplos3 (double i2)
	{
		int a=3,  i;
		
		for(i=2; i<=i2; i++)
		{
			a +=3;
		}
		return (a);
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
		
		//Serie Fibonacci
		public static int serieFibonacci(int posi)
		{
			int c, a = 0, b = 1;
			
			for(int i=2 ; i<=posi; i++)
			{
				c = a + b;
				a = b;
				b = c;
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
}
