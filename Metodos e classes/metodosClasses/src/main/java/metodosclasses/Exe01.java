/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author leandro
 */
public class Exe01 {
    public static void main(String[] args) {
        Conta operacao = new Conta();
        
        operacao.nome = "Roger";
        operacao.saldo = 100;
        
        System.out.println("Cliente: " + operacao.nome);
        System.out.println("Saldo atual: " + operacao.saldo);
        System.out.println("\n----------------------------" );
        
        //-------------------------------------------------------
        
        operacao.depositar(200);
        System.out.println("Cliente: " + operacao.nome);
        System.out.println("Saldo atual: " + operacao.saldo);
        System.out.println("\n----------------------------" );
        
        //-------------------------------------------------------
        
        operacao.sacar(150);
        System.out.println("Cliente: " + operacao.nome);
        System.out.println("Saldo atual: " + operacao.saldo);
        System.out.println("\n----------------------------" );
        
        
    }
}
