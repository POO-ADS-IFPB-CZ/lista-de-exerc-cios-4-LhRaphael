package model;

public class Boleto extends Pagamento {
    private static final double DESCONTO_BOLETO = 0.10; // Desconto de 10%

    @Override
    public void processar(double valor) {
        double valorFinal = valor - (valor * DESCONTO_BOLETO);
        System.out.printf("Pagamento com Boleto: R$ %.2f (Desconto de R$ %.2f aplicado). Valor final: R$ %.2f%n",
                valor, (valor * DESCONTO_BOLETO), valorFinal);
    }
}

