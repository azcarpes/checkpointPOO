package CheckpointPOO;

import java.util.ArrayList;
import java.util.List;

public class UnidadeBasicaSaude {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Paciente> pacientes;
    private List<Enfermeira> enfermeiras;
    private List<AssistenteAdmin> assistente;

    public UnidadeBasicaSaude(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.pacientes = new ArrayList<>();
        this.enfermeiras = new ArrayList<>();
        this.assistente = new ArrayList<>();
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> paciente) {
        this.pacientes = paciente;
    }

    public List<Enfermeira> getEnfermeiras() {
        return enfermeiras;
    }

    public void setEnfermeiras(List<Enfermeira> newEnfermeira) {
        this.enfermeiras = newEnfermeira;
    }

    public List<AssistenteAdmin> getAssistente() {
        return assistente;
    }

    public void setAssistentes(List<AssistenteAdmin> newAssistente) {
        this.assistente = newAssistente;
    }

    // methods
    public void adicionaPaciente(Paciente paciente){
        // Criado para ser usado pela AssistenteAdmin registrar Pacientes no sistema
        this.pacientes.add(paciente);
        paciente.setCadastroAtivo(true);
    }
    public void adicionarEnfermeira(Enfermeira enfermeiras) {
        this.enfermeiras.add(enfermeiras);
        System.out.println("Enfermeira " + enfermeiras.nome() + " Contratada com sucesso na unidade de saúde " + this.nome + ".");}
    public void adicionarAssistentes(AssistenteAdmin assistentes) {
        this.assistente.add(assistentes);
        System.out.println("assistente " + assistentes.getNome() + " Contratada com sucesso na unidade de saúde " + this.nome + ".");}
}
