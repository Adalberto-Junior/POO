package Aula3;

import java.util.Random;
public class Ex8 {
    public static void main(String[] args){
        Random ger = new Random();
        double turma [][] = new double[16][3];

        for(int i = 0; i < turma.length; i++){
            for(int j = 0; j < 2; j++){
                turma[i][j] = ger.nextDouble() * 20;
            }
        }
        for(int i = 0; i < turma.length; i++){
            if(turma[i][0] < 7.0 || turma[i][1] < 7.0)
                turma[i][2] = 66;
            else 
                turma[i][2] = Math.round(0.4 * turma[i][0] + 0.6 * turma[i][1]);
        }
        System.out.println("NotaT\t  NotaP\t  Pauta");
        for(int k = 0; k < turma.length; k++){
               System.out.printf("%.1f\t  %.1f\t  %.0f\n",  turma[k][0], turma[k][1], turma[k][2]);
        }

    }
}
