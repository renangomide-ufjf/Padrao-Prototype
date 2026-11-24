package padroescriacao.prototype;

public class Equipamento implements Cloneable {
    private String nome;
    private Integer nivel;

    public Equipamento(String nome, Integer nivel) {
        super();
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
