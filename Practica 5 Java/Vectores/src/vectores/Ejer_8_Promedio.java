package vectores;

import java.util.Scanner;

public class Ejer_8_Promedio {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		Vector FV = new Vector ();
		int N;
		double cp=0, promedioGeneral=0, promedioPares=0;
		int[] V = new int [100];
		
		System.out.print("Ingrese la cantidad de elementos: ");
		N = leer.nextInt();
		
		 FV.llenarVector2(N, V);
		 FV.mostrarVector(N, V);
		 
		 for(int i=0; i<N; i++)
		 {
			 promedioGeneral += V[i];
				 if(V[i]%2==0){
					 cp++;
					 promedioPares += V[i];
				 }	
		 }
		 promedioPares /= cp;
		 promedioGeneral /= N;
		 System.out.print("\n Promedio General: "+promedioGeneral);
		 System.out.print("\n Promedio Pares: "+promedioPares);
		

	}

}
