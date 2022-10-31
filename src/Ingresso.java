public class Ingresso {
    private int numeroIngresso;
    private int assentoIngresso;
    private String tipoIngresso;
    private float valorIngresso;
    private String dataHoraCompra;

    public void imprimirIngresso() {
        System.out.println("------------------");
        System.out.println(numeroIngresso);
        System.out.println(assentoIngresso);
        System.out.println(tipoIngresso);
        System.out.println(valorIngresso);
        System.out.println(dataHoraCompra);
        System.out.println("------------------");
    }
}
