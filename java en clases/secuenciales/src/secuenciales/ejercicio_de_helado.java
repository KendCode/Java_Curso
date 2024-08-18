package secuenciales;
import java.util.Scanner;
public class ejercicio_de_helado {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		double H, R, C,  AC, AT, area;
		
		System.out.print("ingrese la hipotenusa: ");
		H = leer.nextDouble();
		System.out.print("ingrese el radio: ");
		R = leer.nextDouble();
		
		C = Math.sqrt(Math.pow(H, 2)+ Math.pow(R,2));
		AT = 2 * (R *C) / 2 ;
		
		AC= (Math.PI * Math.pow(R, 2))/2;
		
		area= AT + AC;
		System.out.print("El area total es: "+area);

	}

}
