package LotesDeNumero;
import java.util.Scanner;
public class SumaDigitos {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n, cdig = 0, d;
		
		System.out.print("Ingrese los digitos: ");
		n = leer.nextInt();
		while(n > 0)
		{
			d = n % 10;
			n /= 10;
			cdig++;
		}
		System.out.print("Cantidad de digitos: "+cdig);
	}

}
