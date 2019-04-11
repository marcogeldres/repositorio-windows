package Empleados;

public class Empleado extends Persona {
     public Empleado(String dni, String nombre, String apellido) {
		super(dni, nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	private int codigo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Empleado empleado =  new Empleado("40043141","Marco","Geldres");
     Empleado empleado1 = new Empleado("40043142","Antonio","Milla");
     Empleado empleado2 = new Empleado("40043143","Mario","Alva");
     empleado.Show();
     empleado1.Show();
     empleado2.Show();
	}

}

