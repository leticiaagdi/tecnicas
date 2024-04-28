package projSistemaMedico;

public class Paciente {
    private String nome; // nome do paciente
    private int idade; // idade do paciente
    private String cpf; // CPF do paciente
    private String endereco; // endereço do paciente

    // Construtor
    public Paciente(String nome, int idade, String cpf, String endereco) {
        this.nome = nome; // inicializa o nome do paciente
        this.idade = idade; // inicializa a idade do paciente
        this.cpf = cpf; // inicializa o CPF do paciente
        this.endereco = endereco; // inicializa o endereço do paciente
    }

    // método para atualizar o endereço do paciente
    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco; // define o novo endereço do paciente
        System.out.println("Endereço atualizado para: " + endereco); // imprime o novo endereço atualizado
    }

    // método para imprimir informações do paciente
    public void imprimirInfo() {
        System.out.println("Nome: " + nome); // imprime o nome do paciente
        System.out.println("Idade: " + idade); // imprime a idade do paciente
        System.out.println("CPF: " + cpf); // imprime o CPF do paciente
        System.out.println("Endereço: " + endereco); // imprime o endereço do paciente
    }

    //método que verifica se o paciente é maior de idade
    public boolean ehMaiorDeIdade() {
        return idade >= 18; // retorna true se o paciente for maior de idade, caso contrário retorna false
    }

    // getters e setters com validações e encapsulamento
    public String getNome() {
        return nome; // retorna o nome do paciente
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) { // verifica se o nome fornecido não é nulo ou vazio
            this.nome = nome; // define o novo nome do paciente
        } else {
            System.out.println("Nome inválido!"); // imprime uma mensagem de erro se o nome for inválido
        }
    }

    public int getIdade() {
        return idade; // retorna a idade do paciente
    }

    public void setIdade(int idade) {
        if (idade >= 0) { // verifica se a idade fornecida é um valor válido (não negativo)
            this.idade = idade; // define a nova idade do paciente
        } else {
            System.out.println("Idade inválida!"); // imprime uma mensagem de erro se a idade for inválida
        }
    }

    public String getCpf() {
        return cpf; // retorna o CPF do paciente
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) { // verifica se o CPF fornecido é válido
            this.cpf = cpf; // define o novo CPF do paciente
        } else {
            System.out.println("CPF inválido!"); //imprime uma mensagem de erro se o CPF for inválido
        }
    }

    public String getEndereco() {
        return endereco; // retorna o endereço do paciente
    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.trim().isEmpty()) { // verifica se o endereço fornecido não é nulo ou vazio
            this.endereco = endereco; // define o novo endereço do paciente
        } else {
            System.out.println("Endereço inválido!"); //imprime uma mensagem de erro se o endereço for inválido
        }
    }
}
