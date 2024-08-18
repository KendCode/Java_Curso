package vectores;
import java.util.Scanner;
public class Ejer_16{

	public static void main(String[] args) 
	{
		 Scanner leer = new Scanner(System.in);
		 Vector FV = new Vector();
	        System.out.print("Ingrese la cantidad de números primos a generar: ");
	        int N = leer.nextInt();

	        int[] primos = new int[N];

	        Vector vector = new Vector();

	        FV.llenarPrimos(N, primos);

	        System.out.println("Los primeros " + N + " números primos son:");
	        FV.mostrarVector(N, primos);
	  }

	}

