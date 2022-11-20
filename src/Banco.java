import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getContas() {

        System.out.println("O "+ this.nome + " possui "+ contas.size() + " contas cadastradas.");
    }

    public void AdicionarConta(Conta conta) {
       contas.add(conta);
    }
}
