package Exercicios_Medium;
/// Faça um algoritmo para ler um valor de investimento, com uma taxa
//        de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e
//        o total. Considerando que a remuneração será no regime de juros compostos.
public class Exec1Med {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("Numero é par " + i);
            } else {
                System.out.println("Numero é impar " + i);
            }
            i++;
        }
    }
}
//    Inicio algoritmo
//
//    Declarar variavel inteira: i = 0;
//        Enquanto(i <= 100)
//
//        SE(i % 2 == 0)
//        Exibir: “O Número: ”+ i + “ é par”;
//        Fim SE
//        SE Não
//        Exibir: “O Número: ”+ i + “ é ímpar”;
//        Fim SE
//        i++;
//        Fim Enquanto
//        Fim algoritmo
