package vectores;
import java.util.Scanner;

public class Ejer_12_Primos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Vector FV = new Vector();

        int N, cc = 0;
        int[] V = new int[100];

        System.out.print("Ingrese la cantidad de elementos: ");
        N = leer.nextInt();

        FV.llenarVector2(N, V);
        FV.mostrarVector(N, V);

        for (int i = 0; i < N; i++) {
            if (esPrimo(V[i])) {
                cc++;
            }
        }
        System.out.print("\nCantidad de Primos: " + cc);
    }

    public static boolean esPrimo(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}


