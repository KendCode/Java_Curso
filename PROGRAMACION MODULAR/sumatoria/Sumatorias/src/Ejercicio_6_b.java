import java.util.Scanner;
public class Ejercicio_6_b {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		double N, i, S=0;
		
		
		do{
			System.out.print("Ingresar la cantidad de N: ");
			N = leer.nextDouble();
		}while(N < 2 || N > 6);
		
		for(i = 2; i <= N; i++)
		{
			S += Math.pow((i + 1),2) - Math.pow((i - 1),2);
			System.out.print(S+", ");
		}
		System.out.print("\n La sumatoria es: "+S);
	}

}
