package LotesDeNumero;
import java.util.Scanner;
public class Sueldo {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, c=1;
		double inc = 0, sueldo, total=0;
		
		System.out.print("Ingrese la cantidad de empleados: ");
		n = leer.nextInt();
		
		while (c <= n)
		{
			System.out.print("Ingrese su actual sueldo "+c+": ");
			sueldo = leer.nextDouble();
			
			if(sueldo <= 1000)
				inc = 0.08 * sueldo;
			else
				if(sueldo <= 500)
					inc = 0.075 * sueldo;
				else
					if (sueldo <= 10000)
						inc = 0.05 * sueldo;
					else inc = 0.025 * sueldo;
			total = sueldo + inc;
			System.out.println("El sueldo final es: "+total);
			c++;
		}
		

	}

}
