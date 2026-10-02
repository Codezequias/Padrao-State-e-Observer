package padroescomportamentais.stateobserver;

public class FuncionarioEstadoAposentado extends FuncionarioEstado {

    private FuncionarioEstadoAposentado() {};
    private static FuncionarioEstadoAposentado instance = new FuncionarioEstadoAposentado();
    public static FuncionarioEstadoAposentado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aposentado";
    }


}
