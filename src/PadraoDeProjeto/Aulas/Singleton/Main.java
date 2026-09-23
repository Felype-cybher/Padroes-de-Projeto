package PadraoDeProjeto.Aulas.Singleton;

public class Main {
    static void main() {
        Campanha a = Campanha.getInstancia();
        Campanha b = Campanha.getInstancia();


        System.out.println(a.jogo);
        System.out.println(b.jogo);
        a.jogo = "Residente evil 3";
        System.out.println(b.jogo);
    }
}
