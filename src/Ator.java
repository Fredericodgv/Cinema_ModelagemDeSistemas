

public class Ator extends Papel{
    private int idade;
    private Character sexo;
    private String nacionalidade;

    public Ator(String nomePessoa, String papel, int idade, char sexo, String nacionalidade) {
        super(nomePessoa, papel);
        this.idade = idade;
        setSexo(sexo);
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        if (sexo.equals('m') || sexo.equals('M') || sexo.equals('f') || sexo.equals('F'))
            this.sexo = sexo;
        else
            System.out.println("Sexo inválido!");
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
