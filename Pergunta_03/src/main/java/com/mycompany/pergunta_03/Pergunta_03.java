/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_03;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 * Faça um programa de controle de máquina de café, levando em consideração:

A máquina irá fazer repetidamente a leitura das seguintes opções: 1 - café expresso; 2 - café capuccino; 3 - leite com café; 4 - totalizar vendas;

• As opções de 1 a 3 realizam pedidos de café, que recebem respectivamente R$ 0,75, R$ 1,00 e R$ 1,25 em moeda;
• A opção 4 realiza a totalização dos cafés vendidos, finalizando a venda até o momento, imprimindo um relatório com as seguintes informações:

• quantidade e valor de café expresso vendido;
• quantidade e valor de café capuccino vendido;
• quantidade e valor de leite com café vendido;
• quantidade e valor de todos cafés vendidos;
 */

public class Pergunta_03 {

    public static void main(String[] args) {
        boolean repetir = true;
        int qtd_expresso =0, qtd_capuccino=0, qtd_leite_cafe=0, totalVendas = 0;
        double vnd_expresso=0; 
        double vnd_capuccino = 0;
        double vnd_leite_cafe=0 ;
        int op = 0;
        
        while (op!=4){
             op = Integer.parseInt( JOptionPane.showInputDialog(null, " Deseja qual tipo de café ?\n "+
                     "\n Digite (1) para Café Expresso"+
                     "\n Digite (2) para Café Capuccino"+
                     "\n Digite (3) para Leite com Café"+
                     "\n Digite (4) para Totalizar as vendas\n\n"));
            switch (op) {
                case 1:
                    qtd_expresso= qtd_expresso + 1;
                    vnd_expresso = vnd_expresso + 0.75;
                    break;
                case 2:
                    qtd_capuccino = qtd_capuccino + 1;
                    vnd_capuccino = vnd_capuccino + 1.00;
                    break;
                case 3:
                    qtd_leite_cafe = qtd_leite_cafe + 1;
                    vnd_leite_cafe = vnd_leite_cafe + 1.25;
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, 
                        "\n Quantidade de café expresso vendido: "+ qtd_expresso + "\n Valores acumulados : R$ " + vnd_expresso +"\n"+
                        "\n Quantidade de café capuccino vendido: "  + qtd_capuccino + "\n Valores acumulados : R$ " + vnd_capuccino +"\n"+
                        "\n Quantidade de leite com café vendido: "  + qtd_leite_cafe + "\n Valores acumulados : R$ " + vnd_leite_cafe +"\n"+
                        "\n Quantidade de cafés vendidos : " + (qtd_capuccino+qtd_expresso+qtd_leite_cafe) + "\n Total Vendido : R$ "  + (vnd_expresso +vnd_capuccino+vnd_leite_cafe)+"\n");
                    break;                    
                default:
                    break;
            }
             
        }
        
    }
}
