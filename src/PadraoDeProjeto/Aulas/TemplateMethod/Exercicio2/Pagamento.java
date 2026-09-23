package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio2;

public abstract class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processarPagamento(){
        mostrarValor();
        realizarPagamento();
        confirmarPagamento();
    }

    public void mostrarValor(){
        System.out.println("Valor a ser pago: "+this.valor);
    }

    protected abstract void realizarPagamento();


    protected abstract void confirmarPagamento();

}
