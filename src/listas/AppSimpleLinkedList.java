package listas;

import java.util.Scanner;

public class AppSimpleLinkedList {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*// TODO Auto-generated method stub
		SimpleLinkedList<Integer> listaEnlazada = new SimpleLinkedList<>();
		listaEnlazada.addFirst(5);
		listaEnlazada.addFirst(12);
		listaEnlazada.addFirst(32);
		listaEnlazada.addFirst(55);
		listaEnlazada.addLast(45);
		
		//System.out.println(listaEnlazada.last());
	
	listaEnlazada.getAll();
	System.out.println("indice 2: " + listaEnlazada.getElementObject(2));
	*/
	SimpleLinkedList<Estudiantes> listaEnlazadaEst = new SimpleLinkedList<>();
	System.out.print("Ingrese la cantidad de estudiantes:");
	int n = entrada.nextInt();
	for(int i = 1; i<=n; i++) {
		System.out.println("Estudiante "+ i);
		System.out.println("Cedula ");
		String cedula = entrada.next();
		System.out.println("Nombre: ");
		String nom = entrada.next();
		System.out.println("Edad ");
		int edad = entrada.nextInt();
		Estudiantes agregarEstudiante = new Estudiantes(cedula, nom, edad);
		listaEnlazadaEst.addFirst(agregarEstudiante);
		
		
	}
	listaEnlazadaEst.getAllEst();
	
	System.out.println("Promedio de las edades es: " + listaEnlazadaEst.prom());
	
	System.out.println("Estudiante con mayor edad: "); 
	System.out.println(listaEnlazadaEst.mayorElemento());
	listaEnlazadaEst.mayorElemento();
	System.out.println("Canitdad total de estudiantes mayores de 20: " + listaEnlazadaEst.mayores());
	
	
	
	
	}
	
	

}
