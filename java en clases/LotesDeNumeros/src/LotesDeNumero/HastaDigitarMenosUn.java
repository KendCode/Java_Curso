package LotesDeNumero;
import java.util.Scanner;
public class HastaDigitarMenosUn {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n, suma, d;
		
		System.out.print("Ingrese los digitos: ");
		n = leer.nextInt();
		
		while(n > -1)
		{
			suma = 0;
			while(n > 0)
			{
				d = n % 10;
				n /= 10;
				suma += d;
			}
			System.out.println("La suma es: "+suma);
			System.out.print("Ingrese los digitos: ");
			n = leer.nextInt();
		}
		

	}

}
