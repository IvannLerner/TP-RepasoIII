public class Audiolibro extends MaterialDigital {

    public Audiolibro(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Se puede escuchar");
    }
}
