package secuenciales;
import java.util.Scanner;
public class Promedio {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int c1, c2,c3, c4, s;
		float p;
		
		System.out.print("Ingrese la primera calificacion: ");
		c1 = leer.nextInt();
		System.out.print("Ingrese la segunda calificacion: ");
		c2 = leer.nextInt();
		System.out.print("Ingrese la tercera calificacion: ");
		c3 = leer.nextInt();
		System.out.print("Ingrese la cuarta calificacion: ");
		c4 = leer.nextInt();
		
		s=c1 + c2 + c3 + c4;
		p= s / 4;
		
		System.out.print("Promedio: "+p);
	}

}
