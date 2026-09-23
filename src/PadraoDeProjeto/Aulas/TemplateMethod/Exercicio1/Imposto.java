package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio1;

public abstract class Imposto {

    private double taxa;

    public Imposto(double taxa) {
        this.taxa = taxa;
    }

    public double calcularImposto(double valorProduto) {
        mostrarValor(valorProduto);
        double valorImposto = calcularValorDoImposto(valorProduto);
        double valorFinal = valorImposto + valorProduto;
        valorAposImposto(valorFinal);
        return valorFinal;
    }

    protected void mostrarValor(double valorProduto) {
        System.out.println("Valor do preço do serviço: " + valorProduto);
    }

    protected abstract double calcularValorDoImposto(double valorProduto);

    protected void valorAposImposto(double valorFinal) {
        System.out.println("Valor após impostos: " + valorFinal);
    }

    protected double getTaxa() {
        return taxa;
    }
}