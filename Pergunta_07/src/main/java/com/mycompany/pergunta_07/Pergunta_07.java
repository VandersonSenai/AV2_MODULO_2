/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_07;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 * Escreva um programa que implemente o jogo “Qual é o filme?”.

Nesse o jogo, o jogador 1  deve digitar o nome de um filme e em seguida 5 pistas descritivas sobre o filme. 

Depois, o  jogador 2 tem 5 chances para tentar adivinhar o nome do filme.

Inicialmente somente a  primeira pista é mostrada para o jogador 2, mas sempre que ele errar o nome do filme, uma nova pista é exibida na tela e o jogador pode tentar adivinhar o nome do filme novamente.

O exemplo abaixo mostra como seria uma execução do jogo: 

Jogador 1 - Digite seu nome: Mykael

Mykael - Digite o nome do filme: Matrix  

Mykael  – Digite a pista 1: Humanidade dominada por maquinas

Mykael  – Digite a pista 2: Siga o coelho branco  
_______________________________________________

Jogador 2 - Digite seu nome: Priscila

Priscila, a pista 1 é: Humanidade dominada por maquinas 

Priscila, Qual o nome do filme? Exterminador do Futuro

Priscila, você errou! 

Priscila, a pista 2 é: XXXXXX
 */
public class Pergunta_07 {

    public static void main(String[] args) {
        String[] dicas = new String [5];
        String nomeFilme = "";
        String jogadorUm = "";
        String jogadorDois = "";
        String resposta = "";
        
            jogadorUm=JOptionPane.showInputDialog(null,
            "Jogador 1 - Digite seu nome:\n" ,
            "Qual é o filme?", JOptionPane.INFORMATION_MESSAGE);
        
            nomeFilme=JOptionPane.showInputDialog(null,
            jogadorUm+ " - Digite o nome do filme:\n" ,
            "Qual é o filme?", JOptionPane.INFORMATION_MESSAGE);
            
            for (int i=0 ; i<5 ; i++){
                dicas[i]=JOptionPane.showInputDialog(null,
                jogadorUm + " - Digite a pista " + (i+1) + "º dica.\n" ,
                "Qual é o filme?", JOptionPane.INFORMATION_MESSAGE);
            }
            
            jogadorDois=JOptionPane.showInputDialog(null,
            "Jogador 2 - Digite seu nome:.\n" ,
            "Qual é o filme?", JOptionPane.INFORMATION_MESSAGE);
            
            for (int i=0 ; i<5 ; i++){
                resposta=JOptionPane.showInputDialog(null,
                jogadorDois + ", a pista " + (i+1) + " é: "+ dicas[i] + "\n" +
                jogadorDois + ", Qual o nome do filme?",
                "Qual é o filme?", JOptionPane.INFORMATION_MESSAGE);
                if (!resposta.equals(nomeFilme)){
                    JOptionPane.showMessageDialog(null,
                    jogadorDois + ", você errou!", 
                    "Qual é o filme?",JOptionPane.INFORMATION_MESSAGE);
                } else if (resposta.equals(nomeFilme)){
                    JOptionPane.showMessageDialog(null,
                    jogadorDois + ", você ACERTOOOOOU!!!!!", 
                    "Qual é o filme?",JOptionPane.INFORMATION_MESSAGE);
                    break;
                } 
            
            }

            //System.out.println("Hello World!");
    }
}
