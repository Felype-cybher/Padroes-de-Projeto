package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio2;

public class TestePagamento {
    static void main() {

        Pagamento teste1 = new Cartao(200);
        Pagamento teste2 = new Boleto(987);
        Pagamento teste3 = new Pix(350);

        teste1.processarPagamento();
        System.out.println("------------------------------------");
        teste2.processarPagamento();
        System.out.println("------------------------------------");
        teste3.processarPagamento();
    }
}
