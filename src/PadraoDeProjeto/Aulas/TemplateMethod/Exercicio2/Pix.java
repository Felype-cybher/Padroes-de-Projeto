package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio2;

public class Pix extends Pagamento{

    public Pix(double valor) {
        super(valor);
    }

    @Override
    protected void realizarPagamento() {
        System.out.println("Pagamento realizado no Pix");
    }

    @Override
    protected void confirmarPagamento() {
        System.out.println("Pagamento confirmado");
    }
}
