/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_04;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
Utilize:

JOptionPane.showMessageDialog

JOptionPane.showInputDialog
 */
public class Pergunta_04 {

    public static void main(String[] args) {
        int numeroImput = 0 ;
        
                    numeroImput = Integer.parseInt( JOptionPane.showInputDialog(null, "Entre com um número INTEIRO : "));
                   
                    JOptionPane.showMessageDialog(null, 
                            "O antecessor do numero " + numeroImput + " é : " + (numeroImput-1)+"\n"+
                            "O sucessor do numero " + numeroImput + " é : " + (numeroImput+1)+"\n"
                    );
    }
}
