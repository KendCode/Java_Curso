package secuenciales;
import java.util.Scanner;
public class Suma_de_2_numeros {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		int a, b, resultado;
		
		System.out.println ("Ingrse el primer numero: ");
		a= leer.nextInt();
		
		
		System.out.println ("Ingrse el segundo numero: ");
		b= leer.nextInt();
		
		resultado = a + b;
		System.out.println("la suma es: "+ resultado);
	}

}
