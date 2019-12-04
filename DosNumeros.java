import java.util.Scanner;

public class DosNumeros
{
	public static void main(String[] args)
	{	
		
		Scanner test = new Scanner(System.in);
		System.out.println("ingrese el primer numero");
		int n1 = test.nextInt();
		System.out.println("ingrese el segundo numero numero");
		int n2 = test.nextInt();
		
		System.out.println("opciones de operaciones del programa:");
		System.out.println("Opcion [1] = Suma");
		System.out.println("Opcion [2] = Resta");
		System.out.println("Opcion [3] = Multiplicacion");
		System.out.println("Opcion [4] = Division");
		
		
		int operacion = test.nextInt();
		int resultado = 0;
		switch(operacion)
		{
			case 1:
			resultado = n1+n2;
			System.out.println("El resultado de la suma es: /n" + resultado);
			break;
			case 2:
			resultado = n1-n2;
			System.out.println("El resultado de la resta es: " + resultado);
			break;
			case 3:
			resultado = n1*n2;
			System.out.println("El resultado de la multiplicacion es: "+resultado);
			break;
			case 4:
			resultado = n1/n2;
			System.out.println("El resultado de la division es: "+resultado);
			break;
		}
		
		/*System.out.println("Favor de escribir su primer numero");
		String nombre = numero1.nextLine();
		
		System.out.println("Hola " + nombre + " buen dia!");*/
	}
}