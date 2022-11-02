
public class Direcao extends Papel{
    private String papelDirecao;

    public Direcao(String nomePessoa, String papel, String papelDirecao) {
        super(nomePessoa, papel);
        setPapelDirecao(papelDirecao);
    }

    public String getPapelDirecao() {
        return papelDirecao;
    }

    public void setPapelDirecao(String papelDirecao) {
        this.papelDirecao = papelDirecao;
    }
}
