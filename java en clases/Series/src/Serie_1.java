import java.util.Scanner;
public class Serie_1 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n;
		/* LONG ES PARA NUMEROS GRANDES HASTA 20 DIGITOS*/
		long a = 0;
		
		System.out.print("Ingrese los digitos: ");
		n = leer.nextInt();
		
		for(int i = 1 ; i <= n; i++)
		{
			a = (a * 10)+i;
			System.out.print(a+", ");
		}

	}

}
