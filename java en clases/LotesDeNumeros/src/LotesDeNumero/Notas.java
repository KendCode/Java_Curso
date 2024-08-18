package LotesDeNumero;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		String nombre;
		int n, c=1, nota;
		 System.out.print("Ingrese la cantidad de estudiantes: ");
		 n = leer.nextInt();
		 
		 while(c <= n)
		 {
			 System.out.print("Ingrese el nombre del estudiante:");
			 nombre = leer.next();
			 System.out.print("Ingrese su nota: ");
			 nota = leer.nextInt();
			 
			 switch (nota)
			 {
			 	case 10:
			 		System.out.println("A");
			 		break;
			 	case 9:
			 		System.out.println("B");
			 		break;
			 	case 8:
			 		System.out.println("C");
			 		break;
			 	case 7:
			 		System.out.println("D");
			 	case 6:
			 		System.out.println("D");
			 		break;
			 	default:
			 		System.out.println("F");
			 		break;
			 	
			 }
			 c++;
		 }

	}

}
