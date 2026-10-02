package padroescomportamentais.stateobserver;

public class FuncionarioEstadoAtivo extends FuncionarioEstado {

    private FuncionarioEstadoAtivo() {};
    private static FuncionarioEstadoAtivo instance = new FuncionarioEstadoAtivo();
    public static FuncionarioEstadoAtivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ativo";
    }
    
    public boolean aposentar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        return true;
    }
    
    public boolean afastar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
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

    public boolean transferir(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        return true;
    }

}
