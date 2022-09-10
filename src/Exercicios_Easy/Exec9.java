package Exercicios_Easy;
//Faça um algoritmo para ler um número inteiro entre: 1 e 10, calcular e exibir a tabuada deste número digitado.
//        Ex.: 10 x 1 = 10, .., 10 x 10 = 100.

import javax.swing.*;

public class Exec9 {
    public static void main(String[] args) {
//        Declarar variável do tipo numérico: numero,  i = 1;
        int i = 1, numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero!"));
        //        Enquanto(i<=10) for maior ou igual ao Numero digitado no campo.
        while (i <= 10) {
            //        Exibir: “Numero ”+numeroDigitado + “ x ”+ i +“ = ” + numeroDigitado * i;
            System.out.println(numero * i);
            i++;
            //        Fim Enquanto
            //        Fim Algoritmo
        }
    }
}
//              Inicio Algoritmo
//    Declarar variável do tipo numérico: numeroDigitado,  i = 1;
//        numeroDigitado = Ler(5);
//        Enquanto(i<=10)
//        Exibir: “Numero ”+numeroDigitado + “ x ”+ i +“ = ” + numeroDigitado * i;
//        i=i+1;
//        Fim Enquanto
//               Fim Algoritmo


