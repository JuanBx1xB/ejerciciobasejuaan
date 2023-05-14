
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Usuario
{
    // instance variables - replace the example below with your own
    private String nombre;
    private double precioTotal;
    private double promedioCompra;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getPromedioCompra() {
        return promedioCompra;
    }

    public void seleccionarImplemento(int opcion) {
        switch (opcion) {
            case 1:
                precioTotal += 156.000;
                System.out.println("Has elegido la Camiseta NBA.");
                break;
            case 2:
                precioTotal += 65.000;
                System.out.println("Has elegido el Balón de baloncesto.");
                break;
            case 3:
                precioTotal += 140.000;
                System.out.println("Has elegido la Pantaloneta NBA.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    public void calcularTotal() {
        
    }

    public void calcularPromedio() {
        promedioCompra = precioTotal / 2;
    }
}