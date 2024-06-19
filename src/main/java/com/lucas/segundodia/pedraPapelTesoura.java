package com.lucas.segundodia;

import java.util.Random;
import java.util.Scanner;

public class pedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a partir dos números: 1-papel 2-pedra 3-tesoura");
        int opcao = scan.nextInt();
        Random random = new Random();
        int opcaoMaquina = random.nextInt(3)+1;

        if(opcao == 1 && opcaoMaquina == 1){
            System.out.println("Empate, os papéis se amassam entre si!");
        }else if(opcao == 2 && opcaoMaquina == 2){
            System.out.println("Empate, as pedras se batem e causam um estrondo que choca o mundo!");
        }else if(opcao == 3 && opcaoMaquina == 3){
            System.out.println("Empate, as tesouras se cortam e não acontece nada!");
        }else if(opcao == 2 && opcaoMaquina == 3){
            System.out.println("Jogador vence! A pedra quebra a tesoural!");
        }else if(opcao == 1 && opcaoMaquina == 2){
            System.out.println("Jogador vence! O papel embrulha a pedra!");
        }else if(opcao == 3 && opcaoMaquina == 1){
            System.out.println("Jogador vence! A tesoura corta o papel!");
        }else if(opcao == 1 && opcaoMaquina == 3){
            System.out.println("Máquina vence! A tesoura corta o papel!");
        }else if(opcao == 2 && opcaoMaquina == 1){
            System.out.println("Máquina vence! O papel embrulha a pedra!");
        }else{
            System.out.println("Máquina vence! A pedra quebra a tesoura");
        }

    }
}
