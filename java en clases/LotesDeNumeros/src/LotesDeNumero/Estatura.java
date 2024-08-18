package LotesDeNumero;
import java.util.Scanner;
public class Estatura {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		double estatura = 0, suma = 0, promedio = 0;
		int ce = 1;
		
		System.out.print("ingrese su estatura "+ce+ ": ");
		estatura = leer.nextDouble();
		
		while(estatura != 0)
		{
			
			suma += estatura;
			promedio = suma / ce;
			ce++;
			System.out.print("ingrese su estatura "+ce+ ": ");
			estatura = leer.nextDouble();
		}
		promedio = Math.round(promedio * 100.0)/100.0;
		System.out.print("Promedio es: "+promedio+" m");
	}

}
