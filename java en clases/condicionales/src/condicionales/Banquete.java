package condicionales;
import java.util.Scanner;
public class Banquete {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int personas, total;
		
		System.out.print("Ingrse la cantida de personas: ");
		personas = leer.nextInt();
		
		if(personas > 300)
		{
			total = personas * 75;
		}
		else
		{
			if(personas > 200)
			{
				total = personas * 85;
			}
			else
			{
				total = personas * 95;
			}
		}
		System.out.print("El total es: "+total+" Bs.");

	}

}
