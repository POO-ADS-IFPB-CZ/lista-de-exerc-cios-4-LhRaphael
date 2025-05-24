package model;

public class Arqueiro extends Personagem {

    /**
     * Construtor para a classe Arqueiro.
     * @param nome O nome do arqueiro.
     */
    public Arqueiro(String nome) {
        super(nome);
    }

    /**
     * Implementa a lógica de ataque específica do Arqueiro.
     */
    @Override
    public void atacar() {
        System.out.println(super.getNome() + ", o Arqueiro, dispara uma flecha precisa contra o alvo!");
        // Poderia adicionar lógica de munição, distância, etc. aqui
    }
}