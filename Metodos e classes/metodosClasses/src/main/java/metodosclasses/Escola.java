/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author kleut
 */
public class Escola {
    public Escola(int aluno) {
    
        System.out.println("Aluno : " + aluno);
    
    }
    
    public void imprimirNumeros(int valorInicio, int valorFinal ){
    
        for(int contador = valorInicio; contador <= valorFinal; contador+=5) {
        
            System.out.println("Numero : " + contador);
        
        }
        
    
    }
}
