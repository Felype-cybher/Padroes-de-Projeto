package PadraoDeProjeto.Aulas.State.Exercicio2;

public class Main {
    public static void main(String[] args) {

        Chamado chamado = new Chamado(123465, new Aberto());

        chamado.enviarParaTriagem();
        System.out.println();
        chamado.iniciarAtendimento();
        chamado.escalar();
        chamado.iniciarAtendimento();
        chamado.resolver();


    }
}