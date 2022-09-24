package Exemplos;

// 2 variaveis.
// 1 metodo void.
// 1 metodo com return.
// 1 metodo com parametro.


public class MetodoSemMain {

    // 2 variaveis.
    String nome = " matheus";
    String sobrenome = "nogueira";

    // 1 metodo void.
    public void printarnomes(String nome, String sobrenome) {
        System.out.println("As variaveis são: " + nome + sobrenome);
    }

    // 1 metodo com return.
    public int somarTresNumeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // 1 metodo com parametro.
    public int multiplicarDoisNumeros(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
}

