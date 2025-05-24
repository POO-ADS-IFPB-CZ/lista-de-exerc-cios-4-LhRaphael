package model;

public class CartaoCredito extends Pagamento {
    private static final double TAXA_CARTAO = 0.05; // Taxa de 5%

    @Override
    public void processar(double valor) {
        double valorFinal = valor + (valor * TAXA_CARTAO);
        System.out.printf("Pagamento com Cartão de Crédito: R$ %.2f (Taxa de R$ %.2f aplicada). Valor final: R$ %.2f%n",
                valor, (valor * TAXA_CARTAO), valorFinal);
    }
}
