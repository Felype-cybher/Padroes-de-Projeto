package PadraoDeProjeto.Aulas.Strategy;

public class ControlePS4 implements EstrategiaDeControle {

    @Override
    public void comandoAndar() {
        System.out.println("Analógico → andar");
    }

    @Override
    public void comandoAgachar() {
        System.out.println("↓ → agachar");
    }

    @Override
    public void comandoPular() {
        System.out.println("X → pular");
    }

    @Override
    public void comandoAtacar() {
        System.out.println("□ → atacar");
    }
}
