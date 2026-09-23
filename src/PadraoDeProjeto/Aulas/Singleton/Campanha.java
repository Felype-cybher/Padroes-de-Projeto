package PadraoDeProjeto.Aulas.Singleton;

public class Campanha {

    String jogo;
    String dificuldade;
    int tempoJogado;
    int quantSaves;

    private Campanha(String jogo, String dificuldade, int tempoJogado) {
        this.jogo = jogo;
        this.dificuldade = dificuldade;
        this.tempoJogado = tempoJogado;
    }

    private static Campanha instancia ;


    public static Campanha getInstancia(){
        if (instancia == null){
            instancia = new Campanha("Residente Evil 2", "Hard", 120);
        }
        return instancia;

    }

}
