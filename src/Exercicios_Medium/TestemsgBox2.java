package Exercicios_Medium;

import javax.swing.*;

public class TestemsgBox2 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\55119\\Downloads\\ezgif.com-gif-maker (1).gif");
        int num1, num2, num3, resultSoma, resultSubtracao, resultMultiplacao, resultmedia;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        resultSoma = num1 + num2 + num3;
        resultSubtracao = num1 - num2 - num3;
        resultMultiplacao = num1 * num2 * num3;
        resultmedia = (num1 + num2 + num3) / 3;
    }
}
