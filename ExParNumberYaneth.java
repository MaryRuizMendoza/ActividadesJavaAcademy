public class ExParNumberYaneth
{
	public static void main(String[] args)
	{
		int valorEntero = Integer.valueOf(args[0]);
		
		boolean esPar = valorEntero%2 == 0;
		
		if(esPar)
		{
			System.out.println("El numero " + valorEntero + " es par");
		}
		else{
			System.out.println("El numero " + valorEntero + " es impar");
		}
	}

}