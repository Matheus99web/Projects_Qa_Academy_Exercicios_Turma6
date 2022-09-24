package Exemplos;

public class MetodosComRetornoMain {
    public static void main(String[] args) {
        String cidade = saoPaulo();
        String cidade1 = bahia();
        String cidade2 = ceara();
        String cidade3 = joaoPessoa();
        String cidade4 = minas();
        System.out.println(cidade);
        System.out.println(cidade1);
        System.out.println(cidade2);
        System.out.println(cidade3);
        System.out.println(cidade4);
    }

    public static String saoPaulo() {
        return "saoPaulo";
    }

    public static String bahia() {
        return "bahia";
    }

    public static String ceara() {
        return "ceara";
    }

    public static String joaoPessoa() {
        return "joaoPessoa";
    }

    public static String minas() {
        return "minas";
    }
}
