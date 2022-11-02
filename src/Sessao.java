import java.util.Date;

public class Sessao {
    private Date dataSessao;
    private String horaSessao;
    private String estadoSessao;
    private int ingressosSessao;
    private int ingressosComprados;
    private int ingressosRestantes;

    private Filme filme;
    private Sala sala;

    public Sessao(Date dataSessao, String horaSessao, String estadoSessao, int ingressosSessao, int ingressosComprados, int ingressosRestantes) {
        this.dataSessao = dataSessao;
        this.horaSessao = horaSessao;
        this.estadoSessao = estadoSessao;
        this.ingressosSessao = ingressosSessao;
    }

    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    public String getEstadoSessao() {
        return estadoSessao;
    }

    public void setEstadoSessao(String estadoSessao) {
        this.estadoSessao = estadoSessao;
    }

    public int getIngressosSessao() {
        return ingressosSessao;
    }

    public void setIngressosSessao(int ingressosSessao) {
        this.ingressosSessao = ingressosSessao;
    }

    public int getIngressosComprados() {
        return ingressosComprados;
    }

    public void setIngressosComprados(int ingressosComprados) {
        this.ingressosComprados = ingressosComprados;
    }

    public int getIngressosRestantes() {
        return ingressosRestantes;
    }

    public void setIngressosRestantes(int ingressosRestantes) {
        this.ingressosRestantes = ingressosRestantes;
    }

    public void exibirSessao(){
        System.out.println("Data da sessão: " + getDataSessao());
        System.out.println("Hora da sessão: " + getHoraSessao());
        System.out.println("Estado da sessão: " + getEstadoSessao());
        System.out.println("Ingressos disponíveis: " + getIngressosSessao());
        System.out.println("Ingressos comprados: " + getIngressosComprados());
        System.out.println("Ingressos restantes: " + getIngressosRestantes());
        System.out.println("Filme: " + this.filme.getTitulo());
        System.out.println("Sala: " + this.sala.getNomeSala());
    }

    public void venderIngressos(Ingresso ingVendido){
        if (ingressosRestantes == 0)
            System.out.println("Não há mais ingressos disponíveis para esta sessão.");
        else{
            ingressosComprados++;
            ingressosRestantes--;
        }
    }
}
