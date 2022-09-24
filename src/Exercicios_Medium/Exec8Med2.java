package Exercicios_Medium;

import javax.swing.*;

public class Exec8Med2 {
    public static void main(String[] args) {
        String[] vetorMeses;
        int num;
        vetorMeses = new String[12];
        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "abril";
        vetorMeses[4] = "maio";
        vetorMeses[5] = "junho";
        vetorMeses[6] = "julho";
        vetorMeses[7] = "agosto";
        vetorMeses[8] = "setembro";
        vetorMeses[9] = "outubro";
        vetorMeses[10] = "novembro";
        vetorMeses[11] = "dezembro";
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero!"));
        System.out.println(" O mes é:" + vetorMeses[num - 1]);
    }
}
