package padroescomportamentais.stateobserver;

import java.util.Observable;

public class Empresa extends Observable {

    private String nome;
    private String setor;
    private String cidade;
    private String estado;

    public Empresa(String nome, String setor, String cidade, String estado) {
        this.nome = nome;
        this.setor = setor;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void lancarComunicado() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
