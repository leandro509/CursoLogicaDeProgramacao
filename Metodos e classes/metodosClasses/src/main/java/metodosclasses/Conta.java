/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author leandro
 */
public class Conta {
    //Atributos 
    public String nome;
    public double saldo;
    
    void sacar(double valor) {
    
        //Apontar para o atributo da classe 
        this.saldo -= valor;
    
    }
    
    void depositar(double valor) {
    
        this.saldo += valor;
    
    }
}
