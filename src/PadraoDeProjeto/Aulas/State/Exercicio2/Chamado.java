package PadraoDeProjeto.Aulas.State.Exercicio2;

public class Chamado {

    protected int id;
    private EstadoChamado estado;

    public Chamado(int id, EstadoChamado estado) {
        this.id = id;
        this.estado = estado;
    }

    public void mudarEstado(EstadoChamado novoEstado) {
        this.estado = novoEstado;
    }

    public void enviarParaTriagem() {
        estado.enviarParaTriagem(this);
    }

    public void iniciarAtendimento() {
        estado.iniciarAtendimento(this);
    }

    public void escalar() {
        estado.escalar(this);
    }

    public void resolver() {
        estado.resolver(this);
    }

    public void reabrir() {
        estado.reabrir(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void fechar() {
        estado.fechar(this);
    }

    public void aguardarCliente(){
        estado.aguardarCliente(this);
    }

    public void aguardarTerceiro(){
        estado.aguardarTerceiro(this);
    }
}
