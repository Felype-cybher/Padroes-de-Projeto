package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio4;

public abstract class Relatorio {

    String nomeArquivo;

    public Relatorio(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void gerarRelatorio() {
        carregarArquivo();
        descobrirTipo();
        exportarRelatorio();
    }

    public void carregarArquivo(){
        System.out.println("Arquivo :"+ this.nomeArquivo);
    }

    public void descobrirTipo(){
        String nomeExtensao = "pdf.";
        if (this.nomeArquivo.equals(".")){
            System.out.println("Arquivo pdf");
        }
    }


    public abstract void exportarRelatorio();


}