package PadraoDeProjeto.Aulas.Strategy;

public class Main {

    public static void main(String[] args) {
        Personagem personagem = new Personagem(new ControlePS4());

        System.out.println("Jogando com Controle de PS4:");
        personagem.comandoAndar();
        personagem.comandoPular();
        personagem.comandoAtacar();


        System.out.println("Bateria do controle acabou!");

        personagem.mudarControle(new Teclado());
        System.out.println("Mudando para teclado...");

        personagem.comandoAndar();
        personagem.comandoPular();
        personagem.comandoAtacar();

    }
}