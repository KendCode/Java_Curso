package secuenciales;
import java.util.Scanner;

public class circunferencia {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		float R, area, perimetro, PI;
		
		System.out.print("Ingrese el radio de la circunferencia: ");
		R = leer.nextFloat();
		
		PI = (float) Math.PI;
		
		area = PI * (float)Math.pow(R, 2);
		System.out.println("El area es: " + area);
		
		perimetro = PI * R;
		System.out.println("El prerimetro es: " + perimetro);

	}

}
