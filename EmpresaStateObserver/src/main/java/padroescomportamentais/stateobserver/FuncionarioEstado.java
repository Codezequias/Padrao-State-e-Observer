package padroescomportamentais.stateobserver;

public abstract class FuncionarioEstado {
    
    public abstract String getEstado();

    public boolean ativar(Funcionario funcionario) {
        return false;
    }

    public boolean aposentar(Funcionario funcionario) {
        return false;
    }

    public boolean afastar(Funcionario funcionario) {
        return false;
    }

    public boolean demitir(Funcionario funcionario) {
        return false;
    }

    public boolean desligar(Funcionario funcionario) {
        return false;
    }

    public boolean transferir(Funcionario funcionario) {
        return false;
    }
    
}
