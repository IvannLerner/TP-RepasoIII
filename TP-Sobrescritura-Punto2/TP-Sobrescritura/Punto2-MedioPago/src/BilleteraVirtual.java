public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con billetera virtual de " + getTitular());
            System.out.println("Aplicacion: " + nombreAplicacion);
            System.out.println("Monto: $" + monto);
        }
    }
}
