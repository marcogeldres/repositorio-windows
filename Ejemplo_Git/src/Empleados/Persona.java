package Empleados;

public class Persona {
private String dni;
private String nombre;
private String apellido;
public Persona(String dni , String nombre, String apellido) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
}

public void Show() {
	System.out.println("El Dni es: "+ dni);
	System.out.println("El nombre es: "+ nombre);
	System.out.println("El apellido es: "+ apellido);
}  

}
