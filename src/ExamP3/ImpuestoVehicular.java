package ExamP3;

public class ImpuestoVehicular
{
    protected double valor;
    protected StringBuilder detalleDescuentos;

    public ImpuestoVehicular(double valor) {
        this.valor = valor;
        this.detalleDescuentos = new StringBuilder();
    }


    public double calcularImpuestos() {
        return this.valor * 0.1;
    }


    public void mostrarDetalleDescuentos() {
        System.out.println("Descuentos aplicados:");
        System.out.println(this.detalleDescuentos.toString());
    }


    public void mostrarTotalAPagar() {
        double total = calcularImpuestos();
        System.out.printf("Total a pagar antes de descuentos: $%.2f%n", total);
    }


    public void mostrarTotalConDescuentos() {
        double total = calcularImpuestos();
        System.out.printf("Total a pagar antes de descuentos: $%.2f%n", total);

        double descuentosAplicados = calcularDescuentos();
        double totalConDescuentos = total - descuentosAplicados;

        System.out.printf("Total a pagar con descuentos aplicados: $%.2f%n", totalConDescuentos);
    }


    protected double calcularDescuentos() {
        return 0;
    }
}