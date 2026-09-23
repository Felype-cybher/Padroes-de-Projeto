package PadraoDeProjeto.Aulas.Strategy;

public class ControleXbox implements EstrategiaDeControle {

    @Override
    public void comandoAndar() {
        System.out.println("Xbox: Analógico → andar");
    }

    @Override
    public void comandoAgachar() {
        System.out.println("Xbox: ↓ → agachar");
    }

    @Override
    public void comandoPular() {
        System.out.println("Xbox: A → pular");
    }

    @Override
    public void comandoAtacar() {
        System.out.println("Xbox: X → atacar");
    }
}
