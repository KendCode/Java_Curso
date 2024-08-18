import java.util.Scanner;
public class Sumatoria_4 {

	public static void main(String[] args) 
	{
		//Numeros impares al cubo
		Scanner leer = new Scanner (System.in);
		int N, i, a, R, S = 0;
		
		System.out.print("Ingrese la cantidad de repeticiones N: ");
		N = leer.nextInt();

		for (i = 1; i <= N; i++)
		{
			a = (2 * i)-1;
			R = (int)Math.pow(a, 3);
			S += R;
			System.out.print(R + ", ");
		}
		System.out.print("\n La sumatoria es: "+S);
	}
}
