package PadraoDeProjeto.Aulas.State.Exercicio2;

    public interface EstadoChamado {
        void enviarParaTriagem(Chamado chamado);
        void iniciarAtendimento(Chamado chamado);
        void escalar(Chamado chamado);
        void resolver(Chamado chamado);
        void reabrir(Chamado chamado);
        void cancelar(Chamado chamado);
        void fechar(Chamado chamado);
        void aguardarCliente(Chamado chamado);
        void aguardarTerceiro(Chamado chamado);
    }
