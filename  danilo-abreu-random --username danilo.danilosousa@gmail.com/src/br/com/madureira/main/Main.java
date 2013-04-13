package br.com.madureira.main;

import java.util.List;

/**
 * IMPLEMENTAR UM GERADOR DE NUM PSEUDO-ALEATORIO (GNPA)
 * UTILIZANDO O SEGUINTE ALGORITMO
 * Xn = (a . Xn - 1) % M Congrencial
 * X0 -> parametro
 * M -> parametro( Nº PRIMO )
 * PERIODO M -1 (MAS DEPENDE DO A )
 * VALORES GERADOS E [1, M]
 * P/ VALORES E ]0,1[ --> UTILIZAR Rn  = ( Xn / M )
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Float inicial = Float.parseFloat(args[0]);

        GeradorNumPseudoAleatorio gr =
                new GeradorNumPseudoAleatorio( inicial );

        List<Float> listX = gr.gerar(27);

        for (int i = 1; i < listX.size(); i++) {
            System.out.println(listX.get(i));
        }
    }


}