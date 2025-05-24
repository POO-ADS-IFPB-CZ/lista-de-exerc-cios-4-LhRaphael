package model;

public class Guerreiro extends Personagem {

    /**
     * Construtor para a classe Guerreiro.
     * @param nome O nome do guerreiro.
     */
    public Guerreiro(String nome) {
        super(nome);
    }

    /**
     * Implementa a lógica de ataque específica do Guerreiro.
     */
    @Override
    public void atacar() {
        System.out.println(super.getNome() + ", o Guerreiro, brande sua espada e desfere um golpe poderoso!");
        // Poderia adicionar lógica de dano, chance de acerto, etc. aqui
    }
}