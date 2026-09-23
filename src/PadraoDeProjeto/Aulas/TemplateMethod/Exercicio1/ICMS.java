package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio1;

public class ICMS extends Imposto {

    public ICMS() {
        super(0.18);
    }

    @Override
    public double calcularValorDoImposto(double valorProduto) {
        double valorImposto = valorProduto * getTaxa();
        System.out.println("IMPOSTO ICMS: " + valorImposto);
        return valorImposto;
    }
}