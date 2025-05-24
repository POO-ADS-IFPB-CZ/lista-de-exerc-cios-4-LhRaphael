public abstract class Personagem {
    protected String nome; // Adicionando um nome para identificação

    /**
     * Construtor para a classe Personagem.
     * @param nome O nome do personagem.
     */
    public Personagem(String nome) {
        this.nome = nome;
    }

    /**
     * Método abstrato para o ataque do personagem.
     * Cada subclasse implementará sua própria lógica de ataque.
     */
    public abstract void atacar();

    /**
     * Retorna o nome do personagem.
     * @return O nome do personagem.
     */
    public String getNome() {
        return nome;
    }
}