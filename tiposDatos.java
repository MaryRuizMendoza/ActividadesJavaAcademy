public class tiposDatos
{
	public static void main(String[] args)
	{
		//tipoDato NombreVariable; se agrega la inicializacion opcionalmente
		int edad = 18;
		short peso = 70;
		String nombre = "Jose";
		float precio = 135.5f;
		boolean esVIP = false;
		boolean tieneCredencial = false;
		
		boolean PuedoVotar = ((edad >= 18) && tieneCredencial);
		
		System.out.println(edad+" - "+peso+" - "+nombre+" - "+precio+" - "+esVIP+" - "+tieneCredencial+" - "+PuedoVotar
		);
	}
}