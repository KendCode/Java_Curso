package vectores;
import java.util.Scanner;
public class Ejer_14 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		Vector FV = new Vector();

        int N, cc = 0;
        int[] V = new int[100];
        
		        System.out.print("Ingrese la cantidad de números en el lote: ");
		        N = leer.nextInt();

		        int[] numeros = new int[N];
		        int[] VC;
		        int[] VP;
		        int[] vR;

		        llenarArreglo(numeros, N);
		        vectorC = clasificarVector(numeros, N, 99, true);
		        vectorP = clasificarVector(numeros, N, 2, false);
		        vectorR = clasificarVector(numeros, N, 2, true);

		        System.out.println("Elementos del vector C (mayores a 99):");
		        mostrarVector(vectorC);
		        
		        System.out.println("\nElementos del vector P (números pares):");
		        mostrarVector(vectorP);

		        System.out.println("\nElementos del vector R (números impares):");
		        mostrarVector(vectorR);

		        scanner.close();
		    }

		    public static void llenarArreglo(int[] arr, int N) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Ingrese los números:");
		        for (int i = 0; i < N; i++) {
		            arr[i] = scanner.nextInt();
		        }
		    }

		    public static int[] clasificarVector(int[] arr, int N, int divisor, boolean mayorQue) {
		        int[] result = new int[N];
		        int indice = 0;
		        for (int i = 0; i < N; i++) {
		            if ((mayorQue && arr[i] > divisor) || (!mayorQue && arr[i] % divisor == 0)) {
		                result[indice++] = arr[i];
		            }
		        }
		        return obtenerSubarreglo(result, indice);
		    }

		    public static int[] obtenerSubarreglo(int[] arr, int size) {
		        int[] subarreglo = new int[size];
		        System.arraycopy(arr, 0, subarreglo, 0, size);
		        return subarreglo;
		    }

		    public static void mostrarVector(int[] arr) {
		        for (int num : arr) {
		            if (num != 0) {
		                System.out.print(num + " ");
		            }
		        }
		    }
		}


	}

}
