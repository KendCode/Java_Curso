import java.util.Scanner;
public class Ejercicio_4_K {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		double N, i, a, b, R, S = 0;
		
		do{
			System.out.print("Ingrese la cantidad de repeticiones: ");
			N = leer.nextDouble();
		}while(N < 10 || N > 50);
		
		for(i = 10; i <= N; i++)
		{/*
			a = i - (1.0 / 2.0);
			b = (2 * i) - 3;
			R = a * b;
			S += R;
			
			System.out.print(R+", ");*/
			
			
			//S = S +((i - (1.0 / 2.0)) * ((2 * i)-3));
			S = S + (i - 1.0 / 2.0) * (2 * i - 3);
			System.out.print(S +", ");
		}
		System.out.println("\n La sumatoria es: "+S);
	}

}
