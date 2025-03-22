import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private List<Leito> leitos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public List<Leito> getLeitos() {
        return leitos;
    }

    public Hospital(String nome) {
        this.nome = nome;
    }

    public void adicionarLeito(int numero){
        leitos.add(new Leito(numero));
    }
   
    public void listarLeitos() {
        if (leitos.isEmpty()) {
            System.out.println("Sem leitos cadastrados!");
        } else {
            System.out.println("\nLeitos: ");
            for (Leito leito : leitos) {
                System.out.println("Número do leito: " + leito.getNumero() + "\n");
            }
        }
     
    }

}

