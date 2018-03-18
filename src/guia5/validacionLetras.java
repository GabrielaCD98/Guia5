/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author gaby
 */
public class validacionLetras {
    private String letras[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","Y","X","Y","Z"};

    public validacionLetras() {
    }
    
    public boolean validar (String letra){
        int contador=0;
        for (int i = 0; i < letras.length; i++) {
            if (letra.equals(letras[i])) {
                contador=1;   
            }
        }
        if (contador==1) {
            return true;
        } else {
            return false;
        }
    }
}
