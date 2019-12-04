import java.util.Scanner;

public class LeerTecladoYaneth
{
	public static void main(String[] args)
	{
		Scanner test = new Scanner(System.in);
		
		System.out.println("cual es tu nombre?");
		String nombre = test.nextLine();
		
		System.out.println("Hola " + nombre + " buen dia!");
	}
}