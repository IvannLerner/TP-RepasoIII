public class Main {
    public static void main(String[] args) {
        LibroDigital libro1 = new LibroDigital("El Principito");
        Audiolibro audio1 = new Audiolibro("Don Quijote");

        libro1.mostrarDescripcion();
        audio1.mostrarDescripcion();
    }
}
