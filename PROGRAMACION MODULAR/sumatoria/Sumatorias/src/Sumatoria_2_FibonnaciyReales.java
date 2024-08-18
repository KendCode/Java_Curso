import java.util.Scanner;
public class Sumatoria_2_FibonnaciyReales {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int N, X;
		double num=0, den=0, S=0;
		
		System.out.print("Ingrese la cantidad de elementos: ");
		N = leer.nextInt();
		System.out.print("Ingrese el valor para X: ");
		X = leer.nextInt();
		
		for(int i = 1; i <= N; i++)
		{
			num = X - serieFibonacci(i);
			den = i;
			S += (num / den);
			System.out.print((num/den)+" , ");
		}
		System.out.print("\n Sumatoria es: "+S);
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
}
