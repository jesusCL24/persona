public class Persona {
    protected int edad;
    protected String nombre;

    public Persona(int edad, String nombre) {
    }

    public Persona() {
    }

    public void CargarPersona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void imprimir(int edad,String nombre){
        System.out.println("el nombre da la persona es: " +nombre);
        System.out.println("la edad es: "+edad);
    }
}
