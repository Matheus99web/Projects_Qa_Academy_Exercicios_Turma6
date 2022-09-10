package Exercicios_Easy;
//- Faça um algoritmo para ler duas notas, calcular a média. E
// SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5 exibir exame.

import javax.swing.*;

public class Exec6 {
    public static void main(String[] args) {
//        Declarar variaveis do tipo numerico:not1, not2, not3,media;
        int not1, not2, not3, media;
//        Exibir:("Digite a primeira nota!"));
//        Exibir:("Digite a segunda nota!"));
//        Exibir:("Digite a terceira nota!"));
//        Exibir:media = (not1 + not2 + not3) / 3;
        not1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota!"));
        not2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota!"));
        not3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota!"));
        media = (not1 + not2 + not3) / 3;
        if (media > 5)
            //        Printar:("Você foi Aprovado!!!");
            System.out.println("Você foi Aprovado!!!");
        if (media < 5)
            //        Printar:("Você foi Reprovado!!!");
            System.out.println("Você foi Reprovado!!!");
        if (media == 5)
            //        Printar:("Exibir exame!!!");
            System.out.println("Exibir exame!!!");
    }
//                  Inicio do algoritmo
//    Declarar variáveis do tipo Numérico: nota1, nota2, media;
//    nota1 = Ler (nota1);
//    nota2 = Ler (nota2);
//    Nota3 = Ler (nota3);
//    media = (nota1 + nota2 + nota3) / 3;
//    Exibir: “A media  é :" + (nota1 + nota2 + nota3)/3;
//    Media = “   “;
//    SE Media > 5;
//    exibir: "Aprovado";
//    Fim Se
//    SE Media < 5;
//    exibir: "Reprovado";
//    Fim Se
//    SE Media == 5;
//    exibir: "exame";
//    Fim Se
//                Fim do algoritmo.

}
