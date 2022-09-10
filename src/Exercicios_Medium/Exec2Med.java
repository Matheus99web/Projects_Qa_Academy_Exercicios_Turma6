package Exercicios_Medium;

import javax.swing.*;

// Faça um algoritmo para ler um valor de investimento, com uma taxa
//         de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e
//        o total. Considerando que a remuneração será no regime de juros compostos.
public class Exec2Med {
    public static void main(String[] args) {
        //    Declarar variáveis tipo numero: investimento, taxa =0,05, valorJuros=0, valorTotal=0;i=1;
        int ano = 1;
        double juros = 0.05, valorInvestido;
        valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de investimento"));
        while (ano <= 10) {
            juros = juros + valorInvestido * 0.05;
            ano++;
        }
        System.out.println("Valor Investido = " + valorInvestido);
        System.out.println("Valor dos juros = " + juros);
        System.out.println("Total com juros= " + (valorInvestido + juros));
    }
}
