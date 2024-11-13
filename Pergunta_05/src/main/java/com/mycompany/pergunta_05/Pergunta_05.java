/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_05;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 * Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um 
 * código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. 
 * Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) 
 * deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, 
 * deve ser mostrada a mensagem ‘Acesso permitido’
 */
public class Pergunta_05 {

    public static void main(String[] args) {
        String codigo="1234";
        String senha="9999";
        String codigoImput="0";
        String senhaImput="0";
        
        codigoImput = JOptionPane.showInputDialog(null, "Entre o codigo de usuário : ");
        if (codigoImput.equals(codigo)){
                               
            senhaImput = JOptionPane.showInputDialog(null, "Entre com a senha de acesso : ");
            if (senhaImput.equals(senha)){
                JOptionPane.showMessageDialog(null, "Acesso permitido");
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario invalido");
        }
        
    }
}
