# Questão 1
---

**A) Os construtores de superclasse não são herdados por subclasses.**

**Verdadeiro.** Construtores não são herdados no sentido tradicional de métodos. No entanto, eles são chamados implicitamente ou explicitamente durante a criação de um objeto da subclasse.

---

**B) Um relacionamento "tem um" é implementado via herança.**

**Falso.** Um relacionamento "tem um" (composição ou agregação) é implementado através da **contenção** (ou seja, uma classe contém uma instância de outra classe como um de seus membros). A herança implementa um relacionamento "é um" (onde a subclasse é um tipo da superclasse).

---

**C) Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.**

**Falso.** Quando uma subclasse redefine um método de uma superclasse utilizando a **mesma assinatura** (mesmo nome, mesmos tipos etc..), diz-se que a subclasse **sobrescreve** (override) esse método da superclasse. **Sobrecarga** (overload) de método ocorre quando múltiplos métodos na mesma classe (ou superclasse/subclasse) têm o mesmo nome, mas **assinaturas diferentes** (diferentes tipos ou número de parâmetros).

---
# Questão 2

* Usar **`private` por padrão** é geralmente uma boa prática para maximizar o encapsulamento e minimizar o acoplamento. Exponha apenas o que é absolutamente necessário através de métodos `public` ou, seletivamente, `protected`.
* Usar **`protected` com cautela** para membros que são genuinamente destinados a serem pontos de extensão para subclasses. É crucial que esses membros `protected` sejam bem documentados e que suas alterações sejam gerenciadas com cuidado, pois podem impactar as subclasses.
---

Em uma hierarquia de herança, quando um objeto de uma subclasse é criado, o construtor da subclasse é chamado, mas antes que o corpo do construtor da subclasse seja executado, o construtor da superclasse **deve ser chamado**. Isso garante que a parte da superclasse do objeto seja inicializada corretamente antes que a subclasse tente inicializar seus próprios membros.

**Como funciona a chamada:**

1.  **Chamada Explícita**: A primeira instrução no corpo de um construtor de subclasse pode ser uma chamada explícita ao construtor da superclasse. Em linguagens como Java e C#, isso é feito usando a palavra-chave `super()` (Java) ou `base()` (C#). Pode-se passar argumentos para o construtor da superclasse se ele os exigir.
    ```java
    // Exemplo em Java
    class SuperClasse {
        SuperClasse(String mensagem) {
            System.out.println("Construtor da SuperClasse: " + mensagem);
        }
    }

    class SubClasse extends SuperClasse {
        SubClasse() {
            super("Chamada explícita"); // Chamada explícita ao construtor da superclasse
            System.out.println("Construtor da SubClasse");
        }
    }
    ```

2.  **Chamada Implícita**: Se o programador não fornecer uma chamada explícita ao construtor da superclasse na primeira linha do construtor da subclasse, o compilador (ou o sistema de tempo de execução, dependendo da linguagem) tentará inserir uma chamada implícita ao **construtor padrão (sem argumentos) da superclasse**.
    ```java
    // Exemplo em Java
    class OutraSuperClasse {
        OutraSuperClasse() { // Construtor padrão (sem argumentos)
            System.out.println("Construtor padrão da OutraSuperClasse");
        }
    }

    class OutraSubClasse extends OutraSuperClasse {
        OutraSubClasse() {
            // Chamada implícita a super() aqui
            System.out.println("Construtor da OutraSubClasse");
        }
    }
    ```

# Questão 3

A obrigatoriedade da chamada ao construtor da superclasse (seja explícita ou implícita) é fundamental por alguns motivos:

Em resumo, a chamada ao construtor da superclasse é um mecanismo essencial para garantir a integridade e a consistência dos objetos em uma hierarquia de herança, assegurando que todas as partes de um objeto sejam devidamente inicializadas na ordem correta.
