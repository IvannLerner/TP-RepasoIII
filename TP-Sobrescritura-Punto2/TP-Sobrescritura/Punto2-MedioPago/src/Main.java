public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta1 = new Tarjeta("Juan", "1234");
        BilleteraVirtual billetera1 = new BilleteraVirtual("Pedro", "Mercado Pago");

        tarjeta1.procesarPago(1500);
        billetera1.procesarPago(2000);
    }
}
