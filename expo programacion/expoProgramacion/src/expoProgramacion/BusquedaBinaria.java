package expoProgramacion;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el elemento a buscar: ");
        int objetivo = scanner.nextInt();
        int izquierda = 0;
        int derecha = lista.length - 1;
        boolean encontrado = false;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (lista[medio] == objetivo) {
                System.out.println("Elemento encontrado en el indice: " + medio);
                encontrado = true;
                break;
            } else if (lista[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Elemento no encontrado en la lista.");
        }

        scanner.close();
    }
}


