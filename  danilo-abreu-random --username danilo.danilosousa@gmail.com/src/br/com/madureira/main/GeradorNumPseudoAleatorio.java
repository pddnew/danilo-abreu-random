package br.com.madureira.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class GeradorNumPseudoAleatorio {

    private List<Float> listX;
    private static float retorno;

    public GeradorNumPseudoAleatorio( float paramSemente){

        listX = new ArrayList<Float>();

        listX.add(paramSemente);
    }

    public List<Float> gerar(Integer paramM){

        for(int i = 0; i < paramM; i++){

            retorno = ( 65539 * listX.get(i) + 1250000) % paramM;

            listX.add(retorno);
        }
        return listX;
    }
}
