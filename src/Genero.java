

public class Genero {
    private String nomeGenero;

    public Genero(String nomeGenero) {
        setNomeGenero(nomeGenero);
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        if (nomeGenero.equalsIgnoreCase("Ficção") || nomeGenero.equalsIgnoreCase("Aventura") || nomeGenero.equalsIgnoreCase("Drama") || nomeGenero.equalsIgnoreCase("Ação") || nomeGenero.equalsIgnoreCase("Comédia") || nomeGenero.equalsIgnoreCase("Terror")) {
            this.nomeGenero = nomeGenero;
        } else {
            System.out.println("Gênero inválido!");
        }
    }
}
