package PadraoDeProjeto.Aulas.State.Exercicio2;

public class Atendimento implements EstadoChamado {

    public void enviarParaTriagem(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void escalar(Chamado chamado) {
        System.out.println("Chamado escalado");
        chamado.mudarEstado(new Escalado());
    }

    public void resolver(Chamado chamado) {
        System.out.println("Chamado resolvido");
        chamado.mudarEstado(new Resolvido());
    }

    public void reabrir(Chamado chamado) {
        System.out.println("Operação negada");
    }

    public void cancelar(Chamado chamado) {
        chamado.mudarEstado(new Cancelado());
        System.out.println("Chamado cancelado");
    }

    public void fechar(Chamado chamado) {
        System.out.println("Operação negada");
    }

    @Override
    public void aguardarTerceiro(Chamado chamado) {
        System.out.println("Aguardando Terceiro");
        chamado.mudarEstado(new AguardandoTerceiro());
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Aguardando Cliente");
        chamado.mudarEstado(new AguardandoCliente());
    }

}
