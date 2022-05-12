public class Treinador extends Animal{
    private Int idade;

    public Int getIdade() {
        return idade;
    }

    public void setIdade(Int idade) {
        this.idade = idade;
    }

    public Treinador(String nome) {
        super(nome);
    }

    public String toString() {
        return "Treinador []";
    }

}