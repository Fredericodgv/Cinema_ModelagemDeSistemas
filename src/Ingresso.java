public class Ingresso {
    private int numeroIngresso;
    private int assentoIngresso;
    private String tipoIngresso;
    private float valorIngresso;
    private String dataHoraCompra;

    public Ingresso(int numeroIngresso, int assentoIngresso, String tipoIngresso, float valorIngresso, String dataHoraCompra) {
        this.numeroIngresso = numeroIngresso;
        this.assentoIngresso = assentoIngresso;
        setTipoIngresso(tipoIngresso);
        this.valorIngresso = valorIngresso;
        this.dataHoraCompra = dataHoraCompra;
    }

    public int getNumeroIngresso() {
        return numeroIngresso;
    }

    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public int getAssentoIngresso() {
        return assentoIngresso;
    }

    public void setAssentoIngresso(int assentoIngresso) {
        this.assentoIngresso = assentoIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        if (tipoIngresso.equalsIgnoreCase("Inteira") || tipoIngresso.equalsIgnoreCase("Meia-Entrada")) {
            this.tipoIngresso = tipoIngresso;
        } else {
            System.out.println("Tipo de ingresso inválido!");
        }
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(String dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

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
