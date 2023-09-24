import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1,p3;                 // uso directo.
		Persona p2 =new Persona();  // uso de constructor
		
		int edad;
		char sexo;
		String Nombre, alturaTexto;
		float altura;
		float peso;
		String salir;
		boolean sen =false;
		
		
		
		System.out.println("Ingrese el nombre de la pesona");
		
		Scanner sc = new Scanner(System.in);

		Nombre = sc.nextLine();	
		
	////// ingrese la altura
			System.out.println("Ingrese la edad de la pesona");
			
			sen = false;
			do {
				try {
					edad=sc.nextInt();
					sen=true;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("valor de edad invalido, vuelva a intentarlo nuevamente. o quiere salir del programa escriba SALIR");
					edad = 0;
					sc.next(); //limpiando el buffer.
					sc.nextLine();
					salir = sc.nextLine();
					
					if(salir.equals("SALIR"))
					{
						System.exit(0);
					}else {
						System.out.println("no salir" + salir);
					}
					sc.next();
				}
			} while(!sen);
		
		
		
		////// ingrese la altura
		System.out.println("Ingrese el altura de la pesona");
		
		sen = false;
		do {
			try {
				altura= sc.nextFloat();
				sen=true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("valor de altura invalido, vuelva a intentarlo nuevamente.");
				altura = 0;
				sc.next(); //limpiando el buffer.
			}
		} while(!sen);
		
		sen = false;
		
		System.out.println("Ingrese el peso de la pesona");
		peso = sc.nextFloat();
		
		System.out.println("Ingrese el sexo");
		sexo = sc.next().charAt(0);
		
		p1 = new Persona(Nombre, altura, peso, edad,sexo);
		
		sc.nextLine();
		
		System.out.println("Ingrese el altura en texto");
		alturaTexto = sc.nextLine();
		
		System.out.println("altura texto " + alturaTexto);
		
		p1.afterTextChanged(alturaTexto);
		
		System.out.println("cantidad de objetos es ");
		
		p3 = new Persona(Nombre, altura, peso, edad,sexo);
		
		p1.DevolverCantidaddeObjetos();
		
		System.out.println("calcularAreaCirculo " + UtilidadesMatematicas.calcularAreaCirculo(edad));

		
		
		
	}

}
