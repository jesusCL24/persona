import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);
        int e=0;
        String nombre;
        Empleado p=new Empleado(12,"jesus",55);
        p.mostrar(12,"jesus",65);

        Persona g=new Persona();
        System.out.println("ingrese nombre: ");
        nombre= sx.next();
        System.out.println("ingrese edad: ");
        e=sx.nextInt();
        g.imprimir(e,nombre);
    }
}
