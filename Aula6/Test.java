package Aula6;

import Aula5.Date;

public class Test {
    public static void main(String[] args)  {
        Aluno al = new Aluno ("Andreia Melo", 9855678,new Date(18, 7, 1990), new Date(1, 9, 2018));
        Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new Date(11, 5, 1985), 900);
        bls.setBolsa(1050);
        //Aluno al1 = new Aluno ("Pedro Simão", 8965587,new Date(13, 5, 2000));

        
        System.out.println("Aluno:"+ al.getName());
        System.out.println(al);
        //System.out.println(al1);
        System.out.println("Bolseiro:"+ bls.getName() + ", NMec: " + bls.getNMec() + ", Bolsa:" +  bls.getBolsa());
        System.out.println(bls);
    }
}
