package Exercicios_Medium;
import javax.swing.*;
// Faça um algoritmo para calcular e exibir a multiplicação de todos os números de 1 a 1000. E toda vez que resultado
//         chegar ou ultrapassar 1000, faça que o resultado das multiplicações volte a ser 1.
public class Exec4Med {
    public static void main(String[] args) {
        //    Declarar variável do tipo numerico: i=1, multi = 1;
        int i = 1, multi = 1;
        while (i<=1000){
            multi = i * multi;
            if (multi >= 1000)
            multi = 1;
            System.out.println("Exibir" + multi);
        i++;
        }
    }
    }
//    Inicio Algoritmo
//
//    Declarar variável do tipo numerico: i=1, multi = 1;
//        Enquanto(i<=1000 )
//        multi = i* multi;
//        Se(multi >= 1000)
//        multi = 1;
//        Fim Se
//        Exibir(multi);
//        i++; //i = i+1;
//        Fim Enquanto
//
//        Fim Agoritmo

