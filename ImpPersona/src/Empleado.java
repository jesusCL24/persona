public class Empleado extends Persona{
    private double sueldo;

    public Empleado(int edad,String nombre,double sueldo) {
        super(edad,nombre);
        this.sueldo = sueldo;
    }

    public void Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public void mostrar(int edad,String nombre,double sueldo){
        System.out.println(sueldo);
        System.out.println(edad);
        System.out.println(nombre);
    }

}
