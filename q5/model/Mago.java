package model;
public class Mago extends Personagem {

    /**
     * Construtor para a classe Mago.
     * @param nome O nome do mago.
     */
    public Mago(String nome) {
        super(nome);
    }

    /**
     * Implementa a lógica de ataque específica do Mago.
     */
    @Override
    public void atacar() {
        System.out.println(super.getNome() + ", o Mago, conjura uma bola de fogo flamejante!");
        // Poderia adicionar lógica de custo de mana, tipos de magia, etc. aqui
    }
}