package Exercicios_Medium;
import javax.swing.*;
// Faça um algoritmo para calcular e exibir a soma de todos os
//         números de 0 a 1000. E parar se caso a soma atingir 1500(ou mais).
public class Exec3Med {
    public static void main(String[] args) {
        int i = 0, soma = 1;
        while (i<=1000 && soma <=1500){
            soma = i + soma;
            System.out.println("Exibir: " + soma);
            i++;
        }
        }
    }
//    Inicio Algoritmo
//    Declarar variável do tipo numerico: i=0, soma;
//        Enquanto(i<=1000 && soma <=1500)
//        soma = i+soma;
//        Exibir(soma);
//        i++; //i = i+1;
//        Fim Enquanto
//        Fim Algoritmo


