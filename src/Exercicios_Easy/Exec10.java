package Exercicios_Easy;
//Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. Ao final de 10 anos,
//        exibir o valor investido, valor dos juros e o total com juros. Considerando que a remuneração será
//        no regime de juros simples.

import javax.swing.*;

public class Exec10 {
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
//                     Inicio Algoritmo
//    Declarar variáveis tipo numero: investimento, taxa =0,05, valorJuros=0, valorTotal=0;i=1;
//        Investimento = Ler(1000);
//        Enquanto(i<=10)
//        valorJuros = ((investimento+valorJuros)*taxa)+valorJuros
//        i =i+1;
//        fim enquanto
//        exibir(“Valor juros: ” + valorJuros);
//        exibir(“Valor investido: ” + investimento);
//        exibir(“Valor total: ” + investimento+valorJuros);
//                      Fim Algoritmo

