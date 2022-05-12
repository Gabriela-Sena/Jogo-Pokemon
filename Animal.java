public class Animal{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Animal [nome=" + nome + "]";
    }

    
}