package padroescomportamentais.stateobserver;

public class FuncionarioEstadoDemitido extends FuncionarioEstado {

    private FuncionarioEstadoDemitido() {};
    private static FuncionarioEstadoDemitido instance = new FuncionarioEstadoDemitido();
    public static FuncionarioEstadoDemitido getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Demitido";
    }


}
