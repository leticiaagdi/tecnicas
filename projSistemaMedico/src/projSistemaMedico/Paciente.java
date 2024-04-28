package projSistemaMedico;

public class Paciente {
    public String nome; // Nome do paciente
    public int idade; // Idade do paciente
    private String cpf; // CPF do paciente
    private String endereco; // Endereço do paciente

    // Construtor
    public Paciente(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // Método para atualizar o endereço do paciente
    public void atualizarEndereco(String novoEndereco) {
        endereco = novoEndereco;
        System.out.println("Endereço atualizado para: " + endereco);
    }

    // Método para imprimir informações do paciente
    public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }

    // Método que verifica se o paciente é maior de idade
    public boolean ehMaiorDeIdade() {
        return idade >= 18;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
