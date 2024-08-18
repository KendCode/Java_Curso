package secuenciales;
import java.util.Scanner;
public class primero_nost {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		
		float A, B ,C, AT, AR, area;
		
		System.out.print("Ingrese la altura: ");
		A = leer.nextFloat();
		System.out.print("Ingrese la siguiente altura: ");
		B= leer.nextFloat();
		System.out.print("Ingrese la base: ");
		C= leer.nextFloat();
		
		AT=(B*(A-C))/2;
		
		AR=B*C;
		
		area=AT+AR;
		
		System.out.println("El area es: "+area);
	}

}
