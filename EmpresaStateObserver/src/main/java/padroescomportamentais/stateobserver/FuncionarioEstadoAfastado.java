package padroescomportamentais.stateobserver;

public class FuncionarioEstadoAfastado extends FuncionarioEstado {

    private FuncionarioEstadoAfastado() {};
    private static FuncionarioEstadoAfastado instance = new FuncionarioEstadoAfastado();
    public static FuncionarioEstadoAfastado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Afastado";
    }

    public boolean ativar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        return true;
    }

    public boolean demitir(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return true;
    }

    public boolean desligar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        return true;
    }

}
