package Exercicios_Easy;

import javax.swing.*;

// Faça um algoritmo para ler um número inteiro, somar 2 ao número
//         digitado, até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
//         completar 100 iterações.
public class Exec11 {
    public static void main(String[] args) {
        //    Declarar variável do numerico: i=1, numero;
        int i = 1, numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero!"));
        //        Enquanto(i<=10) for maior ou igual ao Numero digitado no campo.
        while (i <= 100) {
            //        Exibir: “Numero ”+numeroDigitado + “ x ”+ i +“ = ” + numeroDigitado * i;
            System.out.println(numero + 2 * i);
            i++;
        }

    }
}

//    Inicio Algoritmo
//    Declarar variável do inteiro: i=1, numero;
//        numero = Ler numero digitado;
//        Enquanto(i<=100) { //inicio enquanto
//        numero=numero+2;
//        Exibir (numero);
//        i++ / i=i+1
//        } //fim enquanto
//        Fim Algoritmo
