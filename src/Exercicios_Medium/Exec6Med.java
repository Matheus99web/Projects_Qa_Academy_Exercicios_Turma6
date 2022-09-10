package Exercicios_Medium;

import javax.swing.*;

//Faça um algoritmo para ler um número inteiro, calcular e exibir o Fatorial do número digitado.
//        Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 3.628.800
public class Exec6Med {
    public static void main(String[] args) {
        int fatorial,i=0;
        fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero!"));
        i = fatorial;
        while (i>1){
            fatorial = fatorial * (i - 1);
            i--;
        }
        System.out.println("Fatorial do numero digitedo é:" + fatorial);
    }
}
//    Inicio Algoritmo
//
//    Declarar variável do tipo inteiro: fatorial, i;
//
//        fatorial  = Ler(“10”);
//        i =  fatorial ;
//
//        Enquanto(i>1)
//        fatorial = fatorial * (i-1);
//        i--;
//        Fim Enquanto
//
//        Exibir (“O fatorial do número digitado é ”+ fatorial).
//        Fim Algoritmo


