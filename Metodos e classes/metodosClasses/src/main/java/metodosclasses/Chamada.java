/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author leandro
 */
public class Chamada {

    //False - Com o ligacao desligada
    public boolean ligada =  false;
    

    void ligar() {

        

        if (ligada == true) {

            System.out.println("Voce ja esta em uma ligacao!");

        } else {
            
            ligada = true;
            
            System.out.println("Ligacao iniciada!");
        }
         
    }

    void desligar() {

        //True - Significa que estou em uma ligacao
        //False - Significa que nao estou em uma ligacao
        if (ligada == true) {

            System.out.println("Ligacao encerrada com sucesso!");
            
            ligada = false;

        } else {
            
            
            
            System.out.println("Voce nao pode desligar por que nao esta em uma ligacao!");
        }

    }
}
