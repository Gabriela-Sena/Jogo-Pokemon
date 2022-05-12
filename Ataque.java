public class Ataque{
    private String nome;
    private int valorAtaque;
    private int ap;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorAtaque() {
        return valorAtaque;
    }

    public void setValorAtaque(int valorAtaque) {
        this.valorAtaque = valorAtaque;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public Ataque(String nome, int valorAtaque, int ap) {
        this.nome = nome;
        this.valorAtaque = valorAtaque;
        this.ap = ap;
    }

}