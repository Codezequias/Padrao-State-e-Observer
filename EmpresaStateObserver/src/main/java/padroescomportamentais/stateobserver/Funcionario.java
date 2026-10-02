package padroescomportamentais.stateobserver;

import java.util.Observable;
import java.util.Observer;

public class Funcionario implements Observer {

    private String nome;
    private FuncionarioEstado estado;
    private String ultimaNotificacao;

    public Funcionario() {
        this.estado = FuncionarioEstadoAtivo.getInstance();
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.estado = FuncionarioEstadoAtivo.getInstance();
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public boolean aposentar() {
        return estado.aposentar(this);
    }

    public boolean afastar() {
        return estado.afastar(this);
    }

    public boolean demitir() {
        return estado.demitir(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void vincular(Empresa empresa) {
        empresa.addObserver(this);
    }

    @Override
    public void update(Observable empresa, Object arg) {
        this.ultimaNotificacao = this.nome + ", comunicado lançado na " + empresa.toString();
    }
}
