package Exemplos;

public class MetodosComParametrosMain {
    public static void main(String[] args) {
        texto1("primeiro", "comentario");
        texto2("sono", "dormir");
        texto3("fome", "comer");
        texto4("fazer", "exercicio");
        texto5("aprovado", "reprovado");
        String informacao1 = camaro();
        System.out.println(informacao1);
        String informacao2 = fusca();
        System.out.println(informacao2);
        String informacao3 = sofa();
        System.out.println(informacao3);
        String informacao4 = urso();
        System.out.println(informacao4);
        String informacao5 = cachorro();
        System.out.println(informacao5);
    }

    public static void texto1(String a, String b) {   // <-isso é um metodo
        System.out.println("o texto1 é  " + a + "  " + b);
    }

    public static void texto2(String a, String b) {
        System.out.println("o texto2 é  " + a + "  " + b);
    }

    public static void texto3(String a, String b) {
        System.out.println("o texto3 é  " + a + "  " + b);
    }

    public static void texto4(String a, String b) {
        System.out.println("o texto4 é  " + a + "  " + b);
    }

    public static void texto5(String a, String b) {
        System.out.println("o texto5 é  " + a + "  " + b);
    }

    //    -------------------------------------------------
    public static String camaro() {
        return "amarelo";
    }

    public static String fusca() {
        return "azul";
    }

    public static String sofa() {
        return "verde";
    }

    public static String urso() {
        return "branco";
    }

    public static String cachorro() {
        return "cinza";
    }
}

