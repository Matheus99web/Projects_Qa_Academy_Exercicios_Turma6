package Exercicios_Easy;
//Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do salário bruto, valor do salário
//        líquido e o valor do imposto de renda. Respeitando a tabela abaixo:
//        IR = (Salario * aliquota) -dedução

import javax.swing.*;

public class Exec8ex3 {
    public static void main(String[] args) {
        //    Declarar variavel do tipo numerica: salario, ir;
        double salario, ir = 0;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario!: "));
        if (salario > 0 && salario <= 1903.98) {
            //  System.out.println("isento de imposto de renda!");
            JOptionPane.showInternalMessageDialog(null, "isento de imposto de renda!");
//            SE(salario > 0 && salario <= 1903,98 )
//            Exibir: (“Isento de imposto de renda”);
        } else {
            if (salario >= 1903.99 && salario <= 2826.65)
                ir = (salario * 0.075) - 142.80;
            if (salario >= 2826.66 && salario <= 3751.05)
                ir = (salario * 0.15) - 354.80;
            if (salario >= 3751.06 && salario <= 4664.68)
                ir = (salario * 0.225) - 636.13;
            if (salario > 4664.68)
                ir = (salario * 0.275) - 869.36;
            // System.out.println("O seu salario bruto: " + salario);
            // System.out.println("O seu salario liquido:" + (salario - ir));
            // System.out.println("Valor do imposto renda: " + ir);
            JOptionPane.showInternalMessageDialog(null, "O seu salario bruto a ser pago é: " + salario);
            JOptionPane.showInternalMessageDialog(null, "O seu salario liquido a ser pago é:" + (salario - ir));
            JOptionPane.showInternalMessageDialog(null, "Valor do imposto renda a ser pago é: " + ir);
        }
    }
}
//    Inicio Algoritmo
//    Declarar variavel do tipo numerica: salario, ir;
//        salario = Ler(5000,00);
//        SE(salario > 0 && salario <= 1903,98 )
//        Exibir: (“Isento de imposto de renda”);
//        Fim Se
//        SE(salario >= 1903,99 && salario <= 2826,65)
//        ir = (salario * 0,075) - 142,80;
//        Fim Se
//
//        SE(salario >=2826,66 && salario <= 3751,05)
//        ir = (salario * 0,15) - 354,80;
//        Fim Se
//        SE(salario >=3751,06 && salario <= 4664,68)
//        ir = (salario * 0,225) - 636,13;
//        Fim Se
//        SE(salario > 4664,68)
//        ir = (salario * 0,275) - 869,36;
//        Fim Se
//        Exibir“Salario Bruto: ” + salario;
//        Exibir“Salario Liquido: ” + (salario - ir);
//        Exibir“Imposto a pagar: ” +  i);
//        Fim Algoritmo
