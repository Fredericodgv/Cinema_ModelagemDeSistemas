import java.util.Date;

public class Sessao {
    private Date dataSessao;
    private String horaSessao;
    private String estadoSessao;
    private int ingressosSessao;
    private int ingressosComprados;
    private int ingressosRestantes;

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

    }

    public void venderIngressos(){

    }
}
