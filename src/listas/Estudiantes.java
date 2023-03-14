package listas;

public class Estudiantes {
	public String cedula;
	public String nombre;
	public int edad;

	
	
	//constructor
	Estudiantes(String c,String n, int e){
		cedula = c;
		nombre = n;
		edad = e;
	}

	public String mostrar() {
		return "Cedula: " + this.cedula + ", Nombre: " + this.nombre + ", Edad: " + this.edad;
	}

	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
