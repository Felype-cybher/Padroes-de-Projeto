package PadraoDeProjeto.Aulas.State.Exercicio2;

public class Triagem implements EstadoChamado {

    public void enviarParaTriagem(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Atendimento iniciado");
        chamado.mudarEstado(new Atendimento());
    }

    public void escalar(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void resolver(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void reabrir(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void cancelar(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void fechar(Chamado chamado) {
        System.out.println("Operação negada");
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
