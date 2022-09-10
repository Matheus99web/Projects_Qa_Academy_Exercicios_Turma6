package Exercicios_Easy;
//- Faça um algoritmo para ler um valor de salário, calcular e exibir o
//        valor do INSS a ser pago. Respeitando a tabela abaixo:

import javax.swing.*;

public class Exec7 {
    public static void main(String[] args) {
//    Declarar variável do numérico: salario, inss;
        double salario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario!: "));
        if (salario <= 1045.00)
//        Exibir: (“O Valor que você de inss será: ”+ inss);
            System.out.println("salario <= 1045.00 o inss a ser pago é :" + salario * 0.075);
//        Fim se
        if (salario >= 1045.01 && salario <= 2089.60)
//        Exibir: (“ O valor de Inss será: ”+ inss);
            System.out.println("salario >= 1045.01 && salario <= 2089.60 o inss a ser pago é :" + salario * 0.09);
//        Fim se
        if (salario >= 2089.61 && salario <= 3134.40)
//        Exibir: (“ O valor de Inss será: ”+ inss);
            System.out.println("salario >= 2089.61 && salario <= 3134.40 o inss a ser pago é :" + salario * 0.12);
//        Fim se
        if (salario >= 3134.41 && salario <= 6101.06)
//        Exibir: (“ O valor de Inss será: ”+ inss);
            System.out.println("salario >= 3134.41 && salario <= 6101.06 o inss a ser pago é :" + salario * 0.14);
//        Fim se
    }
}
//    Inicio Algoritmo
//    Declarar variável do numérico: salario, inss;
//        salario = Ler(1045);
//        SE(salario <= 1045.00)
//        inss = salario  * 0.075;
//        Exibir: (“O Valor que você de inss será: ”+ inss);
//        Fim se
//        SE(salario >= 1045.01 && salario<= 2089,60)
//        inss = salario  * 0.09;
//        Exibir: (“ O valor de Inss será: ”+ inss);
//        Fim se
//        SE(salario >= 2089,61 && salario<=3134.40)
//        inss = salario  * 0,12;
//        Exibir: (“O valor de Inss será: ”+ inss);
//        Fim se
//        SE(salario >= 3134.41)
//        inss = salario  * 0.14;
//        Exibir: (“O Valor que você de inss será: ”+ inss);
//        Fim Se
//        Fim Algoritmo
