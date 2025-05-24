// Arquivo: Combate.java
// Classe principal para simular um turno de combate polimórfico

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        // Criando uma lista para armazenar os personagens
        List<Personagem> personagensEmCombate = new ArrayList<>();

        // Adicionando instâncias das subclasses à lista
        personagensEmCombate.add(new Guerreiro("Thorin"));
        personagensEmCombate.add(new Mago("Gandalf"));
        personagensEmCombate.add(new Arqueiro("Legolas"));
        personagensEmCombate.add(new Guerreiro("Conan")); // Outro guerreiro

        System.out.println("INÍCIO DO TURNO DE COMBATE!");
        System.out.println("--------------------------------------------------");

        // Iterando pela lista e fazendo cada personagem atacar (polimorfismo)
        for (Personagem p : personagensEmCombate) {
            p.atacar(); // A versão correta de atacar() é chamada para cada objeto
            System.out.println("---"); // Separador visual
        }

        System.out.println("--------------------------------------------------");
        System.out.println("FIM DO TURNO DE COMBATE!");
    }
}
