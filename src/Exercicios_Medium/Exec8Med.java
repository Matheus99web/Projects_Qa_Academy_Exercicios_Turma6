package Exercicios_Medium;
// Faça um algoritmo para exibir todos os meses digitados anteriormente.
public class Exec8Med {
    public static void main(String[] args) {
        String[] vetorMeses;
        int i = 0;
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
        while (i <= 11) {
            System.out.printf("%0,2d- %s\n", (i + 1), vetorMeses[i]);
            i++;
        }
    }
}
//    Inicio Algoritmo
//
//    Declarar variavel do inteiro: i=0;
//        Enquanto(i<=11)
//        Exibir: vetorMeses[i];
//        i++;
//        Fim Enquanto
//
//        Fim Algoritmo

