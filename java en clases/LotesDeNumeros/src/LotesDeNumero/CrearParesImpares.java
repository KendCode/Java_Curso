package LotesDeNumero;
import java.util.Scanner;
public class CrearParesImpares {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n, d, p1 = 1, impar=0, p2 =1, par=0;
		
		System.out.print("Ingrese los digitos: ");
		n = leer.nextInt();
		
		while(n >  0)
		{
			d = n % 10;
			n /=10;
			
			if(d % 2 == 0)
			{
				par = (d * p2)+par;
				p2 *= 10;
			}
			else
			{
				impar = (d * p1) + impar;
				p1 *= 10;
			}
			
		}
		System.out.println("El nuevo numero de pares es: "+par);
		System.out.println("El nuevo numero de impares es: "+impar);

	}

}
