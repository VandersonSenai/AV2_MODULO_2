/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_02;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
 */
public class Pergunta_02 {

    public static void main(String[] args) {
        int anos, meses,dias = 0;
        anos = Integer.parseInt( JOptionPane.showInputDialog(null, "Primeiro passo, entre com a idade em ANOS: "));
        meses = Integer.parseInt( JOptionPane.showInputDialog(null, "Segundo passo,  entre com MESES exedentes: "));
        dias = Integer.parseInt( JOptionPane.showInputDialog(null, "Terceiro passo,  entre com DIAS exedentes: "));
        System.out.println("Hello World!");
        
        JOptionPane.showMessageDialog(null, anos + " anos, " + meses + " meses e " + dias + " dias = " + ((365*anos)+(30*meses)+dias) + " dias");
        
    }
}
