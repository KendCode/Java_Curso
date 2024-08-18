package vectores;

import java.util.Scanner;

public class Ejercicio_4_Multiplos_5 {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		Vector FV = new Vector();
		
		int N, cm5 = 0;
		int[] V = new int[100];
		
		System.out.print("Ingrese la cantidad de elemenetos: ");
		N = leer.nextInt();
		
		FV.llenarVector2(N, V);
		FV.mostrarVector(N, V);
		
		for(int i=0; i<N; i++)
		{
			if(V[i]% 5 == 0)
			{
				cm5++;
			}
		}
		System.out.print("\n Múltiplos de 5 son: "+cm5);
	}

}
