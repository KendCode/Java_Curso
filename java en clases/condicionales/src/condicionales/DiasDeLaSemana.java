package condicionales;
import java.util.Scanner;
public class DiasDeLaSemana {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int dia;
		
		System.out.print("Ingrese un número para ver el dia: ");
		dia = leer .nextInt();
		
		switch(dia)
		{
			case 1:
				System.out.print("lunes");
				break;
			case 2: 
				System.out.print("Martes");
				break;
			case 3: 
				System.out.print("Miercoles");
				break;
			case 4: 
				System.out.print("Jueves");
				break;
			case 5: 
				System.out.print("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.print("Domingo");
				break;
			default:
				System.out.print("El dia no pertence a uno de la semana");
				break;
		}

	}

}
