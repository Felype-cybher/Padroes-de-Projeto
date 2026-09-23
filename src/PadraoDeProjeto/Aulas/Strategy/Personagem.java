package PadraoDeProjeto.Aulas.Strategy;

public class Personagem {

    private EstrategiaDeControle estrategiaControle;

    public Personagem(EstrategiaDeControle estrategiaControle) {
        this.estrategiaControle = estrategiaControle;
    }

    public void mudarControle(EstrategiaDeControle novaEstrategia) {
        this.estrategiaControle = novaEstrategia;
    }

    public void comandoAndar() {
        estrategiaControle.comandoAndar();
    }

    public void comandoAgachar() {
        estrategiaControle.comandoAgachar();
    }

    public void comandoPular() {
        estrategiaControle.comandoPular();
    }

    public void comandoAtacar() {
        estrategiaControle.comandoAtacar();
    }
}
