package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio1;

public class IR extends Imposto {

    public IR() {
        super(0.10);
    }

    @Override
    public double calcularValorDoImposto(double valorProduto) {
        double valorImposto = valorProduto * getTaxa();
        System.out.println("IMPOSTO IR: " + valorImposto);
        return valorImposto;
    }
}