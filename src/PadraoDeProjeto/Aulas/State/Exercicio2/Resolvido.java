package PadraoDeProjeto.Aulas.State.Exercicio2;

public class Resolvido implements EstadoChamado {

    public void enviarParaTriagem(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void escalar(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void resolver(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void reabrir(Chamado chamado) {
        System.out.println("Chamado reaberto");
        chamado.mudarEstado(new Reaberto());
    }

    public void cancelar(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void fechar(Chamado chamado) {
        System.out.println("Chamado fechado");
        chamado.mudarEstado(new Fechado());
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Operação negada");
    }

    @Override
    public void aguardarTerceiro(Chamado chamado) {
        System.out.println("Operação negada");
    }


}

