package Empleados;

public class Empleado extends Persona {
     public double getSueldosoles() {
		return sueldosoles;
	}
	public void setSueldosoles(double sueldosoles) {
		this.sueldosoles = sueldosoles;
	}
	public Empleado(String dni, String nombre, String apellido) {
		super(dni, nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	//private int codigo;
	private double sueldosoles;
	
	public void actSueldo (double sueldodolar) {
		double tipcamb =3.30;
		sueldosoles = tipcamb*sueldodolar;
	}
	public static void main(String[] args) {
		double sueldo1;
		// TODO Auto-generated method stub
     Empleado empleado =  new Empleado("40043141","Marco","Geldres");
     Empleado empleado1 = new Empleado("40043142","Antonio","Milla");
     Empleado empleado2 = new Empleado("40043143","Mario","Alva");
     empleado.Show();
     empleado1.Show();
     empleado2.Show();
     empleado.actSueldo(150);
     sueldo1 = empleado.getSueldosoles();
     System.out.println("El sueldo en soles es: "+sueldo1);
     empleado1.actSueldo(150);
     empleado.actSueldo(150);
	}

}

