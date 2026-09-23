package PadraoDeProjeto.Aulas.Strategy;

public class Teclado implements EstrategiaDeControle {

    @Override
    public void comandoAndar() {
        System.out.println("W → andar");
    }

    @Override
    public void comandoAgachar() {
        System.out.println("↓ → agachar");
    }

    @Override
    public void comandoPular() {
        System.out.println("Espaço → pular");
    }

    @Override
    public void comandoAtacar() {
        System.out.println("J → atacar");
    }
}

