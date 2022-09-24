package Exercicios_Medium;

import javax.swing.*;

////Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor.
public class Exec5Med {
    public static void main(String[] args) {
        //    Declarar variável numérica: i = 1, anterior,numeroDigitado;
        int i = 1, anterior = 0, numeroDigitado;
        while (i <= 5) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero!"));
            if (numeroDigitado < anterior || i == 1) {
                anterior = numeroDigitado;
            }
            i++;
        }
        System.out.println("O menor numero é:" + anterior);
    }
}
//    Inicio Algoritmo
//
//    Declarar variável numérica: i = 1, anterior,
//    numeroDigitado;
//
//    Enquanto(i<=5)
//    numeroDigitado = Ler();
//    Se(numeroDigitado < anterior || i==1)
//    anterior = numeroDigitado;
//    Fim Se
//    i++;
//    Fim Enquanto
//
//    Exibir (“O menor digitado é: ”+anterior);
//
//    Fim Algoritmo

