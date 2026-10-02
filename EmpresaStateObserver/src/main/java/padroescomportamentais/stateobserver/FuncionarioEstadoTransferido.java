package padroescomportamentais.stateobserver;

public class FuncionarioEstadoTransferido extends FuncionarioEstado {

    private FuncionarioEstadoTransferido() {};
    private static FuncionarioEstadoTransferido instance = new FuncionarioEstadoTransferido();
    public static FuncionarioEstadoTransferido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferido";
    }

}
