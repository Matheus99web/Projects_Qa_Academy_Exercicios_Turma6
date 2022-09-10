package Exercicios_Medium;
//Faça um algoritmo para ler todos os meses do ano, armazene em um vetor.
public class Exec7MedEx2 {
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
