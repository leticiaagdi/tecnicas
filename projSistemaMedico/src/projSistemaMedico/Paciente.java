package projSistemaMedico;

public class Paciente {
    private String nome; // nome do paciente
    private int idade; // idade do paciente
    private String cpf; // CPF do paciente
    private String endereco; // endere�o do paciente

    // Construtor
    public Paciente(String nome, int idade, String cpf, String endereco) {
        this.nome = nome; // inicializa o nome do paciente
        this.idade = idade; // inicializa a idade do paciente
        this.cpf = cpf; // inicializa o CPF do paciente
        this.endereco = endereco; // inicializa o endere�o do paciente
    }

    // m�todo para atualizar o endere�o do paciente
    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco; // define o novo endere�o do paciente
        System.out.println("Endere�o atualizado para: " + endereco); // imprime o novo endere�o atualizado
    }

    // m�todo para imprimir informa��es do paciente
    public void imprimirInfo() {
        System.out.println("Nome: " + nome); // imprime o nome do paciente
        System.out.println("Idade: " + idade); // imprime a idade do paciente
        System.out.println("CPF: " + cpf); // imprime o CPF do paciente
        System.out.println("Endere�o: " + endereco); // imprime o endere�o do paciente
    }

    //m�todo que verifica se o paciente � maior de idade
    public boolean ehMaiorDeIdade() {
        return idade >= 18; // retorna true se o paciente for maior de idade, caso contr�rio retorna false
    }

    // getters e setters com valida��es e encapsulamento
    public String getNome() {
        return nome; // retorna o nome do paciente
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) { // verifica se o nome fornecido n�o � nulo ou vazio
            this.nome = nome; // define o novo nome do paciente
        } else {
            System.out.println("Nome inv�lido!"); // imprime uma mensagem de erro se o nome for inv�lido
        }
    }

    public int getIdade() {
        return idade; // retorna a idade do paciente
    }

    public void setIdade(int idade) {
        if (idade >= 0) { // verifica se a idade fornecida � um valor v�lido (n�o negativo)
            this.idade = idade; // define a nova idade do paciente
        } else {
            System.out.println("Idade inv�lida!"); // imprime uma mensagem de erro se a idade for inv�lida
        }
    }

    public String getCpf() {
        return cpf; // retorna o CPF do paciente
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) { // verifica se o CPF fornecido � v�lido
            this.cpf = cpf; // define o novo CPF do paciente
        } else {
            System.out.println("CPF inv�lido!"); //imprime uma mensagem de erro se o CPF for inv�lido
        }
    }

    public String getEndereco() {
        return endereco; // retorna o endere�o do paciente
    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.trim().isEmpty()) { // verifica se o endere�o fornecido n�o � nulo ou vazio
            this.endereco = endereco; // define o novo endere�o do paciente
        } else {
            System.out.println("Endere�o inv�lido!"); //imprime uma mensagem de erro se o endere�o for inv�lido
        }
    }
}
