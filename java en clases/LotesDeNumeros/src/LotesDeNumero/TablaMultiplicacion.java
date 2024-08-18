package LotesDeNumero;
import java.util.Scanner;
public class TablaMultiplicacion {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int a, c, m;
		char respuesta='s';
		
		do
		{
			do 
			{
				System.out.print("Ingrese un número: ");
				a = leer.nextInt();
				
			}while(a < 1 || a > 9);
			c = 1;
			
			while(c <= 10)
			{
				m = a * c;
				System.out.println(a+" x "+c+ " = "+m);
				c++;
			}
			
			System.out.println("¿Quiere introducir otro número? (S/N)");
			respuesta = leer.next().charAt(0);
			
		}while (respuesta == 'S' || respuesta == 's');
		
		
		
		
		

	}

}
