public class tiposDatos2
{
		int edad;
		short peso;
		String nombre;
		float precio;
		boolean esVIP;
		boolean tieneCredencial;
		boolean PuedoVotar;
		long Valorlong;
		
	
	public static void main(String[] args)
	{
		tiposDatos2 ejemplo = new tiposDatos2();
		
		ejemplo.edad = Integer.valueOf(args[0]);
		
		System.out.println(ejemplo.edad);
		System.out.println(ejemplo.peso);
		System.out.println(ejemplo.nombre);
		System.out.println(ejemplo.precio);
		System.out.println(ejemplo.esVIP);
		System.out.println(ejemplo.tieneCredencial);
		System.out.println(ejemplo.PuedoVotar);
		System.out.println(ejemplo.Valorlong);
	
	}
	
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
}