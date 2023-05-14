
/**
 * Write a description of class ImplementosBasquetbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ImplementosBasquetbol
{
    
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Hola este es el programa de implementos de basquetbol .");
        System.out.println("A continuacion pon tu nombre y apellido por favor!:");
        String nombreUsuario = scanner.nextLine();

        
        Usuario usuario = new Usuario(nombreUsuario);

        
        System.out.println("Hola, " + usuario.getNombre() + ". A continuación, escoge los implementos de basquetbol que quieras:");
        System.out.println("1.Camiseta NBA - Precio: $156.000");
        System.out.println("2.Balón de baloncesto - Precio: $65.000");
        System.out.println("3.Pantaloneta NBA - Precio: $140.000");

        
        System.out.println("Ingresa el número que corresponda al primer tipo de implemento de basquetbol que quieras:");
        int opcion1 = scanner.nextInt();
        usuario.seleccionarImplemento(opcion1);

        
        System.out.println("Ingresa el número que corresponda al segundo tipo de implemento de basquetbol que quieras:");
        int opcion2 = scanner.nextInt();
        usuario.seleccionarImplemento(opcion2);

        
        usuario.calcularTotal();
        usuario.calcularPromedio();

        
        System.out.println("El resultado de los tipos de implementos que elegiste son:");
        System.out.println("Precio Total: $" + usuario.getPrecioTotal());
        System.out.println("Promedio de compra: $" + usuario.getPromedioCompra());

        
        scanner.close();
    }
}