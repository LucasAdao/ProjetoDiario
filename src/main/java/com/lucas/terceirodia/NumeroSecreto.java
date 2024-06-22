package com.lucas.terceirodia;

import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroSecreto = 10;
        int chute = 0;
        while(numeroSecreto != chute){
            System.out.println("Tente adivinhar o número secreto! Ele está entre 0 e 20");
            System.out.println("Digite um número:");
            chute = scan.nextInt();
            if(chute > numeroSecreto){
                System.out.println("O número secreto é menor que o número que você digitou!");
            }else if(chute < numeroSecreto){
                System.out.println("O número secreto é maior do que o número que você digitou!");
            }
        }
        System.out.println("Isso mesmo, o número secreto é " + numeroSecreto + "!");

    }
}
