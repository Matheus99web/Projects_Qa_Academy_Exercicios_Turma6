package Main;

import Exercicios_Easy.Exec2;
import Exercicios_Easy.Exec3;
import Exercicios_Easy.Exec4;
import Exercicios_Easy.Exec5;

public class Execucao {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
//      // ((__SUBISTITUIÇÃO DO MAIN EXERCICIO 02 EASY__))
//        Exec2 exec2 = new Exec2();
//        exec2.exibirPalavra("Matheus");
//        System.out.println(exec2.exibirPalavra("Teste"));
//    }
// }
        //--------------------------------------------------------------------------------------------------------------
//      // ((__SUBISTITUIÇÃO DO MAIN EXERCICIO 03 EASY__))
//        Exec3 exec3 = new Exec3();
//        String texto = exec3.inverterNomes("matheus","nogueira");
//        System.out.println(exec3.inverterNomes("matheus","nogueira  "));
//    }
// }
        //--------------------------------------------------------------------------------------------------------------
//      // ((__SUBISTITUIÇÃO DO MAIN EXERCICIO 04 EASY__))
//        Exec4 exec4 = new Exec4();
//        System.out.println("O dobro é:" + exec4.calcularDobro( 10));
//    }
//}
        //--------------------------------------------------------------------------------------------------------------
//      // ((__SUBISTITUIÇÃO DO MAIN EXERCICIO 05 EASY__))
        Exec5 exec5 = new Exec5();
        System.out.println("A soma é: " + exec5.resultadoSoma(10,20,30));
        System.out.println("A subtração é: " + exec5.resultadoSubitracao(10,20,30));
        System.out.println("A multiplicação é " + exec5.resultadoMultiplicacao(10,20,30));
        System.out.println("A media é: " + exec5.resultadoMedia(10,20,500));
    }
}