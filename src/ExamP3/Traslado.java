package ExamP3;

public class Traslado extends VehiculoPublico {
    public Traslado(double valor) {
        super(valor);
    }

    @Override
    protected double calcularDescuentos() {
        double descuentos = super.calcularDescuentos();

        double descuentoTraslado = super.calcularImpuestos() * 0.1;
        descuentos += descuentoTraslado;


        detalleDescuentos.append(String.format("Descuento por traslado de cuenta: $%.2f%n", descuentoTraslado));

        return descuentos;
    }
}
