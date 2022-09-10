package Exercicios_Easy;
//- Faça um algoritmo para ler três números inteiros, armazenar em
//  variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números digitados.

import javax.swing.*;

public class Exec5 {
    public static void main(String[] args) {
//        INICIO DO ALGORITMO
//        Declarar variáveis do tipo numerico:
//        num1, num2, num3, resultsoma, resultsubtração, resultmultiplicação, resultmedia;
        int num1, num2, num3, resultSoma, resultSubtracao, resultMultiplacao, resultmedia;
//        num1 = Ler (**);
//        num2 = Ler (**);
//        num3 = Ler (**);
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        resultSoma = num1 + num2 + num3;
        resultSubtracao = num1 - num2 - num3;
        resultMultiplacao = num1 * num2 * num3;
        resultmedia = (num1 + num2 + num3) / 3;
//        Exibir “Valor da Soma = ” + (num1 + num2 + num3);
//        Exibir “Valor da Subtração = ” + (num1 - num2 - num3);
//        Exibir “Valor da Multiplicação = ” + (num1 * num2 * num3);
//        Exibir “Valor da Média = ” + (num1 + num2 + num3)/3;
        System.out.println("Resultado da soma é: " + resultSoma);
        System.out.println("Resultado da subtração é: " + resultSubtracao);
        System.out.println("Resultado da multiplicação é: " + resultMultiplacao);
        System.out.println("A media dos tres é : " + resultmedia);
//        FIM DO ALGORITMO
    }
}
