package matriz;
import java.util.Scanner ;
public class EJER_1 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		Matriz LM = new Matriz();
		
		int N, i, j, aux;
		System.out.print("Ingrese el tama�o de la matriz cuadrada: ");
		N = leer.nextInt();
		
		//CREAMOS LA MATRIZ A DE NUMEROS ENTEROS
		int [][] A = new int [N][N];
		
		aux = N-1;
		for(i=0 ; i<N; i++)
		{
			for(j = 0; j < N; j++)
				if(j < aux)
					A[i][j] = 1;
				else if(j == aux)
						A[i][j]=2;
					else
						A[i][j]=3;
			aux--;
		}
		LM.mostrarMatriz(A, N, N);

	}

}
