package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Personagem personagem = new Personagem(1, "Guerreiro Original", new Equipamento("Espada", 1), "Guerreiro");

        Personagem personagemClone = personagem.clone();
        personagemClone.setId(2);
        personagemClone.setNome("Guerreiro Clonado");
        personagemClone.getEquipamento().setNivel(2);

        assertEquals("Personagem{id=1, nome='Guerreiro Original', equipamento=Equipamento{nome='Espada', nivel=1}, classe='Guerreiro'}", personagem.toString());
        assertEquals("Personagem{id=2, nome='Guerreiro Clonado', equipamento=Equipamento{nome='Espada', nivel=2}, classe='Guerreiro'}", personagemClone.toString());
    }
}
