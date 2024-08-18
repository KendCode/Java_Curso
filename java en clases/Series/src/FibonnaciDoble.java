import java.util.Scanner;
public class FibonnaciDoble {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int a=0, b=1, c=2, d, n;
		
		System.out.print("Insertar el digito: ");
		n = leer.nextInt();
		
		for ( int i=1 ; i <= n; i++)
		{
			System.out.print(a+", ");
			d = a + b +c;
			a = b;
			b = c; 
			c = d;
		}
		

	}

}
