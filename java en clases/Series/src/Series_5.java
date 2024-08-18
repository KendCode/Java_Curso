import java.util.Scanner;
public class Series_5 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, sw=0, a = 1, c = 1;
		
		System.out.print("Ingrese el digito: ");
		n = leer.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			System.out.print(sw +", ");
			if(c == a)
			{
				if(sw == 0)
				{
					sw = 1;
					c = 1;
				}
				else
				{
					sw = 0;
					c = 1;
					a++;
				}
			}
			else
				c++;
		}

	}

}
