
import java.util.Scanner;

public class ProgramaImplementos {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String nombreUsuario;
int opcion1, opcion2;
double precioTotal, promedioCompra;
System.out.println("Hola bienvenido al programa de implementos de Basquetbol.");
System.out.println("Por favor, ingresa tu nombre:");
nombreUsuario = input.nextLine();

System.out.println("Hola, " + nombreUsuario + ". A continuación, elige los de implementos que deseas:");
System.out.println("1. Camiseta NBA - Precio: $156.000");
System.out.println("2. Balón de baloncesto - Precio: $65.000");
System.out.println("3. Pantaloneta NBA - Precio: $140.000");

System.out.println("Ingresa el número correspondiente al primer tipo de implemento que deseas:");
opcion1 = input.nextInt();

System.out.println("Ingresa el número correspondiente al segundo tipo de implemento que deseas:");
opcion2 = input.nextInt();

precioTotal = 0;

if (opcion1 == 1) {
  precioTotal += 156000;
  System.out.println("Has seleccionado la Camiseta NBA.");
}

if (opcion1 == 2) {
  precioTotal += 65000;
  System.out.println("Has seleccionado el balón de baloncesto.");
}

if (opcion1 == 3) {
  precioTotal += 140000;
  System.out.println("Has seleccionado la Pantaloneta NBA.");
}

if (opcion2 == 1) {
  precioTotal += 156000;
  System.out.println("Has seleccionado la Camiseta NBA.");
}

if (opcion2 == 2) {
  precioTotal += 65000;
  System.out.println("Has seleccionado el balón de baloncesto.");
}

if (opcion2 == 3) {
  precioTotal += 140000;
  System.out.println("Has seleccionado la Pantaloneta NBA.");
}

promedioCompra = precioTotal / 2;

System.out.println("El resultado de los tipos de guantes que elegiste es:");
System.out.println("Precio Total: $" + precioTotal);
System.out.println("Promedio de compra: $" + promedioCompra);

input.close();
}
}
