package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio2;

public class Boleto extends Pagamento{

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    protected void realizarPagamento() {
        System.out.println("Pagamento realizado no Boleto");
    }

    @Override
    protected void confirmarPagamento() {
        System.out.println("Pagamento confirmado");
    }
}
