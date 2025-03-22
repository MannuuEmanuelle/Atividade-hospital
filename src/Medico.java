
import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nome;
    private String crm;
    private String especialidade;
    private List<Paciente> pacientes = new ArrayList<>();

    public Medico(String nome, String crm, String especialidade, List<Paciente> pacientes) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.pacientes = new ArrayList<>(pacientes);
    }

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void adicionarPaciente(Paciente paciente) {
        if (paciente != null) {
            pacientes.add(paciente);
        }

    }

    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrdao!");
        } else {
            System.out.println("Pacientes: ");
        for (Paciente paciente : pacientes) {
            System.out.println("Nome: " + paciente.getNome());
        }
        }
        

    }

}

