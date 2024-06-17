package com.lucas.primeirodia;

public class Main {
    static boolean sucesso = false;

    public static void main(String[] args) {
        while(sucesso == false) {
            workHard();
            System.out.println(sucesso);
    }

    }
    public static void workHard(){
        System.out.println("Estudar Java!! \nFazer projetos em Spring \nTerminar as trilhas que estou inserido \nTreinar bastante fisicamente \nSer um ótimo parceiro para minha parceira");
        sucesso = true;
    }
}
