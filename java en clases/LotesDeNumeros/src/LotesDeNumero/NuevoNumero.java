package LotesDeNumero;
import java.util.Scanner;
public class NuevoNumero {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int p=1, r=0, n, d;
		
		System.out.print("Ingrese los digitos:" );
		n = leer.nextInt();
		
		while (n > 0)
		{
			d = n % 10;
			n /=10;
			
			if(d % 2 !=0)
			{
				r = (d * p)+r;
				p *=10;
			}
		}
		System.out.print("El nuevo numero es: "+r);

	}

}
