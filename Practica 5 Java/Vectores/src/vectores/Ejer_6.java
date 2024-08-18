package vectores;
import java.util.Scanner;

public class Ejer_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Vector FV = new Vector();

        System.out.print("Ingrese la cantidad de elementos: ");
        int N = leer.nextInt();

        int[] num = new int[N];

        Vector vector = new Vector();

        FV.llenarVector(N, num);

        System.out.println("Vector generado es:");
        for (int i = 0; i < N; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        System.out.println("Elementos mayores a 100 y potencias de 4:");
        for (int i = 0; i < N; i++) {
            int elemento = num[i];
            if (elemento > 100 && esPotenciaDeCuatro(elemento)) {
                System.out.println(elemento);
            }
        }
    }

    private static boolean esPotenciaDeCuatro(int numero) {
        // Verificar si el n�mero es una potencia de 4
        if (numero <= 0) {
            return false;
        }

        // Revisar si el n�mero es potencia de 2
        int log2 = (int) (Math.log(numero) / Math.log(2));
        if (Math.pow(2, log2) == numero) {
            // Si es potencia de 2, verificar si el exponente es par
            return log2 % 2 == 0;
        }
        return false;
    }
}



