package CheckpointPOO;

public  class Enfermeira {
    private String nome;
    private Integer matricula;
    private boolean disponivel;

    public Enfermeira(String nome, Integer matricula, boolean disponivel) {
        this.nome = nome;
        this.matricula = matricula;
        this.disponivel = disponivel;
    }

    public String nome() {
        return nome;
    }

    public Integer matricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    //methods
    /*
    * Enfermeira realiza a consulta através da assistente admin que ao executar o metodo marcarConsulta, o atributo "disponivel" se torna false(Não disponivel), e ao terminar a consulta o atributo "Disponivel" se torna true através do metodo "marcarConsulta" e estara pronta para mais uma consulta.
    * */
    public void realizarConsulta(Paciente paciente, UnidadeBasicaSaude UBS) {
        this.disponivel = true;
        System.out.println("Enfermeira " + this.nome + " Realizando consulta com o paciente: " + paciente.getNome() +  " na unidade de saude Basica: " + UBS.getNome());
    }
}