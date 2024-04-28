package projSistemaMedico;

public class Paciente {
    public String nome; // Nome do paciente
    public int idade; // Idade do paciente
    private String cpf; // CPF do paciente
    private String endereco; // Endere�o do paciente

    // Construtor
    public Paciente(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // M�todo para atualizar o endere�o do paciente
    public void atualizarEndereco(String novoEndereco) {
        endereco = novoEndereco;
        System.out.println("Endere�o atualizado para: " + endereco);
    }

    // M�todo para imprimir informa��es do paciente
    public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endere�o: " + endereco);
    }

    // M�todo que verifica se o paciente � maior de idade
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
