
public class Persona {

//	"Copia de practica de la clase persona. Tiene nombrem, edad, altura, peso"
	/*
	 * 
	 * creamos las variables y luego metodos desde las variables con la opcion de los generadores
	 * 
	 * 
	 */
	//variables
	
	static int contador = 0;
	
	
	
	
	public Persona() {
		//
		// este es el constructor heredado de la superclase "java.lang.Object"
		contador++;
	}
	
	private static final char SEXO = 'h';
	
	private String Nombre;
	private float Altura;
	private float peso;
	private int edad;
	private char sexo= SEXO;
	private char sexo2 = SEXO;
	
	
	public char getSexo2() {
		return sexo2;
	}

	public Persona(String nombre, float altura, float peso, int edad, char sexo) {
		super();
		this.Nombre = nombre;
		this.Altura= altura;
		this.peso = peso;
		this.edad = edad;
		this.sexo = sexo;
		contador++;
	}
	
 
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public float getAltura() {
		return Altura;
	}
	public void setAltura(float altura) {
		try {
			Altura = altura;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void DevolverCantidaddeObjetos() {
		// TODO Auto-generated method stub
		System.out.println(contador);
	}

	public void DevolverCantidaddeObjetos1() {
		// TODO Auto-generated method stub
		System.out.println(edad);
	}

	
	public void afterTextChanged(String s) {
	    double doubleValue = 0;
	    if (s != null) {
	        try {
	            doubleValue = Double.parseDouble(s.toString().replace(',', '.'));
	        } catch (NumberFormatException e) {
	            //Error
	        }
	    }
	    //Hacer cualquier cosa con el doblevalue
	    System.out.println("El valor es " + doubleValue);
	}
	
	
}
