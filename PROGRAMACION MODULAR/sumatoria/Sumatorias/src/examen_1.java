import java.util.Scanner;
public class examen_1 {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		double N, i, S=0;
		
		System.out.print("Ingrese la cantidad para N: ");
		N = leer.nextDouble();
		
		for(i= 1; i <= N; i++)
		{
			S += Math.pow((i - 1.0 / 4.0),2);
			System.out.print(S+",");
		}
		System.out.print("\n EL resultado es: "+S);
	}

}
