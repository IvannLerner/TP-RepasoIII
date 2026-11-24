public class Tarjeta extends MedioPago {
    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con tarjeta de " + getTitular());
            System.out.println("Ultimos cuatro digitos: " + ultimosCuatroDigitos);
            System.out.println("Monto: $" + monto);
        }
    }
}
