/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 */
public class Pergunta_09 {

    public static void main(String[] args) throws IOException {
        String nome= "";
        String categoria = "";
        float peso;

        
            nome=JOptionPane.showInputDialog(null,
            "Entre com o nome do lutador :\n" ,
            "", JOptionPane.INFORMATION_MESSAGE);

            peso=Float.parseFloat(
                    JOptionPane.showInputDialog(null,
                    "Entre com o peso do lutador :\n" ,
                    "", JOptionPane.INFORMATION_MESSAGE));
            
            if (peso<65){
                categoria = "Pena";
            } else  if (peso>=65 & peso<72 ){
                categoria = "Leve";
            } else  if (peso>=72 & peso<79 ){
                categoria = "Ligeiro";
            } else  if (peso>=79 & peso<86 ){
                categoria = "Leve";
            } else  if (peso>=86 & peso<93 ){
                categoria = "Leve";
            } else  if (peso>=93 & peso<100 ){
                categoria = "Leve";
            } else  if (peso>=100){
                categoria = "Pesado";
            }
            FileWriter arquivo = new FileWriter(".\\FICHA_LUTADOR.TXT");
            PrintWriter gravar = new PrintWriter(arquivo);
            gravar.println("O lutador " + nome + " pesa " + peso + " e se enquadra na categoria " + categoria);
            gravar.close();
            
            
            JOptionPane.showMessageDialog(null,
            "Nome fornecido : " + nome+"\n"+
            "Peso fornecido  : " + peso+"\n", 
            "",JOptionPane.INFORMATION_MESSAGE);

    }
}
