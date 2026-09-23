package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio1;

public class ISS extends Imposto {

    public ISS() {
        super(0.05);
    }

    @Override
    public double calcularValorDoImposto(double valorProduto) {
        double valorImposto = valorProduto * getTaxa();
        System.out.println("IMPOSTO ISS: " + valorImposto);
        return valorImposto;
    }
}
