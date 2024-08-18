import java.util.Scanner;
public class FibonacciPares {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n, par=2, a=0, b=1, c;
		
		System.out.print("Ingrese para ver las series de numero: ");
		n = leer.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i % 2 == 0 )
			{
				System.out.print(a+", ");
				c = a + b;
				a = b;
				b = c;
			}
			else
			{
				System.out.print(par +", ");
				par += 2;
			}
		}

	}

}
