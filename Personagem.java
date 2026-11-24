package padroescriacao.prototype;

public class Personagem implements Cloneable {
    private int id;
    private String nome;
    private Equipamento equipamento;
    private String classe;

    public Personagem(int id, String nome, Equipamento equipamento, String classe) {
        this.id = id;
        this.nome = nome;
        this.equipamento = equipamento;
        this.classe = classe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {
        Personagem personagemClone = (Personagem) super.clone();
        personagemClone.equipamento = (Equipamento) personagemClone.equipamento.clone();
        return personagemClone;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", equipamento=" + equipamento +
                ", classe='" + classe + '\'' +
                '}';
    }
}
