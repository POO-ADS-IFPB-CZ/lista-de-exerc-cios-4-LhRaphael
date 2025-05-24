import java.util.ArrayList;
import java.util.List;
import model.Boleto;
import model.CartaoCredito;
import model.Pagamento;
import model.Pix;

public class Main {
    public static void main(String[] args) {
        List<Pagamento> metodosPagamento = new ArrayList<>();

        // Adicionando diferentes formas de pagamento à lista
        metodosPagamento.add(new CartaoCredito());
        metodosPagamento.add(new Boleto());
        metodosPagamento.add(new Pix());
        metodosPagamento.add(new CartaoCredito()); // Outro pagamento com cartão

        double valorCompra1 = 100.00;
        double valorCompra2 = 250.50;
        double valorCompra3 = 50.75;
        double valorCompra4 = 1200.00;

        System.out.println("Processando pagamentos:");
        System.out.println("------------------------------------");

        // Processando os pagamentos usando polimorfismo
        metodosPagamento.get(0).processar(valorCompra1);
        metodosPagamento.get(1).processar(valorCompra2);
        metodosPagamento.get(2).processar(valorCompra3);
        metodosPagamento.get(3).processar(valorCompra4);

        System.out.println("------------------------------------");
        System.out.println("Demonstração com loop:");
        System.out.println("------------------------------------");

        double[] valoresCompras = {150.0, 300.0, 75.0};
        for (int i = 0; i < metodosPagamento.size() && i < valoresCompras.length; i++) {
             System.out.printf("Processando compra de R$ %.2f com %s:%n", valoresCompras[i], metodosPagamento.get(i).getClass().getSimpleName());
             metodosPagamento.get(i).processar(valoresCompras[i]);
             System.out.println("---");
        }
    }
}