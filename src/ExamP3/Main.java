package ExamP3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del vehículo: ");
        double valorVehiculo = scanner.nextDouble();

        ImpuestoVehicular calculador;

        System.out.print("¿Es un vehículo de servicio público? (s/n): ");
        String esPublicoStr = scanner.next();
        boolean esPublico = esPublicoStr.equalsIgnoreCase("s");

        if (esPublico) {
            System.out.print("¿Es traslado de cuenta? (s/n): ");
            String esTrasladoStr = scanner.next();
            boolean esTraslado = esTrasladoStr.equalsIgnoreCase("s");

            if (esTraslado) {
                calculador = new Traslado(valorVehiculo);
            } else {
                calculador = new VehiculoPublico(valorVehiculo);
            }
        } else {
            calculador = new ImpuestoVehicular(valorVehiculo);
        }

        calculador.mostrarTotalConDescuentos();
        calculador.mostrarDetalleDescuentos();
    }
}
