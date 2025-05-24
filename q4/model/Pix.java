package model;

public class Pix extends Pagamento {
    private static final double DESCONTO_PIX = 0.02; // Desconto de 2% para Pix

    @Override
    public void processar(double valor) {
        double valorFinal = valor - (valor * DESCONTO_PIX);
        System.out.printf("Pagamento com Pix: R$ %.2f (Desconto de R$ %.2f aplicado). Valor final: R$ %.2f%n",
                valor, (valor * DESCONTO_PIX), valorFinal);
    }
}