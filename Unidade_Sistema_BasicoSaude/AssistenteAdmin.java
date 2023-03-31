package CheckpointPOO;

public class AssistenteAdmin {
    private String nome;
    private Integer matricula;

    public AssistenteAdmin(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    // methods
    /*
    * Metodo cadastraPaciente cadastra o paciente na unidade e ja registra no sistema da propria unidade atraves da AsistenteAdministrativa
    * e caso a Enfermeira ou paciente não constar no sistema da unidade não realiza a consulta
    * */
    public void cadastraPaciente(Paciente paciente, UnidadeBasicaSaude UBS){
        UBS.adicionaPaciente(paciente);
        System.out.println("Paciente: " + paciente.getNome() + " cadastrado, e registrado com sucesso na unidade: " + UBS.getNome());
    }
    public void marcarConsulta(Enfermeira enfermeira, Paciente paciente, UnidadeBasicaSaude UBS){
        if (paciente.isCadastroAtivo() && enfermeira.isDisponivel() && UBS.getPacientes().contains(paciente) && UBS.getEnfermeiras().contains(enfermeira)) {
            enfermeira.realizarConsulta(paciente, UBS);
            enfermeira.setDisponivel(false);
        }else{
            System.out.println("Paciente ou enfermeira não encontrados na unidade: " + UBS.getNome() + ".");
        }
    }
    public void atualizarEndereco(Paciente paciente, String novoEndereco) {
        if (paciente.isCadastroAtivo()) {
            paciente.atualizarEndereco(novoEndereco);
            System.out.println("Endereço do paciente: " + paciente.getNome() + " Atualizado para " + novoEndereco + ".");
        }else{
            System.out.println("Paciente " + paciente.getNome() + " Não cadastrado no sistema para atualização de endereço.");
        }
    }
    public void inativarCadastro(Paciente paciente){
        if(paciente.isCadastroAtivo()){
             paciente.setCadastroAtivo(false);
            System.out.println("Cadastro do paciente: " + paciente.getNome() + " Inativado com sucesso");
        }else{
            System.out.println("Paciente: " + paciente.getNome() + " Não encontrado.");
        }
    }
}