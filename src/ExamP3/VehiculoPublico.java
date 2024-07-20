package ExamP3;

public class VehiculoPublico extends ImpuestoVehicular {
    public VehiculoPublico(double valor) {
        super(valor);
    }

    @Override
    public double calcularImpuestos() {

        return super.calcularImpuestos();
    }

    @Override
    protected double calcularDescuentos() {
        double descuentos = super.calcularImpuestos() * 0.05;
        descuentos += 1000;


        detalleDescuentos.append(String.format("Descuento por pronto pago: $%.2f%n", descuentos * 0.05));
        detalleDescuentos.append(String.format("Descuento por ser de servicio público: $%.2f%n", 1000.0));

        return descuentos;
    }
}
