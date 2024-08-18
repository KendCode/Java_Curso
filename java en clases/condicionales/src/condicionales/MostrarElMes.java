package condicionales;
import java.util.Scanner;
public class MostrarElMes {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int mes;
		
		System.out.print("Ingrese un numero para ver el mes: ");
		mes = leer.nextInt();
		
		switch(mes)
		{
			case 1:
				System.out.print("Enero");
				break;
			case 2: 
				System.out.print("Febrero");
				break;
			case 3:
				System.out.print("Marzo");
				break;
			case 4:
				System.out.print("Abril");
				break;
			case 5:
				System.out.print("Mayo");
				break;
			case 6:
				System.out.print("Junio");
				break;
			case 7:
				System.out.print("Julio");
				break;
			case 8:
				System.out.print("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("Ingrese un numero valido");
				break;
			
		}
		

	}

}
