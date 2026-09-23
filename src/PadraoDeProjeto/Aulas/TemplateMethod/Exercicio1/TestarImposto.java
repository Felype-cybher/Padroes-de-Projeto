package PadraoDeProjeto.Aulas.TemplateMethod.Exercicio1;

public class TestarImposto {
    public static void main(String[]args) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto ir = new IR();

        icms.calcularImposto(2000);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        iss.calcularImposto(2000);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        ir.calcularImposto(2000);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
    }
}
