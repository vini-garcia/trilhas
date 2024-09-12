public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, String dataNascimento, Universidade universidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public void informarNomeEUniversidade() {
        System.out.println("Nome: " + nome + ", Universidade: " + universidade.getNome());
    }
}
