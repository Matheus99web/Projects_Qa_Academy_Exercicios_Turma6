package Exercicios_Easy;
//-Faça um algoritmo para ler um número inteiro,
//        armazenar em uma variável, calcular o dobro, e exibir.

import javax.swing.*;

public class Exec4ex2 {
    public static void main(String[] args) {
        //        Declarar variável do tipo Numerico: num1, num2, resultado;
        int num1, resultado;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero!"));
//        resultado = num1*2;
        resultado = num1 * 2;
//        Exibir: " O dobro é:" + resultado;
        // System.out.println(" O dobro é:" + resultado);
        JOptionPane.showInternalMessageDialog(null, resultado);
    }
    //        Inicio do Algoritmo
//        Declarar variável do tipo Numerico numeroDigitado,resultado;
//        numeroDigitado = Ler 10;
//        resultado = numeroDigitado *2;
//        Exibir resultado;
//    }
}

