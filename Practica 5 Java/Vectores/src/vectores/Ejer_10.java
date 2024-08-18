package vectores;
import java.util.Scanner;
public class Ejer_10 {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		Vector FV = new Vector ();
		int N, K, posicion = 0;
		int[] V = new int [100];
		
		System.out.print("Ingrese la cantidad de elementos: ");
		N = leer.nextInt();
		System.out.print("\n Ingrese que multiplo quiere buscar: ");
		K = leer.nextInt();
		 FV.llenarVector2(N, V);
		 FV.mostrarVector(N, V);
		 
		 for(int i=0; i<N; i++)
		 {
			 if(V[i] % K == 0){
				 posicion = i;
				 System.out.print("\n El multiplo es: "+V[i]+", posicion: "+posicion);
			 }
		 }
		 

	}

}
