package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio2;

public class Cartao extends Pagamento{


    public Cartao(double valor) {
        super(valor);
    }

    @Override
    protected void realizarPagamento() {
        System.out.println("Pagamento realizado no cartão");
    }

    @Override
    protected void confirmarPagamento() {
        System.out.println("Pagamento confirmado");
    }
}
