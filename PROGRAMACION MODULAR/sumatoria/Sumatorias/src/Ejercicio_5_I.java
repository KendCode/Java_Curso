import java.util.Scanner;
public class Ejercicio_5_I {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int N, i, S=0;
		
		System.out.print("Ingrese la cantidad de N: ");
		N = leer.nextInt();
		
		for(i = 1; i <= N; i++)
		{
			S += Math.pow(i, 2)* (2 * i + 3);
			System.out.print(S+", ");
		}
		System.out.print("\n La sumatoria es: "+S);
		
	}

}
