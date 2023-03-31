package CheckpointPOO;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias da classe UnidadeBasicaSaude
        UnidadeBasicaSaude UBS_Centro = new UnidadeBasicaSaude("UBS Centro","Centro","51-994371232");
        UnidadeBasicaSaude UBS_SantaRita = new UnidadeBasicaSaude("UBS Santa Rita ","Santa Rita","51-992153054");
        UnidadeBasicaSaude UBS_SaoJorge = new UnidadeBasicaSaude("UBS São Jorge","São Jorge","51-996593567");

        // Criando instancias da classe Paciente
        Paciente paciente1 = new Paciente("João Silva","Rua de cima", 513333333, false);
        Paciente paciente2 = new Paciente("Maria Souza","Rua de baixo", 514444444, false);
        Paciente paciente3 = new Paciente("Pedro Santos","Rua das palmeiras ", 515555555, false);

        // Criando instâncias da classe Enfermeira
        Enfermeira enfermeiraSenior = new Enfermeira("Ana Oliveira",87654321,true);
        Enfermeira enfermeiraPleno = new Enfermeira("Bruna Ferreira",13579087,true);
        Enfermeira enfermeiraJunior = new Enfermeira("Roberta Rodrigues",97531253,true);

        // Criando instâncias da classe AssistenteAdmin
        AssistenteAdmin assistente1 = new AssistenteAdmin("Fernanda Lima",92837462);
        AssistenteAdmin assistente2 = new AssistenteAdmin("Gabriela Santos",29183742);
        AssistenteAdmin assistente3 = new AssistenteAdmin("Henrique Oliveira",93746152);

        // Exemplo de Utilização do sistema
        UBS_Centro.adicionarEnfermeira(enfermeiraSenior);
        UBS_SantaRita.adicionarEnfermeira(enfermeiraJunior);

        UBS_Centro.adicionarAssistentes(assistente1);
        UBS_Centro.adicionarAssistentes(assistente2);

        assistente1.cadastraPaciente(paciente1,UBS_Centro);
        assistente2.cadastraPaciente(paciente2,UBS_SantaRita);

        assistente1.marcarConsulta(enfermeiraSenior,paciente1,UBS_Centro);
        assistente2.marcarConsulta(enfermeiraJunior,paciente2,UBS_SantaRita);

        //assistente1.inativarCadastro(paciente1);
        //assistente1.atualizarEndereco(paciente1,"alvares maro");

        /*
        * Para a consulta ser marcada e realizada a enfermeira precisa estar na mesma unidadeBasicaSaude que o paciente.
        * */

    }
}
