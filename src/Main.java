import com.transportes.Vehiculo;
import com.transportes.Carro;
import com.transportes.Moto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Vehiculo miVehiculo = new Vehiculo("Lada", 1985);
        Carro miCarro = new Carro("Toyota", 2010, 4);
        Moto miMoto = new Moto("Bugatti", 2018);

        miVehiculo.arrancar();
        miCarro.arrancar();
        miMoto.arrancar();

        miMoto.settieneCanasta(true);

        System.out.println(miCarro.getMarca() + " es del año " + miCarro.getAnio() + " y tiene " + miCarro.getNumeroPuertas() + " puertas.");
        System.out.println(miMoto.getMarca() + " es del año " + miMoto.getAnio() + " y tiene canasta: " + miMoto.gettieneCanasta() );*/

        Scanner scanner = new Scanner(System.in);
        Carro miCarro = null;
        Moto miMoto = null;
        String marca;
        int annio, numeroPuertas;
        boolean tieneCanasta;

        while (true) {
            System.out.println("\n Concesionaria Vehiculo");
            System.out.println(" 1. Agregar un carro");
            System.out.println(" 2. Agregar una moto");
            System.out.println(" 3. Modificar un carro");
            System.out.println(" 4. Modificar una moto");
            System.out.println(" 5. Ver carro actual");
            System.out.println(" 6. Ver moto actual");
            System.out.println(" 7. Salir");
            System.out.print("\n\nOpcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Marca: ");
                    marca = scanner.nextLine();
                    System.out.print("Año: ");
                    annio = scanner.nextInt();
                    System.out.print("Numero de Puertas: ");
                    numeroPuertas = scanner.nextInt();
                    miCarro = new Carro(marca, annio, numeroPuertas);
                    System.out.println("Se ha agregado el carro de marca " + miCarro.getMarca() + " del año " + miCarro.getAnio() + " con " + miCarro.getNumeroPuertas() + " puertas.");
                    break;
                case 2:
                    System.out.print("Marca: ");
                    marca = scanner.nextLine();
                    System.out.print("Año: ");
                    annio = scanner.nextInt();
                    System.out.print("Tiene canasta: ");
                    tieneCanasta = scanner.nextBoolean();
                    miMoto = new Moto(marca, annio, tieneCanasta);
                    System.out.println("Se ha agregado la moto de marca " + miMoto.getMarca() + " del año " + miMoto.getAnio() + " con canasta: " + miMoto.gettieneCanasta());
                    break;
                case 3:
                    if (miCarro != null) {
                        System.out.print("Nueva Marca: ");
                        String nuevaMarca = scanner.nextLine();
                        miCarro.setMarca(nuevaMarca);
                        System.out.print("Nuevo Año: ");
                        int nuevoAnio = scanner.nextInt();
                        miCarro.setAnio(nuevoAnio);
                        System.out.print("Nuevo Numero de Puertas: ");
                        int nuevoNumeroPuertas = scanner.nextInt();
                        miCarro.setNumeroPuertas(nuevoNumeroPuertas);
                        System.out.println("Se ha modificado el carro de marca " + miCarro.getMarca() + " del año " + miCarro.getAnio() + " con " + miCarro.getNumeroPuertas() + " puertas.");
                    } else {
                        System.out.println("No hay carro todavía agregado.");
                    }
                    break;
                case 4:
                    if (miMoto != null) {
                        System.out.print("Nueva Marca: ");
                        String nuevaMarca = scanner.nextLine();
                        miMoto.setMarca(nuevaMarca);
                        System.out.print("Nuevo Año: ");
                        int nuevoAnio = scanner.nextInt();
                        miMoto.setAnio(nuevoAnio);
                        System.out.print("Tiene canasta: ");
                        boolean nuevoTieneCanasta = scanner.nextBoolean();
                        miMoto.settieneCanasta(nuevoTieneCanasta);
                        System.out.println("Se ha modificado la moto de marca " + miMoto.getMarca() + " del año " + miMoto.getAnio() + " con canasta: " + miMoto.gettieneCanasta());
                    } else {
                        System.out.println("No hay moto todavía agregado.");
                    }
                    break;
                case 5:
                    if (miCarro != null) {
                        System.out.println("Tenemos el carro de marca " + miCarro.getMarca() + " del año " + miCarro.getAnio() + " con " + miCarro.getNumeroPuertas() + " puertas.");
                    } else {
                        System.out.println("No hay carro todavía agregado.");
                    }
                    break;
                case 6:
                    if (miMoto != null) {
                        System.out.println("Tenemos la moto de marca " + miMoto.getMarca() + " del año " + miMoto.getAnio() + " con canasta: " + miMoto.gettieneCanasta());
                    } else {
                        System.out.println("No hay moto todavía agregada.");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }
}
